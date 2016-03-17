package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class MyOrderParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String  jsessionid;//用户信息jsessionid

	private String status;//1:全部 2待付款 3待收货 4待评价 5售后
	
	private String currentPage;
	
	private String pageSize;
	
	private String memberId;//微信用户id

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
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "MyOrderParam [jsessionid=" + jsessionid + ", status=" + status
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ ", memberId=" + memberId + "]";
	}
	
}
