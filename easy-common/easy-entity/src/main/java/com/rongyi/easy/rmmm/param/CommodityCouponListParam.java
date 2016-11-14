package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

public class CommodityCouponListParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> commodityIds;

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}

	@Override
	public String toString() {
		return "CommodityCouponListParam [commodityIds=" + commodityIds + "]";
	}
	
}
