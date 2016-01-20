package com.rongyi.easy.redi.param;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author rongyi
 */
public class BailianCouponInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<CouponInfo> couponList;// 用券信息
	
	public List<CouponInfo> getCouponList() {
		return couponList;
	}
	public void setCouponList(List<CouponInfo> couponList) {
		this.couponList = couponList;
	}
	
	
}
