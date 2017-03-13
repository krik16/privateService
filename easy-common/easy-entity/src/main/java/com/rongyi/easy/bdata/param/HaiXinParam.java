package com.rongyi.easy.bdata.param;

import java.io.Serializable;

public class HaiXinParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String url;//传入的数据

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "HaiXinParam [url=" + url + "]";
	}
	
}
