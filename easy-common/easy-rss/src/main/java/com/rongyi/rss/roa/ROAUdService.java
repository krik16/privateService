package com.rongyi.rss.roa;

import com.rongyi.easy.roa.entity.UdPublish;

/**
 * 类ROAUdService.java的描述：TODO 类实现描述
 * 
 * @author PingKang 2015年5月6日 下午2:49:20
 */
public interface ROAUdService {

	public boolean saveUdPublish(UdPublish udPublish) throws Exception;
    
	public boolean publish(String mallMid) throws Exception;
}
