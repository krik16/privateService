package com.rongyi.core.enumerate.mcmc;

/**
 * 商品状态
 * @author xiaobo
 *
 */
public enum CommodityStatus {
	/**
	 * 上架
	 */
	ON(0),

	/**
	 * 下架
	 */
	OFF(1);	

	private int value;
	
	private CommodityStatus(int value) {
		this.value = value;
	}

	/**
	 * 获取值
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}
}
