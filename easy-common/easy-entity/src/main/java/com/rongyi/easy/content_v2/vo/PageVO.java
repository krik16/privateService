package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

public class PageVO implements Serializable{
	private Integer currentPage;
	private Integer pageSize;
	private Integer totalCount;
	
	public PageVO(){
		
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
