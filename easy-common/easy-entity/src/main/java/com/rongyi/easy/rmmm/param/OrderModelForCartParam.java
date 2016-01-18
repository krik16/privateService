/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
public class OrderModelForCartParam  extends MalllifeBaseParam implements Serializable{
	
	private List<CartParam> shopCart;//购物车生成模板的购物车id集合
	
	private List<Integer> orderModerIdList;//父模板id集合
	
	private String type = "1";//1 删除子模板 2 把子模板的商品数量设为库存
	
	private List<Integer> detailModelIds;//要删除的或修改的子模板id集合
	
	private Map<String,String> detailModelMap;// key=子模板id value=红包券码

	public Map<String, String> getDetailModelMap() {
		return detailModelMap;
	}

	public void setDetailModelMap(Map<String, String> detailModelMap) {
		this.detailModelMap = detailModelMap;
	}

	public List<CartParam> getShopCart() {
		return shopCart;
	}

	public void setShopCart(List<CartParam> shopCart) {
		this.shopCart = shopCart;
	}

	public List<Integer> getOrderModerIdList() {
		return orderModerIdList;
	}

	public void setOrderModerIdList(List<Integer> orderModerIdList) {
		this.orderModerIdList = orderModerIdList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Integer> getDetailModelIds() {
		return detailModelIds;
	}

	public void setDetailModelIds(List<Integer> detailModelIds) {
		this.detailModelIds = detailModelIds;
	}

	@Override
	public String toString() {
		return "OrderModelForCartParam [shopCart=" + shopCart + ", orderModerIdList=" + orderModerIdList + ", type=" + type
				+ ", detailModelIds=" + detailModelIds + "]";
	}

}
