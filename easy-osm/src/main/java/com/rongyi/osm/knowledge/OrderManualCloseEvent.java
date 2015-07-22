package com.rongyi.osm.knowledge;

public class OrderManualCloseEvent extends UserEvent{
	/**  */
	private static final long serialVersionUID = -5570873128575044931L;

	@Override
	public String getName() {
		return "卖家关闭订单";
	}
}
