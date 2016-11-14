package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ReceiveCouponParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String couponId;//卷 的id
	private String userId;//用户id userid
	private String user_source;//用户渠道
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUser_source() {
		return user_source;
	}
	public void setUser_source(String user_source) {
		this.user_source = user_source;
	}
	@Override
	public String toString() {
		return "ReceiveCouponParam [couponId=" + couponId + ", userId="
				+ userId + ", user_source=" + user_source + "]";
	}
	
}
