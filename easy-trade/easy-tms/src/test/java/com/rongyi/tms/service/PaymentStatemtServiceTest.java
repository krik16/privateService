/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月28日下午4:14:23
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.tms.BaseTest;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年9月28日下午4:14:23
 *
 **/

public class PaymentStatemtServiceTest extends BaseTest{

	@Autowired
	PaymentStatementService paymentStatementService;
	
	@Test
	public void testSelectPageList(){
		List<PaymentStatementDto> list = paymentStatementService.selectPageList(new HashMap<String,Object>(), 0, 15);
		System.err.println(list.size());
		for (PaymentStatementDto paymentStatementDto : list) {
			System.err.println(paymentStatementDto.getId());
		}
		System.err.println("count="+paymentStatementService.selectPageListCount(null));
	}
}
