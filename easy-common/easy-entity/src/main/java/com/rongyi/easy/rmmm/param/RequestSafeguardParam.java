package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * 申请维权参数
 * @author zzp
 *
 */
public class RequestSafeguardParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 子订单id*/
	private String sonOrderId;
	
	/** 维权说明*/
	private String safeguardComment;

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getSafeguardComment() {
		return safeguardComment;
	}

	public void setSafeguardComment(String safeguardComment) {
		this.safeguardComment = safeguardComment;
	}

	

}
