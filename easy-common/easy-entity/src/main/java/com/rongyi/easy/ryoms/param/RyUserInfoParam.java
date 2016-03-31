package com.rongyi.easy.ryoms.param;

import java.io.Serializable;

public class RyUserInfoParam implements Serializable {

	private static final long serialVersionUID = -6925409893875036430L;
	
	private String ryst;
	private String channel;
	public String getRyst() {
		return ryst;
	}
	public void setRyst(String ryst) {
		this.ryst = ryst;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
