package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

import com.rongyi.easy.mcmc.CommodityCategory;


public class CommodityCategoryVO2 implements  Serializable{

	private static final long serialVersionUID = -7221743669151489796L;
	private String categoryId;
	private String categoryName;
	private int type;//0表示不是最后一级1表示是最后一级
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public CommodityCategoryVO2(CommodityCategory commodityCategory){
		this.categoryId = commodityCategory.getId().toString();
		this.categoryName = commodityCategory.getName();
		if(commodityCategory.getType()==3)
			this.type=1;
		else
			this.type=0;
	}
}
