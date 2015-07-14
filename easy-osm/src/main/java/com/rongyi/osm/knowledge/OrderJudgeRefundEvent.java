package com.rongyi.osm.knowledge;

public class OrderJudgeRefundEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 7861339158793544118L;

	@Override
	public String getName() {
		return "客服判定退款";
	}
}
