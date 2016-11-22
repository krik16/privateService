package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;

public class IndustrySearchParam implements Serializable {
	private static final long serialVersionUID = 2905367200197306832L;
	
	private String name;
	private int currentPage = 0;//当前页
	private int pageSize =0;//总页数
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "IndustrySearchParam [name=" + name + ", currentPage=" + currentPage + ", pageSize=" + pageSize + "]";
	}
	
	
}
