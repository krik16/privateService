package com.rongyi.easy.rmmm.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class MyOrderCountVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String unPaidCount;// 待付款数量
	private String unReceiveCount;// 待收货数量（包括待发货数量）
	private String unEvalueCount;// 待评价数量
	private String afterSaleCount;// 售后
	private int unDeliverCount;//待发货数量
	private int unReceiveCount2;//待收货数量（不包括待发货数量）
	private int finishedCount;//完成订单数
	private int refundCount;//退款单数量
	private int closeCount;//已关闭订单数量（包括确认收货和已关闭订单数量

	public int getUnDeliverCount() {
		return unDeliverCount;
	}

	public void setUnDeliverCount(int unDeliverCount) {
		this.unDeliverCount = unDeliverCount;
	}

	public int getUnReceiveCount2() {
		return unReceiveCount2;
	}

	public void setUnReceiveCount2(int unReceiveCount2) {
		this.unReceiveCount2 = unReceiveCount2;
	}

	public String getUnPaidCount() {
		return unPaidCount;
	}

	public void setUnPaidCount(String unPaidCount) {
		this.unPaidCount = unPaidCount;
	}

	public String getUnReceiveCount() {
		return unReceiveCount;
	}

	public void setUnReceiveCount(String unReceiveCount) {
		this.unReceiveCount = unReceiveCount;
	}

	public String getUnEvalueCount() {
		return unEvalueCount;
	}

	public void setUnEvalueCount(String unEvalueCount) {
		this.unEvalueCount = unEvalueCount;
	}

	public String getAfterSaleCount() {
		return afterSaleCount;
	}

	public void setAfterSaleCount(String afterSaleCount) {
		this.afterSaleCount = afterSaleCount;
	}

	public int getFinishedCount() {
		return finishedCount;
	}

	public void setFinishedCount(int finishedCount) {
		this.finishedCount = finishedCount;
	}

	public int getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(int refundCount) {
		this.refundCount = refundCount;
	}

	public int getCloseCount() {
		return closeCount;
	}

	public void setCloseCount(int closeCount) {
		this.closeCount = closeCount;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
}
