package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 用户管理店铺VO
 * 
 * @author chenjun
 * 
 */
public class ShopDetailVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopId;// 店铺mysqlid
	private String shopLogo;// 店铺logo
	private String address;// 店铺地址
	private String shopName;// 店铺名字
	private String berthNum;// 铺位号
	private String shopMid;// shop mongoId

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLogo() {
		return shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getBerthNum() {
		return berthNum;
	}

	public void setBerthNum(String berthNum) {
		this.berthNum = berthNum;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

}
