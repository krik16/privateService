package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class SonOrderParam implements Serializable{
	private String specId;// 我是规格编号
	private String num;// 下单数量
	private String commodityId;// 我是商品编号
	private String couponCode;// 卡券码
	private String type;//
	private String orderDetailModelId;// 子模板id

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getOrderDetailModelId() {
		return orderDetailModelId;
	}

	public void setOrderDetailModelId(String orderDetailModelId) {
		this.orderDetailModelId = orderDetailModelId;
	}

	@Override
	public String toString() {
		return "SonOrderParam{" +
				"specId='" + specId + '\'' +
				", num='" + num + '\'' +
				", commodityId='" + commodityId + '\'' +
				", couponCode='" + couponCode + '\'' +
				", orderDetailModelId='" + orderDetailModelId + '\'' +
				'}';
	}
}
