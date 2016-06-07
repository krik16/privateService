package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.mcmc.entity.ThirdPartMcmcCommodity;

import java.io.Serializable;
/**
 * 根据款号分组筛选抄同款中的商品数量
 * @author user
 *
 */
public class CommodityByNoVO implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String commodityNo;//商品款号
	private Integer count;//数量
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "CommodityByNoVO [commodityNo=" + commodityNo + ", count="
				+ count + "]";
	}

}
