/** 
 * @Title: OSMStandbyStatus.java 
 * @Package com.rongyi.osm.listener 
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月8日 下午2:16:34 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.listener;

import org.springframework.stereotype.Component;

/**
 * @author ZhengYl
 * 
 */
@Component
public final class OSMStandbyStatus {
	private static boolean active = false;
	private static boolean slaveAlive = false;
//	private static String propertiesPath = "properties/config.properties";

	public boolean isActive() {
		return active;
	}

	public void wakeUp() {
		active = true;
	}
	
	public void block() {
		active = false;
	}

	public boolean isSlaveAlive() {
		return slaveAlive;
	}
	
	public void slaveOffline() {
		slaveAlive = false;
	}
	
	public void slaveOnline() {
		slaveAlive = true;
	}
}
