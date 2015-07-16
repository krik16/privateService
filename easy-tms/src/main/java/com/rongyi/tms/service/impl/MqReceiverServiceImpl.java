/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月29日下午6:17:54
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitmq.client.Channel;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.constant.TmsEventTypeEnum;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.MqReceiverService;
import com.rongyi.tms.service.SalesCommissionService;

/**
 * @Author: 柯军
 * @Description: TODO
 * @datetime:2015年5月29日下午6:17:54
 * 
 **/
@Service
public class MqReceiverServiceImpl implements MqReceiverService {

	@Autowired
	DrawApplyService drawApplyService;

	@Autowired
	SalesCommissionService salesCommissionService;

	@Autowired
	Sender sender;
	/**
	 * @Description: 回调函数
	 * @param message
	 * @param messageString
	 * @Author: 柯军
	 * @datetime:2015年6月2日上午10:27:32
	 **/
	@Override
	public void callBack(Message message, Channel channel, String messageString) {
		MessageEvent messageEvent = MessageEvent.messageToEvent(messageString);
		if (TmsEventTypeEnum.DRAWAPPLY.getCode().equals(messageEvent.getType())) {// 提现
			Map<String, Object> messageMap = new HashMap<String, Object>();
			messageMap = drawApplyService.addDrawApplyByMQ(messageEvent);
			sender.rpcSend(messageMap, message, channel);
		} else if (PaymentEventType.PAY_NOTIFY.equals(messageEvent.getType())) {// 支付成功通知
			drawApplyService.updateDrawApplyByMQ(messageEvent);
		} else if (TmsEventTypeEnum.COMMISSION_POST.getCode().equals(messageEvent.getType())) {// 佣金提审
			salesCommissionService.addCommissionByMQ(messageEvent);
		}
	}

}
