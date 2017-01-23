package com.rongyi.easy.rmmm.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;

public class ReceiveCouponParam extends MalllifeBaseParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String couponId;//卷 的id
	private String userId;//用户id userid
	private String user_source;//用户渠道
	private String activityId; //活动标识
	private Integer activityType; //活动类型

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

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
		return "ReceiveCouponParam{" +
				"couponId='" + couponId + '\'' +
				", userId='" + userId + '\'' +
				", user_source='" + user_source + '\'' +
				", activityId='" + activityId + '\'' +
				", activityType=" + activityType +
				", MalllifeBaseParam=" + super.toString() +
				'}';
	}
}
