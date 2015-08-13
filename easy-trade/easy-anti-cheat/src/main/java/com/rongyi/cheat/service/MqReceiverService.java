/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月29日下午6:17:54
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.service;

import org.springframework.amqp.core.Message;

import com.rabbitmq.client.Channel;

/**
 * @Author: 柯军
 * @Description: 消息处理接口
 * @datetime:2015年5月29日下午6:17:54
 * 
 **/
public interface MqReceiverService {
    
    /**	
     * @Description: mq reservice 回调处理接口
     * @param message
     * @param channel
     * @param messageString	
     * @Author:  柯军
     * @datetime:2015年6月3日上午11:19:38
     **/
    public void callBack(Message message, Channel channel, String messageString);
    
}
