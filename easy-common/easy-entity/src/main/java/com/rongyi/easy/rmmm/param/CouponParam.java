package com.rongyi.easy.rmmm.param;

import com.rongyi.easy.rmmm.base.BaseParam;

public class CouponParam extends BaseParam{

	private String couponCode;// 卡券码
	
	private String couponId;// 卡券Id
	
	private Integer num;//数量

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

}
