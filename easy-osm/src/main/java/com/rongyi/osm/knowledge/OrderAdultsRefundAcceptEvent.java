package com.rongyi.osm.knowledge;

public class OrderAdultsRefundAcceptEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 6080132677717369983L;

	@Override
	public String getName() {
		return "卖家在买家维权后同意退款";
	}
}
