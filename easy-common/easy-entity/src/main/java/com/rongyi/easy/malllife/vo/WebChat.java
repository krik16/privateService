package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/**
 * 微信
 * 
 * @author zzq
 * 
 */
public class WebChat implements Serializable {

	private int flag;
	private String redirect;
	private  String code;
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	@Override
	public String toString() {
		return "WebChat [flag=" + flag + ", redirect=" + redirect + ", code="
				+ code + "]";
	}
 

}
