package com.rongyi.rpb.service.impl;

import com.google.common.base.Strings;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.Exception.WeixinException;
import com.rongyi.rpb.common.pay.weixin.model.RefundResData;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.*;
import com.rongyi.rpb.unit.TimeExpireUnit;
import com.rongyi.rpb.unit.WeixinPayUnit;
import com.rongyi.rss.rpb.OrderNoGenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: 柯军
 * @Description: 微信支付
 * @datetime:2015年4月23日上午10:07:12
 **/
@Service
public class WeixinPayServiceImpl extends BaseServiceImpl implements WeixinPayService {

    @Autowired
    PCWebPageAlipayService pcWebPageAlipayService;

    @Autowired
    PaymentLogInfoService paymentLogInfoService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    OrderNoGenService orderNoGenService;

    @Autowired
    PaymentItemService paymentItemService;

    @Autowired
    RpbEventService rpbEventService;

    @Autowired
    Sender sender;

    @Autowired
    TimeExpireUnit timeExpireUnit;

    @Autowired
    WeixinPayUnit weixinPayUnit;

    private static final Logger LOGGER = LoggerFactory.getLogger(WeixinPayServiceImpl.class);

    @Override
    public Map<String, Object> getAppWeXinSign(String payNo, double total_fee, String timeStart, String timeExpire, Integer orderType) {
        LOGGER.info("获取微信支付签名 getAppWeXinSign,payNo={},total_fee={}，timeStart={},timeExpire={},orderType={}", payNo, total_fee, timeStart, timeExpire, orderType);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BigDecimal totalFee = new BigDecimal(total_fee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
            if (Strings.isNullOrEmpty(timeStart))
                timeStart = DateUtil.dateToString(new Date(), "yyyyMMddHHmmss");
            timeExpire = timeExpireUnit.weixinPayTimeExpire(timeStart, timeExpire, orderType);
            map = weixinPayUnit.getWeXinPaySign(payNo, totalFee.intValue(), "容易网商品", timeStart, timeExpire);
            map.put("code", 0);
            map.put("totlePrice", total_fee);
        } catch (WeixinException e) {
            map.put("code", e.getCode());
            map.put("message", e.getMessage());
            e.printStackTrace();
        }
        return map;
    }


