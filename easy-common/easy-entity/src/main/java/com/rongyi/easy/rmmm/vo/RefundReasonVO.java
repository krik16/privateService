package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class RefundReasonVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;// 退款原因id

	private String name;// 退款原因

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
