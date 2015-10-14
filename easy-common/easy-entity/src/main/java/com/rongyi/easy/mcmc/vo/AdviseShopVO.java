package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 建议商店
 * @author xiaob
 *
 */
public class AdviseShopVO  implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 商场名称
	 */
	private String mallName;
	/**
	 * 店铺名称
	 */
	private String shopName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	

}
