package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
/**
 * 商品详情页查询多店有售商品列表参数
 * @author user
 *
 */
public class CommoditySPUParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String commodityId;//商品id
	 
	private String systemNumber;//商品SPU

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}
	
}
