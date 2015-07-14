package com.rongyi.osm.knowledge;

public class OrderDeliveryConfirmEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = -435752251025996659L;

	@Override
	public String getName() {
		return "买家确认收货";
	}
}
