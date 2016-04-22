package com.rongyi.rpb.service;

import com.rongyi.easy.rpb.domain.PaymentItemEntity;

import java.util.List;

/**	
 * Author:  柯军
 * Description: 子订单service
 * datetime:2015年4月23日上午10:02:14
 *
 **/
public interface PaymentItemService {

	/**
	 * 根据osm传入的数据插入数据库，如果存在多个子订单则分多条插入
	 * 
	 * param paymentItemEntity
	 */
		void insert(PaymentItemEntity paymentItemEntity);
	
	/**	
	 * Description: 根据paymentId 查询对应子订单信息
	 * param paymentId
	 * Author:  柯军
	 * datetime:2015年7月14日上午10:43:30
	 **/
	List<PaymentItemEntity> selectByPaymentId(Integer paymentId);
	
	/**	
	 * Description: 获取子订单拼接字符串
	 * @param itemList itemList
	 * Author:  柯军
	 * datetime:2015年7月20日上午11:53:37
	 **/
	public String getDetailNum(List<PaymentItemEntity> itemList);

}