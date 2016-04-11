package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

public class MallTerminalVO implements Serializable {
	private static final long serialVersionUID = -7647318295364366168L;
	
	// 1 表示绑定 0 表示未绑定 
	private Integer wechat;	 		// 是否绑定微信终端
	private Integer mallTerminal;	// 商场终端
	public Integer getWechat() {
		return wechat;
	}
	public void setWechat(Integer wechat) {
		this.wechat = wechat;
	}
	public Integer getMallTerminal() {
		return mallTerminal;
	}
	public void setMallTerminal(Integer mallTerminal) {
		this.mallTerminal = mallTerminal;
	}
	@Override
	public String toString() {
		return "MallTerminalVO [wechat=" + wechat + ", mallTerminal=" + mallTerminal + "]";
	}
	
}
