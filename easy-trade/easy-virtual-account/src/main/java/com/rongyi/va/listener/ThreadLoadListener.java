/** 
* @Title: ThreadLoadListener.java 
* @Package com.rongyi.va.listener 
* @Description: 各种工作线程的启动类
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午1:42:47 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.listener;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.rongyi.easy.gcc.TransConfigurations;
import com.rongyi.rss.gcc.RmmmSettingsService;
import com.rongyi.va.constants.DrawApplyRules;

/**
 * @author ZhengYl
 *
 */
@Component
public class ThreadLoadListener implements ApplicationListener<ContextRefreshedEvent> {
	private static boolean initialized = false;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DrawApplyRules drawApplyRules;

	@Autowired
	private RmmmSettingsService rmmmSettingsService;

	//    @Autowired
	//    private MessageReceiver mqReceiver;
	//    
	//    @Autowired
	//    private MessageSender mqSender;

	@Resource
	private SimpleMessageListenerContainer msgContainer;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (!initialized) {
			logger.info("Start background working thread ...");
			try {
				TransConfigurations transConf = rmmmSettingsService.getLatestTransConfigurations(2);
				drawApplyRules.setDrawApplyTimesLimit(transConf.getDrawCountMax());
				//买手
				TransConfigurations maiShouConf = rmmmSettingsService.getLatestTransConfigurations(3);
				drawApplyRules.setMaiShouDrawTimesLimit(maiShouConf.getDrawCountMax());
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
			}

			msgContainer.start();
			//	        mqSender.start();
			//	        mqReceiver.start();

			initialized = true;
		}
	}
}
