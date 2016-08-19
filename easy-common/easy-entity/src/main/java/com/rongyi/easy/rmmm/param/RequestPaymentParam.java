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
     * appId
     */
    private String appId;

    /**
     * 微信公众号支付需要获取支付用户的openId
     */
    private String openId;
    /**
	 * 0:APP(app支付),1:JSAPI(公众号支付),2:NATIVE(原生扫码支付)
	 */
	private String weixinPayType;
	private String callBackUrl;//支付宝网页支付同步通知回调地址

	private String merchantUrl;//支付宝网页支付支付取消返回商家url
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
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	public String getWeixinPayType() {
		return weixinPayType;
	}

	public void setWeixinPayType(String weixinPayType) {
		this.weixinPayType = weixinPayType;
	}
	
	public String getCallBackUrl() {
		return callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public String getMerchantUrl() {
		return merchantUrl;
	}

	public void setMerchantUrl(String merchantUrl) {
		this.merchantUrl = merchantUrl;
	}

	@Override
	public String toString() {
		return "RequestPaymentParam [orderNums=" + orderNums
				+ ", paymentEventType=" + paymentEventType + ", appId=" + appId
				+ ", openId=" + openId + ", weixinPayType=" + weixinPayType
				+ ", callBackUrl=" + callBackUrl
				+ ", merchantUrl=" + merchantUrl
				+ "]";
	}

	
}
