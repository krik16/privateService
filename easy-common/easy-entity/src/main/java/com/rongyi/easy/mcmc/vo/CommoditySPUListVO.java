package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class CommoditySPUListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CommodityBuyerVO> commoditySPUList;//多店有售商品列表
	public List<CommodityBuyerVO> getCommoditySPUList() {
		return commoditySPUList;
	}
	public void setCommoditySPUList(List<CommodityBuyerVO> commoditySPUList) {
		this.commoditySPUList = commoditySPUList;
	}
	
}
