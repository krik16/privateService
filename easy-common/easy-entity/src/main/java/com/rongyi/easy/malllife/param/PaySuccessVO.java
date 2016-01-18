package com.rongyi.easy.malllife.param;

import java.io.Serializable;

public class PaySuccessVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orderId;//订单id
	private String sonOrderId;//子订单id
	private String unitPrice;//单价
	private String num;//下单数量
	private String commodityName;//商品名称
	private String commodityId;//商品id
	private String totalPrice;//总价
	private String shopName;// 店铺名称
	private String consignee;// 收件人姓名
	private String phone;// 收件人电话
	private String address;// 邮寄地址
	private String orderNum;// 订单编号
	private String expressBillId;// 物流单号ID
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSonOrderId() {
		return sonOrderId;
	}
	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getExpressBillId() {
		return expressBillId;
	}
	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}
	@Override
	public String toString() {
		return "PaySuccessVO [orderId=" + orderId + ", sonOrderId="
				+ sonOrderId + ", unitPrice=" + unitPrice + ", num=" + num
				+ ", commodityName=" + commodityName + ", commodityId="
				+ commodityId + ", totalPrice=" + totalPrice + ", shopName="
				+ shopName + ", consignee=" + consignee + ", phone=" + phone
				+ ", address=" + address + ", orderNum=" + orderNum
				+ ", expressBillId=" + expressBillId + "]";
	}
	
}
