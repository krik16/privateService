package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.ryoms.entity.WechatInfoVo;

import java.io.Serializable;
import java.util.List;

public class MallTerminalVO implements Serializable {
	private static final long serialVersionUID = -7647318295364366168L;

	// 1 表示绑定 0 表示未绑定
	//private Integer wechat;	 		// 是否绑定微信终端

	private List<WechatInfoVo> wechatInfoVoList;
	private Integer mallTerminal;	// 商场终端

	public List<WechatInfoVo> getWechatInfoVoList() {
		return wechatInfoVoList;
	}

	public void setWechatInfoVoList(List<WechatInfoVo> wechatInfoVoList) {
		this.wechatInfoVoList = wechatInfoVoList;
	}

	public Integer getMallTerminal() {
		return mallTerminal;
	}
	public void setMallTerminal(Integer mallTerminal) {
		this.mallTerminal = mallTerminal;
	}
	@Override
	public String toString() {
		return "MallTerminalVO [wechatInfoVoList=" + wechatInfoVoList + ", mallTerminal=" + mallTerminal + "]";
	}

}
