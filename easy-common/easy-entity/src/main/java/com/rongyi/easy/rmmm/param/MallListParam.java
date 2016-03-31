package com.rongyi.easy.rmmm.param;

import java.io.Serializable;


public class MallListParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallName; // 要搜索Mall的名称
	private String currentPage; // 从0页开始
	private String pageSize;  // 每页数据显示数量

	public String getMallName() {
		return mallName;
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
}
