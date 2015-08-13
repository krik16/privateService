package com.rongyi.tms.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.cheat.service.AccountBlacklistService;
import com.rongyi.tms.BaseTest;

public class AccountBlackListServiceImplTest extends BaseTest{
	
	@Autowired
	AccountBlacklistService blackRollService;
	
	@Test
	@Rollback(false)
	public void testValadatePayAccount(){
		blackRollService.valadatePayAccount(new HashMap<String,Object>());
	}
}
