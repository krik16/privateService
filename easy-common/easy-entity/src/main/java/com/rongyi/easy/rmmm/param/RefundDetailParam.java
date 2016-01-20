package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class RefundDetailParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sonOrderId;//子订单ID

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

}
