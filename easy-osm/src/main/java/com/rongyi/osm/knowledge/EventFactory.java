package com.rongyi.osm.knowledge;

import java.math.BigDecimal;
import java.util.List;

import net.sf.json.JSONObject;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.OrderEventType;
import com.rongyi.core.constant.PaymentEventType;

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

		if (source.equals("rpb")) {
			// 付款或者退款事件回复

			if (type.equals(PaymentEventType.PAYMENT) || type.equals(PaymentEventType.REFUND)) {
				event = new PaymentResponseEvent();
			}

			if (type.equals(PaymentEventType.BUYER_PAID)) {
				// 买家付款
				event = new OrderPaidEvent();
			}
		} else {
			if (type.equals(OrderEventType.PLACE_ORDER)) {
				// 买家下单
				event = new OrderCreateEvent();
			} else if (type.equals(OrderEventType.MANUAL_CLOSED)) {
				// 卖家主动关闭订单
				event = new OrderManualCloseEvent();
			} else if (type.equals(OrderEventType.MODIFY_PRICE)) {
				// 卖家修改价格
				event = new OrderPriceChangeEvent();
			} else if (type.equals(OrderEventType.DELIVER_GOOD)) {
				// 卖家发货
				event = new OrderDeliveryEvent();
			} else if (type.equals(OrderEventType.APPLY_REFUND)) {
				// 买家申请退款
				event = new OrderRefundRequestEvent();
			} else if (type.equals(OrderEventType.CANCEL_REFUND)) {
				// 买家取消退款
				event = new OrderRefundCancelEvent();
			} else if (type.equals(OrderEventType.AGREE_APPLY_REFUND)) {
				// 卖家同意退款
				event = new OrderRefundAcceptEvent();
			} else if (type.equals(OrderEventType.REFUSE_APPLY_REFUND)) {
				// 卖家拒绝退款
				event = new OrderRefundRefuseEvent();
			} else if (type.equals(OrderEventType.APPLY_ADULTS)) {
				// 买家申请维权
				event = new OrderAppealRequestEvent();
			} else if (type.equals(OrderEventType.CANCEL_ADULTS)) {
				// 卖家取消维权
				event = new OrderAppealCancelEvent();
			} else if (type.equals(OrderEventType.JUDGE_REFUND)) {
				// 客服判定退款
				event = new OrderJudgeRefundEvent();
			} else if (type.equals(OrderEventType.JUDGE_NO_REFUND)) {
				// 客服判定不退款
				event = new OrderJudgeNoRefundEvent();
			} else if (type.equals(OrderEventType.CONFIRM_RECEIPT)) {
				// 买家确认收货
				event = new OrderDeliveryConfirmEvent();
			} else if (type.equals(OrderEventType.AGREE_APPLY_REFUND_AFTER_ADULTS)) {
				// 卖家在买家维权后同意退款
				event = new OrderAdultsRefundAcceptEvent();
			} else if (type.equals(OrderEventType.CONFIRM_EVALUATE)) {
				// 买家评价
				event = new OrderIsCommentEvent();
			} else if (type.equals(OrderEventType.C2C_MODIFY_PRICE)) {
				// 卖家修改价格(C2C)
				event = new OrderPriceResetEvent();
			} else if (type.equals(OrderEventType.CANCEL_BY_SELLER)) {
				// 卖家撤销订单(付款后)
				event = new OrderCancelBySellerEvent();
			} 

			else if (type.equals(OrderEventType.DEBUG_RELOAD_ORDER)) {
				event = new OrderReloadEvent();
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

	public static BaseEvent makeRefundEvent(String orderNum, String orderDetailNumber, BigDecimal totalPrice,
			List<Integer> paymentIdList) {
		return null;
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
