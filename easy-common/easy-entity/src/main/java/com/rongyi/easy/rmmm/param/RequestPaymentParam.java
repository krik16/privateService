package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

public class RequestPaymentParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> orderNums;// 大订单号集合

	private String paymentEventType; // 请求支付类型 1为网页支付，3为APP支付

	public List<String> getOrderNums() {
		return orderNums;
	}

	public void setOrderNums(List<String> orderNums) {
		this.orderNums = orderNums;
	}

	public String getPaymentEventType() {
		return paymentEventType;
	}

	public void setPaymentEventType(String paymentEventType) {
		this.paymentEventType = paymentEventType;
	}

	@Override
	public String toString() {
		return "RequestPaymentParam{" +
				"orderNums=" + orderNums +
				", paymentEventType='" + paymentEventType + '\'' +
				'}';
	}
}
