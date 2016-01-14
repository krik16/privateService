package com.rongyi.easy.mcmc.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class CommodityPageBuyerVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -611440203770186180L;
	
	
	private int totalPage;
	private int pageSize;
	private int currentPage;
	private int nextFrom;
	private List<CommodityBuyerVO> commodityList;
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public List<CommodityBuyerVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<CommodityBuyerVO> commodityList) {
		this.commodityList = commodityList;
	}

	public int getNextFrom() {
		return nextFrom;
	}

	public void setNextFrom(int nextFrom) {
		this.nextFrom = nextFrom;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("totalPage", totalPage)
				.append("pageSize", pageSize)
				.append("currentPage", currentPage)
				.append("commodityList", commodityList)
				.append("nextFrom",  nextFrom)
				.toString();
	}
}
