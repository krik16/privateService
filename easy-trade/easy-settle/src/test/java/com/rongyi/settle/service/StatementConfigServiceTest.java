/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:39:09
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service;

import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.rss.settle.GoodPayService;
import com.rongyi.settle.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.util.*;

/**	
 * @Author:  柯军
 * @Description: 对账单配置测试用例
 * @datetime:2015年9月17日上午11:39:09
 *
 **/

public class StatementConfigServiceTest extends BaseTest{

	@Autowired
	StatementConfigService statementConfigService;

	@Autowired
	GoodPayService goodPayService;

	
//	@Test
	@Rollback(false)
	@Description("插入")
	public void insertTest(){
		StatementConfig statementConfig = new StatementConfig();
		statementConfig.setBussinessCode("001");
		statementConfig.setBussinessName("test");
		statementConfig.setBussinessType((byte) 0);
		statementConfig.setContractNo("123");
		statementConfig.setCooperateType((byte)1);
		statementConfig.setCountCycle((byte)2);
		statementConfig.setCreateAt(new Date());
		statementConfig.setCreateBy("kejun");
		statementConfig.setCycleStartTime(new Date());
		statementConfig.setCycleEndTime(new Date());
		statementConfig.setDatumType((byte)3);
		statementConfig.setEffectStartTime(new Date());
		statementConfig.setEffectEndTime(new Date());
		statementConfig.setGenerateHeaderTime("23");
		statementConfig.setGenerateHmTime("11:00");
		statementConfig.setLinkedRuleCode("abc123");
		statementConfig.setPayChannel((byte)0);
		statementConfig.setPayMode((byte)1);
		statementConfig.setRegularDay("day");
		statementConfig.setRollType((byte)0);
		statementConfig.setRuleCode("a123456");
		statementConfig.setSendTime(new Date());
		statementConfig.setStatus((byte)0);
		statementConfig.setVerifyType((byte)0);
		statementConfig.setIsLoop((byte)0);
		statementConfig.setIsDelete((byte)0);
		statementConfig.setRollDay("day");
//		statementConfig.setLinkShopId("111");

		statementConfigService.insert(statementConfig);
	}
//	@Test
	@Rollback(false)
	@Description("更新")
	public void updateTest(){
		StatementConfig statementConfig = statementConfigService.selectById(3);
		statementConfig.setBussinessCode("002");
		statementConfigService.update(statementConfig);
	}
	
//	@Test
	@Description("分页查询")
	public void selectPageListTest(){
		Map<String,Object> map = new HashMap<String,Object>();
		//currentPage=0, pageSize=15
		map.put("bussinessType", "0");
		map.put("createAtstart", "2015-09-18");
		List<StatementConfigVO> list = statementConfigService.selectPageList(map, 0,15);
		System.err.println("list size=" + list.size());
	}
	
//	@Test
	@Description("分页查询总数")
	public void selectPageListCountTest(){
		Map<String,Object> map = new HashMap<String,Object>();
		Integer count = statementConfigService.selectPageListCount(map);
		System.err.println("count="+count);
	}

	@Test
	public void validateNeedPayTest(){
		System.err.println(goodPayService.validateNeedPay("5478adcfe4b0d2aff10082e7", "1507", 1));
	}

//	@Test
	public void checkeffectStartTest(){
		Map<String,Object> paramsMap = new HashMap<>();
		List<Integer> ids = new ArrayList<>();
		ids.add(61);
		ids.add(62);
		paramsMap.put("ids", ids);
		paramsMap.put("checkEffectStart", new Date());
		List list = statementConfigService.checkeffectStart(paramsMap);
		System.err.println("=============================== >>>>>>>>>>>>>>>>>>>>>>>>"+list.size());
		System.err.println("=============================== >>>>>>>>>>>>>>>>>>>>>>>>"+list);
	}

	public static void main(String[] args) {
				BigDecimal bi =new BigDecimal(11.5 + "").divide(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
				System.err.println(bi.doubleValue());
	}

	@Test
	public void testGetUserAccountByConfigId(){
		List<Integer> accounts = statementConfigService.getUserIdByConfigId(93);
		System.err.println(accounts);
	}
}
