package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class UserIdParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;//导购id

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
