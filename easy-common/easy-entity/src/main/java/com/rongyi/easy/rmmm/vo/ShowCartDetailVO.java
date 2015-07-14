package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ShowCartDetailVO implements Serializable{
	
	private List<ShoppingCartVO> shoppingCartList;

	public List<ShoppingCartVO> getShoppingCartList() {
		return shoppingCartList;
	}

	public void setShoppingCartList(List<ShoppingCartVO> shoppingCartList) {
		this.shoppingCartList = shoppingCartList;
	}
	
}
