package com.rongyi.easy.bsoms.param;

import java.io.Serializable;

public class JudgeShopParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMid;//店铺mongoId

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	@Override
	public String toString() {
		return "JudgeShopParam [shopMid=" + shopMid + "]";
	}
	
}
