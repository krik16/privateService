package com.rongyi.easy.bdata.param;

import java.io.Serializable;

public class CategoryHaiXinParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String upperCode;//上级编码
	private Integer level;//级别
	public String getUpperCode() {
		return upperCode;
	}
	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "CategoryHaiXinParam [upperCode=" + upperCode + ", level="
				+ level + "]";
	}
	
}
