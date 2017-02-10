package com.rongyi.rpb.bizz;

import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.wechat.model.PunchCardPayQueryResData;
import com.rongyi.pay.core.wechat.model.PunchCardPayResData;
import com.rongyi.pay.core.wechat.model.WechatPaySignData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.Exception.TradeException;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * conan
 * 2017/2/7 10:28
 **/
@Repository
public class PayBizz {

    @Autowired
    PaymentService paymentService;
    @Autowired
    InitEntityUnit initEntityUnit;
    @Autowired
    SaveUnit saveUnit;
    @Autowired
    RedisService redisService;

    /**
     * 微信扫码支付签名
     *
     * @param ryMchId 商户在容易网的商户号
     * @param wechatPaySignData 业务参数
     * @param wechatConfigure   支付参数
     * @return map
     */
    public Map<String, Object> wechatScanPaySign(String ryMchId,WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchId,wechatPaySignData.getOrderNo(), wechatPaySignData.getTotalFee(), "", wechatConfigure.getMchID(), Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, Constants.ORDER_TYPE.ORDER_TYPE_6);

        //获取微信支付签名
        wechatPaySignData.setPayNo(paymentEntity.getPayNo());
        Map<String, Object> map = WeChatPayUnit.getPaySign(wechatPaySignData, wechatConfigure, wechatConfigure.getNotifyUrl());

        //保存异步通知地址
        redisService.set(paymentEntity.getPayNo() + paymentEntity.getOrderNum(), wechatConfigure.getNotifyUrl());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, null);

        return map;

    }

    /**
     * 微信刷卡支付
     * @param ryMchId 商户在容易网的商户号
     * @param wechatPaySignData 业务参数
     * @param wechatConfigure   支付参数
     * @return PunchCardPayResData
     */
    public PunchCardPayResData wechatPunchCardPay(String ryMchId,WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchId,wechatPaySignData.getOrderNo(),wechatPaySignData.getTotalFee(),"", wechatConfigure.getMchID(),Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1,Constants.ORDER_TYPE.ORDER_TYPE_6);

        //发起支付
        wechatPaySignData.setPayNo(paymentEntity.getPayNo());
        PunchCardPayResData punchCardPayResData = WeChatPayUnit.punchCardPay(wechatPaySignData, wechatConfigure);

        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(punchCardPayResData.getTransaction_id(), punchCardPayResData.getOut_trade_no(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                punchCardPayResData.getResult_code(), punchCardPayResData.getTotal_fee(), punchCardPayResData.getOpenid(), punchCardPayResData.getOpenid(),
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);

        return punchCardPayResData;
    }

    /**
     * 微信刷卡支付订单查询
     *
     * @param orderNo         订单号
     * @param wechatConfigure 支付参数
     * @return PunchCardPayQueryResData
     */
    public PunchCardPayQueryResData wechatPunchCardPayQueryOrder(String orderNo, WechatConfigure wechatConfigure) {

        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        if (oldPaymentEntity == null) {
            throw new TradeException("此订单支付记录不存在,orderNo={}", orderNo);
        }
        return WeChatPayUnit.punchCardPayQueryOrder(null, oldPaymentEntity.getPayNo(), wechatConfigure);
    }

    /**
     * 支付宝扫码支付签名
     * @param ryMchId 商户在容易网的商户号
     * @param aliScanPayReqData 业务参数
     * @param aliConfigure 支付参数
     * @return map
     */
    public Map<String, Object> aliScanPaySign(String ryMchId,AliScanPayReqData aliScanPayReqData, AliConfigure aliConfigure) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchId,aliScanPayReqData.getOrderNo(), aliScanPayReqData.getTotalAmount(), aliScanPayReqData.getSellerId(),"",Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0,Constants.ORDER_TYPE.ORDER_TYPE_6);

        //获取支付宝扫码支付签名
        aliScanPayReqData.setPayNo(paymentEntity.getPayNo());
        Map<String, Object> map = AliPayUnit.getScanPaySign( aliScanPayReqData,aliConfigure);

        //保存异步通知地址
        redisService.set(paymentEntity.getPayNo() + paymentEntity.getOrderNum(), aliConfigure.getNotifyUrl());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, null);

        return map;
    }


    /**
     * 支付宝刷卡支付
     * @param ryMchId 商户在容易网的商户号
     * @param aliPunchCardPayReqData 业务参数
     * @param aliConfigure 支付参数
     * @return AlipayTradePayResponse
     */
    public AlipayTradePayResponse aliPunchCardPay(String ryMchId,AliPunchCardPayReqData aliPunchCardPayReqData,AliConfigure aliConfigure){

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchId,aliPunchCardPayReqData.getOrderNo(),aliPunchCardPayReqData.getTotalAmount(),aliPunchCardPayReqData.getSellerId(),
                "",Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0,Constants.ORDER_TYPE.ORDER_TYPE_6);

        //发起支付
        aliPunchCardPayReqData.setPayNo(paymentEntity.getPayNo());
        AlipayTradePayResponse alipayTradePayResponse = AliPayUnit.punchCardPay(aliPunchCardPayReqData, aliConfigure);

        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(alipayTradePayResponse.getTradeNo(), alipayTradePayResponse.getOutTradeNo(), Constants.REPLAY_FLAG.REPLAY_FLAG0,
                "SUCCESS", aliPunchCardPayReqData.getTotalAmount(), alipayTradePayResponse.getBuyerUserId(), alipayTradePayResponse.getBuyerLogonId(),
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);

        return alipayTradePayResponse;
    }

    /**
     * 支付宝面对面支付查询
     * @param orderNo 订单号
     * @param aliConfigure 支付参数
     * @return AlipayTradeQueryResponse
     */
    public AlipayTradeQueryResponse aliF2FPayQuery(String orderNo,AliConfigure aliConfigure){

        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0);

        if (oldPaymentEntity == null) {
            throw new TradeException("此订单支付记录不存在,orderNo={}", orderNo);
        }
        return AliPayUnit.f2fPayQuery(oldPaymentEntity.getPayNo(),null,aliConfigure);


    }

    /**
     * 初始化支付记录信息
     */
    private PaymentEntity initPaymentEntity(String ryMchId,String orderNo, Integer totalFee, String aliSellerId, String wechatMchId, Integer payChannel, Integer orderType) {

        //查找支付记录
        PaymentEntity paymentEntity = paymentService.selectByOrderNoAndPayChannelWithLock(orderNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);

        //支付记录已存在
        if (paymentEntity != null) {
            if (Constants.PAYMENT_STATUS.STAUS2 == paymentEntity.getStatus() && payChannel.equals(paymentEntity.getPayChannel())) {// 订单已完成支付后重新发起支付请求
                throw new TradeException("此订单已成功支付,此次请求属于订单重复支付请求,请重新下单,orderNo=" + orderNo);
            }
            paymentEntity.setWechatMchId(wechatMchId);
            paymentEntity.setAliSellerId(aliSellerId);
            paymentEntity.setCreateTime(DateUtil.getCurrDateTime());
            paymentEntity.setOrderPrice(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        } else {
            //生成支付信息
            paymentEntity = initEntityUnit.initPaymentEntity(ryMchId,orderNo, totalFee, orderType, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, payChannel, aliSellerId, wechatMchId);
        }
        return paymentEntity;
    }
}
