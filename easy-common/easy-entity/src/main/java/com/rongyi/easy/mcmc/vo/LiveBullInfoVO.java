package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 买手信息
 * 
 * @author xiaobo
 *
 */
public class LiveBullInfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 买手直播场次
	 */
	private int liveCount;

	/**
	 * 买手手持商品总数
	 */
	private int commodityCount;

	public int getLiveCount() {
		return liveCount;
	}

	public void setLiveCount(int liveCount) {
		this.liveCount = liveCount;
	}

	public int getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(int commodityCount) {
		this.commodityCount = commodityCount;
	}

}
