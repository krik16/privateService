/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

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
	private String shopLogo;//店铺logo
	private String mallName;// 商场名称
	private String provinceName;// 省名称
	private String cityName;// 市名称
	private Integer guideType;// 1是导购 2是买手
	private Integer rebateNum = 0;// 可使用抵扣券数量
	
	private String shopPostage;// 店铺快递邮费
	private String supportWay;//1仅支持自提 2仅支持快递 3都支持
	private Double couponTotalDiscount;//店铺红包抵扣金额
	private String shopMid;//店铺mongoId
	
    private String platformRebateCode;//抵扣券券码
	private Double rebateDiscount;// 抵扣券抵扣金额	
	private Double rebateOriginalPrice;// 抵扣券满多少元可用
	
	public String getPlatformRebateCode() {
		return platformRebateCode;
	}

	public void setPlatformRebateCode(String platformRebateCode) {
		this.platformRebateCode = platformRebateCode;
	}

	public Double getRebateDiscount() {
		return rebateDiscount;
	}

	public void setRebateDiscount(Double rebateDiscount) {
		this.rebateDiscount = rebateDiscount;
	}

	public Double getRebateOriginalPrice() {
		return rebateOriginalPrice;
	}

	public void setRebateOriginalPrice(Double rebateOriginalPrice) {
		this.rebateOriginalPrice = rebateOriginalPrice;
	}

	public Double getCouponTotalDiscount() {
		return couponTotalDiscount;
	}

	public void setCouponTotalDiscount(Double couponTotalDiscount) {
		this.couponTotalDiscount = couponTotalDiscount;
	}

	public String getShopPostage() {
		return shopPostage;
	}

	public void setShopPostage(String shopPostage) {
		this.shopPostage = shopPostage;
	}

	public String getSupportWay() {
		return supportWay;
	}

	public void setSupportWay(String supportWay) {
		this.supportWay = supportWay;
	}

	public Integer getRebateNum() {
		return rebateNum;
	}

	public void setRebateNum(Integer rebateNum) {
		this.rebateNum = rebateNum;
	}

	public Integer getGuideType() {
		return guideType;
	}

	public void setGuideType(Integer guideType) {
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
	
	public String getShopLogo() {
		return shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
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
	
	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	@Override
	public String toString() {
		return "OrderModelVO [orderModelId=" + orderModelId + ", provinceId="
				+ provinceId + ", cityId=" + cityId + ", nickName=" + nickName
				+ ", imId=" + imId + ", paymentWaitMax=" + paymentWaitMax
				+ ", userLogo=" + userLogo + ", userName=" + userName
				+ ", userPhone=" + userPhone + ", shopName=" + shopName
				+ ", shopLogo=" + shopLogo + ", mallName=" + mallName
				+ ", provinceName=" + provinceName + ", cityName=" + cityName
				+ ", guideType=" + guideType + ", rebateNum=" + rebateNum
				+ ", shopPostage=" + shopPostage + ", supportWay=" + supportWay
				+ ", couponTotalDiscount=" + couponTotalDiscount + ", shopMid="
				+ shopMid + ", platformRebateCode=" + platformRebateCode
				+ ", rebateDiscount=" + rebateDiscount
				+ ", rebateOriginalPrice=" + rebateOriginalPrice + "]";
	}
}
