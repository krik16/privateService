package com.rongyi.osm.service.coupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.rss.coupon.RoaUserCashCouponService;

@Service
public class CouponStatusService {

	@Autowired
	RoaUserCashCouponService userCashCouponService;

	public int getCouponStatusByCode(String couponCode){
		return userCashCouponService.getCashCouponStatus(couponCode);
	}

	public boolean setCouponStatusByCode(String couponCode, int status, String orderNo, Integer guideId){
		return userCashCouponService.changeCashCouponStatus(couponCode, status, orderNo, guideId);
	}

	public Double getDiscountByCode(String couponCode){
		return userCashCouponService.getCashCouponDiscount(couponCode);
	}

}
