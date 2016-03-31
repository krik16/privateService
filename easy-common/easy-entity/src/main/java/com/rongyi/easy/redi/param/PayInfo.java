package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class PayInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String payMetSid;// 支付方式代码：0-在线支付，1-货到付款，2-货到刷卡
	
	private String payMet;// 支付方式名称

	public String getPayMetSid() {
		return payMetSid;
	}

	public void setPayMetSid(String payMetSid) {
		this.payMetSid = payMetSid;
	}

	public String getPayMet() {
		return payMet;
	}

	public void setPayMet(String payMet) {
		this.payMet = payMet;
	}
	
	
	

	
}
