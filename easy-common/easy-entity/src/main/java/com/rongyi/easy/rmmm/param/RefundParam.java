package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * 退款参数
 * @author user
 *
 */
public class RefundParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String refundDetailId;//退款详情ID
	private String reason;//拒绝原因
	
	public String getRefundDetailId() {
		return refundDetailId;
	}
	public void setRefundDetailId(String refundDetailId) {
		this.refundDetailId = refundDetailId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
