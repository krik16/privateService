package com.rongyi.easy.shop.vo;

import java.io.Serializable;
import java.util.List;

public class CategoryVO implements Serializable{
	
	private String id;
	
	private String name;
	
	private List<CategoryVO> subCategoryVOs;//子类集合
	
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

	public List<CategoryVO> getSubCategoryVOs() {
		return subCategoryVOs;
	}

	public void setSubCategoryVOs(List<CategoryVO> subCategoryVOs) {
		this.subCategoryVOs = subCategoryVOs;
	}
	
	
}
