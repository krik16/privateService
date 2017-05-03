package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;

public class UserBindingVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bindingMId;//绑定的id
	private String bindingType;// group,mall,shop
	public String getBindingMId() {
		return bindingMId;
	}
	public void setBindingMId(String bindingMId) {
		this.bindingMId = bindingMId;
	}
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	@Override
	public String toString() {
		return "UserBindingVO [bindingMId=" + bindingMId + ", bindingType="
				+ bindingType + "]";
	}
	
}
