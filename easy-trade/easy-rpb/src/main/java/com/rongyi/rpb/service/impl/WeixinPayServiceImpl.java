package com.rongyi.rpb.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.pay.weixin.model.RefundQueryReqData;
import com.rongyi.rpb.common.pay.weixin.model.RefundQueryResData;
import com.rongyi.rpb.common.pay.weixin.model.RefundReqData;
import com.rongyi.rpb.common.pay.weixin.model.RefundResData;
import com.rongyi.rpb.common.pay.weixin.model.ReverseReqData;
import com.rongyi.rpb.common.pay.weixin.model.ScanPayQueryReqData;
import com.rongyi.rpb.common.pay.weixin.service.PayQueryService;
import com.rongyi.rpb.common.pay.weixin.service.RefundQueryService;
import com.rongyi.rpb.common.pay.weixin.service.RefundService;
import com.rongyi.rpb.common.pay.weixin.service.ReverseService;
import com.rongyi.rpb.common.pay.weixin.service.UnifiedorderService;
import com.rongyi.rpb.common.pay.weixin.util.Util;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PCWebPageAlipayService;
import com.rongyi.rpb.service.PaymentItemService;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.RpbEventService;
import com.rongyi.rpb.service.WeixinPayService;
import com.rongyi.rss.rpb.OrderNoGenService;

