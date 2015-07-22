/** 
 * @Title: OSMFactReceiver.java 
 * @Package com.rongyi.osm.mq 
 * @Description:  OSM主从同步接收fact，插入kSession
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月9日 下午3:21:14 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.mq;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

/**
 * @author ZhengYl
 * 
 */
@Component
public class OSMFactInsertReceiver implements ChannelAwareMessageListener {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name = "ksession")
	private KieSession kSession;

	/*
	 * (non-Javadoc)
	 * 
	 * @param message
	 * 
	 * @param channel
	 * 
	 * @see
	 * org.springframework.amqp.rabbit.core.ChannelAwareMessageListener#onMessage
	 * (org.springframework.amqp.core.Message, com.rabbitmq.client.Channel)
	 */
	@Override
	public void onMessage(Message message, Channel channel) {
		ByteArrayInputStream bais = null;
		Object obj = null;
		
		try {
			bais = new ByteArrayInputStream(message.getBody());
			ObjectInputStream ois = new ObjectInputStream(bais);
			obj = ois.readObject();
			logger.info("Sync Insert received fact: " + obj.getClass().getName());
			
			kSession.insert(obj);
			
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
