package com.rongyi.easy.redi.vo;

import java.util.List;

public class StanVo  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer typeId ;
	
	private String name ;
	
	private List<ValuesVo>  valuesList ;


	public List<ValuesVo> getValuesList() {
		return valuesList;
	}

	public void setValuesList(List<ValuesVo> valuesList) {
		this.valuesList = valuesList;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
