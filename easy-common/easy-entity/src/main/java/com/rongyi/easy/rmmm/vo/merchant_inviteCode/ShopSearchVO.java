package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;
/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 筛选的店铺相关的信息VO
 * time ：2015年6月4日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平                                  2015年6月4日                        1.0           创建文件
 */
public class ShopSearchVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMId;
	private String shopMName;
	public String getShopMId() {
		return shopMId;
	}
	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}
	public String getShopMName() {
		return shopMName;
	}
	public void setShopMName(String shopMName) {
		this.shopMName = shopMName;
	}
	
}
