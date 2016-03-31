package com.rongyi.easy.roa.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
@Entity(value = "valid_history", noClassnameStored = true)
public class ValidHistory implements Serializable {

	private static final long serialVersionUID = -8579281554179085277L;

	/** 券码ID */
	@Id
	private ObjectId id;
	

	/** 券名称 */
	private String title;
	
	/** 券码 */
	@Property("coupon_code")
	private String couponCode;

	/** 商场ID */
	@Property("mall_id")
	private String mallId;

	/** 店铺ID */
	@Property("shop_id")
	private String shopId;

	/** 券id */
	@Property("coupon_id")
	private String couponId;

	/** 领用券码用户ID */
	@Property("user_id")
	private String userId;

	/** 领用券码用户电话号码 */
	private String phone;

	/** 原价 */
	@Property("original_price")
	private Double originalPrice;
	
	/**  现价 */
	@Property("current_price")
	private Double currentPrice;

	/** 创建时间 */
	@Property("public_time")
	private Date publicTime;

	/** 更新时间（验证时间） */
	@Property("updated_time")
	private Date updatedTime;
	/** 卖家id */
	private String sellerId;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getPublicTime() {
		return publicTime;
	}

	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	@Override
	public String toString() {
		return "ValidHistory [id=" + id + ", title=" + title + ", couponCode="
				+ couponCode + ", mallId=" + mallId + ", shopId=" + shopId
				+ ", couponId=" + couponId + ", userId=" + userId + ", phone="
				+ phone + ", originalPrice=" + originalPrice
				+ ", currentPrice=" + currentPrice + ", publicTime="
				+ publicTime + ", updatedTime=" + updatedTime + ", sellerId="
				+ sellerId + "]";
	}

}
