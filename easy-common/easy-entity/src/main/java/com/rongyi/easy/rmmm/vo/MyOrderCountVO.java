package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class MyOrderCountVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String unPaidCount;// 待付款数量
	private String unReceiveCount;// 待收货数量
	private String unEvalueCount;// 待评价数量
	private String afterSaleCount;// 售后

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

	@Override
	public String toString() {
		return "MyOrderCountVO{" +
				"unPaidCount='" + unPaidCount + '\'' +
				", unReceiveCount='" + unReceiveCount + '\'' +
				", unEvalueCount='" + unEvalueCount + '\'' +
				", afterSaleCount='" + afterSaleCount + '\'' +
				'}';
	}
}
