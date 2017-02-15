package com.rongyi.rpb.unit;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rss.rpb.OrderNoGenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

/**
 * conan
 * 2017/2/7 10:46
 **/
@Repository
public class InitEntityUnit {

    private static final Logger log = LoggerFactory.getLogger(InitEntityUnit.class);

    @Autowired
    OrderNoGenService orderNoGenService;


    /**
     * 初始化支付记录
     */
    public PaymentEntity initPaymentEntity(String ryMchId,String orderNo,Integer totalFee,Integer orderType,Integer tradeType,Integer payChannel,
                                           String aliSellerId,String wechatMchId){
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setRyMchId(ryMchId);
        paymentEntity.setPayNo(orderNoGenService.getOrderNo("0"));
        paymentEntity.setOrderNum(orderNo);
        paymentEntity.setOrderType(orderType);
        paymentEntity.setOrderPrice(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        paymentEntity.setAmountMoney(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS0);
        paymentEntity.setTradeType(tradeType);
        paymentEntity.setCreateTime(new Date());
        paymentEntity.setPayChannel(payChannel);
        paymentEntity.setAliSellerId(aliSellerId);
        paymentEntity.setWechatMchId(wechatMchId);
        log.info("初始化支付记录,paymentEntity={}",paymentEntity);
        return paymentEntity;
    }

    /**
     * 初始化支付事件记录
     */
    public PaymentLogInfo initPaymentLogInfo(String tradeNo,String payNo,Integer replayFlag,String result,Integer totalFee,
                                             String buyerId,String buyerEmail,Integer buyerType,Integer eventType,
                                             Integer tradeType,String transactionId){
        PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
        paymentLogInfo.setTransactionId(transactionId);
        paymentLogInfo.setOutTradeNo(payNo);
        paymentLogInfo.setTimeEnd(new Date());
        paymentLogInfo.setReplayFlag(replayFlag);
        paymentLogInfo.setTrade_no(tradeNo);
        paymentLogInfo.setResult(result);
        paymentLogInfo.setTotal_fee(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).doubleValue());
        paymentLogInfo.setBuyer_id(buyerId);
        paymentLogInfo.setBuyer_email(buyerEmail);
        paymentLogInfo.setBuyer_type(buyerType);
        paymentLogInfo.setEventType(eventType);
        paymentLogInfo.setTradeType(tradeType);
        log.info("初始化支付事件记录,paymentLogInfo={}", paymentLogInfo);
        return paymentLogInfo;
    }
}
