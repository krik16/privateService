package com.rongyi.rpb.bizz;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.wechat.model.RefundQueryResData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * conan
 * 2017/2/27 14:25
 **/
@Repository
public class QueryBizz {

    @Autowired
    PaymentService paymentService;
    @Autowired
    PayConfigInitUnit payConfigInitUnit;
    @Autowired
    PaymentLogInfoService paymentLogInfoService;
    /**
     * 微众微信刷卡支付订单查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WwPunchCardResData webankWechatPunchCardPayQueryOrder(String orderNo, String weBankMchNo) {


        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        WwPunchCardQueryOrderReqData reqData  = new WwPunchCardQueryOrderReqData(weBankMchNo,oldPaymentEntity.getPayNo());

        WwPunchCardResData resData = WebankPayUnit.wechatPunchCardPayQueryOrder(reqData);

        //检查是否支付是否成功
        if(!("0".equals(resData.getResult().getErrno()) && "1".equals(resData.getPayment()))
                && !com.rongyi.pay.core.constants.ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getResult().getErrno())){
            throw new WebankException(resData.getResult().getErrno(), resData.getResult().getErrmsg());
        }
        resData.setTerminal_serialno(oldPaymentEntity.getPayNo());
        return resData;
    }

    /**
     * 微众微信刷卡支付退款查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WwPunchCardRefundResData webankWechatPunchCardRefundQuery(String orderNo, String weBankMchNo) {


        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        WwpunchCardRefundReqData reqData  = new WwpunchCardRefundReqData();
        reqData.setMerchant_code(weBankMchNo);
        reqData.setTerminal_serialno(oldPaymentEntity.getPayNo());

        WwPunchCardRefundResData resData = WebankPayUnit.wechatPunchCardRefundQuery(reqData);

        resData.setPayNo(oldPaymentEntity.getPayNo());
        return resData;
    }

    /**
     * 微众支付宝刷卡支付订单查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WaQueryTradeResData weBankAliPunchCardPayQueryOrder(String orderNo,String weBankMchNo) {

        //初始化设置支付宝ticket
        payConfigInitUnit.initAliTicket();

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        WaQueryTradeReqData reqData  = new WaQueryTradeReqData(weBankMchNo,oldPaymentEntity.getPayNo());

        WaQueryTradeResData resData = WebankPayUnit.alipayQueryTrade(reqData);
        if(!"0".equals(resData.getCode()) ||
                (!com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_01.getCodeStr().equals(resData.getTradeStatus()) &&
                !com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_03.getCodeStr().equals(resData.getTradeStatus()) &&
                !com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_05.getCodeStr().equals(resData.getTradeStatus()))){
            throw new TradePayException(resData.getCode(),resData.getMsg());
        }
        resData.setOutTradeNo(oldPaymentEntity.getPayNo());
        return resData;
    }


    /**
     * 微众支付宝退款订单查询
     *
     * @param orderNo     订单号
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WaRefundQueryResData webankAliPunchCardRefundQuery(String orderNo, String weBankMchNo) {

        //初始化设置支付宝ticket
        payConfigInitUnit.initAliTicket();

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        PaymentEntity refundPaymentEntity = baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        WaRefundQueryReqData reqData  = new WaRefundQueryReqData();
        reqData.setWbMerchantId(weBankMchNo);
        reqData.setOrderId(oldPaymentEntity.getPayNo());
        reqData.setOutRequestNo(refundPaymentEntity.getPayNo());

        return WebankPayUnit.alipayRefundQuery(reqData);

    }

    /**
     *
     * 支付宝退款结果查询接口(暂未调用支付宝接口，只查询交易网关退款结果)
     * @param orderNo 订单号
     * @param aliConfigure 支付配置
     * @return PaymentEntity
     */
    public PaymentEntity aliRefundQuery(String orderNo,AliConfigure aliConfigure) {

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);
        return oldPaymentEntity;
    }
    /**
     *
     * 支付结果事件查询
     * @param payNo 付款单号
     * @return PaymentLogInfo
     */
    public PaymentLogInfo queryPaymentLogInfo(String payNo) {

        PaymentLogInfo paymentLogInfo = paymentLogInfoService.selectByOutTradeNo(payNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0);

        if (paymentLogInfo == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        return paymentLogInfo;
    }

        /**
         * 微信退款订单查询
         *
         * @param orderNo     订单号
         * @return PaymentEntity
         */
    public RefundQueryResData wechatRefundQuery(String orderNo,WechatConfigure wechatConfigure) {

        PaymentEntity oldPaymentEntity = basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        RefundQueryResData refundQueryResData = WeChatPayUnit.refundQuery(null,oldPaymentEntity.getPayNo(),null,wechatConfigure);
        refundQueryResData.setTotalAmount(oldPaymentEntity.getAmountMoney());
        return refundQueryResData;

    }

    /**
     * 现金支付订单查询
     *
     * @param orderNo     订单号
     * @return PaymentEntity
     */
    public PaymentEntity cashPayQueryOrder(String orderNo) {

       return basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3);
    }

    /**
     * 现金退款订单查询
     *
     * @param orderNo     订单号
     * @return PaymentEntity
     */
    public PaymentEntity cashRefundQueryOrder(String orderNo) {

         return baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3);
    }


    /**
     * 银行卡支付订单查询
     *
     * @param orderNo     订单号
     * @return PaymentEntity
     */
    public PaymentEntity posBankCardPayQueryOrder(String orderNo) {

       return basePayQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);
    }

    /**
     * pos银行卡退款订单查询
     *
     * @param orderNo     订单号
     * @return PunchCardPayQueryResData
     */
    public PaymentEntity posBankCardRefundQueryOrder(String orderNo) {

        return baseRefundQuery(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);
    }



    private PaymentEntity basePayQuery(String orderNo, Integer payType){

        PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null,
                payType);

        if (paymentEntity == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        return paymentEntity;
    }

    private PaymentEntity baseRefundQuery(String orderNo, Integer payType){

        PaymentEntity refundPayment = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,null,
                payType);

        if (refundPayment == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_REFUND_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_REFUND_RECORED_NOT_EXIST.getValueStr());
        }
        return refundPayment;
    }
}
