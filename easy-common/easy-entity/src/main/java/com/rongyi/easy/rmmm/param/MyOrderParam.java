package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class MyOrderParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String  jsessionid;//用户信息jsessionid

	private String status;//1:全部 2待付款 3待收货 4待评价 5售后  6已完成 7待发货
	
	private String currentPage;
	
	private String pageSize;
	
	private String memberId;//微信用户id

	private String orderSource;//订单来源，查询多个来源逗号分隔

	private String createAtBegin;//创建时间开始值

	private String createAtEnd;//创建时间结束值

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

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getCreateAtBegin() {
		return createAtBegin;
	}

	public void setCreateAtBegin(String createAtBegin) {
		this.createAtBegin = createAtBegin;
	}

	public String getCreateAtEnd() {
		return createAtEnd;
	}

	public void setCreateAtEnd(String createAtEnd) {
		this.createAtEnd = createAtEnd;
	}

	@Override
	public String toString() {
		return "MyOrderParam{" +
				"jsessionid='" + jsessionid + '\'' +
				", status='" + status + '\'' +
				", currentPage='" + currentPage + '\'' +
				", pageSize='" + pageSize + '\'' +
				", memberId='" + memberId + '\'' +
				", orderSource='" + orderSource + '\'' +
				", createAtBegin='" + createAtBegin + '\'' +
				", createAtEnd='" + createAtEnd + '\'' +
				'}';
	}
}
