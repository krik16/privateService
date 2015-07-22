package com.rongyi.osm.knowledge;

public class OrderRefundAcceptEvent extends UserEvent{
	/**  */
	private static final long serialVersionUID = -6710057692169164559L;

	@Override
	public String getName() {
		return "卖家同意退款";
	}
}
