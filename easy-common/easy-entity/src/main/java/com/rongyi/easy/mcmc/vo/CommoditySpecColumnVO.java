package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

import com.rongyi.easy.mcmc.CommoditySpecColumn;
import org.apache.commons.lang.builder.ToStringBuilder;


public class CommoditySpecColumnVO implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 302492299841268843L;

	private String columnId;
	private String columnName;
	private String columnValue;
	private String columnNote;//规格备注
	private boolean isRequired;
	
	public CommoditySpecColumnVO(){
		
	}
	public CommoditySpecColumnVO(CommoditySpecColumn specColumn){
		if(specColumn != null){
			this.columnId = specColumn.getId().toString();
			this.columnName = specColumn.getName();
			this.isRequired = specColumn.isRequired();
		}
	}
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
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("columnId", columnId)
				.append("columnName", columnName)
				.append("columnValue", columnValue)
				.append("columnNote", columnNote)
				.append("isRequired", isRequired)
				.toString();
	}

	public String getColumnNote() {
		return columnNote;
	}
	public void setColumnNote(String columnNote) {
		this.columnNote = columnNote;
	}

}
