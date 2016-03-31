package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;

/**
 * 返回翻牌加的次数信息！
 * @author lijing
 *
 */
public class FlopUserTimeVO implements Serializable{
	/**返回的信息*/
	private String msg;
	/**错误编码*/
	private Integer errno;
	/**翻牌购拼接的url*/
	private String url;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getErrno() {
		return errno;
	}
	public void setErrno(Integer errno) {
		this.errno = errno;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
