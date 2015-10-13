/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月28日下午4:14:23
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.rpb.vo.PayNotifyVO;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.tms.BaseTest;
import com.rongyi.tms.constants.ConstantEnum;

/**
 * @Author: 柯军
 * @Description: TODO
 * @datetime:2015年9月28日下午4:14:23
 * 
 **/

public class PaymentStatemtServiceTest extends BaseTest {

	@Autowired
	PaymentStatementService paymentStatementService;

//	@Test
	public void testSelectPageList() {
		List<PaymentStatementDto> list = paymentStatementService.selectPageList(new HashMap<String, Object>(), 0, 15);
		System.err.println(list.size());
		for (PaymentStatementDto paymentStatementDto : list) {
			System.err.println(paymentStatementDto.getId());
		}
		System.err.println("count=" + paymentStatementService.selectPageListCount(null));
	}

	@Test
	public void testUpdateByNotify() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", ConstantEnum.STATEMENT_STATUE_12.getCodeByte());
		map.put("payTime", DateUtil.getCurrDateTime());
		List<PayNotifyVO> payNotifylist = new ArrayList<PayNotifyVO>();
		PayNotifyVO payNotifyVO = new PayNotifyVO();
		payNotifyVO.setDrawNo("1000000386972591");
		payNotifyVO.setTradeNo("1000001522652136");
		payNotifylist.add(payNotifyVO);
		payNotifyVO.setDrawNo("1000000386972592");
		payNotifyVO.setTradeNo("1000001522652133");
		payNotifylist.add(payNotifyVO);
		map.put("statementList", payNotifylist);
		paymentStatementService.updateByNotify(map);
	}
}
