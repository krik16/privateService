package com.rongyi.rss.rpb;

import java.util.Date;
import java.util.List;

import com.rongyi.easy.rpb.domain.PaymentEntity;

public interface PaymentOrderService {

	/**
	 * @Description 批量更新支付流水状态 
	 * @param payNoList
	 * @param status
	 */
	Integer updateStatusList(List<String> payNoList,Integer status);
	
	/**
	 * @Description 
	 * @param date
	 * @return
	 */
	List<PaymentEntity> findList(Date date);
}
