package com.rongyi.easy.bsoms.param;

import java.io.Serializable;

public class BsUserInfoParam implements Serializable {

	private static final long serialVersionUID = -6925409893875036430L;
	
	private String bsst;
	private String channel;
	
	public String getBsst() {
		return bsst;
	}
	public void setBsst(String bsst) {
		this.bsst = bsst;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
