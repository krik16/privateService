package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * FE端商品VO
 * 
 * @author xiaobo
 *
 */
public class CommodityFEVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 商品id
	 */
	private String id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品分类
	 */
	private String category;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 商场名称
	 */
	private String mallNmae;

	/**
	 * 状态
	 */
	private int status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMallNmae() {
		return mallNmae;
	}

	public void setMallNmae(String mallNmae) {
		this.mallNmae = mallNmae;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
