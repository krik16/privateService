package com.rongyi.tms.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.cheat.service.BlackRollService;
import com.rongyi.tms.BaseTest;

public class BlackRollServiceImplTest extends BaseTest{
	
	@Autowired
	BlackRollService blackRollService;
	
	@Test
	@Rollback(false)
	public void testValadatePayAccount(){
		blackRollService.valadatePayAccount(new HashMap<String,Object>());
	}
}
