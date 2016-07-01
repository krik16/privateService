package com.rongyi.easy.malllife.vo.h5;

import java.io.Serializable;
/**
 * 你可能喜欢的店铺VO
 * @author user
 *
 */
public class MayLikeShopVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String shopId;//店铺id
	private String shopLogo;//店铺logo
	private String shopName;//店铺名称
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopLogo() {
		return shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "MayLikeShopVO [shopId=" + shopId + ", shopLogo=" + shopLogo
				+ ", shopName=" + shopName + "]";
	}
	
	
}
