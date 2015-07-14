/** 
 * @Title: SpringAmqpSender.java 
 * @Package com.rongyi.osm.mq 
 * @Description: OSM主从同步MQ发送者
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月1日 下午1:08:30 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.mq;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rongyi.osm.listener.OSMStandbyStatus;

/**
 * @author ZhengYl
 * 
 */
@Component
public class OSMFactSender {
	private static String DEFAULT_EXCHANGE = "core_exchange";

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private RabbitTemplate template;

	@Autowired
	private OSMStandbyStatus osmStandbyStatus;

	/**
	 * OSM主从同步fact发送
	 * 
	 * @author ZhengYl
	 * @date 2015年6月10日 下午5:19:29
	 * @param serializable
	 *            待发送对象
	 * @param operateKey
	 *            根据操作类型以不同的routingKey发送
	 */
	public void sendFact(Object serializable, String operateKey) {
		if (osmStandbyStatus.isSlaveAlive()){
			ObjectOutputStream oos = null;
			ByteArrayOutputStream baos = null;
			if (serializable instanceof Serializable) {
				try {
					baos = new ByteArrayOutputStream();
					oos = new ObjectOutputStream(baos);
					oos.writeObject(serializable);
					byte[] msg = baos.toByteArray();

					template.send(DEFAULT_EXCHANGE, operateKey, MessageBuilder.withBody(msg).build());
				} catch (Exception e) {
					e.printStackTrace();
					logger.error("Send Event Error: " + e.getMessage());
				}
			}
		}
	}
}
