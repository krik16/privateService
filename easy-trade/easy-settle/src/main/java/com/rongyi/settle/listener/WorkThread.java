/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月16日下午6:56:12
 * @Description: TODO
 *
 **/

package com.rongyi.settle.listener;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**	
 * @Author:  柯军
 * @Description: 任务启动线程 
 * @datetime:2015年9月16日下午6:56:12
 *
 **/
@Component
public class WorkThread extends Thread{
	
	private static final Logger LOGGER = Logger.getLogger(WorkThread.class);
	
	private boolean running = true;
	
	@Override
	public void run() {
		LOGGER.info("work start");
		while (running) {
			try {
				//TODO 查询数据库是否存在符合条件的对账单配置
				LOGGER.info("生成对账单");
				sleep(60000);//睡眠一分钟
			} catch (Exception e) {
				LOGGER.error("[x] run Error: " + e.toString() + ", try again in 5 seconds...",e);
				try {
					sleep(5000);
				} catch (Exception sleepException) {
					LOGGER.error(sleepException);
				}
				continue;
			}
		}
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

}
