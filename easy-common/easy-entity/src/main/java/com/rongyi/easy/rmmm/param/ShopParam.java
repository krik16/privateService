package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ShopParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopId;// 店铺id(mysql)

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}


}
