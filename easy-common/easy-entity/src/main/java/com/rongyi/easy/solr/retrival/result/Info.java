package com.rongyi.easy.solr.retrival.result;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;



public class Info  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6512381411021309111L;
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
