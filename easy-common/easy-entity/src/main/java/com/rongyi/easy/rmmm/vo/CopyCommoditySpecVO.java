package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
/**
 * 抄同款商品规格返回
 * @author user
 *
 */
public class CopyCommoditySpecVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String columnName;//规格名
	
	private String columnValue;//规格名对应的值

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
		return "CopyCommoditySpecVO [columnName=" + columnName
				+ ", columnValue=" + columnValue + "]";
	}
	
}
