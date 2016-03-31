package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class RefundVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String refundStatus;// 退款状态

	// private String shopIM;// 店铺可用IM账号
	private List<String> shopIM;// 店铺可用IM账号

	private String countDown;// 等带商家处理时间

	private String refundAmount;// 退款金额

	private String refundComment;// 退款说明

	private String refundTime;// 退款申请时间

	private List<String> refundPicList;// 申请退款图片

	private String refundDescribe;// 退款描述(拒绝退款理由)

	private String shopDealTime;// 商家处理退款时间

	private String refundId;// 售后ID

	private String expressBillId;// 物流单号ID

	private String expressName;// 物流名称

	private String expressTime;// 提交退货物流时间

	private String sonOrderId;// 子订单id

	private String refundTypeId;// 退款类型

	private String unitPrice;// 单价

	private String quantity;// 数量

	private String commodityPostage;// 运费

	private String parentOrderStatus;// 父订单状态

	private String otherRefundTimes;// 剩余退款次数

	private String sonOrderStatus;// 子订单状态

	private String orderId;// 订单id

	private String closeReason;// 关闭原因:商家取消订单/商家超时未发货

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	/*
	 * public String getShopIM() { return shopIM; }
	 * 
	 * public void setShopIM(String shopIM) { this.shopIM = shopIM; }
	 */

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}

	public String getCountDown() {
		return countDown;
	}

	public void setCountDown(String countDown) {
		this.countDown = countDown;
	}

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundComment() {
		return refundComment;
	}

	public void setRefundComment(String refundComment) {
		this.refundComment = refundComment;
	}

	public String getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public List<String> getRefundPicList() {
		return refundPicList;
	}

	public void setRefundPicList(List<String> refundPicList) {
		this.refundPicList = refundPicList;
	}

	public String getRefundDescribe() {
		return refundDescribe;
	}

	public void setRefundDescribe(String refundDescribe) {
		this.refundDescribe = refundDescribe;
	}

	public String getShopDealTime() {
		return shopDealTime;
	}

	public void setShopDealTime(String shopDealTime) {
		this.shopDealTime = shopDealTime;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getExpressTime() {
		return expressTime;
	}

	public void setExpressTime(String expressTime) {
		this.expressTime = expressTime;
	}

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getRefundTypeId() {
		return refundTypeId;
	}

	public void setRefundTypeId(String refundTypeId) {
		this.refundTypeId = refundTypeId;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getParentOrderStatus() {
		return parentOrderStatus;
	}

	public void setParentOrderStatus(String parentOrderStatus) {
		this.parentOrderStatus = parentOrderStatus;
	}

	public String getOtherRefundTimes() {
		return otherRefundTimes;
	}

	public void setOtherRefundTimes(String otherRefundTimes) {
		this.otherRefundTimes = otherRefundTimes;
	}

	public String getSonOrderStatus() {
		return sonOrderStatus;
	}

	public void setSonOrderStatus(String sonOrderStatus) {
		this.sonOrderStatus = sonOrderStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCloseReason() {
		return closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

}
