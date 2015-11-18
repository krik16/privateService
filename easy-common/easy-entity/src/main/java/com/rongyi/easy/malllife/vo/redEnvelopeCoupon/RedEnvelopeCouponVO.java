package com.rongyi.easy.malllife.vo.redEnvelopeCoupon;

import java.io.Serializable;
/**
 * 可使用红包的代金券列表VO
 * @author user
 *
 */
public class RedEnvelopeCouponVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String shopName;//店铺名称   
	private String voucherName;//代金券名称
	private Double origPrice;//代金券原价
	private Double currPrice;//代金券现价
	private Integer soldCount;//已售数量
	private Boolean isLimitBuy;//是否限购
	private String shopId;//店铺id
    private String picUrl;//代金券图片（取第一张）
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getVoucherName() {
		return voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	public Double getOrigPrice() {
		return origPrice;
	}
	public void setOrigPrice(Double origPrice) {
		this.origPrice = origPrice;
	}
	public Double getCurrPrice() {
		return currPrice;
	}
	public void setCurrPrice(Double currPrice) {
		this.currPrice = currPrice;
	}
	public Integer getSoldCount() {
		return soldCount;
	}
	public void setSoldCount(Integer soldCount) {
		this.soldCount = soldCount;
	}
	public Boolean getIsLimitBuy() {
		return isLimitBuy;
	}
	public void setIsLimitBuy(Boolean isLimitBuy) {
		this.isLimitBuy = isLimitBuy;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	@Override
	public String toString() {
		return "RedEnvelopeCouponVO [shopName=" + shopName + ", voucherName="
				+ voucherName + ", origPrice=" + origPrice + ", currPrice="
				+ currPrice + ", soldCount=" + soldCount + ", isLimitBuy="
				+ isLimitBuy + ", shopId=" + shopId + ", picUrl=" + picUrl
				+ "]";
	}
	
}
