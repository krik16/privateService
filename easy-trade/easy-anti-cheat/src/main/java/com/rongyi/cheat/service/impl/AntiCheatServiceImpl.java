package com.rongyi.cheat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.cheat.service.AccountBlacklistService;
import com.rongyi.rss.cheat.IAntiCheatService;

@Service
public class AntiCheatServiceImpl implements IAntiCheatService {

	@Autowired
	AccountBlacklistService accountBlacklistService;

	@Override
	public boolean valdateAccountInBlackList(String payAccout, Byte payType, Byte status) {
		return !(accountBlacklistService.selectByPayAccount(payAccout, payType, status) == null);
	}

}
