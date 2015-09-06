package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;


public class CommodityCategoryVO1 implements  Serializable{

	/**
	 * 最新的十条类目
	 */
	private static final long serialVersionUID = -7221743669151489796L;
	private String categoryId;
	private String categoryName;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}