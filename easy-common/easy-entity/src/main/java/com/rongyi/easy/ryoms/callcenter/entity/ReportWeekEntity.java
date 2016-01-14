package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;
import java.util.List;

public class ReportWeekEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1989038018425319161L;
	private int maxValue;//最大值
	private int minValue;//最小值
	private String reportText;//展示文本
	private int addCount;
	private int doneCount;
	private List<Integer> user_Id;
	/**
	 * @return the maxValue
	 */
	public int getMaxValue() {
		return maxValue;
	}
	/**
	 * @param maxValue the maxValue to set
	 */
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	/**
	 * @return the minValue
	 */
	public int getMinValue() {
		return minValue;
	}
	/**
	 * @param minValue the minValue to set
	 */
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}
	/**
	 * @return the reportText
	 */
	public String getReportText() {
		return reportText;
	}
	/**
	 * @param reportText the reportText to set
	 */
	public void setReportText(String reportText) {
		this.reportText = reportText;
	}
	
	public ReportWeekEntity(int maxValue, int minValue, String reportText) {
		super();
		this.maxValue = maxValue;
		this.minValue = minValue;
		this.reportText = reportText;
	}
	/**
	 * @return the addCount
	 */
	public int getAddCount() {
		return addCount;
	}
	/**
	 * @param addCount the addCount to set
	 */
	public void setAddCount(int addCount) {
		this.addCount = addCount;
	}
	/**
	 * @return the doneCount
	 */
	public int getDoneCount() {
		return doneCount;
	}
	/**
	 * @param doneCount the doneCount to set
	 */
	public void setDoneCount(int doneCount) {
		this.doneCount = doneCount;
	}
	/**
	 * @return the user_Id
	 */
	public List<Integer> getUser_Id() {
		return user_Id;
	}
	/**
	 * @param user_Id the user_Id to set
	 */
	public void setUser_Id(List<Integer> user_Id) {
		this.user_Id = user_Id;
	}
}
