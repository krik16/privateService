/** 
 * @Title: SpringAmqpSender.java 
 * @Package com.rongyi.osm.mq 
 * @Description: spring-rabbit 消息接收/处理
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月1日 下午3:22:31
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.mq;

import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;
import com.rongyi.osm.knowledge.BaseEvent;
import com.rongyi.osm.knowledge.EventFactory;

@Component
public class SpringAmqpReceiver implements ChannelAwareMessageListener {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name="ksession")
	private KieSession kSession;

	@Override
	public void onMessage(Message message, Channel channel) {
		// 必须捕获异常，否则会导致SpringRabbit重新调用消息接收函数
		try {	
			String replyTo = message.getMessageProperties().getReplyTo();
			String correlationId = message.getMessageProperties().getReplyTo();
//			byte[] objectCorrelationId = message.getMessageProperties().getCorrelationId();
//			StringBuffer correlationId = new StringBuffer();
//			for (int i = 0; i < objectCorrelationId.length; i++) {
//				correlationId.append(objectCorrelationId[i]);
//			}

			logger.info("Received Event: " + new String(message.getBody(), "UTF-8") + "  replyTo: " + replyTo
					+ "  correlationId: " + correlationId);

			BaseEvent event = EventFactory.buildEventFromString(new String(message.getBody(), "UTF-8"), replyTo, correlationId.toString());
			kSession.insert(event);
			
			//Ack after drool processing
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
