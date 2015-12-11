/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月7日上午11:34:01
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.tms.BaseTest;

/**	
 * @Author:  柯军
 * @Description: 优惠券订单 
 * @datetime:2015年9月7日上午11:34:01
 *
 **/

public class CouponOrderServiceTest extends BaseTest{

	@Autowired
	CouponOrderService couponOrderService;
	
//	@Test
	public void testSelectPageList(){
		System.err.println(couponOrderService.selectPageList(1, 10, new HashMap<String,Object>()).size());
	}
	
//	@Test
	public void testSelectPageListCount(){
		System.err.println(couponOrderService.selectPageListCount(new HashMap<String,Object>()));
	}
	
	@Test
	public void testSelectById(){
		System.err.println(couponOrderService.selectById(57786));
	}
	
}
