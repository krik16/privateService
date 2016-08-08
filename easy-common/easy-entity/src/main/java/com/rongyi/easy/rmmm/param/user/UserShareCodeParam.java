package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;

public class UserShareCodeParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private Integer type;//1容易逛用户   2摩店用户
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	
}
