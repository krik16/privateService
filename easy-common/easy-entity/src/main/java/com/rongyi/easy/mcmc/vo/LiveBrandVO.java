package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 直播商品品牌
 * @author xiaobo
 *
 */
public class LiveBrandVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 品牌id
	 */
	private String brandId;
	/**
	 * 品牌名称
	 */
	private String brandName;
	/**
	 * 品牌logo图片路径
	 */
	private String brandLogo;
	
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandLogo() {
		return brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

}
