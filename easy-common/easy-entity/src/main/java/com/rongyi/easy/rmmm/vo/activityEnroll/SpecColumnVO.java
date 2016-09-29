package com.rongyi.easy.rmmm.vo.activityEnroll;

import java.io.Serializable;
/**
 * 规格具体信息类
 * @author user
 *
 */
public class SpecColumnVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String columnId;//规格具体信息的
	private String columnName;//规格具体信息的名称
	private String columnValue;//规格具体信息的名称对应的值
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnValue() {
		return columnValue;
	}
	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}
	@Override
	public String toString() {
		return "SpecColumnVO [columnId=" + columnId + ", columnName="
				+ columnName + ", columnValue=" + columnValue + "]";
	}
	
}
