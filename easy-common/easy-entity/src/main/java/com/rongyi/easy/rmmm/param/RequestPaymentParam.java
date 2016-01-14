package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

public class RequestPaymentParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> orderNums;// 大订单号集合

	private String paymentEventType; // 请求支付类型 1为网页支付，3为APP支付  5微信支付
	
	/**
     * 微信公众号
     */
    private String publicCode;

    /**
     * 微信支付商场id(区分不同商场的公众号)
     */
    private String mallId;

    /**
     * 微信公众号支付需要获取支付用户的openId
     */
    private String openId;

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

	public String getPublicCode() {
		return publicCode;
	}

	public void setPublicCode(String publicCode) {
		this.publicCode = publicCode;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@Override
	public String toString() {
		return "RequestPaymentParam [orderNums=" + orderNums
				+ ", paymentEventType=" + paymentEventType + ", publicCode="
				+ publicCode + ", mallId=" + mallId + ", openId=" + openId
				+ "]";
	}
	
}
