/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年9月8日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年9月8日 1.0 创建文件
 */
public class AppAdvertParam implements Serializable {

	private String appid;// APP标识

	private String idfa;// 用户标识

	private String channel;// 广告渠道 zhimeng/waps

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "AppAdvertParam [appid=" + appid + ", idfa=" + idfa + ", channel=" + channel + "]";
	}

}
