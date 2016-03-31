package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class CouponListParam implements Serializable{

	private String status;// 1：未使用 2：包括已使用、已失效

	private String commodityId;// 商品编号

	private String currentPage;//

	private String pageSize;//

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	@Override
	public String toString () {
		return new ToStringBuilder(this)
				.append("status", status)
				.append("commodityId", commodityId)
				.append("currentPage", currentPage)
				.append("pageSize", pageSize)
				.toString();
	}
}
