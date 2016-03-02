package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;

public class CommodityToTopParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> commodityIds;
	private Integer sort;
	public List<String> getCommodityIds() {
		return commodityIds;
	}
	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
}
