package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class MyOrderParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String  jsessionid;//用户信息jsessionid

	private String status;
	
	private String currentPage;
	
	private String pageSize;

	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MyOrderParam{" +
				"status='" + status + '\'' +
				", currentPage='" + currentPage + '\'' +
				", pageSize='" + pageSize + '\'' +
				'}';
	}
}
