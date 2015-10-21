package com.rongyi.core.enumerate.mcmc;

/**
 * 商品类型
 * 
 * @author xiaobo
 *
 */
public enum CommodityType {
	/**
	 * 导购
	 */
	GUIDE(1),

	/**
	 * 买手
	 */
	BULL(2);

	private int value;

	private CommodityType(int value) {
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
