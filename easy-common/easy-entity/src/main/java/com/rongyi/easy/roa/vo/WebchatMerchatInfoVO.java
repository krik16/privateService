package com.rongyi.easy.roa.vo;

import java.io.Serializable;

public class WebchatMerchatInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopId;//店铺mysqlId
	private String shopMid;//店铺mongoId
	private String shopLogo;//店铺logo
	private String shopName;//店铺名称
	private String mallId;//店铺所属商场id（mongoId）
	private String mallName;//商场名称
	private String brandId;//品牌id（mongoId）
	private String brandName;//品牌名称
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getShopLogo() {
		return shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "WebchatMerchatInfoVO [shopId=" + shopId + ", shopMid="
				+ shopMid + ", shopLogo=" + shopLogo + ", shopName=" + shopName
				+ ", mallId=" + mallId + ", mallName=" + mallName
				+ ", brandId=" + brandId + ", brandName=" + brandName + "]";
	}
	
}
