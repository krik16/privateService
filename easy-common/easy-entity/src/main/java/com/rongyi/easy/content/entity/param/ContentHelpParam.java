package com.rongyi.easy.content.entity.param;

import java.io.Serializable;

public class ContentHelpParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currentPage;//当前页
	private String pageSize;//每页显示的数量
	private Integer type;//0买家,1卖家
	
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
