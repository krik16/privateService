package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.List;

public class FlopRecordUserInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FlopGoPramVO info;
	private List<FlopGORecordInfoVO> records;
	public FlopGoPramVO getInfo() {
		return info;
	}
	public void setInfo(FlopGoPramVO info) {
		this.info = info;
	}
	public List<FlopGORecordInfoVO> getRecords() {
		return records;
	}
	public void setRecords(List<FlopGORecordInfoVO> records) {
		this.records = records;
	}
	
}
