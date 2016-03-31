package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.List;

public class FlopgoPrizeByTimesListVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FlopGoPramVO info;
	private FlopgoPrizeByTimesVO records;
	public FlopgoPrizeByTimesListVO(){
		
	}
	public FlopGoPramVO getInfo() {
		return info;
	}
	public void setInfo(FlopGoPramVO info) {
		this.info = info;
	}
	public FlopgoPrizeByTimesVO getRecords() {
		return records;
	}
	public void setRecords(FlopgoPrizeByTimesVO records) {
		this.records = records;
	}
	
	
}
