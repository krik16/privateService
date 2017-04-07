package com.rongyi.rpb.service.impl.v6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.dto.PaymentOrderDto;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.rpb.PaymentOrderService;

public class PaymentOrderServiceImpl extends BaseServiceImpl implements PaymentOrderService {

	@Autowired
	private PaymentService paymentService;

	@Override
	public Integer updateStatusList(List<String> payNoList, Integer status) {
		return paymentService.updateStatusList(payNoList, status);
	}

	@Override
	public List<PaymentEntity> findList(Date date) {
		PaymentOrderDto paymentOrderDto = new PaymentOrderDto();
		paymentOrderDto.setEndAt(date);
		paymentOrderDto.setPayChannel(3);
		paymentOrderDto.setStatus(2);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		paymentOrderDto.setTradeTypeList(list);
		return paymentService.findList(paymentOrderDto);
	}

}
