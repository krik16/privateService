package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 购物车VO
 * 
 * @author zzp
 * 
 */
public class ShoppingCartVO implements Serializable{

	private String shopId;// 店铺id
	private String shopMid;// 店铺mongoid
	private String shopName;// 店铺名称
	private String brandId;// 品牌id
	private String brandName;// 品牌名称
	private String mallId;// 商场id
	private String mallName;// 商场名称
	//private String shopIM;// 店铺可用IM账号
	private List<String> shopIM;// 店铺可用IM账号
	private List<ShowCartCommodityVO> commodityList;// 商品信息列表

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}

	public List<ShowCartCommodityVO> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<ShowCartCommodityVO> commodityList) {
		this.commodityList = commodityList;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

}
