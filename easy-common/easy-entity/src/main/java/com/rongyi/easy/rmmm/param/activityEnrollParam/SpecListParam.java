package com.rongyi.easy.rmmm.param.activityEnrollParam;

import java.io.Serializable;

public class SpecListParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commoditySpecId;//规格id
	private String activityPrice;//活动价格
	private Integer inventory;//活动提报库存
	public String getCommoditySpecId() {
		return commoditySpecId;
	}
	public void setCommoditySpecId(String commoditySpecId) {
		this.commoditySpecId = commoditySpecId;
	}
	public String getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	@Override
	public String toString() {
		return "SpecListParam [commoditySpecId=" + commoditySpecId + ", activityPrice="
				+ activityPrice + ", inventory=" + inventory + "]";
	}
	
}
