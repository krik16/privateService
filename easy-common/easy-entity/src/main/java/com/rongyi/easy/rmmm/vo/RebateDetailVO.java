/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ：抵扣券详情字段 time
 * ：2015年12月2日 History: 变更记录 <author> <time> <version> <desc> chenjun 2015年12月2日
 * 1.0 创建文件
 */
public class RebateDetailVO extends RebateVO implements Serializable {

	private List<CommodityBuyerVO> commodityList;// 可使用商品列表

	private List<RebateCouponVO> couponList;// 可使用代金券列表

	public List<CommodityBuyerVO> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<CommodityBuyerVO> commodityList) {
		this.commodityList = commodityList;
	}

	public List<RebateCouponVO> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<RebateCouponVO> couponList) {
		this.couponList = couponList;
	}

	@Override
	public String toString() {
		return "RebateDetailVO [commodityList=" + commodityList + ", couponList=" + couponList + "]";
	}

}
