package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ExclusiveGuideParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String currentPage;// （要请求页）

	private String pageSize;// 每页数据显示数量

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

	@Override
	public String toString() {
		return "ExclusiveGuideParam [currentPage=" + currentPage
				+ ", pageSize=" + pageSize + "]";
	}
	
	
}
