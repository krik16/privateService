package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class RefundDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String expressName;// 快递公司名称
	private String expressId;// 快递单号
	private String orderId;// 订单编号
	private String refundTime;// 退款申请时间
	private String refundType;// 退款类型
	private String buyerName;// 买家昵称
	private String buyerIM;// 买家IM
	private String phone;// 联系方式
	private String refundAmount;// 退款金额
	private String refundComment;// 退款说明
	private List<String> refundPicList;// 退款说明图片集合
	private String refundDetailId;// 退款详情ID
	private String buyerNickName;// 买家昵称

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getExpressId() {
		return expressId;
	}

	public void setExpressId(String expressId) {
		this.expressId = expressId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerIM() {
		return buyerIM;
	}

	public void setBuyerIM(String buyerIM) {
		this.buyerIM = buyerIM;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public List<String> getRefundPicList() {
		return refundPicList;
	}

	public void setRefundPicList(List<String> refundPicList) {
		this.refundPicList = refundPicList;
	}

	public String getRefundDetailId() {
		return refundDetailId;
	}

	public void setRefundDetailId(String refundDetailId) {
		this.refundDetailId = refundDetailId;
	}

	public String getBuyerNickName() {
		return buyerNickName;
	}

	public void setBuyerNickName(String buyerNickName) {
		this.buyerNickName = buyerNickName;
	}

}
