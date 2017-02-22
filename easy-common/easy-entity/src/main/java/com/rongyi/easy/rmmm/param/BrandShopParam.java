package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 * 店铺id查品牌
 * @author user
 *
 */
public class BrandShopParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4023627248995954192L;
	private String shopMid;//店铺mongoId
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	@Override
	public String toString() {
		return "BrandShopParam [shopMid=" + shopMid + "]";
	}
	
}
