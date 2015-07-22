/** 
* @Title: MqConfig.java 
* @Package com.rongyi.va.mq 
* @Description: mq信息配置类
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午2:09:07 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.mq;

import java.util.Properties;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rongyi.core.common.util.PropertiesUtil;

/**
 * @author ZhengYl
 *
 */
@Component
public class MqConfig {

    private String host;
    
    private int port = 5672;
    
    private String username;
    
    private String password;
    
    private int connectionTimeout = 0;
    
    private int preFetchSize;
    
    private boolean automaticRecoveryEnabled = true;
    
    private int networkRecoveryInterval = 10000;
    
    private int heartBeat;
    
    private String virtualHost;
    
    public MqConfig(){
        String classesPath = this.getClass().getClassLoader().getResource("").getFile();
        classesPath += "properties/config.properties";
        Properties properties = PropertiesUtil.getProperties(classesPath);
//        this.port = properties.get("mq.port");
        this.host = properties.getProperty("mq.host");
        this.username = properties.getProperty("mq.username");
        this.password = properties.getProperty("mq.password");
        this.heartBeat = Integer.parseInt(properties.getProperty("mq.heartbeat"));
        this.virtualHost =properties.getProperty("mq.virtualhost");
    }

    public String getHost() {
        return host;
    }
    
    public int getPort() {
        return port;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getConnectionTimeout() {
        return connectionTimeout;
    }
    
    public int getPreFetchSize() {
        return preFetchSize;
    }
    
    public boolean getAutomaticRecoveryEnabled() {
        return automaticRecoveryEnabled;
    }

    public int getNetworkRecoveryInterval() {
        return networkRecoveryInterval;
    }

    public int getHeartBeat() {
        return heartBeat;
    }

	public String getVitualHost() {
		return virtualHost;
	}

}
