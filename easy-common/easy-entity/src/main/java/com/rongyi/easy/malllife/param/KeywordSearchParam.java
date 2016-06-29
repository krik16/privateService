package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 搜索关联联想词参数
 * @author user
 *
 */
public class KeywordSearchParam extends MalllifeBaseParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityName;//商品名称
	private String mallOrShopName;//店铺或者商场名称
	private String couponName;//代金券名称
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getMallOrShopName() {
		return mallOrShopName;
	}
	public void setMallOrShopName(String mallOrShopName) {
		this.mallOrShopName = mallOrShopName;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	@Override
	public String toString() {
		return "KeywordSearchParam [commodityName=" + commodityName
				+ ", mallOrShopName=" + mallOrShopName + ", couponName="
				+ couponName + "]";
	}
	
}
