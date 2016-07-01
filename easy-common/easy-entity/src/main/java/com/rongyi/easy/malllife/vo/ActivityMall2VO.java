package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class ActivityMall2VO implements Serializable{
	
	private List<String>  mallNames;
	private String refId;//
	private String refType;//"mall / brand /shop",
	public List<String> getMallNames() {
		return mallNames;
	}
	public void setMallNames(List<String> mallNames) {
		this.mallNames = mallNames;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getRefType() {
		return refType;
	}
	public void setRefType(String refType) {
		this.refType = refType;
	}
	@Override
	public String toString() {
		return "ActivityMall2VO [mallNames=" + mallNames + ", refId=" + refId
				+ ", refType=" + refType + "]";
	}

}
