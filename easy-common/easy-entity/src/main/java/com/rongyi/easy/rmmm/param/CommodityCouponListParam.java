package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

public class CommodityCouponListParam implements Serializable{

	private List<String> commodityIds;

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}

}
