package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianCartThemeBaseVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String count;// 
	private String pageSize;// 
	private String pages;// 
	private String end;// 
	private String start;// 
	private String currentPage;// 
	private List<BailianCartThemeVo> list;// 
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public List<BailianCartThemeVo> getList() {
		return list;
	}
	public void setList(List<BailianCartThemeVo> list) {
		this.list = list;
	}
	
}