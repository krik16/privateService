package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ValidHistoryParam implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String currentPage; // 从1页开始
	private String pageSize; // 每页数据显示数量
	private Integer date;// 时间（0所有时间，1当天，2当周，3当月，4昨天）
	private Integer status;//1我的核销 2店铺核销

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

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
