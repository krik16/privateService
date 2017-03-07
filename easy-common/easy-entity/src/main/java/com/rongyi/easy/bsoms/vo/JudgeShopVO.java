package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;

public class JudgeShopVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMid;//店铺id
	private Boolean isChainShop;//是否是连锁店铺
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public Boolean getIsChainShop() {
		return isChainShop;
	}
	public void setIsChainShop(Boolean isChainShop) {
		this.isChainShop = isChainShop;
	}
	@Override
	public String toString() {
		return "JudgeShopVO [shopMid=" + shopMid + ", isChainShop="
				+ isChainShop + "]";
	}
	
}
