package com.rongyi.rpb.bizz;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.v6.PaymentEntityVo;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.tianyi.param.RefundParam;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.pay.core.unit.TianyiPayUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.WaRefundReqData;
import com.rongyi.pay.core.webank.model.WaRefundResData;
import com.rongyi.pay.core.webank.model.WwPunchCardRefundResData;
import com.rongyi.pay.core.webank.model.WwpunchCardRefundReqData;
import com.rongyi.pay.core.wechat.model.RefundResData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.rpb.OrderNoGenService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

/**
 * conan 
 * 2017/2/7 15:36
 **/
@Repository
public class RefundBizz {

//    private static final Logger log = LoggerFactory.getLogger(RefundBizz.class);

    @Autowired
    PaymentService paymentService;
    @Autowired
    SaveUnit saveUnit;
    @Autowired
    InitEntityUnit initEntityUnit;
    @Autowired
    PayConfigInitUnit payConfigInitUnit;
    @Autowired
    OrderNoGenService orderNoGenService;

    /**
     * 微信支付退款
     * @param orderNo 订单号
     * @param refundFee 退款金额
     * @param wechatConfigure 支付参数
     * @return RefundResData
     */
    public RefundResData weChatRefund(String orderNo, int refundFee, WechatConfigure wechatConfigure){

        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundFee, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, oldPaymentEntity);

