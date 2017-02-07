package com.rongyi.easy.rmmm.brand;

import java.io.Serializable;

public class BrandVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9083923891159691011L;
	private String id;//品牌mongoId
	private String brandName;//品牌名称
	private String logo;//品牌logo
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Override
	public String toString() {
		return "BrandVO [id=" + id + ", brandName=" + brandName + ", logo="
				+ logo + "]";
	}
	
}
