package com.rongyi.easy.malllife.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  获取可使用红包的代金券/商品接口参数
 * time:  2015/11/18
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/11/18             1.0            创建文件
 *
 */
public class RedEnvelopeParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String couponCode;//红包券码

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Override
	public String toString() {
		return "RedEnvelopeParam [couponCode=" + couponCode + "]";
	}
	
}