        Integer payAmount = oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).intValue();


        //发起退款
        RefundResData refundResData = WeChatPayUnit.refund(oldPaymentEntity.getPayNo(), refundFee, payAmount, refundPaymentEntity.getPayNo(), wechatConfigure);

        refundPaymentEntity.setFinishTime(new Date());
        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(refundResData.getTransaction_id(),refundResData.getOut_refund_no(),Constants.REPLAY_FLAG.REPLAY_FLAG3,
                refundResData.getResult_code(),Integer.valueOf(refundResData.getTotal_fee()),"","",
                0,0,Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,refundResData.getRefund_id());

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, paymentLogInfo);

        return refundResData;
    }

    /**
     * 支付宝面对面支付退款
     * @param orderNo 订单号
     * @param refundFee 退款金额
     * @param refundReason 退款原因
     * @param aliConfigure 支付参数
     * @return AlipayTradeRefundResponse
     */
    public AlipayTradeRefundResponse aliRefund(String orderNo, Integer refundFee, String refundReason, AliConfigure aliConfigure){


        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundFee, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, oldPaymentEntity);

        //发起退款
        AlipayTradeRefundResponse alipayTradeRefundResponse = AliPayUnit.f2fPayRefund(oldPaymentEntity.getPayNo(), refundFee, refundPaymentEntity.getPayNo(), refundReason, "", aliConfigure);
        refundPaymentEntity.setFinishTime(new Date());
        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(alipayTradeRefundResponse.getTradeNo(),alipayTradeRefundResponse.getOutTradeNo(),Constants.REPLAY_FLAG.REPLAY_FLAG3,
                "SUCCESS",refundFee,alipayTradeRefundResponse.getBuyerUserId(),alipayTradeRefundResponse.getBuyerLogonId(),
                0,0,Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,alipayTradeRefundResponse.getOpenId());

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, paymentLogInfo);

        alipayTradeRefundResponse.setRefundFee(oldPaymentEntity.getAmountMoney().toString());

        return alipayTradeRefundResponse;

    }


    /**
     * 微众微信退款
     *
     * @return WwPunchCardRefundResData
     */
    public WwPunchCardRefundResData webankWechatRefund(String orderNo,Integer refundAmount,String webankMchNo){

        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundAmount, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, oldPaymentEntity);

        WwpunchCardRefundReqData wwpunchCardRefundReqData = new WwpunchCardRefundReqData();
        wwpunchCardRefundReqData.setMerchant_code(webankMchNo);
        wwpunchCardRefundReqData.setTerminal_serialno(oldPaymentEntity.getPayNo());
        BigDecimal refundFee = new BigDecimal(refundAmount).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
        wwpunchCardRefundReqData.setRefund_amount(refundFee);
        WwPunchCardRefundResData resData = WebankPayUnit.wechatPunchCardRefund(wwpunchCardRefundReqData);
        //发起退款
        refundPaymentEntity.setFinishTime(new Date());
        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo("", refundPaymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                "SUCCESS", refundAmount, "", "",
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, resData.getRefundid());

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, paymentLogInfo);

        resData.setRefund_fee(new BigDecimal(refundAmount).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        resData.setTotal_fee(oldPaymentEntity.getAmountMoney());
        resData.setPayNo(oldPaymentEntity.getPayNo());
        return resData;

    }

    /**
     * 微众支付宝退款
     *
     * @return WwPunchCardRefundResData
     */
    public WaRefundResData webankAliRefund(String orderNo,Integer refundAmount,String webankMchNo){
        //初始化设置支付宝ticket
        payConfigInitUnit.initAliTicket();

        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundAmount, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, oldPaymentEntity);

        WaRefundReqData reqData = new WaRefundReqData();
        reqData.setWbMerchantId(webankMchNo);
        reqData.setOrderId(oldPaymentEntity.getPayNo());
        BigDecimal refundFee = new BigDecimal(refundAmount).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
        reqData.setRefundAmount(refundFee);
        reqData.setOutRequestNo(refundPaymentEntity.getPayNo());
        WaRefundResData resData = WebankPayUnit.alipayRefund(reqData);
        //发起退款
        refundPaymentEntity.setFinishTime(new Date());
        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);

        Integer resultRefundFee = new BigDecimal(resData.getRefundFee()).multiply(new BigDecimal(100)).intValue();
        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(resData.getTradeNo(),refundPaymentEntity.getPayNo(),Constants.REPLAY_FLAG.REPLAY_FLAG3,
                "SUCCESS",resultRefundFee,"","",
                0,0,Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,"");

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, paymentLogInfo);

        return resData;

    }

    /**
     * 现金退款
     *
     * @return WwPunchCardRefundResData
     */
    public PaymentEntityVo cashRefund(String orderNo,Integer refundAmount){

        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3);

        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundAmount, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3, oldPaymentEntity);

        refundPaymentEntity.setFinishTime(new Date());
        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(orderNoGenService.getOrderNo("6"), refundPaymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                "SUCCESS", refundAmount, "", "",
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, "");

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, paymentLogInfo);

        PaymentEntityVo paymentEntityVo = new PaymentEntityVo();
        BeanUtils.copyProperties(refundPaymentEntity,paymentEntityVo);
        paymentEntityVo.setTradeNo(paymentLogInfo.getTrade_no());
        return paymentEntityVo;

    }
    /**
     * pos银行卡退款
     *
     * @return WwPunchCardRefundResData
     */
    public PaymentEntity posBankCardPayRefund(String orderNo,Integer refundAmount){

        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);

        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundAmount, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2, oldPaymentEntity);
        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, null);

        return refundPaymentEntity;

    }

    public PaymentEntity baseRefund(String orderNo,Integer refundAmount,Integer payType,PaymentEntity oldPaymentEntity){
        //初始化退款入住商户信息
        RyMchVo ryMchVo = initRefundRyMchVo(oldPaymentEntity);

        //查找订单退款记录
        PaymentEntity oldRefundPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, null,
                payType);

        if (oldRefundPaymentEntity != null && oldRefundPaymentEntity.getStatus() == Constants.PAYMENT_STATUS.STAUS2) {
            throw new TradePayException(ConstantEnum.EXCEPTION_REFUND_FAIL.getCodeStr(),ConstantEnum.EXCEPTION_REFUND_FAIL.getValueStr());
        }
        //未支付退款记录已存在，更新记录
        if(oldRefundPaymentEntity != null){
            oldRefundPaymentEntity.setAmountMoney(new BigDecimal(refundAmount).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
            return oldRefundPaymentEntity;
        }
        //初始化退款记录
        return initEntityUnit.initPaymentEntity(ryMchVo, orderNo,
                refundAmount, oldPaymentEntity.getOrderType(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,
                payType, "", "",oldPaymentEntity.getPayScene());
    }

    public PaymentEntity basePayment(String orderNo,Integer payType){
        //查找订单支付记录
        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                payType);

        if (oldPaymentEntity == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        return oldPaymentEntity;
    }

    /**
     * 翼支付退款
     * @param orderNo 订单号
     * @param refundAmount 退款金额
     */
    public void tianyiRefund(String orderNo,Integer refundAmount){
        //查找订单支付记录
        PaymentEntity oldPaymentEntity = basePayment(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL6);

        //查找退款记录
        PaymentEntity refundPaymentEntity = baseRefund(orderNo, refundAmount, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL6, oldPaymentEntity);
        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, null);

        //初始化翼支付请求参数
        RefundParam param = initTianyiRefundParam(refundAmount,oldPaymentEntity,refundPaymentEntity);

        //翼支付发起退款
        TianyiPayUnit.tradeRefund(param);

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, null);
    }

    public RyMchVo initRefundRyMchVo(PaymentEntity paymentEntity){
        //初始化开放商户信息
        RyMchVo ryMchVo = new RyMchVo();
        ryMchVo.setSource(paymentEntity.getSource());
        ryMchVo.setRyAppId(paymentEntity.getRyAppId());
        ryMchVo.setRyMchId(paymentEntity.getRyMchId());
        ryMchVo.setOrgChannel(paymentEntity.getOrgChannel());
        return ryMchVo;
    }

    private RefundParam initTianyiRefundParam(Integer totalAmount,PaymentEntity paymentEntity,PaymentEntity refundPayment){
        JSONObject json = JSONObject.parseObject(paymentEntity.getAttach());
        RefundParam refundParam = new RefundParam();
        refundParam.setMerchantId(String.valueOf(json.get("merchatId")));
        refundParam.setKey(String.valueOf(json.get("merchatKey")));
        refundParam.setMerchantPwd(String.valueOf(json.get("merchatPwd")));
        refundParam.setOldOrderNo(paymentEntity.getOrderNum());
        refundParam.setOldOrderReqNo(paymentEntity.getPayNo());
        refundParam.setRefundReqNo(refundPayment.getPayNo());
        refundParam.setRefundReqDate(DateUtil.getCurrentDateYYMMDD());
        refundParam.setTransAmt(String.valueOf(totalAmount));
        refundParam.setChannel("5");
        refundParam.setBgUrl(payConfigInitUnit.getTianyiRefundNotifyUrl());
        return refundParam;
    }
}
