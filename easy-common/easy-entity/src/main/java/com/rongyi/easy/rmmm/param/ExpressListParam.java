package com.rongyi.easy.rmmm.param;

import java.io.Serializable;


public class ExpressListParam implements Serializable{


	private String currentPage = "0"; // 从0页开始
	private String pageSize = "10";  // 每页数据显示数量
	private String version = "0";//0是老版本（只查询前10条数据） 1是新版本
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "ExpressListParam [currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", version=" + version + "]";
	}


}
