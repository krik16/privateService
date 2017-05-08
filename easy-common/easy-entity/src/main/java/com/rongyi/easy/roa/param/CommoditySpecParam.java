package com.rongyi.easy.roa.param;

import java.io.Serializable;

public class CommoditySpecParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6708546471893710100L;
	private String commodityId;		//商品id
	private String specId;//规格id
	
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}
	@Override
	public String toString() {
		return "CommoditySpecParam [commodityId=" + commodityId + ", specId="
				+ specId + "]";
	}

}
