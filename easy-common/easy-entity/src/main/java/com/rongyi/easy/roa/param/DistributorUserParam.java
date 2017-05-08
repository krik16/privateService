package com.rongyi.easy.roa.param;

import java.io.Serializable;

public class DistributorUserParam implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;
	
	private Integer currentPage;
	
	private String mallId;//商场id
	
	private String shopId;//店铺id

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	
	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "DistributorUserParam [pageSize=" + pageSize + ", currentPage="
				+ currentPage + ", mallId=" + mallId + ", shopId=" + shopId
				+ "]";
	}
	
}
