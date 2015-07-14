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

import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.nsynchronous.OrderFormNsyn;
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
				orderDetailNum = getDetailNum(itemList);
			}
			MessageEvent event = rpbEventService.getMessageEvent(paymentEntity.getPayNo(), paymentEntity.getOrderNum(), orderDetailNum, paymentEntity.getPayChannel().toString(),
					Constants.SOURCETYPE.RPB, target, PaymentEventType.REFUND);
			sender.convertAndSend(event);
			return messageMap;
		}
		messageMap.put("success", false);
		messageMap.put("message", "微信退款失败");
		return messageMap;
	}

	private String getDetailNum(List<PaymentItemEntity> itemList) {
		String detailNum = "";
		if (itemList != null && !itemList.isEmpty())
			for (int i = 0; i < itemList.size(); i++) {
				detailNum += itemList.get(i).getDetailNum();
				if (i < itemList.size() - 1) {
					detailNum += ",";
				}
			}
		return detailNum;
	}

}
