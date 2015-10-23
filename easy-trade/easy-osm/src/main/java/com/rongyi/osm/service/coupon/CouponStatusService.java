package com.rongyi.osm.service.coupon;

import com.rongyi.rss.coupon.RoaUserRedenvelopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponStatusService {

	@Autowired
	private RoaUserRedenvelopeService roaUserRedenvelopeService;

	public int getCouponStatusByCode(String couponCode){
		return roaUserRedenvelopeService.getCashCouponStatus(couponCode);
	}

	public boolean setCouponStatusByCode(String couponCode, int status, String orderNo, Integer guideId){
		return roaUserRedenvelopeService.changeCashCouponStatus(couponCode, status, orderNo, guideId);
	}

	public Double getDiscountByCode(String couponCode){
		return roaUserRedenvelopeService.getCashCouponDiscount(couponCode);
	}

}
