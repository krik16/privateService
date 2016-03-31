package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class BrandParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String brandId;// 品牌id

	private String currentPage;// （要请求页）

	private String pageSize;// 每页数据显示数量

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
