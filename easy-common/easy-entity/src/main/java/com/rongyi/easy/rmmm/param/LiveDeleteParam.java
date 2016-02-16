package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class LiveDeleteParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String liveId;//直播id
	
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	
}
