package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 
 * @author Lc
 * 
 *         合作品牌VO
 *
 */
public class CooperateBrandVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String brandLogo; // 品牌LOGO
	private String id;
	private String name; // 品牌名称
	private String keyTag; // 标签
	private String bussinessDistrict; // 商圈

	public String getBrandLogo() {
		return brandLogo;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getKeyTag() {
		return keyTag;
	}

	public String getBussinessDistrict() {
		return bussinessDistrict;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKeyTag(String keyTag) {
		this.keyTag = keyTag;
	}

	public void setBussinessDistrict(String bussinessDistrict) {
		this.bussinessDistrict = bussinessDistrict;
	}
}
