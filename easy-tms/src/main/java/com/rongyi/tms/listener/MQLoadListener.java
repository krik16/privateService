package com.rongyi.tms.listener;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * mq server 启动类
 * 
 * @author baodk
 */
@Component
public class MQLoadListener implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger logger = Logger.getLogger(MQLoadListener.class);

	@Autowired
	SimpleMessageListenerContainer container;

	/*@Resource(name = "tmsTrigger")
	CronTriggerBean cronTriggerBean;

	@Resource
	SchedulerFactoryBean schedulerFactoryBean;

	@Autowired
	private RmmmSettingsService rmmmSettingsService;
*/
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (!container.isActive()) {
//			try {
//				TransConfigurations transConf = rmmmSettingsService.getLatestTransConfigurations();
//				//default settlement days: 5 and 20
//				int settleDateEarly = transConf.getSettleDateEarly() == 0 ? 5 : transConf.getSettleDateEarly();
//				int settleDateLate = transConf.getSettleDateLate() == 0 ? 20 : transConf.getSettleDateLate();
//
//				// set trigger with a new cron expression by gcc setting
//				String cron = "0 0 0 " + settleDateEarly + "," + settleDateLate + " * ?";
//				logger.info(">>>>>> Loading settlement schedule by TransConfigurations: " + cron);
//				cronTriggerBean.setCronExpression(cron);
//				
//				// get schedule
//				Scheduler scheduler = schedulerFactoryBean.getScheduler();
//				
//				// reset trigger of the schedule
////				Date date = scheduler.rescheduleJob(cronTriggerBean.getName(), cronTriggerBean.getGroup(), cronTriggerBean);
////				logger.info(">>>>>> Next settlement day is: " + date.toString());
//			} catch (Exception e) {
//				logger.error(e.getMessage());
//				e.printStackTrace();
//			}

			container.start();
			logger.info("message receiver Starting...");
		}

	}
}
