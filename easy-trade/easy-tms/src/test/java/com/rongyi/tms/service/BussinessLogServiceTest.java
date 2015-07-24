/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月20日下午5:10:22
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.easy.tms.entity.BussinessLog;
import com.rongyi.tms.BaseTest;

/**	
 * @Author:  柯军
 * @Description: 业务日志 
 * @datetime:2015年7月20日下午5:10:22
 *
 **/

public class BussinessLogServiceTest extends BaseTest{
	
	@Autowired
	BussinessLogService bussinessLogService;
	
//	@Test
	@Rollback(false)
	public void testInsert(){
		BussinessLog bussinessLog = new BussinessLog();
		bussinessLog.setBussinessId(1);
		bussinessLog.setBussinessType(2);
		bussinessLog.setCreateAt(new Date());
		bussinessLog.setMemo("test");
		bussinessLog.setUsername("test");
		bussinessLog.setDeleted(0);
		bussinessLogService.insert(bussinessLog);
	}
	
	@Test
	public void testSelectByBussinessIdAndType(){
		BussinessLog bussinessLog = bussinessLogService.selectByBussinessIdAndType(1,2);
		System.err.println(bussinessLog.getId());
	}
}
