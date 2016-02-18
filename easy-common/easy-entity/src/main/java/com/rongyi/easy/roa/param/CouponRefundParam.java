package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;



public class CouponRefundParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orderId;//订单号
	private Integer number;//退款优惠券数量
	private Double totalFee;//退款总金额
	private String refundWay;//退款方式
	private String refundReason;//退款原因
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	public String getRefundWay() {
		return refundWay;
	}
	public void setRefundWay(String refundWay) {
		this.refundWay = refundWay;
	}
	public String getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	
}
