package com.rongyi.rpb.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;

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
	@Deprecated
	public String getOrderNo() {
		int machineId = 1;// 最大支持1-9个集群机器部署
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		return machineId + String.format("%015d", hashCodeV);
	}

	@Override
	public String getOrderNo(String firstValue) {
		StringBuffer sb = new StringBuffer();
		if (!StringUtils.isEmpty(firstValue))
			sb.append(firstValue);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MMdd");
		String mmdd = formatter.format(date);
		formatter = new SimpleDateFormat("HHmm");
		String hhmm = formatter.format(date);
		sb.append(mmdd);
		IdGenService idGenService = new IdGenService(1l);
		String randomString = idGenService.nextId(8);
		sb.append(randomString);
		sb.append(hhmm);
		return sb.toString();
	}

	public static void main(String[] args) {
		OrderNoGenServiceImpl orderNoGenServiceImpl = new OrderNoGenServiceImpl();
		System.err.println(orderNoGenServiceImpl.getOrderNo(null));
	}
}
