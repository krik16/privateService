package com.rongyi.osm.listener;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.rongyi.osm.knowledge.RuleProcessor;
import com.rongyi.osm.mq.SpringAmqpSender;

/**
 * mq server 启动类
 * 
 * @author baodk
 */
@Component
public class WorkThreadLoadListener implements ApplicationListener<ContextRefreshedEvent> {

	private static boolean initialized = false;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RuleProcessor ruleProcessor;

	@Autowired
	private SpringAmqpSender springSender;

	@Autowired
	private OSMStandbyService osmStandbyService;

	@Resource(name = "syncInsertListener")
	private SimpleMessageListenerContainer syncMsgInsertContainer;

	@Resource(name = "syncUpdateListener")
	private SimpleMessageListenerContainer syncMsgUpdateContainer;
	
	@Resource(name = "syncDeleteListener")
	private SimpleMessageListenerContainer syncMsgDeleteContainer;
	
	@Autowired
	private OSMStandbyStatus osmStandbyStatus;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (!initialized) {
			logger.info("Register node to zookeeper and determine the node's role ...");
			osmStandbyService.nodeHeartBeatWatching();
			
			logger.info("Start background working thread ...");

			// NOTICE: Start Sequence is IMPORTANT
			// 装载初始化数据

			ruleProcessor.initialize();

			if (osmStandbyStatus.isActive()) {
				ruleProcessor.start();
			} else {
				syncMsgInsertContainer.start();
				syncMsgUpdateContainer.start();
				syncMsgDeleteContainer.start();
			}

			initialized = true;


		}
	}

}
