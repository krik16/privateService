/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

import com.rongyi.easy.rmmm.param.OrderModelParam;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月19日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月19日 1.0 创建文件
 */
public class OrderModelVO extends OrderModelParam implements Serializable {

	private String orderModelId;// 父订单模板id
	private String provinceId;// 省id
	private String cityId;// 市id
	private String nickName;// 导购昵称
	private String imId;// 导购环信账号
	private String paymentWaitMax;// 付款超时,取消订单的时长
	private String userLogo;// 导购logo
	private String userName;// 导购姓名
	private String userPhone;// 导购电话
	private String shopName;// 店铺名称
	private String mallName;// 商场名称
	private String provinceName;// 省名称
	private String cityName;// 市名称
	private String guideType;// 1是导购 2是买手

	public String getGuideType() {
		return guideType;
	}

	public void setGuideType(String guideType) {
		this.guideType = guideType;
	}

	public String getOrderModelId() {
		return orderModelId;
	}

	public void setOrderModelId(String orderModelId) {
		this.orderModelId = orderModelId;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getImId() {
		return imId;
	}

	public void setImId(String imId) {
		this.imId = imId;
	}

	public String getPaymentWaitMax() {
		return paymentWaitMax;
	}

	public void setPaymentWaitMax(String paymentWaitMax) {
		this.paymentWaitMax = paymentWaitMax;
	}

	public String getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
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

}
