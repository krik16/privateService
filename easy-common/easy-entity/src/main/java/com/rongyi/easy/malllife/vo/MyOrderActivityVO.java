package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class MyOrderActivityVO implements Serializable{
	private String activityCode;
	private Integer status;
	private BigDecimal unit_price; // 单价
	private int activitiesId; // 优惠券Id
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public BigDecimal getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
	}
	public int getActivitiesId() {
		return activitiesId;
	}
	public void setActivitiesId(int activitiesId) {
		this.activitiesId = activitiesId;
	}
}
