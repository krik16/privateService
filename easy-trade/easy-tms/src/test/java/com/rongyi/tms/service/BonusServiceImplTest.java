/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月31日上午9:47:46
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.tms.BaseTest;
import com.rongyi.tms.moudle.vo.BonusPageParam;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年7月31日上午9:47:46
 *
 **/

public class BonusServiceImplTest extends BaseTest{

	@Autowired
	BonusService bonusService;
	
	@Test
	public void testfindPageList(){
		bonusService.findByPage(new BonusPageParam());
	}
}
