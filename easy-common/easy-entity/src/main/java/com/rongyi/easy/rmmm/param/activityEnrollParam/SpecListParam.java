package com.rongyi.easy.rmmm.param.activityEnrollParam;

import java.io.Serializable;

public class SpecListParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String specId;//规格id
	private String activityPrice;//活动价格
	private Integer inventory;//活动提报库存
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
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
		return "SpecListParam [specId=" + specId + ", activityPrice="
				+ activityPrice + ", inventory=" + inventory + "]";
	}
	
}
