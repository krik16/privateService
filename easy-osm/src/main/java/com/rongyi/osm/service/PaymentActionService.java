/** 
 * @Title: PaymentActionService.java 
 * @Package com.rongyi.osm.service 
 * @Description: PaymentAction持久化服务类
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月29日 下午1:43:29 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.redis.service.impl.RedisServiceImpl;
import com.rongyi.osm.knowledge.PaymentAction;
import com.rongyi.osm.knowledge.PaymentActionSerializeUtil;

/**
 * @author ZhengYl
 * 
 */
@Service
public class PaymentActionService extends RedisServiceImpl<String, String> {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/** 
	* @Title: setPA 
	* @Description: 插入或者更新需要缓存的Payment Action
	* @param paymentAction 
	* @return void
	* @throws 
	*/
	public void setPA(final PaymentAction paymentAction) {
		try {
			redisTemplate.execute(new RedisCallback<Object>() {

				@Override
				public Object doInRedis(RedisConnection connection) throws DataAccessException {
					// payment action对象在redis存储时以 "payment.id." + 大订单号 + 小订单号 作为key
					// 缓存的payment action有86400秒的生存时间
					connection.setEx(
							("payment.id." + paymentAction.getOrderNo() + paymentAction.getOrderItemNo()).getBytes(),
							86400, PaymentActionSerializeUtil.serialize(paymentAction));
					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Redis Insert Error: " + e.getMessage());
			return;
		}

	}

	/** 
	* @Title: getAllPA 
	* @Description: 从数据库中获得所有未关闭的Payment Action对象
	* @return PaymentAction List
	* @throws 
	*/
	public List<PaymentAction> getAllPA() {
		try {
			return redisTemplate.execute(new RedisCallback<List<PaymentAction>>() {

				@Override
				public List<PaymentAction> doInRedis(RedisConnection connection) throws DataAccessException {
					List<PaymentAction> actionList = new ArrayList<PaymentAction>();
					//payment action对象在redis存储时以 "payment.id." + 大订单号 + 小订单号 作为key
					Set<byte[]> keys = connection.keys("payment.id.*".getBytes());
					for (byte[] key : keys) {
						byte[] pa = connection.get(key);
						actionList.add(PaymentActionSerializeUtil.unserialize(pa));
					}
					return actionList;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Redis Insert Error: " + e.getMessage());
			return null;
		}
	}

	/* (non-Javadoc) 
	* @param keys
	* @return 
	* @see com.rongyi.core.framework.redis.service.impl.RedisServiceImpl#del(java.lang.String[]) 
	*/
	@Override
	public long del(final String... keys) {
		try {
			return redisTemplate.execute(new RedisCallback<Long>() {
				public Long doInRedis(RedisConnection connection) throws DataAccessException {
					long result = 0;
					for (int i = 0; i < keys.length; i++) {
						result = connection.del(keys[i].getBytes());
					}
					return result;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Redis Insert Error: " + e.getMessage());
			return 0;
		}
	}
}
