/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年6月4日下午2:54:04
 * @Description: TODO
 *
 **/

package com.rongyi.rpb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.PayAccountUseTotal;
import com.rongyi.easy.rpb.vo.PaySuccessResponse;
import com.rongyi.easy.rpb.vo.QueryOrderParamVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.nsynchronous.OrderFormNsyn;
import com.rongyi.rpb.service.AliPaymentService;
import com.rongyi.rpb.service.PaymentItemService;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.RpbEventService;
import com.rongyi.rpb.service.WeixinPayService;
import com.rongyi.rss.rpb.IRpbService;

/**
 * @Author: 柯军
 * @Description: rpb dubbo 接口实现
 * @datetime:2015年6月4日下午2:54:04
 * 
 **/
public class RpbServiceImpl implements IRpbService {

	private static final Logger LOGGER = Logger.getLogger(RpbServiceImpl.class);

	@Autowired
	OrderFormNsyn orderFormNsyn;

	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentLogInfoService paymentLogInfoService;

	@Autowired
	WeixinPayService weixinPayService;

	@Autowired
	RpbEventService rpbEventService;

	@Autowired
	Sender sender;

	@Autowired
	PaymentItemService paymentItemService;

	@Autowired
	AliPaymentService aliPaymentService;

	@Override
	public Map<Integer, String> validateAccount(String paymentIds) {
		if (paymentIds == null)
			return null;
		String[] ids = paymentIds.split("\\,");
		Map<Integer, String> map = new HashMap<Integer, String>();
		int value = 0;
		if (ids != null)
			for (int i = 0; i < ids.length; i++) {
				PaymentEntity paymentEntity = paymentService.selectByPrimaryKey(ids[i]);
				if (paymentEntity == null)
					continue;
				value = orderFormNsyn.validateAccount(paymentEntity.getOrderNum(), paymentEntity.getPayChannel());
				if (Constants.ACCOUNT_STATUS.ACCOUNT_STATUS0 != value) {
					map.put(value, paymentEntity.getOrderNum());
					break;
				}
			}
		return map;
	}

	@Override
	public PaymentLogInfo selectByTradeNo(String tradeNo) {
		return paymentLogInfoService.selectByPayTradeNo(tradeNo);

	}

	@Override
	public Map<String, Object> operateWeixinRefund(Integer id) {
		Map<String, Object> messageMap = new HashMap<String, Object>();
		PaymentEntity paymentEntity = paymentService.selectByPrimaryKey(id.toString());
		PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2);
		if (weixinPayService.weixinRefund(oldPaymentEntity.getPayNo(), paymentEntity.getAmountMoney().doubleValue(), oldPaymentEntity.getAmountMoney().doubleValue(), paymentEntity.getPayNo())) {
			paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
			paymentService.updateByPrimaryKeySelective(paymentEntity);
			messageMap.put("success", true);
			messageMap.put("message", "微信退款成功");
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
			return messageMap;
		}
		messageMap.put("success", false);
		messageMap.put("message", "微信退款失败");
		return messageMap;
	}

	@Override
	public boolean paySuccessNotify(String orderNo, Double totalAmount) {
		LOGGER.info("参数：ordeNo=" + orderNo + ",totalAmount=" + totalAmount);
		if (totalAmount == 0) {
			LOGGER.info("0元商品购买，无需发送通知,orderNo-->" + orderNo);
			return true;
		}
		boolean result = false;
		PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS0);
		if (paymentEntity == null)
			return result;
		if (queryOrderPayStatus(null, paymentEntity.getPayNo(), paymentEntity.getPayChannel())) {
			LOGGER.info("更新付款状态，发送同步支付通知,订单号-->" + orderNo);
			String orderNums = paymentService.getOrderNumStrsByPayNo(paymentEntity.getPayNo());
			List<PaySuccessResponse> responseList = paymentLogInfoService.paySuccessToMessage(paymentEntity.getPayNo(), null, orderNums, paymentEntity.getOrderType(), paymentEntity.getPayChannel()
					.toString());
			if (validateResponseList(responseList)) {
				paymentService.updateListStatusBypayNo(paymentEntity.getPayNo(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2);// 修改付款单状态
				result = true;
			}
		}
		return result;
	}

	/**
	 * @Description: 查询订单在第三方交易系统中状态
	 * @param paymentEntity
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月11日下午4:17:19
	 **/
	@Override
	public boolean queryOrderPayStatus(String tradeNo, String payNo, Integer payChannel) {
		if (Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0 == payChannel) {
			QueryOrderParamVO queryOrderParamVO = aliPaymentService.queryOrder(tradeNo, payNo);
			if (queryOrderParamVO != null && ("TRADE_SUCCESS".equals(queryOrderParamVO.getTrade_status()) || "TRADE_FINISHED".equals(queryOrderParamVO.getTrade_status()))) {
				return true;
			}
			LOGGER.info("支付宝订单状态-->" + queryOrderParamVO.getTrade_status());
		} else if (Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1 == payChannel) {
			WeixinQueryOrderParamVO weixinQueryOrderParamVO = weixinPayService.queryOrder(payNo);
			if (weixinQueryOrderParamVO != null && 0 == weixinQueryOrderParamVO.getRet_code()) {
				return true;
			}
			LOGGER.info("微信订单-->" + (weixinQueryOrderParamVO.getRet_code() == 62623003) != null ? "订单不存在" : weixinQueryOrderParamVO.getRet_code());
		} else {
			LOGGER.info("未找到对应付款方式-->payChannel=" + payChannel + ",tradeNo=" + tradeNo + ",payNo=" + payNo);
		}
		return false;
	}

	/**
	 * @Description: 验证返回结果中是否有未成功记录
	 * @param responseList
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月30日上午11:17:19
	 **/
	private boolean validateResponseList(List<PaySuccessResponse> responseList) {
		for (PaySuccessResponse paySuccessResponse : responseList) {
			if (!paySuccessResponse.isResult())
				return false;
		}
		return true;
	}

	@Override
	public QueryOrderParamVO queryOrder(Map<String, Object> map) {
		String payNo = (map.get("payNo") != null) ? map.get("payNo").toString() : null;
		String tradeNo = (map.get("tradeNo") != null) ? map.get("tradeNo").toString() : null;
		return aliPaymentService.queryOrder(payNo, tradeNo);
	}

	@Override
	public List<PayAccountUseTotal> selectPayAccountUseTotal(Map<String, Object> map) {
		return paymentLogInfoService.selectPayAccountUseTotal(map);
	}
}
