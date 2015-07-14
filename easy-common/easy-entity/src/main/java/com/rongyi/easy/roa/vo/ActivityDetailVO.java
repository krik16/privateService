package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.Date;

public class ActivityDetailVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer activityDetailId; // 优惠Id

	private String activityCode; // 优惠券码

	private String itemName; // 优惠券名称 ， 商品名称，团购中对应团购名称 title 字段

	private Integer status; // 使用状态

	private Date startTime; // 有效期始

	private Date endTime; // 有效期止

	public Integer getActivityDetailId() {
		return activityDetailId;
	}

	public void setActivityDetailId(Integer activityDetailId) {
		this.activityDetailId = activityDetailId;
	}

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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}