package com.rongyi.easy.solr.result;

import java.io.Serializable;

public class SearchMeta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3337560364556240592L;
	
	private int hitCount;
	private int status;
	private String msg;
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
