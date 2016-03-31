package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
import java.util.List;

public class ContentHelpFirstCateVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstId;//一级分类id
	private String firstCategoryName;//一级分类名称
	private List<ContentHelpSecondCateVO> secondCateList;//二级分类列表
	
	public String getFirstId() {
		return firstId;
	}
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}
	public String getFirstCategoryName() {
		return firstCategoryName;
	}
	public void setFirstCategoryName(String firstCategoryName) {
		this.firstCategoryName = firstCategoryName;
	}
	public List<ContentHelpSecondCateVO> getSecondCateList() {
		return secondCateList;
	}
	public void setSecondCateList(List<ContentHelpSecondCateVO> secondCateList) {
		this.secondCateList = secondCateList;
	}
	
}
