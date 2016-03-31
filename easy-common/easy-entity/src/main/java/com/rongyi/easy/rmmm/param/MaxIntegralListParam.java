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
public class MaxIntegralListParam extends MalllifeBaseParam implements Serializable{
	
	private Double platformRebateAmount = 0.0;//抵扣券抵扣金额
	
	private List<MaxIntegralParam> shopListAmount;

	public Double getPlatformRebateAmount() {
		return platformRebateAmount;
	}

	public void setPlatformRebateAmount(Double platformRebateAmount) {
		this.platformRebateAmount = platformRebateAmount;
	}

	public List<MaxIntegralParam> getShopListAmount() {
		return shopListAmount;
	}

	public void setShopListAmount(List<MaxIntegralParam> shopListAmount) {
		this.shopListAmount = shopListAmount;
	}

	@Override
	public String toString() {
		return "MaxIntegralListParam [platformRebateAmount=" + platformRebateAmount + ", shopListAmount=" + shopListAmount + "]";
	}

}
