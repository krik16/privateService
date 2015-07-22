package com.rongyi.osm.service.coupon;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.rss.coupon.RoaCashCouponService;

@Service
public class CouponTemplateService {
	
	@Autowired
	RoaCashCouponService cashCouponService;
	
	public Coupon getCouponById(String couponId){
		return cashCouponService.findOne(new ObjectId(couponId));
	}
	
	public boolean setCouponStatus(Coupon coupon){
		return cashCouponService.saveOrUpdate(coupon);
	}
}
