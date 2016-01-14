package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
/**
 * 
 * @author Lc
 * 
 *         列表VO需要继承公共分页VO
 *
 */
public class PageVO implements Serializable{
	
	public static final long serialVersionUID = 1L;
	/** 数据总页数 */
	private int totalPage;
	/** 每页长度 */
	private int pageSize;
	/** 当前返回页 */
	private int currentPage;

	public int getTotalPage() {
		return totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

}
