package com.rongyi.rpb.service.impl;

import java.util.UUID;

import com.rongyi.rss.rpb.OrderNoGenService;

/**
 * @Author: 柯军
 * @Description: 订单号接口实现
 * @datetime:2015年4月23日上午10:01:38
 * 
 **/
public class OrderNoGenServiceImpl implements OrderNoGenService {

	/**
	 * @Description: 生成随机订单号
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年4月23日上午10:01:53
	 **/
	@Override
	public String getOrderNo() {
		int machineId = 1;// 最大支持1-9个集群机器部署
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		return machineId + String.format("%015d", hashCodeV);
	}
}
