package com.rongyi.osm.mq;


import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.QueueingConsumer.Delivery;
import com.rongyi.osm.knowledge.BaseEvent;
import com.rongyi.osm.knowledge.EventFactory;

/**
 * 消息接收服务
 * 
 * 本服务为单线程模式
 */
@Component
public class MessageReceiver extends Thread {
	public static final String EXCHANGE_NAME = "core_exchange";
	public static final String ROUTING_KEY = "osm";
	public static final String RECEIVE_QUEUENAME = "order_external_event";
	
	@Autowired
	private MqConfig mqConfig;
	
	@Resource(name="ksession")
	private KieSession kSession;
    
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    private ConnectionFactory factory;
    private Connection connection;
    private Channel channel;
    private QueueingConsumer consumer;
    
    private boolean running = true;
   
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

    /**
     * 回调函数
     * @param message
     * @throws Exception 
     */
    private void ProcessMessage(String message, String replyTo, String correlationId) throws Exception{
        logger.info("Received Event: " + message + "  replyTo: " + replyTo + "  correlationId: " + correlationId);
        BaseEvent event = EventFactory.buildEventFromString(message, replyTo, correlationId);
        kSession.insert(event);
    }

    @Override
    public void run() {
    	Delivery delivery = null;
    	boolean needConnect = true;
    	
    	// 初始化连接配置
    	initConnectionFactory();
    	

    	while(running) {
    		
    		if (needConnect) {
    			// 连接mq服务器，直到连上为止
    			connect();
    			needConnect = false;
    		}
    		
    		// 接收消息，如果接收失败，休息5秒，继续。
    		// （其实RabbitMqSDK会自动断网重连的，间隔5秒）
    		try {
				delivery = consumer.nextDelivery();
			}catch(Exception e){
				// 所以，不太可能走到这里
				// 这里应付极端的错误情况
				logger.info("[x] Message Delivery Error: " + e.toString() + ", try again in 5 seconds...");

				try{
					sleep(5000);
				}catch(Exception sleepException){
				}
				needConnect = true;
				continue;
			}

    		// 处理消息
    		try {
	    		String message = new String(delivery.getBody(), "UTF-8");
	    		
	    		ProcessMessage(message, delivery.getProperties().getReplyTo(), 
	    				delivery.getProperties().getCorrelationId());
	    		
    			channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
    		}catch(Exception e){
    			// 可能的错误有： InvalidEventFormat, UnsupportedEvent, IOException
    			e.printStackTrace();
    			logger.error("Process Order Event Error: " + e.getMessage());
    		}
    	}
    	
    	try {
    		logger.info("Message Receiver shutdown.");
    		
    		channel.close();
    		connection.close();
    	}catch(Exception e) {
    		// 出错不管
    	}
    }

	/**
	 * 
	 */
	private void connect() {
		// 初始化连接，失败重试，直到成功
    	while(running) {
    		try {
				connection = factory.newConnection();
				channel = connection.createChannel();
				channel.exchangeDeclare(EXCHANGE_NAME, "direct", true);
				channel.queueDeclare(RECEIVE_QUEUENAME, true, false, false, null);
				channel.queueBind(RECEIVE_QUEUENAME, EXCHANGE_NAME, ROUTING_KEY);

				consumer = new QueueingConsumer(channel);
				// Set max prefetch = 10000
				channel.basicQos(10000);
				// Enable manual Acknowledge for message
				channel.basicConsume(RECEIVE_QUEUENAME, false, consumer);
				
				// 退出连接循环
				break;
			}catch(Exception e) {
				// 连接失败，休息5秒后，重试
				// 因为RabbitMqSDK在初次连接的时候，不会断网重连
				// 所以我们需要自己进行这个动作
				e.printStackTrace();
				logger.info("Connect MQ Server : " + factory.getHost() + " failed: " +
						e.toString() + ", try again in 5 seconds.");
				try{
					sleep(5000);
				}catch(Exception sleepException){
				}
			}
    	}
    	
		
		logger.info("[x] Waiting for messages ...");
	}
    
    // 关闭消息接收线程
    public void shutdown() {
    	running = false;
    }
}
