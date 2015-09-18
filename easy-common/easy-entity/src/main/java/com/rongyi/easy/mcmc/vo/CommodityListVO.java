package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class CommodityListVO implements Serializable{
	private static final long serialVersionUID = 2927430452258911558L;
	
	private List<CommodityVO1> commodityList;

	public List<CommodityVO1> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<CommodityVO1> commodityList) {
		this.commodityList = commodityList;
	}
	
}
