package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
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
	private Date updateTime;//验证时间
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

	@Override
	public String toString() {
		return "CouponHistoryVo [code=" + code + ", userPhone=" + userPhone
				+ ", originalPrice=" + originalPrice + ", nowPrice=" + nowPrice
				+ ", updateTime=" + updateTime + "]";
	}
	
}
