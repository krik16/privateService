/** 
* @Title: MessageSender.java 
* @Package com.rongyi.va.mq 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午2:06:31 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.mq;

import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import com.rongyi.core.constant.Constants;
import com.rongyi.va.account.BaseEvent;


/**
 * @author ZhengYl
 *
 */
@Component
public class MessageSender extends Thread {
	public static final String EXCHANGE_NAME = Constants.MQRequestParam.EXCHANGE;
	
	@Autowired
	private MqConfig mqConfig;
    
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    private ConnectionFactory factory;
    private Connection connection;
    private Channel channel;
    private boolean running = true;
    
    private LinkedBlockingQueue<BaseEvent> queue = new LinkedBlockingQueue<BaseEvent>();
    
   
    /**
     * 初始化connection factory
     */
    private void initConnectionFactory(){
        logger.info("init rabbit connection factory！");
        factory = new ConnectionFactory();
        factory.setHost(mqConfig.getHost());
        factory.setPort(mqConfig.getPort());
        factory.setUsername(mqConfig.getUsername());
        factory.setPassword(mqConfig.getPassword());
        factory.setVirtualHost(mqConfig.getVitualHost());
        factory.setAutomaticRecoveryEnabled(mqConfig.getAutomaticRecoveryEnabled());
        factory.setNetworkRecoveryInterval(mqConfig.getNetworkRecoveryInterval());
        factory.setRequestedHeartbeat(mqConfig.getHeartBeat());
        
        
    }

    @Override
    public void run() {
    	boolean needConnect = true;
    	// 初始化连接配置
    	initConnectionFactory();
    	
    	while(running) {
    		// 连接MQ server
    		if (needConnect) {
    			connect();
    			needConnect = false;
    		}
    		
    		try {
    			BaseEvent event = queue.take();
    			
    			String payload = event.buildMessageString();
    			BasicProperties props = new BasicProperties();
    			
    			if (event.getCorrelationId() != null) {
    				props = new BasicProperties.Builder()
    					.correlationId(event.getCorrelationId()).build();
    			}
    			
    			logger.info("发送事件到:" + event.getTarget() + " JSON: " + payload);
    			channel.basicPublish(EXCHANGE_NAME, event.getTarget(), 
    					MessageProperties.PERSISTENT_TEXT_PLAIN, 
    					payload.getBytes());
    			
    		}catch(Exception e) {
    			e.printStackTrace();
    			logger.error("发送事件出错：" + e.getMessage());
    		}
    		
    	}
    }
    
    public void shutdown() {
    	running = false;
    }

	/**
	 * 
	 */
	private void connect() {
		// 初始化连接，失败重试，直到成功
    	while(true) {
    		try {
				connection = factory.newConnection();
				channel = connection.createChannel();
				channel.exchangeDeclare(EXCHANGE_NAME, "direct", true);
				
				// 退出连接循环
				break;
			}catch(Exception e) {
				e.printStackTrace();
				logger.info("Connect MQ Server : " + factory.getHost() + " failed: " +
						e.toString() + ", try again in 5 seconds.");
				try{
					sleep(5000);
				}catch(Exception sleepException){
				}
			}
    	}
    	
    	logger.info("[x] Waiting for messages to send ...");
	}
    
//    public void sendEvent(BaseEvent event) {
//    	try {
//			queue.put(event);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//			logger.error("Send Event Error: " + e.getMessage());
//		}
//    }
}