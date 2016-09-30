package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class UserAddressListParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currentPage; // 当前页
	private String pageSize;  // 每页数据显示数量
	private Integer appVersion;//app版本号
	private Integer iosOrAndroid;//1 安卓，2 ios，0 默认值
	
	public Integer getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(Integer appVersion) {
		this.appVersion = appVersion;
	}
	public Integer getIosOrAndroid() {
		return iosOrAndroid;
	}
	public void setIosOrAndroid(Integer iosOrAndroid) {
		this.iosOrAndroid = iosOrAndroid;
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
	@Override
	public String toString() {
		return "UserAddressListParam [currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", appVersion=" + appVersion
				+ ", iosOrAndroid=" + iosOrAndroid + "]";
	}
	
}
