package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class CollectCommodityParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String commodityId;// 我是商品编号

	private String currentPage;

	private String pageSize;

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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

	@Override
	public String toString() {
		return "CollectCommodityParam [commodityId=" + commodityId
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ "]";
	}

}
