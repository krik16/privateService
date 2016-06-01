package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class UserAddressListParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currentPage; // 当前页
	private String pageSize;  // 每页数据显示数量
	
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
		return "UserAddressListParam [currentPage=" + currentPage
				+ ", pageSize=" + pageSize + "]";
	}
	
}
