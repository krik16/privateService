/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月17日下午3:55:10
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.easy.tms.entity.CouponCommission;
import com.rongyi.rss.service.trigger.ICouponCommissionTrigger;
import com.rongyi.tms.BaseTest;

/**	
 * @Author:  柯军
 * @Description: 优惠券佣金
 * @datetime:2015年7月17日下午3:55:10
 *
 **/

public class CouponCommissionServiceTest extends BaseTest{
	
	@Autowired
	CouponCommissionService couponCommissionService;
	
	@Autowired
	ICouponCommissionTrigger couponCommissionTrigger;
	
//	@Test
	public void testSelectPageList(){
		List<CouponCommission> list =  couponCommissionService.selectPageList(1,100,new HashMap<String,Object>());
		System.err.println(list.get(0).getId());
		int count = couponCommissionService.selectPageListCount(new HashMap<String,Object>());
		System.err.println(count);
	}
	
	@Test
	public void testCouponCommissionTrigger(){
		couponCommissionTrigger.couponCommissionTrigger();
	}
}
