package com.rongyi.easy.notice.param;

import java.io.Serializable;

public class NoticeQueryParam implements Serializable{
	private static final int PAGESIZE = 10;
    private static final int CURRENTPAGE = 1;
	/**
	 * 店铺id
	 */
	private String shopId;
	/**
	 * 当前页
	 */
	private int currentPage;
	/**
	 * 每页显示的数量
	 */
	private int pageSize;
	/**
	 * lilmit (0)
	 */
	private int offset;
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public int getCurrentPage() {
		return currentPage == 0?CURRENTPAGE:currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize ==0 ? PAGESIZE:pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getOffset() {
		return (this.getCurrentPage() - 1) * this.getPageSize();
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public static int getPagesize() {
		return PAGESIZE;
	}
	public static int getCurrentpage() {
		return CURRENTPAGE;
	}
	
	
}
