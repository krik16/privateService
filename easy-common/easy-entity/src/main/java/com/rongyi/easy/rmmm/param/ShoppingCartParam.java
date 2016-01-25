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
 * time ：2015年12月19日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年12月19日               1.0              创建文件
 */
public class ShoppingCartParam extends MalllifeBaseParam implements Serializable{
	
	private String userId;//用户id
	
	private String shopId;//店铺id
	
	private Integer guideId;//导购id
	
	private Integer commodityCount;//商品数量
	
	private Integer shopCartId;//购物车主键id
	
	private String commodityId;//商品编号
	
	private String specId;//商品规格
	
	private String type;//1删除单个购物车 2清空购物车 3根据导购id集合删除购物车
	
	private List<Integer> guideIds;//导购、买手id集合

	public ShoppingCartParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartParam(String userId, String shopId, Integer guideId) {
		super();
		this.userId = userId;
		this.shopId = shopId;
		this.guideId = guideId;
	}
	
	

	public ShoppingCartParam(Integer guideId, String commodityId, String specId) {
		super();
		this.guideId = guideId;
		this.commodityId = commodityId;
		this.specId = specId;
	}

	public List<Integer> getGuideIds() {
		return guideIds;
	}

	public void setGuideIds(List<Integer> guideIds) {
		this.guideIds = guideIds;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public Integer getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}

	public Integer getShopCartId() {
		return shopCartId;
	}

	public void setShopCartId(Integer shopCartId) {
		this.shopCartId = shopCartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Integer getGuideId() {
		return guideId;
	}

	public void setGuideId(Integer guideId) {
		this.guideId = guideId;
	}

	@Override
	public String toString() {
		return "ShoppingCartParam [userId=" + userId + ", shopId=" + shopId + ", guideId=" + guideId + ", commodityCount="
				+ commodityCount + ", shopCartId=" + shopCartId + ", commodityId=" + commodityId + ", specId=" + specId + "]";
	}
	
    
}
