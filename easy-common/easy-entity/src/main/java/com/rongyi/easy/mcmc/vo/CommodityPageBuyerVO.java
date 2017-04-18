package com.rongyi.easy.mcmc.vo;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.solr.param.CommoditySearchParam;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.List;

public class CommodityPageBuyerVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -611440203770186180L;
	
	
	private int totalPage; ///< 总页码
	private int pageSize; ///< 每页数
	private int currentPage; ///< 当前页
	private int nextFrom; ///< 下页开始位置
	private List<CommodityBuyerVO> commodityList;
	private int totalCount; ///< 总记录数
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
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
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

	public void wrapPaginationInfo(int totalCount, int from, int pageSize, int currentPage) {
		this.setTotalCount(totalCount);
		this.setNextFrom(from);
		this.setTotalPage(calculateTotalPage(totalCount, pageSize));
		this.setPageSize(pageSize);
		this.setCurrentPage(currentPage);
	}

	private int calculateTotalPage(int totalCount, int pageSize) {
		return (totalCount % pageSize == 0) ? totalCount / pageSize : totalCount / pageSize + 1;
	}

	private int getCommodityIndex(List<CommodityBuyerVO> commodityList) {
		Assert.notNull(commodityList);
		return (this.currentPage - 1) * this.pageSize + commodityList.size();
	}

	public void buildCommodityPageBuyerVO(List<CommodityBuyerVO> commodityVOList, int currentPage,
											int pageSize, int totalCount){
		this.setCommodityList(commodityVOList);
		this.wrapPaginationInfo(totalCount, getCommodityIndex(commodityVOList), pageSize, currentPage);
	}
}
