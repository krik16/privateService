package com.rongyi.rpb.bizz;

import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.wechat.model.RefundResData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.Exception.TradeException;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.SaveUnit;
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

    /**
     * 微信支付退款
     * @param orderNo 订单号
     * @param refundFee 退款金额
     * @param wechatConfigure 支付参数
     * @return RefundResData
     */
    public RefundResData weChatRefund(String orderNo, int refundFee, WechatConfigure wechatConfigure){

        //查找订单支付记录
        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
        if (oldPaymentEntity == null) {
            throw new TradeException("此订单支付记录不存在,orderNo={}",orderNo);
        }

        //初始化退款入住商户信息
        RyMchVo ryMchVo = initRefundRyMchVo(oldPaymentEntity);

        //初始化退款记录
        PaymentEntity refundPaymentEntity = initEntityUnit.initPaymentEntity(ryMchVo,orderNo, refundFee, Constants.ORDER_TYPE.ORDER_TYPE_6, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, "", wechatConfigure.getMchID());
        Integer payAmount = oldPaymentEntity.getAmountMoney().multiply(new BigDecimal(100)).intValue();
        //发起退款
        RefundResData refundResData = WeChatPayUnit.refund(oldPaymentEntity.getPayNo(), refundFee,payAmount, refundPaymentEntity.getPayNo(), wechatConfigure);

        refundPaymentEntity.setFinishTime(new Date());
        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(refundResData.getTransaction_id(),refundResData.getOut_refund_no(),Constants.REPLAY_FLAG.REPLAY_FLAG3,
                refundResData.getResult_code(),Integer.valueOf(refundResData.getTotal_fee()),"","",
                0,0,Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,refundResData.getRefund_id());

        //保存记录
        saveUnit.updatePaymentEntity(refundPaymentEntity,paymentLogInfo);

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
        //查找订单支付记录
        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0,Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);
        if (oldPaymentEntity == null) {
            throw new TradeException("此订单支付记录不存在,orderNo={}",orderNo);
        }

        //初始化退款入住商户信息
        RyMchVo ryMchVo = initRefundRyMchVo(oldPaymentEntity);

        //初始化退款记录
        PaymentEntity refundPaymentEntity = initEntityUnit.initPaymentEntity(ryMchVo, orderNo, refundFee, Constants.ORDER_TYPE.ORDER_TYPE_6, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, aliConfigure.getAppid(), "");
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

        return alipayTradeRefundResponse;

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
}
