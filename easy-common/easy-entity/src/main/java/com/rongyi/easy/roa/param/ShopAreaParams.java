package com.rongyi.easy.roa.param;

import java.io.Serializable;
import java.util.List;
/**
 * 获取集团、商场、品牌、店铺集合下所有店铺位置信息(省市)
 * @author Ventures
 *
 */
public class ShopAreaParams implements Serializable{

	/** 0：集团      1：品牌       2：商场      3：店铺集合 */
	private Integer type;
	private String searchId;
	private List<String> shops;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getSearchId() {
		return searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
	public List<String> getShops() {
		return shops;
	}
	public void setShops(List<String> shops) {
		this.shops = shops;
	}
	
}
