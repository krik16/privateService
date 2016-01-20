package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class CommoditySpecBuyerVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3825251583176519198L;
	
	private String commodityId;
	private List<CommoditySpecVO> commoditySpecList;
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public List<CommoditySpecVO> getCommoditySpecList() {
		return commoditySpecList;
	}
	public void setCommoditySpecList(List<CommoditySpecVO> commoditySpecList) {
		this.commoditySpecList = commoditySpecList;
	}

}
