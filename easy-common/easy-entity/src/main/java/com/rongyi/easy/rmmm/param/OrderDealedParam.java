package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class OrderDealedParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;// 大订单id
	private String discount;// 要减去的价格
	private String commodityPostage;// 运费
	private String orderNo;// 大订单号
	private String orderPrice;// 订单价格
	private Integer userId;//卖家用户id
	private Integer source = 1;//操作平台 1摩店 2商家后台

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getSource()
	{
		return source;
	}

	public void setSource(Integer source)
	{
		this.source = source;
	}

	@Override
	public String toString() {
		return "OrderDealedParam{" +
				"orderId='" + orderId + '\'' +
				", discount='" + discount + '\'' +
				", commodityPostage='" + commodityPostage + '\'' +
				", orderNo='" + orderNo + '\'' +
				", orderPrice='" + orderPrice + '\'' +
				", userId=" + userId +
				", source=" + source +
				'}';
	}
}
