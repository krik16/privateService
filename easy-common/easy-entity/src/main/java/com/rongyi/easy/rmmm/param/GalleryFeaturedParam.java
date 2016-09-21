package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

public class GalleryFeaturedParam extends BaseParam implements Serializable {
	
	private String shopId;//店铺id
	private String commodityId;//商品id
	private Integer galleryPosition;//橱窗位置，分别是 1 ,2, 3
	
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public Integer getGalleryPosition() {
		return galleryPosition;
	}
	public void setGalleryPosition(Integer galleryPosition) {
		this.galleryPosition = galleryPosition;
	}
	@Override
	public String toString() {
		return "GalleryFeaturedParam [shopId=" + shopId + ", commodityId="
				+ commodityId + ", galleryPosition=" + galleryPosition + "]";
	}

}
