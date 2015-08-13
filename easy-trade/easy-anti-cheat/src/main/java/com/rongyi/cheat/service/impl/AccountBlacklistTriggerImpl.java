/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月13日下午5:33:38
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.cheat.service.AccountBlacklistService;
import com.rongyi.rss.service.trigger.AccountBlacklistTrigger;

/**
 * @Author: 柯军
 * @Description: 定时任务(黑名单扫描)
 * @datetime:2015年8月13日下午5:33:38
 * 
 **/
@Service
public class AccountBlacklistTriggerImpl implements AccountBlacklistTrigger {

	@Autowired
	AccountBlacklistService accountBlacklistService;

	@Override
	public void accountBlacklistTrigger() {
		accountBlacklistService.valadatePayAccount(new HashMap<String, Object>());
	}

}
