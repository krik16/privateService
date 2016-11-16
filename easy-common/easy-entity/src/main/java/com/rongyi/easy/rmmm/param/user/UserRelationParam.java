package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

/**
 * 关联导购参数
 * @author WZH
 *
 */
public class UserRelationParam implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private String mallUserMid;//用户买家id
	
	private Integer userId;//导购id(卖家)
	
	private String shopMId;//店铺id或者店铺mongoId
	
	public String getMallUserMid() {
		return mallUserMid;
	}

	public void setMallUserMid(String mallUserMid) {
		this.mallUserMid = mallUserMid;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getShopMId() {
		return shopMId;
	}

	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}

	@Override
	public String toString() {
		return "UserRelationParam [mallUserMid=" + mallUserMid + ", userId="
				+ userId + ", shopMId=" + shopMId + "]";
	}

}
