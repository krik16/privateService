package com.rongyi.rpb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.RpbEventService;

/**
 * @Author: 柯军
 * @Description: 订单支付成功事件记录
 * @datetime:2015年4月23日上午10:02:34
 * 
 **/
@Service
public class PaymentLogInfoServiceImpl extends BaseServiceImpl implements PaymentLogInfoService {
	private static final Logger LOGGER = Logger.getLogger(PaymentLogInfoServiceImpl.class);

	private static final String LOG_NAMESPACE = "com.rongyi.rpb.mapper.PaymentLogInfoLogMapper";

	@Autowired
	PaymentService paymentService;

	@Autowired
	Sender sender;

	@Autowired
	RpbEventService rpbEventService;

	@Override
	public Map<String, String> insert(PaymentLogInfo logInfo) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			this.getBaseDao().insertBySql(LOG_NAMESPACE + ".insert", logInfo);
			map.put("message", "成功插入返回的message数据！");
		} catch (Exception e) {
			LOGGER.error(e);
			map.put("message", e.getMessage());
		}
		return map;
	}

	@Override
	public Integer insertGetId(PaymentLogInfo logInfo) {
		try {
			this.getBaseDao().insertBySql(LOG_NAMESPACE + ".insert", logInfo);
			return logInfo.getId();
		} catch (Exception e) {
			LOGGER.error(e);
			return null;
		}
	}

	@Override
	public PaymentLogInfo selectByOutTradeNo(String outTradeNo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("outTradeNo", outTradeNo);
		return this.getBaseDao().selectOneBySql(LOG_NAMESPACE + ".selectByOrderNum", resultMap);
	}

	@Override
	public PaymentLogInfo selectById(int id) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("id", id);
		return this.getBaseDao().selectOneBySql(LOG_NAMESPACE + ".selectById", resultMap);
	}

	@Override
	public PaymentLogInfo selectByNotifyId(String notifyId) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("notifyId", notifyId);
		return this.getBaseDao().selectOneBySql(LOG_NAMESPACE + ".selectByNotifyId", resultMap);
	}

	@Override
	public PaymentLogInfo selectByPayTradeNo(String tradeNo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("tradeNo", tradeNo);
		return this.getBaseDao().selectOneBySql(LOG_NAMESPACE + ".selectByTradeNo", resultMap);
	}

	@Override
	public void insertPayNotify(PaymentLogInfo paymentLogInfo, Integer tradeType, Integer status, String payChannel) {
		insertGetId(paymentLogInfo);
		List<PaymentEntity> list = paymentService.selectByPayNoAndTradeType(paymentLogInfo.getOutTradeNo(), tradeType);
		if (list != null && !list.isEmpty() && list.get(0).getStatus() != Constants.PAYMENT_STATUS.STAUS2) {
			paymentService.updateListStatusBypayNo(paymentLogInfo.getOutTradeNo(), tradeType, status);// 修改付款单状态
			String orderNums = paymentService.getOrderNumStrsByPayNo(paymentLogInfo.getOutTradeNo());
			paySuccessToMessage(paymentLogInfo.getOutTradeNo(),paymentLogInfo.getBuyer_email(), orderNums, list.get(0).getOrderType(), payChannel);
		}
	}

	@Override
	public void paySuccessToMessage(String out_trade_no,String buyerEmail, String orderNums, Integer orderType, String payChannel) {
		if (orderNums != null) {
			String[] orderNumArray = orderNums.split("\\,");
			String target = Constants.SOURCETYPE.COUPON;// 优惠券订单
			for (int i = 0; i < orderNumArray.length; i++) {
				if (Constants.ORDER_TYPE.ORDER_TYPE_0 == orderType)// 商品订单
					target = Constants.SOURCETYPE.OSM;
				MessageEvent event = rpbEventService.getMessageEvent(out_trade_no, orderNumArray[i], null, payChannel,buyerEmail, Constants.SOURCETYPE.RPB, target, PaymentEventType.BUYER_PAID);
				sender.convertAndSend(event);
			}
		}
	}

	@Override
	public void updateDeleteStatus(Integer id, Integer deleteStatus) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("id", id);
		resultMap.put("deleteStatus", deleteStatus);
		this.getBaseDao().updateBySql(LOG_NAMESPACE + ".updateDeleteStatus", resultMap);
	}
}
