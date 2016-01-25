package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppOrderRefund implements Serializable{
	private Integer id;

	private String orderId;

	private String activityId;

	private Integer needRefundNum;

	private BigDecimal needRefundAmount;

	private BigDecimal realRefundAmount;

	private Integer status;

	private Integer itemId;

	private String itemName;

	private String buyerId;

	private String buyerName;

	private String buyerMobile;

	private Date updateTime;

	private Date createTime;

	private String createBy;

	private Date checkTime;

	private String checkBy;

	private Integer orderDetailId;

	private String payment; // 退款方式 微信 or支付宝

	private String payAccount; // 退款账号，支付宝帐号或微信账号
	
	private String refundWay; // 退款途径 （现在只支持原路返回）

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId == null ? null : activityId.trim();
	}

	public Integer getNeedRefundNum() {
		return needRefundNum;
	}

	public void setNeedRefundNum(Integer needRefundNum) {
		this.needRefundNum = needRefundNum;
	}

	public BigDecimal getNeedRefundAmount() {
		return needRefundAmount;
	}

	public void setNeedRefundAmount(BigDecimal needRefundAmount) {
		this.needRefundAmount = needRefundAmount;
	}

	public BigDecimal getRealRefundAmount() {
		return realRefundAmount;
	}

	public void setRealRefundAmount(BigDecimal realRefundAmount) {
		this.realRefundAmount = realRefundAmount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName == null ? null : itemName.trim();
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId == null ? null : buyerId.trim();
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName == null ? null : buyerName.trim();
	}

	public String getBuyerMobile() {
		return buyerMobile;
	}

	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile == null ? null : buyerMobile.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckBy() {
		return checkBy;
	}

	public void setCheckBy(String checkBy) {
		this.checkBy = checkBy == null ? null : checkBy.trim();
	}

	public Integer getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment == null ? null : payment.trim();
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount == null ? null : payAccount.trim();
	}

	public String getRefundWay() {
		return refundWay;
	}

	public void setRefundWay(String refundWay) {
		this.refundWay = refundWay;
	}
}