package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class APPShopVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String shopId;//店铺id
	private String shopName;//店铺名
	private String logo;//店铺LOGO
	private String notice;//公告内容
	private String mallName;//所在商场名
	private String address;//地址
	private char[] location;//[float,float]经纬度
	private int rating;//评分
	private Boolean isFav;//boolean是否收藏
	private Boolean isRebate;//boolean是否有抵扣券
	private Boolean isActiviy;//boolean是否有优惠信息
	private Boolean isCoupon;//boolean是否有代金券
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
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char[] getLocation() {
		return location;
	}
	public void setLocation(char[] location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Boolean getIsFav() {
		return isFav;
	}
	public void setIsFav(Boolean isFav) {
		this.isFav = isFav;
	}
	public Boolean getIsRebate() {
		return isRebate;
	}
	public void setIsRebate(Boolean isRebate) {
		this.isRebate = isRebate;
	}
	public Boolean getIsActiviy() {
		return isActiviy;
	}
	public void setIsActiviy(Boolean isActiviy) {
		this.isActiviy = isActiviy;
	}
	public Boolean getIsCoupon() {
		return isCoupon;
	}
	public void setIsCoupon(Boolean isCoupon) {
		this.isCoupon = isCoupon;
	}
	
}
