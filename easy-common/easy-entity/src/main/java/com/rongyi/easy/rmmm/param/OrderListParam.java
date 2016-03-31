/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年7月27日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年7月27日 1.0 创建文件
 */
public class OrderListParam implements Serializable {

	private Double couponAmount = 0.0;// 红包价格

	private Double unitPrice  = 0.0;// 单价

	private Double num = 0.0;// 数量
	
	private Double platformRebateAmount = 0.0;// 抵扣券抵扣金额
	
	private String couponId;// 代金券id

	public Double getPlatformRebateAmount() {
		return platformRebateAmount;
	}

	public void setPlatformRebateAmount(Double platformRebateAmount) {
		this.platformRebateAmount = platformRebateAmount;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Double getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "OrderListParam [couponAmount=" + couponAmount + ", unitPrice=" + unitPrice + ", num=" + num
				+ ", platformRebateAmount=" + platformRebateAmount + ", couponId=" + couponId + "]";
	}
}
