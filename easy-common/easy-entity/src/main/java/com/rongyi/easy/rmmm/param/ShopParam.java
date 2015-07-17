package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ShopParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMId;// 店铺id(mysql)

	public String getShopMId() {
		return shopMId;
	}

	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}


}
