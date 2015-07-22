/** 
 * @Title: SpringAmqpSender.java 
 * @Package com.rongyi.osm.mq 
 * @Description: spring-rabbit 消息发送线程
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月1日 下午1:08:30 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.mq;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.va.account.BaseEvent;
import com.rongyi.va.account.ResponseEvent;

/**
 * @author ZhengYl
 * 
 */
@Component
public class SpringAmqpSender {
	private static String DEFAULT_EXCHANGE = "core_exchange";

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private RabbitTemplate template;

	public void sendEvent(BaseEvent event) {
		try {
			String payload = event.buildMessageString();

			if (event.getCorrelationId() != null) {
				template.setCorrelationKey(event.getCorrelationId());
			}
			logger.info("发送事件到:" + event.getTarget() + " JSON: " + payload);
			if (event.getTarget().startsWith("amq.gen-")) {
				template.convertAndSend(event.getTarget(), payload); // RPC MSG
			} else {
				template.convertAndSend(DEFAULT_EXCHANGE, event.getTarget(), payload);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Send Event Error: " + e.getMessage());
		}
	}

	public ResponseEvent sendRPCEvent(BaseEvent event) {
		ResponseEvent response = new ResponseEvent();
		try {
			String payload = event.buildMessageString();

			if (event.getCorrelationId() != null) {
				template.setCorrelationKey(event.getCorrelationId());
			}
			logger.info("发送事件到:" + event.getTarget() + " JSON: " + payload);

			String responseStr = (String) template.convertSendAndReceive(DEFAULT_EXCHANGE, event.getTarget(), payload);
			JSONObject json = JsonUtil.getJSONObject(responseStr);

			response.load(json);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Send Event Error: " + e.getMessage());
		}
		return response;
	}
}
