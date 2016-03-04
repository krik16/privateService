package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class LiveAddressAndBrandVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> brandNames;//品牌名称集合
	private List<String> brandIds;//品牌id集合
	private String commodityAddress;//商品所在商场或者店铺名（取最多的一个）
	
	public List<String> getBrandNames() {
		return brandNames;
	}
	public void setBrandNames(List<String> brandNames) {
		this.brandNames = brandNames;
	}
	public List<String> getBrandIds() {
		return brandIds;
	}
	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}
	public String getCommodityAddress() {
		return commodityAddress;
	}
	public void setCommodityAddress(String commodityAddress) {
		this.commodityAddress = commodityAddress;
	}
	
}
