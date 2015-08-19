/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月29日下午6:17:54
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.service.impl;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

import com.rabbitmq.client.Channel;
import com.rongyi.cheat.service.MqReceiverService;

/**
 * @Author: 柯军
 * @Description: TODO
 * @datetime:2015年5月29日下午6:17:54
 * 
 **/
@Service
public class MqReceiverServiceImpl implements MqReceiverService {
	
	private static final Logger LOGGER = Logger.getLogger(MqReceiverServiceImpl.class);

	/**
	 * @Description: 回调函数
	 * @param message
	 * @param messageString
	 * @Author: 柯军
	 * @datetime:2015年6月2日上午10:27:32
	 **/
	@Override
	public void callBack(Message message, Channel channel, String messageString) {

	}

}
