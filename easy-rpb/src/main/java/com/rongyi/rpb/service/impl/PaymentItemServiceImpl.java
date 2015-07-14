package com.rongyi.rpb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.rpb.service.PaymentItemService;

/**
 * @Author: 柯军
 * @Description: 子订单service
 * @datetime:2015年4月23日上午10:02:14
 * 
 **/
@Service
public class PaymentItemServiceImpl extends BaseServiceImpl implements PaymentItemService {

	private static final String PAYMENTENTITY_NAMESPACE = "com.rongyi.rpb.mapper.PaymentItemEntityMapper";

	@Override
	public void insert(PaymentItemEntity paymentItemEntity) {
		this.getBaseDao().insertBySql(PAYMENTENTITY_NAMESPACE + ".insert", paymentItemEntity);
	}

	@Override
	public List<PaymentItemEntity> selectByPaymentId(Integer paymentId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paymentId", paymentId);
		return this.getBaseDao().selectListBySql(PAYMENTENTITY_NAMESPACE + ".selectByPaymentId", map);
	}

}
