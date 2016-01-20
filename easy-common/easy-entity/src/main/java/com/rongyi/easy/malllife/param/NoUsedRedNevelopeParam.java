package com.rongyi.easy.malllife.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  订单不可使用的红包参数
 * time:  2015/11/18
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/11/18             1.0            创建文件
 *
 */
public class NoUsedRedNevelopeParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commodityId;//商品id
	
	private String cashCouponId;//代金券id
	
	private List<String> couponCodes;//红包券码集合

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCashCouponId() {
		return cashCouponId;
	}

	public void setCashCouponId(String cashCouponId) {
		this.cashCouponId = cashCouponId;
	}

	public List<String> getCouponCodes() {
		return couponCodes;
	}

	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}
	
}
