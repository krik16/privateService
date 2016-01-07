/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月14日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月14日 1.0 创建文件
 */
public class ShopMallVO implements Serializable {

	private String shopId;// 店铺mysqlid
	private String shopName;// 店铺名字
	private String shopLogo;//店铺logo
	private String shopMid;// shop mongoId
	private String mallId;// 商场mysqlid
	private String mallName;// 商场名字
	private String mallMid;// 商场 mongoId
	private String userId;// 买家id
	private String userName; // 买家用户名
	private String userPhone;// 买家电话
	private String nickname;// 买家昵称
	private String provinceId;// 省id
	private String cityId;// 市id
	private String provinceName;// 省名称
	private String cityName;// 市名称

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getShopLogo() {
		return shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
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

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "ShopMallVO{" +
				"shopId='" + shopId + '\'' +
				", shopName='" + shopName + '\'' +
				", shopMid='" + shopMid + '\'' +
				", mallId='" + mallId + '\'' +
				", mallName='" + mallName + '\'' +
				", mallMid='" + mallMid + '\'' +
				", userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", userPhone='" + userPhone + '\'' +
				", nickname='" + nickname + '\'' +
				", provinceId='" + provinceId + '\'' +
				", cityId='" + cityId + '\'' +
				", provinceName='" + provinceName + '\'' +
				", cityName='" + cityName + '\'' +
				'}';
	}
}
