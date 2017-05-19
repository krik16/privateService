package com.rongyi.rpb.bizz;

import com.alipay.api.response.AlipayTradeQueryResponse;
import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.model.res.WwScanQueryResData;
import com.rongyi.pay.core.webank.param.WwScanQueryParam;
import com.rongyi.pay.core.wechat.model.PunchCardPayQueryResData;
import com.rongyi.pay.core.wechat.model.RefundQueryResData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import com.rongyi.rpb.unit.SaveUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * conan
 * 2017/2/27 14:25
 **/
@Repository
public class QueryBizz {

    private static Logger log = LoggerFactory.getLogger(QueryBizz.class);

    @Autowired
    PaymentService paymentService;
    @Autowired
    PayConfigInitUnit payConfigInitUnit;
    @Autowired
    PaymentLogInfoService paymentLogInfoService;
    @Autowired
    InitEntityUnit initEntityUnit;
    @Autowired
    SaveUnit saveUnit;


    /**
     * 微信刷卡支付订单查询
     *
     * @param orderNo         订单号
     * @param wechatConfigure 支付参数
     * @return PunchCardPayQueryResData
     */
    public Map<String, Object> wechatPunchCardPayQueryOrder(String orderNo, WechatConfigure wechatConfigure) throws Exception {

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        Map<String, Object> map = new HashMap<>();
        //外部订单号
        map.put("orderNo", orderNo);
        //容易网交易号
        map.put("payNo", oldPaymentEntity.getPayNo());
        //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

        //订单未支付查询第三方接口
        if (!oldPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)) {

            PunchCardPayQueryResData resData = WeChatPayUnit.punchCardPayQueryOrder(null, oldPaymentEntity.getPayNo(), wechatConfigure);

            //检查是否支付成功状态
            if (com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getTrade_state())) {
                updatePayment(oldPaymentEntity, resData.getTransaction_id(), resData.getOpenid(), resData.getOpenid());
            }
            //微信流水号
            map.put("tradeNo", resData.getTransaction_id());
            //设置支付状态
            if (com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getReturn_code()) &&
                    com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getResult_code()) &&
                    com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getTrade_state())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getTrade_state())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            } else if (com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr().equals(resData.getTrade_state())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr());
            } else {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }
        } else {
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(oldPaymentEntity.getPayNo());
            //第三方流水号
            if (paymentLogInfo != null) {
                map.put("tradeNo", paymentLogInfo.getTrade_no());
            }
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
        }
        //显示退款状态
        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(oldPaymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
        if(refundPayment != null){
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr());
        }
        return map;
    }

    /**
     * 支付宝面对面支付查询
     *
     * @param orderNo      订单号
     * @param aliConfigure 支付参数
     * @return AlipayTradeQueryResponse
     */
    public Map<String, Object> aliF2FPayQuery(String orderNo, AliConfigure aliConfigure) {

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        Map<String, Object> map = new HashMap<>();
        //外部订单号
        map.put("orderNo", orderNo);
        map.put("tradeStatus", "SUCCESS");
        //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        //容易网交易号
        map.put("payNo", oldPaymentEntity.getPayNo());

        if (!oldPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)) {

            AlipayTradeQueryResponse resData = AliPayUnit.f2fPayQuery(oldPaymentEntity.getPayNo(), null, aliConfigure);
            updatePayment(oldPaymentEntity, resData.getTradeNo(), resData.getBuyerUserId(), resData.getBuyerLogonId());

            map.put("tradeNo", resData.getTradeNo());

        } else {
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(oldPaymentEntity.getPayNo());
            //第三方流水号
            if (paymentLogInfo != null) {
                map.put("tradeNo", paymentLogInfo.getTrade_no());
            }
        }
        //显示退款状态
        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(oldPaymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);
        if(refundPayment != null){
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr());
        }
        return map;

    }

    /**
     * 微众支付查询接口(包含扫码和被扫)
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return map
     * @throws Exception
     */
    public Map<String, Object> weBankWechatPayQueryOrder(String orderNo, String weBankMchNo) throws Exception {

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
        Map<String, Object> map = new HashMap<>();

        //外部订单号
        map.put("orderNo", orderNo);
        //容易网交易号
        map.put("payNo", oldPaymentEntity.getPayNo());
        //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

        //已完成订单
        if (oldPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)) {
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(oldPaymentEntity.getPayNo());
            //第三方流水号
            if (paymentLogInfo != null) {
                map.put("tradeNo", paymentLogInfo.getTrade_no());
            }
            //设置支付状态
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
        }else  if (ConstantEnum.PAY_SCENE_SCAN.getCodeInt().equals(oldPaymentEntity.getPayScene())) {
            WwScanQueryResData resData = webankWechatScanPayQueryOrder(weBankMchNo, oldPaymentEntity);
            //微信流水号
            map.put("tradeNo", resData.getTransaction_id());
            map.put("tradeStatus", resData.getTrade_state());
        } else {
            WwPunchCardResData resData = webankWechatPunchCardPayQueryOrder(weBankMchNo, oldPaymentEntity);
            //微信流水号
            map.put("tradeNo", resData.getTransaction_id());
            //设置支付状态
            if (com.rongyi.pay.core.constants.ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(resData.getResult().getErrno()) &&
                    com.rongyi.pay.core.constants.ConstantEnum.WEBANK_PAYEMENT_1.getCodeStr().equals(resData.getPayment())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getResult().getErrno())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            } else {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }
        }

        //检查是否支付成功状态
        if (com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(map.get("tradeStatus"))) {
            updatePayment(oldPaymentEntity, com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr(), "", "");
        }
        //显示退款状态
        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(oldPaymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
        if(refundPayment != null){
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr());
        }
        return map;

    }

    /**
     * 微众微信刷卡支付订单查询
     *
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WwPunchCardResData webankWechatPunchCardPayQueryOrder(String weBankMchNo, PaymentEntity oldPaymentEntity) {

        WwPunchCardQueryOrderReqData reqData = new WwPunchCardQueryOrderReqData(weBankMchNo, oldPaymentEntity.getPayNo());

        WwPunchCardResData resData = WebankPayUnit.wechatPunchCardPayQueryOrder(reqData);

        //检查是否支付是否成功
        if (!("0".equals(resData.getResult().getErrno()) && "1".equals(resData.getPayment()))
                && !com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getResult().getErrno())) {
            throw new WebankException(resData.getResult().getErrno(),
                    StringUtil.isEmpty(resData.getResult().getErrmsg()) ? com.rongyi.pay.core.constants.ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr() : resData.getResult().getErrmsg());
        }
        resData.setTerminal_serialno(oldPaymentEntity.getPayNo());
        return resData;
    }


    /**
     * 微众微信扫码支付订单查询
     *
     * @param weBankMchNo 微众商户号
     * @return WwScanQueryResData
     */
    public WwScanQueryResData webankWechatScanPayQueryOrder(String weBankMchNo, PaymentEntity oldPaymentEntity) {

        WwScanQueryParam reqData = new WwScanQueryParam();
        reqData.setMchId(weBankMchNo);
        reqData.setOutTradeNo(oldPaymentEntity.getPayNo());
        WwScanQueryResData resData = WebankPayUnit.wechatScanQuery(reqData);

        //检查是否支付是否成功
        if (!("0".equals(resData.getStatus()) && "0".equals(resData.getResult_code()))) {
            throw new WebankException(resData.getErr_code(),
                    StringUtil.isEmpty(resData.getErr_msg()) ? com.rongyi.pay.core.constants.ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr() : resData.getErr_msg());
        }
        resData.setOut_trade_no(oldPaymentEntity.getPayNo());
        return resData;
    }


    /**
     * 微众微信刷卡支付退款查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public Map<String,Object> webankWechatPunchCardRefundQuery(String orderNo, String weBankMchNo) {


        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        PaymentEntity refundPayment = baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        Map<String, Object> map = new HashMap<>();
        //外部订单号
        map.put("orderNo", orderNo);
        //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        //退款金额
        map.put("refundAmount", refundPayment.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        map.put("refundStatus", "SUCCESS");
        //容易网交易号
        map.put("payNo", refundPayment.getPayNo());

        if (!refundPayment.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)) {

            WwpunchCardRefundReqData reqData = new WwpunchCardRefundReqData();
            reqData.setMerchant_code(weBankMchNo);
            reqData.setTerminal_serialno(oldPaymentEntity.getPayNo());

            WwPunchCardRefundResData resData = WebankPayUnit.wechatPunchCardRefundQuery(reqData);
            if (!"1".equals(resData.getRefundment())) {
                map.put("refundStatus", "FAIL");
            }
            //微众银行退款单号
            map.put("tradeNo", resData.getRefundid());
        } else {
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(refundPayment.getPayNo());
            //第三方流水号
            if(StringUtil.isNotEmpty(paymentLogInfo.getTransactionId())) {
                map.put("tradeNo", paymentLogInfo.getTransactionId());
            }else{
                map.put("tradeNo", paymentLogInfo.getTrade_no());
            }
        }

        return map;
    }

    /**
     * 微众支付宝刷卡支付订单查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public Map<String,Object> weBankAliPunchCardPayQueryOrder(String orderNo, String weBankMchNo) {

        //初始化设置支付宝ticket
        payConfigInitUnit.initAliTicket();

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        Map<String, Object> map = new HashMap<>();
        //外部订单号
        map.put("orderNo", orderNo);
        //容易网交易号
        map.put("payNo", oldPaymentEntity.getPayNo());
        //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

        if(!oldPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)){

            WaQueryTradeReqData reqData = new WaQueryTradeReqData(weBankMchNo, oldPaymentEntity.getPayNo());

            WaQueryTradeResData resData = WebankPayUnit.alipayQueryTrade(reqData);
            if (com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_04.getCodeStr().equals(resData.getTradeStatus())) {
                throw new TradePayException(com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_04.getCodeStr(),
                        com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_04.getValueStr());
            }
            if (!"0".equals(resData.getCode()) ||
                    (!com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_01.getCodeStr().equals(resData.getTradeStatus()) &&
                            !com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_03.getCodeStr().equals(resData.getTradeStatus()) &&
                            !com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_05.getCodeStr().equals(resData.getTradeStatus()))) {
                throw new TradePayException(resData.getCode(), resData.getMsg());
            }

            //第三方交易号
            map.put("tradeNo", resData.getTradeNo());

            //设置支付状态
            if (com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_01.getCodeStr().equals(resData.getTradeStatus())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_03.getCodeStr().equals(resData.getTradeStatus())) {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            }else if(com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_05.getCodeStr().equals(resData.getTradeStatus())){
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_COLSE.getValueStr());
            } else {
                map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }
        }else{
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(oldPaymentEntity.getPayNo());
            //第三方流水号
            if (paymentLogInfo != null) {
                map.put("tradeNo", paymentLogInfo.getTrade_no());
            }
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
        }
        //显示退款状态
        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(oldPaymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);
        if(refundPayment != null){
            map.put("tradeStatus", com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr());
        }

        return map;
    }


    /**
     * 微众支付宝退款订单查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public Map<String,Object> webankAliPunchCardRefundQuery(String orderNo, String weBankMchNo) {

        //初始化设置支付宝ticket
        payConfigInitUnit.initAliTicket();

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        PaymentEntity refundPaymentEntity = baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        Map<String, Object> map = new HashMap<>();
        //外部订单号
        map.put("orderNo", orderNo);
        //容易网交易号
        map.put("payNo", refundPaymentEntity.getPayNo());
        //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        //退款金额
        map.put("refundAmount",oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        map.put("refundStatus", "SUCCESS");

        if(!refundPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)){
            WaRefundQueryReqData reqData = new WaRefundQueryReqData();
            reqData.setWbMerchantId(weBankMchNo);
            reqData.setOrderId(oldPaymentEntity.getPayNo());
            reqData.setOutRequestNo(refundPaymentEntity.getPayNo());
            WaRefundQueryResData resData = WebankPayUnit.alipayRefundQuery(reqData);
            //微众银行退款单号
            map.put("tradeNo", resData.getTradeNo());
        }else{
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(refundPaymentEntity.getPayNo());
            //第三方流水号
            if (paymentLogInfo != null) {
                if (StringUtil.isNotEmpty(paymentLogInfo.getTransactionId())) {
                    map.put("tradeNo", paymentLogInfo.getTransactionId());
                } else {
                    map.put("tradeNo", paymentLogInfo.getTrade_no());
                }
            }
        }
        return map;
    }

    /**
     * 支付宝退款结果查询接口(暂未调用支付宝接口，只查询交易网关退款结果)
     *
     * @param orderNo      订单号
     * @param aliConfigure 支付配置
     * @return PaymentEntity
     */
    public PaymentEntity aliRefundQuery(String orderNo, AliConfigure aliConfigure) {

        basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

      return baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);
    }

    /**
     * 支付结果事件查询
     *
     * @param payNo 付款单号
     * @return PaymentLogInfo
     */
    public PaymentLogInfo queryPaymentLogInfo(String payNo) {

        PaymentLogInfo paymentLogInfo = paymentLogInfoService.selectByOutTradeNo(payNo, null);

        if (paymentLogInfo == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(), ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        return paymentLogInfo;
    }

    /**
     * 微信退款订单查询
     *
     * @param orderNo 订单号
     * @return PaymentEntity
     */
    public Map<String,Object> wechatRefundQuery(String orderNo, WechatConfigure wechatConfigure) {

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        PaymentEntity refundPaymentEntity = baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
        Map<String, Object> map = new HashMap<>();

        //外部订单号
        map.put("orderNo", orderNo);
        //容易网交易号
        map.put("payNo", refundPaymentEntity.getPayNo());
         //交易金额
        map.put("totalAmount", oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        //退款金额
        map.put("refundAmount", refundPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
        map.put("refundStatus", "SUCCESS");

        if(!refundPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)){
            RefundQueryResData resData = WeChatPayUnit.refundQuery(null, oldPaymentEntity.getPayNo(), null, wechatConfigure);
            //微众银行退款单号
            map.put("tradeNo", resData.getTransaction_id());
        }else{
            PaymentLogInfo paymentLogInfo = queryPaymentLogInfo(oldPaymentEntity.getPayNo());
            //第三方流水号
            if (paymentLogInfo != null) {
                if(StringUtil.isNotEmpty(paymentLogInfo.getTransactionId())) {
                    map.put("tradeNo", paymentLogInfo.getTransactionId());
                }else{
                    map.put("tradeNo", paymentLogInfo.getTrade_no());
                }
            }
        }
        return map;

    }

    /**
     * 现金支付订单查询
     *
     * @param orderNo 订单号
     * @return PaymentEntity
     */
    public PaymentEntity cashPayQueryOrder(String orderNo) {

        PaymentEntity paymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3);
        //to 此处是由于产品不合理的需求,在查询接口中返回退款状态而做的特殊处理，已退款强制设置支付状态为3表示已退款
        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, null,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3);
        if (refundPayment != null && refundPayment.getStatus() == Constants.PAYMENT_STATUS.STAUS2) {
            paymentEntity.setStatus(3);
        }
        return paymentEntity;
    }

    /**
     * 现金退款订单查询
     *
     * @param orderNo 订单号
     * @return PaymentEntity
     */
    public PaymentEntity cashRefundQueryOrder(String orderNo) {

        return baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3);
    }


    /**
     * 银行卡支付订单查询
     *
     * @param orderNo 订单号
     * @return PaymentEntity
     */
    public PaymentEntity posBankCardPayQueryOrder(String orderNo) {

        PaymentEntity paymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);

        //to 此处是由于产品不合理的需求,在查询接口中返回退款状态而做的特殊处理，已退款强制设置支付状态为3表示已退款
        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, null,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);
        if (refundPayment != null && refundPayment.getStatus() == Constants.PAYMENT_STATUS.STAUS2) {
            paymentEntity.setStatus(3);
        }
        return paymentEntity;
    }

    /**
     * pos银行卡退款订单查询
     *
     * @param orderNo 订单号
     * @return PunchCardPayQueryResData
     */
    public PaymentEntity posBankCardRefundQueryOrder(String orderNo) {

        return baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);
    }


    private PaymentEntity basePayQuery(String orderNo, Integer payType) {

        PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null,
                payType);

        if (paymentEntity == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(), ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }

        validateRePay(paymentEntity);

        return paymentEntity;
    }

    /**
     * 检查已付款记录是否存在重复付款
     */
    private void validateRePay(PaymentEntity paymentEntity) {
        if (paymentEntity.getStatus() == Constants.PAYMENT_STATUS.STAUS2) {
            List<PaymentEntity> list = paymentService.selectByOrderNum(paymentEntity.getOrderNum(), paymentEntity.getTradeType(), null, Constants.PAYMENT_STATUS.STAUS2);
            if (list != null && list.size() > 1) {
                throw new TradePayException(ConstantEnum.EXCEPTION_ORDER_REPAY.getCodeStr(), ConstantEnum.EXCEPTION_ORDER_REPAY.getValueStr());
            }
        }

    }

    private PaymentEntity baseRefundQuery(String orderNo, Integer payType) {

        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, null,
                payType);

        if (refundPayment == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_REFUND_RECORED_NOT_EXIST.getCodeStr(), ConstantEnum.EXCEPTION_REFUND_RECORED_NOT_EXIST.getValueStr());
        }
        return refundPayment;
    }

    /**
     * 查询时检查是否已支付，如已支付，更新支付状态
     */
    private void updatePayment(PaymentEntity paymentEntity, String tradeNo, String buyerId, String buyerEmail) {

        log.info("检查是否已支付未更新状态,paymentEntity={},tradeNo={}", paymentEntity, tradeNo);

        if (paymentEntity.getStatus() != Constants.PAYMENT_STATUS.STAUS2) {
            //更新支付状态
            paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
            paymentEntity.setFinishTime(new Date());
            Integer totalFee = paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).intValue();
            //初始化支付事件记录
            PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(tradeNo, paymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                    "SUCCESS", totalFee, buyerId, buyerEmail,
                    0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");
            //保存支付记录
            saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo, null);
        }
    }
}
