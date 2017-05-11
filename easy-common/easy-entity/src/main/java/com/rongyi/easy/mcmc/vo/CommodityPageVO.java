package com.rongyi.easy.mcmc.vo;

import org.springframework.util.Assert;

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
	private int totalCount;
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

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<CommodityVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<CommodityVO> commodityList) {
		this.commodityList = commodityList;
	}

	public void wrapPaginationInfo(int totalCount, int pageSize, int currentPage) {
		this.setTotalCount(totalCount);
		this.setTotalPage(calculateTotalPage(totalCount, pageSize));
		this.setPageSize(pageSize);
		this.setCurrentPage(currentPage);
	}

	private int calculateTotalPage(int totalCount, int pageSize) {
		return (totalCount % pageSize == 0) ? totalCount / pageSize : totalCount / pageSize + 1;
	}

	public void buildCommodityPageBuyerVO(List<CommodityVO> commodityVOList, int currentPage,
										  int pageSize, int totalCount){
		this.setCommodityList(commodityVOList);
		this.wrapPaginationInfo(totalCount, pageSize, currentPage);
	}
}
