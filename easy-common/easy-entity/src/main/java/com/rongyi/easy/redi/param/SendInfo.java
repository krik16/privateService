package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class SendInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sendType;// String 配送方式
	
	private String sendTypeSid;// 配送方式ID,0-送货上门,1-自提
	
	private String sendTime ; //送货时间类型,0-双休日、工作日均可送货,1-工作日送货,2-双休日送货
	
	private String extrPlaceSid ;//自提点ID 
	
	private String extrPlace ;//自提点名称
	
	private String storeCode ;//自提门店代码

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getSendTypeSid() {
		return sendTypeSid;
	}

	public void setSendTypeSid(String sendTypeSid) {
		this.sendTypeSid = sendTypeSid;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getExtrPlaceSid() {
		return extrPlaceSid;
	}

	public void setExtrPlaceSid(String extrPlaceSid) {
		this.extrPlaceSid = extrPlaceSid;
	}

	public String getExtrPlace() {
		return extrPlace;
	}

	public void setExtrPlace(String extrPlace) {
		this.extrPlace = extrPlace;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	

	
}
