package com.rongyi.easy.bsoms.param;

import java.io.Serializable;

public class UserShopIdParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String shopMid;
	private Integer userId;
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UserShopIdParam [shopMid=" + shopMid + ", userId=" + userId
				+ "]";
	}
	
}
