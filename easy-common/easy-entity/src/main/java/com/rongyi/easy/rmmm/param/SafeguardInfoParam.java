package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class SafeguardInfoParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 子订单id*/
	private String sonOrderId;

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}
	
}
