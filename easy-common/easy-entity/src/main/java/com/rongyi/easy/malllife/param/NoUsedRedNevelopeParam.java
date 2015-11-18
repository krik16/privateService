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
	
	private List<String> commodityIds;//商品id集合
	
	private List<String> cashCouponIds;//代金券id集合

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}

	public List<String> getCashCouponIds() {
		return cashCouponIds;
	}

	public void setCashCouponIds(List<String> cashCouponIds) {
		this.cashCouponIds = cashCouponIds;
	}
	
}
