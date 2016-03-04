package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券历史记录只对象
 * @author hebo
 *
 */
public class CouponHistoryVO implements Serializable{
  
	private static final long serialVersionUID = 1L;
	private String code;//券码
	private String userPhone;//手机号
	private Double originalPrice;//原价
	private Double nowPrice;//现价
	private Date updateTime;//验证时间(类型：Date)
	private BigDecimal amount;//佣金
	private String title;
	private String couponId;//券id
	private String date;//验证时间（类型：String）
	private String from;//码佣
	private String status;//状态
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Double getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(Double nowPrice) {
		this.nowPrice = nowPrice;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CouponHistoryVo [code=" + code + ", userPhone=" + userPhone
				+ ", originalPrice=" + originalPrice + ", nowPrice=" + nowPrice
				+ ", updateTime=" + updateTime + "]";
	}
	
}
