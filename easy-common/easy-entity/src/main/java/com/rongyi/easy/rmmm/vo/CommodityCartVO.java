package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class CommodityCartVO implements Serializable{
	
	private String commodityId;// 我是商品编号

	private String specId;// 我是规格编号

	private String commodityCount;// 商品最终数量

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

	public String getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(String commodityCount) {
		this.commodityCount = commodityCount;
	}

}
