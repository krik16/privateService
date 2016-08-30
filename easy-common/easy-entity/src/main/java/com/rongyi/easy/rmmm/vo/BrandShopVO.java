package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class BrandShopVO implements Serializable{

	private String id; // 店铺id
	private String logo; // 店铺logo
	private String shopName; // 店铺名称
	private String mallName; // 商场名称
	private String address; // 店铺地址
	private String couponInfo; // 优惠信息
	private String cooperationShopId;// shop的mysql id
	private List<Integer> tip;//标签[0,0,0] 分别对应[货,惠,券] 0表示没有  1表示有 
	private Double distance;//距离
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCouponInfo() {
		return couponInfo;
	}

	public void setCouponInfo(String couponInfo) {
		this.couponInfo = couponInfo;
	}

	public String getCooperationShopId() {
		return cooperationShopId;
	}

	public void setCooperationShopId(String cooperationShopId) {
		this.cooperationShopId = cooperationShopId;
	}

	public List<Integer> getTip() {
		return tip;
	}

	public void setTip(List<Integer> tip) {
		this.tip = tip;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
	
}
