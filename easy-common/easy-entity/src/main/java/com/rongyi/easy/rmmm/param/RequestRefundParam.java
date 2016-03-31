package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class RequestRefundParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sonOrderId;// 子订单id
	private String requestServeId;// 申请服务(退款类型)
	private String refundAmount;// 退款金额
	private String expressBillId;// 物流单号
	private String expressId;// 物流公司id
	private String expressName;// 物流公司名称
	private String refundReasonId;// 退货原因ID
	private String refundComment;// 退款说明

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getRequestServeId() {
		return requestServeId;
	}

	public void setRequestServeId(String requestServeId) {
		this.requestServeId = requestServeId;
	}

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
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

	public String getRefundReasonId() {
		return refundReasonId;
	}

	public void setRefundReasonId(String refundReasonId) {
		this.refundReasonId = refundReasonId;
	}

	public String getRefundComment() {
		return refundComment;
	}

	public void setRefundComment(String refundComment) {
		this.refundComment = refundComment;
	}

	public String getExpressId() {
		return expressId;
	}

	public void setExpressId(String expressId) {
		this.expressId = expressId;
	}

}
