/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月25日上午11:00:03
 * @Description: TODO
 *
 **/

package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.rss.rpb.IRpbService;

import base.BaseTest;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年8月25日上午11:00:03
 *
 **/

public class RpbServiceTest extends BaseTest{

	@Autowired
	IRpbService iRpbService;
	
	@Test
	public void testOperateWeixinRefund(){
		iRpbService.operateWeixinRefund(32221);
	}
}
