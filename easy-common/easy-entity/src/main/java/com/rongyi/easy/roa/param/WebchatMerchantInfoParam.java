package com.rongyi.easy.roa.param;

import java.io.Serializable;
/**
 * 微信版商品详情商家有关信息（店铺信息）参数
 * @author user
 *
 */
public class WebchatMerchantInfoParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopId;//店铺id
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	
}
