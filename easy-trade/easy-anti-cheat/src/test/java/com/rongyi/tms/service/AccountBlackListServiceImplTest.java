package com.rongyi.tms.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.cheat.service.AccountBlacklistService;
import com.rongyi.easy.cheat.AccountBlacklist;
import com.rongyi.rss.cheat.IAntiCheatService;
import com.rongyi.tms.BaseTest;

public class AccountBlackListServiceImplTest extends BaseTest {

	@Autowired
	AccountBlacklistService blackRollService;

	@Autowired
	IAntiCheatService iAntiCheatService;

	// @Test
	@Rollback(false)
	public void testValadatePayAccount() {
		blackRollService.valadatePayAccount(new HashMap<String, Object>());
	}

	// @Test
	public void testSelectByPayAccount() {
		AccountBlacklist accountBlacklist = blackRollService.selectByPayAccount("1041929273@qq.com", null, null);
		System.err.println(accountBlacklist.getId());
	}

	@Test
	public void testSelectPageList() {
		Map<String, Object> map = blackRollService.selectPageList(1, 10, new HashMap<String, Object>());
		System.err.println(map.get("count"));
	}
}
