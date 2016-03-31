package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class ShopInfoVO implements Serializable {
	
	private static final long serialVersionUID = 1803283478450310137L;

	private int id;//店铺id
	private String shopName;
	private String mallName;//商场名
	private String mallId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	@Override
	public String toString() {
		return "ShopInfo [id=" + id + ", shopName=" + shopName + ", mallName="
				+ mallName + ", mallId=" + mallId + "]";
	}
	
	
	
}
