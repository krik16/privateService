package com.rongyi.easy.contentnew.entity.vo;

import java.io.Serializable;

public class PageVo implements Serializable{
	private Integer currentPage;
	private Integer pageSize;
	private Integer totalCount;
	
	public PageVo(){
		
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
