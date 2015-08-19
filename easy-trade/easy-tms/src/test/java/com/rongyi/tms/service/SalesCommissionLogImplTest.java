/** 
 * @Title: SalesCommissionTest.java 
 * @Package com.rongyi.tms.service 
 * @Description: 佣金接口测试
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月22日 下午4:31:10 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.easy.tms.entity.SalesCommission;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.tms.service.impl.SalesCommissionServiceImpl;

/**
 * @author ZhengYl
 * 
 */
public class SalesCommissionLogImplTest {

	@Autowired
	SalesCommissionAuditLogService salesCommissionLogService;

	@Rollback(false)
	@Test(description = "插入")
	public void selectListBySearchTest() {
		SalesCommissionAuditLog salesCommissionAuditLog=new SalesCommissionAuditLog();
		salesCommissionAuditLog.setAuditUserId("2");
		salesCommissionAuditLog.setCreateAt(new Date());
		salesCommissionAuditLog.setSalesCommissionId(1);
		salesCommissionAuditLog.setOperateBiz(1);
		salesCommissionAuditLog.setMemo("dddd");
		if(salesCommissionLogService==null){
		    
		}else{
		    salesCommissionLogService.createCommissionAuditLog(salesCommissionAuditLog);
		}
		
        System.err.println("id="+salesCommissionAuditLog.getId());
	}
}
