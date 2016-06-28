package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 潮人攻略参数
 * @author user
 *
 */
public class HipsterStrategyParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMId;//店铺id
	private String mallMId;//商场id
	public String getShopMId() {
		return shopMId;
	}
	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}
	public String getMallMId() {
		return mallMId;
	}
	public void setMallMId(String mallMId) {
		this.mallMId = mallMId;
	}
	
}
