package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;


public class ContentHelpSecondCateVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String secondId;//二级分类id
	private String secondCategoryName;//二级分类名称
	
	public String getSecondId() {
		return secondId;
	}
	public void setSecondId(String secondId) {
		this.secondId = secondId;
	}
	public String getSecondCategoryName() {
		return secondCategoryName;
	}
	public void setSecondCategoryName(String secondCategoryName) {
		this.secondCategoryName = secondCategoryName;
	}
	
}
