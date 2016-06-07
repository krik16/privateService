package com.rongyi.rpb.service.impl;

import com.rongyi.core.Exception.TradeException;
import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.third.md5.Md5Util;
import com.rongyi.core.common.third.rsa.MalllifeRsaUtil;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.HttpUtil;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.constant.TradeConstantEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.Exception.WeixinException;
import com.rongyi.rpb.common.pay.weixin.model.PaySignData;
import com.rongyi.rpb.common.pay.weixin.model.RefundResData;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.*;
import com.rongyi.rpb.unit.TimeExpireUnit;
import com.rongyi.rpb.unit.WeixinPayUnit;
import com.rongyi.rss.rpb.OrderNoGenService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: 柯军
 * Description: 微信支付
 * datetime:2015年4月23日上午10:07:12
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

    @Autowired
    PropertyConfigurer propertyConfigurer;

    private static final Logger LOGGER = LoggerFactory.getLogger(WeixinPayServiceImpl.class);

    @Override
    public Map<String, Object> getAppWeXinSign(PaySignData paySignData) {
        LOGGER.info("获取微信支付签名 getAppWeXinSign,paySignData={}",paySignData);
        Map<String, Object> map = new HashMap<>();
        try {
            Map<String, String> timeExpireMap = timeExpireUnit.weixinPayTimeExpire(paySignData.getTimeStart(), paySignData.getTimeExpire(), paySignData.getOrderType());
            LOGGER.info("timeExpireMap={}", timeExpireMap);
            paySignData.setTimeStart(timeExpireMap.get("timeStart"));
            paySignData.setTimeExpire(timeExpireMap.get("timeExpire"));
            map = weixinPayUnit.getWeXinPaySign(paySignData);
            map.put("code", 0);
            map.put("totlePrice", paySignData.getTotalFee());
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
        return (paymentEntity != null);
    }


    @Override
    public boolean messageToRefund(PaymentEntityVO paymentEntityVO, PaymentEntity hisPayEntity) {
        LOGGER.info("MQ消息申请退款，历史付款单号payNo={},历史付款订单号orderNo={}", hisPayEntity.getPayNo(), hisPayEntity.getOrderNum());
        String newPayNo = paymentService.getPayNo();
        Map<String, Object> result = weixinRefund(hisPayEntity.getPayNo(), paymentEntityVO.getAmountMoney().doubleValue(), hisPayEntity.getAmountMoney().doubleValue(), newPayNo,
                Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,hisPayEntity.getWeixinMchId());
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
    public Map<String, Object> weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo, Integer tradeType,Integer weixinMchId) {
        LOGGER.info("申请微信退款  weixinRefund payNo={},refundFee={},totalFee={},newPayNo={},tradeType={},weixinMchId={}", payNo, refundFee, totalFee, newPayNo, tradeType,weixinMchId);

        Map<String, Object> map = new HashMap<>();
        try {
            //微信退款
            RefundResData refundResData = weixinPayUnit.weixinRefund(payNo, refundFee, totalFee, newPayNo,weixinMchId);
            //退款成功后睡眠1秒钟后查询结果，否则微信端可能未处理完退款申请，导致查询结果错误
            Thread.sleep(1000);
            //退款查询结果验证是否成功退款
            weixinPayUnit.checkRefundQueryResult(null, null, newPayNo,weixinMchId);
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
    public void closeOrder(String payNo,Integer weixinMchId) {
        weixinPayUnit.closeOrder(payNo, weixinMchId);
        paymentService.deleteByPayNo(payNo);
    }

    @Override
    public WeixinQueryOrderParamVO queryOrder(String tradeNo, String payNo,Integer weixinMchId) {
        return weixinPayUnit.queryOrder(tradeNo, payNo,weixinMchId);
    }

    @Override
    public void batchTriggerWeixinRefund() {
        LOGGER.info("微信批量退款定时任务启动");
        try {
            List<String> failList = new ArrayList<>();
            List<PaymentEntity> list = paymentService.selectByTradeTypeAndRefundRejected(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1,
                    Constants.REFUND_REJECTED.REFUND_REJECTED0, Constants.PAYMENT_STATUS.STAUS0);
            for (PaymentEntity paymentEntity : list) {
                PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2, paymentEntity.getPayChannel());
                if(oldPaymentEntity == null){
                    LOGGER.info("付款记录不存在,忽略该条退款，继续后面退款,orderNo={}",paymentEntity.getOrderNum());
                    continue;
                }
                boolean result = doRefundAndNotify(oldPaymentEntity,paymentEntity);
                if(!result){
                    failList.add(paymentEntity.getPayNo());
                }
            }
            LOGGER.info("微信批量退款定时任务结束,failList={}", failList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean doRefundAndNotify(PaymentEntity oldPaymentEntity,PaymentEntity paymentEntity){
        boolean result = false;
        try {
            Map<String, Object> refundResultMap = weixinRefund(oldPaymentEntity.getPayNo(), paymentEntity.getAmountMoney().doubleValue(), oldPaymentEntity.getAmountMoney().doubleValue(), paymentEntity.getPayNo(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,oldPaymentEntity.getWeixinMchId());
            if (Constants.RESULT.SUCCESS.equals(refundResultMap.get("result")) || ConstantEnum.WEIXIN_REFUND_RESULT_PROCESSING.getCodeStr().equals(refundResultMap.get("result"))) {
                paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
                paymentEntity.setFinishTime(DateUtil.getCurrDateTime());
                paymentService.updateByPrimaryKeySelective(paymentEntity);
                if (Constants.ORDER_TYPE.ORDER_TYPE_2 == paymentEntity.getOrderType()) {//退款通知第三方系统
                    refundNotifyThird(paymentEntity);
                } else {//退款通知交易中心系统
                    String target = Constants.SOURCETYPE.OSM;
                    if (Constants.ORDER_TYPE.ORDER_TYPE_1 == oldPaymentEntity.getOrderType()) {
                        target = Constants.SOURCETYPE.COUPON;
                    }
                    List<PaymentItemEntity> itemList = paymentItemService.selectByPaymentId(paymentEntity.getId());
                    String orderDetailNum = paymentItemService.getDetailNum(itemList);
                    MessageEvent event = rpbEventService.getMessageEvent(paymentEntity.getPayNo(), paymentEntity.getOrderNum(), orderDetailNum, paymentEntity.getPayChannel().toString(), null,
                            Constants.SOURCETYPE.RPB, target, PaymentEventType.REFUND);
                    sender.convertAndSend(event);
                }
                result = true;
            }
        }catch (TradeException e){
            LOGGER.warn(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
        return result;

    }

    /**
     * 支付成功通知第三方
     * @param paymentEntity
     */
    @Override
    public void payNotifyThird(PaymentEntity paymentEntity){
        try {
            ResponseData responseData = notifyThird(paymentEntity, ConstantEnum.THIRD_NOTIFY_TYPE_0.getCodeStr());
            if(responseData == null || responseData.getMeta() == null || 0 != responseData.getMeta().getErrno()){
                throw new TradeException();
            }
        }catch (ThirdException | TradeException e){
            LOGGER.warn("第三方支付结果处理失败，暂记录日志，不做业务处理", e);
            e.printStackTrace();
            throw new TradeException(TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getCodeStr(),TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getValueStr());
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 退款成功通知第三方
     * @param paymentEntity
     */
    @Override
    public void refundNotifyThird(PaymentEntity paymentEntity){
        try {
            ResponseData responseData = notifyThird(paymentEntity, ConstantEnum.THIRD_NOTIFY_TYPE_1.getCodeStr());
            if(responseData == null || responseData.getMeta() == null || 0 != responseData.getMeta().getErrno()){
                throw new TradeException();
            }
        }catch (ThirdException | TradeException e){
            LOGGER.error("第三方退款结果处理失败，暂记录日志，不做业务处理", e);
            e.printStackTrace();
            throw new TradeException(TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getCodeStr(),TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getValueStr());
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 通知第三方支付/退款结果
     * @param paymentEntity PaymentEntity
     * @param type 0:支付,1:退款
     * @throws ThirdException
     */
    private ResponseData notifyThird(PaymentEntity paymentEntity,String type) throws ThirdException {
            Map<String,String> paramMap = new HashMap<>();
            paramMap.put("channel", TradeConstantEnum.PHP_SCORE_CHANNEL_TOKEN.getValueStr());
            paramMap.put("order_id", paymentEntity.getOrderNum());
            paramMap.put("payment_no", paymentEntity.getPayNo());
            paramMap.put("status", "0");//支付成功默认为0/否则给1
            paramMap.put("type",type);
            String timeStamp = DateUtil.getCurrDateTime().toString();
            String preStr = StringUtil.createLinkString(paramMap);
            String dataEncrypt = MalllifeRsaUtil.encryptionStr(preStr, TradeConstantEnum.PHP_SCORE_PUBLIC_KEY.getValueStr());
            String str = "data=" + dataEncrypt + "&timeStamp=" + timeStamp + "&channel=" + TradeConstantEnum.PHP_SCORE_CHANNEL_TOKEN.getCodeStr() + "&token=" + TradeConstantEnum.PHP_SCORE_CHANNEL_TOKEN.getValueStr();
            String md5Sign = Md5Util.GetMD5Code(str);
            Map<String,String> resultMap = new HashMap<>();
            resultMap.put("data", dataEncrypt);
            resultMap.put("timeStamp", timeStamp);
            resultMap.put("channel", TradeConstantEnum.SCORE_STORE_CHANNEL_TOKEN.getCodeStr());
            resultMap.put("sign", md5Sign);
            String url = propertyConfigurer.getProperty("PHP_SCORE_STORE_NOTYFY_URL");
            String result = HttpUtil.httpPOST(url, resultMap);
            JSONObject resultJson = JSONObject.fromObject(result);
            return  (ResponseData)JSONObject.toBean(resultJson);
    }
}
