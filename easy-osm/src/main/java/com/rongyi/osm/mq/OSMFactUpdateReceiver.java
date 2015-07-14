/** 
 * @Title: OSMFactUpdateReceiver.java 
 * @Package com.rongyi.osm.mq 
 * @Description: OSM主从同步接收fact，更新kSession
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月10日 下午5:23:56 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.mq;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.osm.knowledge.OrderUtil;
import com.rongyi.osm.knowledge.PaymentAction;

/**
 * @author ZhengYl
 * 
 */
@Component
public class OSMFactUpdateReceiver implements ChannelAwareMessageListener {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "ksession")
	private KieSession kSession;

	@Autowired
	private OrderUtil orderUtil;

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
			logger.info("Sync Update received fact: " + obj.getClass().getName());

			if (obj instanceof OrderFormEntity) {
				OrderFormEntity order = (OrderFormEntity) obj;
				OrderFormEntity localFact = orderUtil.queryGetOrder(order.getOrderNo());
				if (localFact != null) {
					FactHandle handle = kSession.getFactHandle(localFact);
					if (handle != null) {
						kSession.update(handle, obj);
					} else {
						logger.error("[SYNC ERROR] : NOT FIND THE HANDLE FOR object: " + obj.getClass().getName());
					}
				}
			} else if (obj instanceof OrderDetailFormEntity) {
				OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) obj;
				OrderDetailFormEntity localFact = orderUtil.queryGetOrderDetail(orderDetail.getOrderItemNo());
				if (localFact != null) {
					FactHandle handle = kSession.getFactHandle(localFact);
					if (handle != null) {
						kSession.update(handle, obj);
					} else {
						logger.error("[SYNC ERROR] : NOT FIND THE HANDLE FOR object: " + obj.getClass().getName());
					}
				}
			} else if (obj instanceof ApplicationFormEntity) {
				ApplicationFormEntity application = (ApplicationFormEntity) obj;
				ApplicationFormEntity localFact = orderUtil.queryGetApplication(application.getId());
				if (localFact != null) {
					FactHandle handle = kSession.getFactHandle(localFact);
					if (handle != null) {
						kSession.update(handle, obj);
					} else {
						logger.error("[SYNC ERROR] : NOT FIND THE HANDLE FOR object: " + obj.getClass().getName());
					}
				}
			} else if (obj instanceof PaymentAction) {
				PaymentAction pa = (PaymentAction) obj;
				PaymentAction localFact = orderUtil.queryPaymentAction(pa.getOrderNo(), pa.getOrderItemNo());
				if (localFact != null) {
					FactHandle handle = kSession.getFactHandle(localFact);
					if (handle != null) {
						kSession.update(handle, obj);
					} else {
						logger.error("[SYNC ERROR] : NOT FIND THE HANDLE FOR object: " + obj.getClass().getName());
					}
				}
			}

			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);

		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
