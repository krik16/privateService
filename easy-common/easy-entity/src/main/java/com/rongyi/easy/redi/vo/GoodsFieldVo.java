package com.rongyi.easy.redi.vo;

import java.util.List;

public class GoodsFieldVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	 /** */
    private String field;
    
    private List<String> values ;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
    
    
    
  
	

	
	
}