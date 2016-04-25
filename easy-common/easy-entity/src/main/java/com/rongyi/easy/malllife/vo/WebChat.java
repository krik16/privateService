package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/**
 * 微信
 * 
 * @author zzq
 * 
 */
public class WebChat implements Serializable {

	private int flag=0;
	private String redirect;
	private  String code;
	private String jsessionid;



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

	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}

	@Override
	public String toString() {
		return "WebChat [flag=" + flag + ", redirect=" + redirect + ", code="
				+ code + "]";
	}
 

}
