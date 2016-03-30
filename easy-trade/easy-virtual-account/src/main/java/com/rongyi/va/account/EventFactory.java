/** 
 * @Title: EventFactory.java 
 * @Package com.rongyi.va.service 
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月13日 下午4:22:19 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.account;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Component;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.VirtualAccountEventType;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.va.constants.CommonConstants;

/**
 * @author ZhengYl
 * 
 */
@Component
public class EventFactory {
	public static BaseEvent buildEventFromString(String payload, String replyTo, String correlationId) throws Exception {
		BaseEvent event = null;
		JSONObject json;
		String type;
		String source;

		try {
			json = JsonUtil.getJSONObject(payload);
			type = json.get("type").toString();
			source = json.get("source").toString();
		} catch (Exception e) {
			throw new InvalidEventFormat(e);
		}

		if (source.equals(CommonConstants.SOURCETYPE.OSM)) {
			if (type.equals(VirtualAccountEventTypeEnum.ACCOUNT_POST.getCode())) {
				// 交易金额入账
				event = new AccountPostEvent();
			}
		} else if (source.equals(CommonConstants.SOURCETYPE.TMS)) {
			if (type.equals(VirtualAccountEventTypeEnum.ACCOUNT_POST.getCode())) {
				// 金额入账
				event = new AccountPostEvent();
			} else if (type.equals(VirtualAccountEventTypeEnum.DRAWAPPLY.getCode())) {
				// 提现申请
				event = new WithdrawRequestEvent();
			} else if (type.equals(VirtualAccountEventTypeEnum.COMMISSION_BATCH_POST.getCode())
					||type.equals(VirtualAccountEventTypeEnum.COMMISSION_TYPE_EXPAND.getCode())
					||type.equals(VirtualAccountEventTypeEnum.COMMISSION_TYPE_FIRST.getCode())) {
				// 佣金批量入账
				event = new CommissionBatchPostEvent();
			} else if (type.equals(VirtualAccountEventTypeEnum.COUPON_COMMISSION_BATCH_POST.getCode())) {
				// 优惠券核销佣金批量入账
				event = new CommissionBatchPostEvent();
			} else if (type.equals(VirtualAccountEventType.ACCOUNT_CREATE)) {
				// 虚拟账户创建
				event = new AccountCreateEvent();
			} else if (type.equals(VirtualAccountEventType.ACCOUNT_EDIT)) {
				// 虚拟账户编辑
				event = new AccountUpdateEvent();
			} else if (type.equals(VirtualAccountEventType.ACCOUNT_LOCK_UNLOCK)) {
				// 虚拟账户冻结/解锁
				event = new AccountLockUnlockEvent();
			}
		}

		if (event == null) {
			throw new UnsupportedEvent(payload);
		}

		try {
			event.load(json);

			if (replyTo != null) {
				event.setTarget(replyTo);
			}

			if (correlationId != null) {
				event.setCorrelationId(correlationId);
			}
		} catch (Exception e) {
			throw new InvalidEventFormat(e);
		}

		return event;
	}

	public static class InvalidEventFormat extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = -8712826540173898094L;

		public InvalidEventFormat(Exception e) {
			super("Invalid Event Format", e);
		}

	}

	public static class UnsupportedEvent extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 852584030131426987L;

		public UnsupportedEvent(String message) {
			super("Unsupported Event : " + message);
		}
	}
}
