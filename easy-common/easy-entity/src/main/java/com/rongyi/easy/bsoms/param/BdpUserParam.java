package com.rongyi.easy.bsoms.param;

import java.io.Serializable;

public class BdpUserParam implements Serializable {

	private static final long serialVersionUID = 9158363236874550422L;
	
	private String st;
	private String channel;
	private String sign;
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "BdpUserParam [st=" + st + ", channel=" + channel + ", sign=" + sign + "]";
	}

}
