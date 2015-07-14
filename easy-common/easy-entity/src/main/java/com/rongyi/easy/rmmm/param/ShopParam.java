package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ShopParam implements Serializable{

	private String shopId;// 店铺id(mysql)

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
