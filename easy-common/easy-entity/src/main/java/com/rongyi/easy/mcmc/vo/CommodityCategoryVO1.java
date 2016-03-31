package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;


public class CommodityCategoryVO1 implements  Serializable{

	/**
	 * 最新的十条类目
	 */
	private static final long serialVersionUID = -7221743669151489796L;
	private List<String> categoryIds;
	private String categoryName;
	
	public List<String> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}