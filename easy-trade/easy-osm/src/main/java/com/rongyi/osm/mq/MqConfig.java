package com.rongyi.osm.mq;

import org.springframework.stereotype.Component;


/**
 * mq信息配置类
 * @author baodk
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
//        String classesPath = this.getClass().getClassLoader().getResource("").getFile();
//        classesPath += "properties/config.properties";
//        Properties properties = PropertiesUtil.getProperties(classesPath);
//        this.host = properties.getProperty("mq.host");
//        this.username = properties.getProperty("mq.username");
//        this.password = properties.getProperty("mq.password");
//        this.heartBeat = Integer.parseInt(properties.getProperty("mq.heartbeat"));
//        this.virtualHost =properties.getProperty("mq.virtualhost");
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
