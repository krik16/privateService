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
	private String shopId;//店铺id
	private String mallId;//商场id
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	@Override
	public String toString() {
		return "HipsterStrategyParam [shopId=" + shopId + ", mallId=" + mallId
				+ "]";
	}
	
}
