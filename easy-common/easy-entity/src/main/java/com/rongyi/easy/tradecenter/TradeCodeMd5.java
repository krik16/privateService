package com.rongyi.easy.tradecenter;

import com.rongyi.core.common.util.JsonUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeCodeMd5 implements Serializable {
    
    private Integer id;

    private String couponCode;

    private String couponCodeMd5;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponCodeMd5() {
		return couponCodeMd5;
	}

	public void setCouponCodeMd5(String couponCodeMd5) {
		this.couponCodeMd5 = couponCodeMd5;
	}

    
}