package com.rongyi.easy.malllife.vo.redEnvelopeCoupon;

import java.io.Serializable;
import java.util.List;

public class RedEnvelopeCouponListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RedEnvelopeCouponVO> cashCouponList;//代金券列表

	public List<RedEnvelopeCouponVO> getCashCouponList() {
		return cashCouponList;
	}

	public void setCashCouponList(List<RedEnvelopeCouponVO> cashCouponList) {
		this.cashCouponList = cashCouponList;
	}
	
}
