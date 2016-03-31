package com.rongyi.easy.bdata.vo;

import java.io.Serializable;


public class BrandsCategoryVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cateId;
	private String cateName;
	private String secCateId;
	private String secCateName;
	public String getCateId() {
		return cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getSecCateId() {
		return secCateId;
	}
	public void setSecCateId(String secCateId) {
		this.secCateId = secCateId;
	}
	public String getSecCateName() {
		return secCateName;
	}
	public void setSecCateName(String secCateName) {
		this.secCateName = secCateName;
	}
}
