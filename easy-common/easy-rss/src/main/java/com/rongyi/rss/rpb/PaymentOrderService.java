package com.rongyi.rss.rpb;

import java.util.List;

public interface PaymentOrderService {

	/**
	 * @Description 批量更新支付流水状态 
	 * @param payNoList
	 * @param status
	 */
	Integer updateStatusList(List<String> payNoList,Integer status);
}
