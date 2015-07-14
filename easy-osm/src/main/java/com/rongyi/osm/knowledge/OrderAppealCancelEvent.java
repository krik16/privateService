package com.rongyi.osm.knowledge;

public class OrderAppealCancelEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = -9035646093611468077L;

	@Override
	public String getName() {
		return "用户放弃维权";
	}
}
