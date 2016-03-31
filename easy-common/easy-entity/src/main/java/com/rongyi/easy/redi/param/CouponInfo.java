package com.rongyi.easy.redi.param;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author rongyi
 */
public class CouponInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String couponRuleId;// 优惠券用券分组id(=groupId)
	
	private List<String> couponCodes;// 券号

	public String getCouponRuleId() {
		return couponRuleId;
	}

	public void setCouponRuleId(String couponRuleId) {
		this.couponRuleId = couponRuleId;
	}

	public List<String> getCouponCodes() {
		return couponCodes;
	}

	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}

	
	
	

	
}
