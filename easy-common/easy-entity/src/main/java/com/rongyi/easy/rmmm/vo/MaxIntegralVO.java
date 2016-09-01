/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年7月27日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年7月27日 1.0 创建文件
 */
public class MaxIntegralVO implements Serializable{

	private int maxIntegral;// 最大抵扣积分

	private double integralRatio;// 积分抵扣比例

	private int myIntegral;// 我的积分
	
	private Integer rebateNum = 0;// 可使用抵扣券数量
	
	private Integer hongBaoNum = 0;// 可使用红包数量
	
	private BigDecimal realOrderPrice;//不包含积分的支付价格
	
	private BigDecimal maxEasyMoney;//最大可使用容易币
	
    private String couponCode;//红包券码
	
	private Double couponDiscount;// 红包抵扣金额
	
    private String platformRebateCode;//抵扣券券码
	
	private Double rebateDiscount;// 抵扣券抵扣金额
	
	private Double rebateOriginalPrice;// 抵扣券满多少元可用

	public Double getRebateOriginalPrice() {
		return rebateOriginalPrice;
	}

	public void setRebateOriginalPrice(Double rebateOriginalPrice) {
		this.rebateOriginalPrice = rebateOriginalPrice;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Double getCouponDiscount() {
		return couponDiscount;
	}

	public void setCouponDiscount(Double couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

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

	public BigDecimal getMaxEasyMoney() {
		return maxEasyMoney;
	}

	public void setMaxEasyMoney(BigDecimal maxEasyMoney) {
		this.maxEasyMoney = maxEasyMoney;
	}

	public BigDecimal getRealOrderPrice() {
		return realOrderPrice;
	}

	public void setRealOrderPrice(BigDecimal realOrderPrice) {
		this.realOrderPrice = realOrderPrice;
	}

	public Integer getRebateNum() {
		return rebateNum;
	}

	public void setRebateNum(Integer rebateNum) {
		this.rebateNum = rebateNum;
	}

	public Integer getHongBaoNum() {
		return hongBaoNum;
	}

	public void setHongBaoNum(Integer hongBaoNum) {
		this.hongBaoNum = hongBaoNum;
	}

	public int getMaxIntegral() {
		return maxIntegral;
	}

	public void setMaxIntegral(int maxIntegral) {
		this.maxIntegral = maxIntegral;
	}

	public double getIntegralRatio() {
		return integralRatio;
	}

	public void setIntegralRatio(double integralRatio) {
		this.integralRatio = integralRatio;
	}

	public int getMyIntegral() {
		return myIntegral;
	}

	public void setMyIntegral(int myIntegral) {
		this.myIntegral = myIntegral;
	}

	@Override
	public String toString() {
		return "MaxIntegralVO [maxIntegral=" + maxIntegral + ", integralRatio="
				+ integralRatio + ", myIntegral=" + myIntegral + ", rebateNum="
				+ rebateNum + ", hongBaoNum=" + hongBaoNum
				+ ", realOrderPrice=" + realOrderPrice + ", maxEasyMoney="
				+ maxEasyMoney + ", couponCode=" + couponCode + ", couponDiscount="
				+ couponDiscount + ", platformRebateCode=" + platformRebateCode
				+ ", rebateDiscount=" + rebateDiscount 
				+ ", rebateOriginalPrice=" + rebateOriginalPrice 
				+ "]";
	}

}
