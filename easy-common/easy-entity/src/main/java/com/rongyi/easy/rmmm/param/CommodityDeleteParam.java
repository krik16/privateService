package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class CommodityDeleteParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	
}
