package com.rongyi.rpb.service.impl.v6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.rpb.PaymentOrderService;

public class PaymentOrderServiceImpl extends BaseServiceImpl implements PaymentOrderService {

	@Autowired
	private PaymentService paymentService;

	@Override
	public Integer updateStatusList(List<String> payNoList, Integer status) {
		return paymentService.updateStatusList(payNoList, status);
	}

}
