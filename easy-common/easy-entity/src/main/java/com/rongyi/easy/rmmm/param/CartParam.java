/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年12月28日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年12月28日               1.0              创建文件
 */
public class CartParam  implements Serializable{
	
	private List<Integer> shopCartIds;//购物车id集合

	public List<Integer> getShopCartIds() {
		return shopCartIds;
	}

	public void setShopCartIds(List<Integer> shopCartIds) {
		this.shopCartIds = shopCartIds;
	}

	@Override
	public String toString() {
		return "CartParam [shopCartIds=" + shopCartIds + "]";
	}

}
