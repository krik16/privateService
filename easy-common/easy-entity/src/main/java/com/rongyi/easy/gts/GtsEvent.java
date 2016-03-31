package com.rongyi.easy.gts;

import java.io.Serializable;
import java.util.Date;

public class GtsEvent  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1198450663954945003L;
	private String orderId;
	private String status;
	private String requester;
	private Date deadline;
	public String getRequester() {
		return requester;
	}
	public void setRequester(String requester) {
		this.requester = requester;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	

}
