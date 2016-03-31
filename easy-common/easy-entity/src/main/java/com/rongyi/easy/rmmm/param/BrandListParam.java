package com.rongyi.easy.rmmm.param;

import java.io.Serializable;


public class BrandListParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId; // 要搜索品牌所属Mall的Mongo ID
	private String brandName; // 搜索条件品牌name
	private String currentPage; // 从0页开始
	private String pageSize;  // 每页数据显示数量

	public String getCurrentPage() {
		return currentPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getMallId() {
		return mallId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
