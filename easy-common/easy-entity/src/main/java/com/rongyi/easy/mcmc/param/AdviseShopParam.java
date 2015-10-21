package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * 建议商店
 * 
 * @author xiaob
 *
 */
public class AdviseShopParam implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * mongo id
	 */
	private String id;
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

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
