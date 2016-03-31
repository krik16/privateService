package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ShowCartDetailVO implements Serializable{
	
	private List<ShoppingCartVO> shoppingCartList;
	
	private Integer cartCommodityNum ;//购物车商品sku

	public Integer getCartCommodityNum() {
		return cartCommodityNum;
	}

	public void setCartCommodityNum(Integer cartCommodityNum) {
		this.cartCommodityNum = cartCommodityNum;
	}

	public List<ShoppingCartVO> getShoppingCartList() {
		return shoppingCartList;
	}

	public void setShoppingCartList(List<ShoppingCartVO> shoppingCartList) {
		this.shoppingCartList = shoppingCartList;
	}

	@Override
	public String toString() {
		return "ShowCartDetailVO [shoppingCartList=" + shoppingCartList + ", cartCommodityNum=" + cartCommodityNum + "]";
	}
	
}
