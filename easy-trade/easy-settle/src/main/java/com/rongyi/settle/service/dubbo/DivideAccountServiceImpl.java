package com.rongyi.settle.service.dubbo;

import javax.annotation.Resource;

import com.rongyi.rss.settle.DivideAccountService;
import com.rongyi.settle.service.SmDivideAccountService;

public class DivideAccountServiceImpl implements DivideAccountService {
	
	@Resource
	private SmDivideAccountService smDivideAccountService;

	@Override
	public void batchGenerateDivideAccount() {
		smDivideAccountService.batchGenerateDivideAccount();
	}
}
