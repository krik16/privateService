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
	
	private String source = "1";//来源 0为微网站，1为容易逛，2为终端机，3其他
	
	private String userId;//买家id
	
	private boolean ifRecommend = true;//是否推荐红包和抵扣券，true推荐  false不推荐  默认推荐

	public boolean isIfRecommend() {
		return ifRecommend;
	}

	public void setIfRecommend(boolean ifRecommend) {
		this.ifRecommend = ifRecommend;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

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
		return "OrderModelForCartParam [shopCart=" + shopCart
				+ ", orderModerIdList=" + orderModerIdList + ", type=" + type
				+ ", detailModelIds=" + detailModelIds + ", detailModelMap="
				+ detailModelMap + ", source=" + source + ", userId=" + userId
				+ ", ifRecommend=" + ifRecommend + "]";
	}

}
