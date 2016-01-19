package com.rongyi.easy.rmmm.param;

import java.io.Serializable;


public class ExpressListParam implements Serializable{


	private String currentPage; // 从0页开始
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


}
