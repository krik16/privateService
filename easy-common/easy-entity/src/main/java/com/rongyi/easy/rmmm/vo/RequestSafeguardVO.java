package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 申请维权返回结果
 * @author chenjun 2015/2/15
 *
 */
public class RequestSafeguardVO implements Serializable{
	
	private String safeguardId;//维权ID

	public String getSafeguardId() {
		return safeguardId;
	}

	public void setSafeguardId(String safeguardId) {
		this.safeguardId = safeguardId;
	}
	

}