/**
 * @Author: 柯军
 * @Description: 微信支付
 * @datetime:2015年4月23日上午10:07:12
 * 
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

	private static final Logger LOGGER = LoggerFactory.getLogger(WeixinPayServiceImpl.class);

	@Override
	public Map<String, Object> getAppWeXinSign(String payNo, double total_fee) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BigDecimal totalFee = new BigDecimal(total_fee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
			UnifiedorderService unifiedorderService = new UnifiedorderService();
			map = unifiedorderService.getAppWeXinSign(payNo, totalFee.intValue(), "容易网商品");
			map.put("code", 0);
			map.put("totlePrice", total_fee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public Map<String, Object> weixinRefundMessage(MessageEvent event, PaymentEntityVO paymentEntityVO, String payNo) {
		Map<String, Object> messageMap = new HashMap<String, Object>();
		messageMap.put("timestamp", DateUtil.getCurrDateTime().getTime());
		messageMap.put("source", Constants.SOURCETYPE.RPB);
		messageMap.put("type", event.getType());
		Map<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("orderDetailNum", paymentEntityVO.getOrderDetailNumArray());
		bodyMap.put("paymentId", payNo);
		bodyMap.put("orderNum", paymentEntityVO.getOrderNum());
		bodyMap.put("totalPrice", paymentEntityVO.getAmountMoney());
		messageMap.put("body", JSONObject.fromObject(bodyMap));
		return messageMap;
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
	public Map<String, Object> getRefundMessageMap(MessageEvent event) {

		PaymentEntityVO paymentEntityVO = paymentService.bodyToPaymentEntity(event.getBody(), null);
		PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntityVO.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
				Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
		if (messageToRefund(paymentEntityVO, paymentEntity)) {
			return weixinRefundMessage(event, paymentEntityVO, paymentEntity.getPayNo());
		}
		return null;
	}

	@Override
	public boolean messageToRefund(PaymentEntityVO paymentEntityVO, PaymentEntity hisPayEntity) {
		LOGGER.info("申请退款，退款单号-->" + hisPayEntity.getPayNo() + ",退款订单号-->" + hisPayEntity.getOrderNum());
		String newPayNo = paymentService.getPayNo();
		Map<String, Object> result = weixinRefund(hisPayEntity.getPayNo(), paymentEntityVO.getAmountMoney().doubleValue(), hisPayEntity.getAmountMoney().doubleValue(), newPayNo,
				Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1);
		PaymentEntity paymentEntity = new PaymentEntity();
		BeanUtils.copyProperties(paymentEntityVO, paymentEntity);
		paymentEntity.setPayNo(newPayNo);
		paymentEntity.setTradeType(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1);
		paymentEntity.setCreateTime(DateUtil.getCurrDateTime());
		paymentEntity.setPayChannel(hisPayEntity.getPayChannel());
		if (Constants.RESULT.SUCCESS.equals(result.get("result"))){
			paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
			paymentEntity.setFinishTime(DateUtil.getCurrDateTime());
		}else {
			paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS0);
			LOGGER.info("微信退款失败,生成支付款记录，但未生成付款成功事件！");
		}
		paymentService.insertByOrderDetailNum(paymentEntity, paymentEntityVO.getOrderDetailNumArray());
		return Constants.RESULT.SUCCESS.equals(result.get("result"));
	}

	@Override
	public Map<String, Object> weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo, Integer tradeType) {
		LOGGER.info("原付款单号" + payNo + ",付款总金额-->" + totalFee + ",退款单号-->" + newPayNo + ",退款金额-->" + refundFee);
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			RefundService refundService = new RefundService();
			BigDecimal bigTotalFee = new BigDecimal(totalFee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
			BigDecimal bigRefundFee = new BigDecimal(refundFee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
			RefundReqData refundReqData = new RefundReqData(null, payNo, null, newPayNo, bigTotalFee.intValue(), bigRefundFee.intValue(), ConstantUtil.PayWeiXin_V3.MCH_ID, null);
			String result = refundService.request(refundReqData);
			RefundResData refundResData = (RefundResData) Util.getObjectFromXML(result, RefundResData.class);
			if (Constants.RESULT.SUCCESS.equals(refundResData.getReturn_code()) && Constants.RESULT.SUCCESS.equals(refundResData.getResult_code())) {// 退款申请成功后查询退款结果
				RefundQueryResData refundQueryResData = refundQuery(null, null, newPayNo);
				map.put("result", refundQueryResData.getRefund_status_0());
				if (ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getCodeStr().equals(refundQueryResData.getRefund_status_0())
						|| ConstantEnum.WEIXIN_REFUND_RESULT_PROCESSING.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {// 退款成功
					LOGGER.info(ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getValueStr() + ",退款状态-->" + refundQueryResData.getRefund_status_0());
					savePaymentLogInfo(refundResData, tradeType);
					map.put("message", ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getValueStr());
				} else if (ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
					LOGGER.info(ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getValueStr() + ",退款状态-->" + refundQueryResData.getRefund_status_0());
					map.put("message", ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getValueStr());
				} else if (ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
					LOGGER.info(ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getValueStr() + ",退款状态-->" + refundQueryResData.getRefund_status_0());
					map.put("message", ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getValueStr());
				} else if (ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
					LOGGER.info(ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getValueStr() + ",退款状态-->" + refundQueryResData.getRefund_status_0());
					map.put("message", ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getValueStr());
				} else {
					LOGGER.info("未知错误,状态-->" + refundQueryResData.getRefund_status_0());
				}
			} else {
				LOGGER.info("退款失败，退款申请返回结果-->" + result);
				map.put("result", "FAIL");
				map.put("message",!StringUtils.isEmpty(refundResData.getErr_code_des())?refundResData.getErr_code_des():"退款失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	@Override
	public void savePaymentLogInfo(RefundResData refundResData, Integer tradeType) {
		LOGGER.info("refundResData"+refundResData.toString()+",tradeType="+tradeType);
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
		paymentLogInfoService.insert(paymentLogInfo);
	}

	@Override
	public String getResultMessage(String message) {
		if (StringUtils.isNotEmpty(message))
			return message;
		else
			return "success";
	}

	@Override
	public String getPennyByMoney(double totalFee) {
		BigDecimal bgTotalFee = new BigDecimal(totalFee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
		return bgTotalFee.toString();
	}

	@Override
	public void closeOrder(String payNo) {
		try {
			ReverseService reverseService = new ReverseService();
			ReverseReqData reverseReqData = new ReverseReqData(null, payNo);
			String response = reverseService.request(reverseReqData);
			if (response.contains("CDATA[SUCCESS]")) {
				paymentService.deleteByPayNo(payNo);
				LOGGER.info("微信撤销订单成功，删除系统中支付单号-->" + payNo + " 付款记录");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("微信撤销订单失败，付款单号-->" + payNo);
		}
	}

	@Override
	public WeixinQueryOrderParamVO queryOrder(String tradeNo, String payNo) {
		WeixinQueryOrderParamVO weixinQueryOrderParamVO = new WeixinQueryOrderParamVO();
		String result = null;
		try {
			PayQueryService payQueryService = new PayQueryService();
			ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData(tradeNo, payNo);
			result = payQueryService.request(scanPayQueryReqData);
			return (WeixinQueryOrderParamVO) Util.getObjectFromXML(result, WeixinQueryOrderParamVO.class);
		} catch (Exception e) {
			LOGGER.info("微信订单查询结果-->" + result);
			e.printStackTrace();
		}
		return weixinQueryOrderParamVO;
	}

	@Override
	public void batchTriggerWeixinRefund() {
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
		if (failList.isEmpty())
			LOGGER.info("微信批量退款成功 -->"+successList.toString());
		else
			LOGGER.info("微信批量退款失败单号-->" + failList.toString());
	}

	@Override
	public RefundQueryResData refundQuery(String tradeNo, String payNo, String refundNo) {
		RefundQueryResData refundQueryResData = new RefundQueryResData();
		try {
			RefundQueryService refundQueryService = new RefundQueryService();
			RefundQueryReqData refundQueryReqData = new RefundQueryReqData(tradeNo, payNo, null, refundNo, null);
			String result = refundQueryService.request(refundQueryReqData);
			refundQueryResData = (RefundQueryResData) Util.getObjectFromXML(result, RefundQueryResData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refundQueryResData;
	}
}
