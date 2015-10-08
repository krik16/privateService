package com.rongyi.settle.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**	
 * @Author:  柯军
 * @Description: 监听器 
 * @datetime:2015年9月16日下午6:55:18
 *
 **/
@Component
public class WorkListener implements ServletContextListener {

	private static final Logger logger = Logger.getLogger(WorkListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
//		logger.info("Starting listener ...");
//		WorkThread workThread = new WorkThread();
//		workThread.start();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("MQLoadListener ======== contextDestroyed");
	}

}
