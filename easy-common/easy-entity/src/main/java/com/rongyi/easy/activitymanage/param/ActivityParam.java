package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;

public class ActivityParam implements Serializable{
    
	private static final long serialVersionUID = 6383826849485417919L;

	private String startDt;

    private String oId;

	public String getStartDt() {
		return startDt;
	}

	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}

	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	@Override
	public String toString() {
		return "ActivityParam [startDt=" + startDt + ", oId=" + oId + "]";
	}

	
}
