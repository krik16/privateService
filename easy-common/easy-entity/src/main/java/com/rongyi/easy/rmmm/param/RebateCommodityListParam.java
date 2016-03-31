/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年12月23日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年12月23日               1.0              创建文件
 */
public class RebateCommodityListParam extends MalllifeBaseParam implements Serializable{
	
	private List<RebateCommodityParam> orderCommoditys;

	public List<RebateCommodityParam> getOrderCommoditys() {
		return orderCommoditys;
	}

	public void setOrderCommoditys(List<RebateCommodityParam> orderCommoditys) {
		this.orderCommoditys = orderCommoditys;
	}

	@Override
	public String toString() {
		return "RebateCommodityListParam [orderCommoditys=" + orderCommoditys + "]";
	}

}
