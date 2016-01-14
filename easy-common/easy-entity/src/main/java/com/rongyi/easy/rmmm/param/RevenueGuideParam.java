package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
/**
 * 收入管理RequestParam
 */
public class RevenueGuideParam implements Serializable {

	private static final long serialVersionUID = 1L;

	/**  导购Id */
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
