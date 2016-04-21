package com.rongyi.easy.rmc.param;

import java.io.Serializable;

public class ActivityLimitParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1159768198557797584L;
	private String mobile;
	private String name;
	private String mallId;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
}
