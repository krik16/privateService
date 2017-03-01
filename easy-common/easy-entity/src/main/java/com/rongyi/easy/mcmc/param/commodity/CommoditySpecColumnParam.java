package com.rongyi.easy.mcmc.param.commodity;

import java.io.Serializable;

import com.rongyi.easy.bsoms.param.BaseParam;



/**
 * 大运营后台规格改造   规格参数
 * @author user
 *
 */
public class CommoditySpecColumnParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commoditySpecId;//规格id
	private String commoditySpecName;//规格名称
    private Integer pageSize;//每页数量
	private Integer currentPage;//当前页  从1开始
	private Integer isDisabled;//1 或者null 查全部，2 查正常的
	public String getCommoditySpecId() {
		return commoditySpecId;
	}
	public void setCommoditySpecId(String commoditySpecId) {
		this.commoditySpecId = commoditySpecId;
	}
	public String getCommoditySpecName() {
		return commoditySpecName;
	}
	public void setCommoditySpecName(String commoditySpecName) {
		this.commoditySpecName = commoditySpecName;
	}
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
	public Integer getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}
	@Override
	public String toString() {
		return "CommoditySpecColumnParam [commoditySpecId=" + commoditySpecId
				+ ", commoditySpecName=" + commoditySpecName + ", pageSize="
				+ pageSize + ", currentPage=" + currentPage + ", isDisabled="
				+ isDisabled + "]";
	}
	
}
