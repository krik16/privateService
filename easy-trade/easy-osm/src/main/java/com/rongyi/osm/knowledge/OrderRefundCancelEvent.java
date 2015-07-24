package com.rongyi.osm.knowledge;

public class OrderRefundCancelEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 6761516086841113709L;

	@Override
	public String getName() {
		return "买家放弃退款";
	}
}