    @Override
    public boolean validateIsWeixinPay(MessageEvent event) {
        PaymentEntityVO paymentEntityVO = paymentService.bodyToPaymentEntity(event.getBody(), null);
        PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntityVO.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);// 根据退款单记录中的订单号找到对应的历史付款单记录（用来查找付款交易流水号）
        if (paymentEntity == null)
            return false;
        return true;
    }


    @Override
    public boolean messageToRefund(PaymentEntityVO paymentEntityVO, PaymentEntity hisPayEntity) {
        LOGGER.info("MQ消息申请退款，历史付款单号payNo={},历史付款订单号orderNo={}", hisPayEntity.getPayNo(), hisPayEntity.getOrderNum());
        String newPayNo = paymentService.getPayNo();
        Map<String, Object> result = weixinRefund(hisPayEntity.getPayNo(), paymentEntityVO.getAmountMoney().doubleValue(), hisPayEntity.getAmountMoney().doubleValue(), newPayNo,
                Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1);
        PaymentEntity paymentEntity = new PaymentEntity();
        BeanUtils.copyProperties(paymentEntityVO, paymentEntity);
        paymentEntity.setPayNo(newPayNo);
        paymentEntity.setTradeType(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1);
        paymentEntity.setCreateTime(DateUtil.getCurrDateTime());
        paymentEntity.setPayChannel(hisPayEntity.getPayChannel());
        if (Constants.RESULT.SUCCESS.equals(result.get("result"))) {
            paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
            paymentEntity.setFinishTime(DateUtil.getCurrDateTime());
        } else {
            paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS0);
            LOGGER.info("微信退款失败,生成预支付退款记录，但未生成付款成功事件！");
        }
        paymentService.insertByOrderDetailNum(paymentEntity, paymentEntityVO.getOrderDetailNumArray());
        return Constants.RESULT.SUCCESS.equals(result.get("result"));
    }

    @Override
    public Map<String, Object> weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo, Integer tradeType) {
        LOGGER.info("申请微信退款  weixinRefund payNo={},refundFee={},totalFee={},newPayNo={},tradeType={}", payNo, refundFee, totalFee, newPayNo, tradeType);

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            //微信退款
            RefundResData refundResData = weixinPayUnit.weixinRefund(payNo, refundFee, totalFee, newPayNo);
            //退款成功后睡眠1秒钟后查询结果，否则微信端可能未处理完退款申请，导致查询结果错误
            Thread.sleep(1000);
            //退款查询结果验证是否成功退款
            weixinPayUnit.checkRefundQueryResult(null, null, newPayNo);
            //记录退款事件
            savePaymentLogInfo(refundResData, tradeType);
            map.put("result", ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getCodeStr());
            map.put("message", ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getValueStr());
        } catch (WeixinException e) {
            map.put("result", "FAIL");
            map.put("message", e.getMessage());
        } catch (Exception e) {
            map.put("result", "FAIL");
            map.put("message", e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public void savePaymentLogInfo(RefundResData refundResData, Integer tradeType) {
        LOGGER.info("退款成功保存退款事件 savePaymentLogInfo");
        PaymentLogInfo oldPaymentLogInfo = paymentLogInfoService.selectByPayTradeNo(refundResData.getTransaction_id());
        PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
        paymentLogInfo.setNotifyTime(DateUtil.getCurrDateTime());
        paymentLogInfo.setTimeEnd(DateUtil.getCurrDateTime());
        paymentLogInfo.setSign(refundResData.getSign());
        paymentLogInfo.setSignType("MD5");
        paymentLogInfo.setTradeMode("1");
        paymentLogInfo.setTransactionId(refundResData.getRefund_id());
        paymentLogInfo.setOutTradeNo(refundResData.getOut_refund_no());
        paymentLogInfo.setTimeEnd(DateUtil.getCurrDateTime());
        paymentLogInfo.setTrade_no(refundResData.getTransaction_id());
        paymentLogInfo.setResult(refundResData.getResult_code());
        paymentLogInfo.setTotal_fee(Double.valueOf(refundResData.getRefund_fee()) / 100);// 微信金额单位为分，转换为元
        paymentLogInfo.setReplayFlag(3);
        paymentLogInfo.setEventType(Constants.EVENT_TYPE.EVENT_TYPE5);
        paymentLogInfo.setTradeType(tradeType);
        if (oldPaymentLogInfo != null)
            paymentLogInfo.setBuyer_email(oldPaymentLogInfo.getBuyer_email());
        paymentLogInfoService.insert(paymentLogInfo);
    }


    @Override
    public void closeOrder(String payNo) {
        weixinPayUnit.closeOrder(payNo);
        paymentService.deleteByPayNo(payNo);
    }

    @Override
    public WeixinQueryOrderParamVO queryOrder(String tradeNo, String payNo) {
        return weixinPayUnit.queryOrder(tradeNo, payNo);
    }

    @Override
    public void batchTriggerWeixinRefund() {
        LOGGER.info("微信批量退款定时任务启动");
        try {
            List<String> failList = new ArrayList<String>();
            List<String> successList = new ArrayList<String>();
            List<PaymentEntity> list = paymentService.selectByTradeTypeAndRefundRejected(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1,
                    Constants.REFUND_REJECTED.REFUND_REJECTED0, Constants.PAYMENT_STATUS.STAUS0);
            for (PaymentEntity paymentEntity : list) {
                successList.add(paymentEntity.getPayNo());
                PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                        paymentEntity.getPayChannel());
                Map<String, Object> refundResultMap = weixinRefund(oldPaymentEntity.getPayNo(), paymentEntity.getAmountMoney().doubleValue(), oldPaymentEntity.getAmountMoney().doubleValue(),
                        paymentEntity.getPayNo(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1);
                if (Constants.RESULT.SUCCESS.equals(refundResultMap.get("result")) || ConstantEnum.WEIXIN_REFUND_RESULT_PROCESSING.getCodeStr().equals(refundResultMap.get("result"))) {
                    paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
                    paymentEntity.setFinishTime(DateUtil.getCurrDateTime());
                    paymentService.updateByPrimaryKeySelective(paymentEntity);
                    String target = Constants.SOURCETYPE.OSM;
                    String orderDetailNum = "";
                    if (Constants.ORDER_TYPE.ORDER_TYPE_1 == oldPaymentEntity.getOrderType()) {
                        target = Constants.SOURCETYPE.COUPON;
                        List<PaymentItemEntity> itemList = paymentItemService.selectByPaymentId(paymentEntity.getId());
                        orderDetailNum = paymentItemService.getDetailNum(itemList);
                    }
                    MessageEvent event = rpbEventService.getMessageEvent(paymentEntity.getPayNo(), paymentEntity.getOrderNum(), orderDetailNum, paymentEntity.getPayChannel().toString(), null,
                            Constants.SOURCETYPE.RPB, target, PaymentEventType.REFUND);
                    sender.convertAndSend(event);
                } else {
                    failList.add(paymentEntity.getPayNo());
                }
            }
            LOGGER.info("微信批量退款定时任务结束,failList={}", failList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
