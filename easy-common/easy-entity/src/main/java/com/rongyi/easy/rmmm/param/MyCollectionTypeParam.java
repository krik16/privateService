package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class MyCollectionTypeParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pageSize;//页面显示的数量
	private String currentPage;//当前页 从1 开始
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	
}
