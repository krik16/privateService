package com.rongyi.settle.service.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.rss.settle.DivideAccountService;
import com.rongyi.settle.service.SmDivideAccountService;

@Service
public class DivideAccountServiceImpl implements DivideAccountService {
	
	@Autowired
	private SmDivideAccountService smDivideAccountService;

	@Override
	public void batchGenerateDivideAccount() {
		smDivideAccountService.batchGenerateDivideAccount();
	}
}
