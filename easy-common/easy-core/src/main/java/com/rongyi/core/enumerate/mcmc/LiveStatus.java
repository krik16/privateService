package com.rongyi.core.enumerate.mcmc;

/**
 * 直播状态
 * @author rongyi
 *
 */
public enum LiveStatus {
	/**
	 * 预热
	 */
	READY(0),
	
	/**
	 * 上架
	 */
	ON(1),

	/**
	 * 下架
	 */
	OFF(2);	

	private int value;
	
	private LiveStatus(int value) {
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
