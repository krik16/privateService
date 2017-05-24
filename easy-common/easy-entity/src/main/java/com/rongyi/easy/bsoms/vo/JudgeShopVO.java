package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;

public class JudgeShopVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMid;//店铺id
	private boolean isChainShop;//是否是连锁店铺
	private boolean singleShopAccount;//是否是单店铺账号
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public boolean getIsChainShop() {
		return isChainShop;
	}
	public void setIsChainShop(boolean isChainShop) {
		this.isChainShop = isChainShop;
	}
	public boolean isSingleShopAccount() {
		return singleShopAccount;
	}
	public void setSingleShopAccount(boolean singleShopAccount) {
		this.singleShopAccount = singleShopAccount;
	}
	@Override
	public String toString() {
		return "JudgeShopVO [shopMid=" + shopMid + ", isChainShop="
				+ isChainShop + ", singleShopAccount=" + singleShopAccount
				+ "]";
	}
	
}
