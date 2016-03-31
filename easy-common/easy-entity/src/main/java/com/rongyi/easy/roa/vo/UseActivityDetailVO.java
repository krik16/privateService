package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.Date;

public class UseActivityDetailVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String mallName; // 商场名称

	private String address; // 商场地址

	private String activityCode; // 优惠券码

	private String itemName; // 优惠券名称 ， 商品名称，团购中对应团购名称 title 字段

	private Date startTime; // 有效期始

	private Date endTime; // 有效期止

	private String use_restriction; // 使用限制

	private String use_mode; // 使用方式

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
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

	public String getMallName() {
		return mallName;
	}

	public String getAddress() {
		return address;
	}

	public String getUse_restriction() {
		return use_restriction;
	}

	public String getUse_mode() {
		return use_mode;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUse_restriction(String use_restriction) {
		this.use_restriction = use_restriction;
	}

	public void setUse_mode(String use_mode) {
		this.use_mode = use_mode;
	}
}