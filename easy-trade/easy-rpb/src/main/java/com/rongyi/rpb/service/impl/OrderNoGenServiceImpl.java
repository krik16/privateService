package com.rongyi.rpb.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.spring.context.utils.SpringContextUtil;
import com.rongyi.rss.rpb.OrderNoGenService;

/**
 * @Author: 柯军
 * @Description: 订单号接口实现
 * @datetime:2015年4月23日上午10:01:38
 * 
 **/
public class OrderNoGenServiceImpl implements OrderNoGenService {

	private static final Logger LOGGER = Logger.getLogger(OrderNoGenServiceImpl.class);

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
//		formatter = new SimpleDateFormat("HHmm");
		//单号生成改用分秒，防止重复
		formatter = new SimpleDateFormat("mmss");
		String hhmm = formatter.format(date);
		sb.append(mmdd);
		PropertyConfigurer propertyConfigurer = (PropertyConfigurer) SpringContextUtil.getBean("propertyConfigurer");
		long wokerId = 1;
		try {
			wokerId = Long.valueOf(propertyConfigurer.getProperty("idgenService.workerId").toString());
		} catch (Exception e) {
			LOGGER.error("配置的wokerId出现异常，使用默认wokerId = 1," + e.getMessage());
			e.printStackTrace();
		}
		IdGenService idGenService = new IdGenService(wokerId);
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
