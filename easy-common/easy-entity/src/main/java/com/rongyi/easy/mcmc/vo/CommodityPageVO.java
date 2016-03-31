package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class CommodityPageVO  implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2927430452258911558L;

	private int totalPage;
	private int pageSize;
	private int currentPage;
	private List<CommodityVO> commodityList;
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
	public List<CommodityVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<CommodityVO> commodityList) {
		this.commodityList = commodityList;
	}
	
}
