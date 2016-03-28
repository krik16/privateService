package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ExpressPushVO  implements Serializable{
	
	private String state;//已签收，在途中
	
	private List<ExpressDataVO> expressList;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<ExpressDataVO> getExpressList() {
		return expressList;
	}

	public void setExpressList(List<ExpressDataVO> expressList) {
		this.expressList = expressList;
	}

	@Override
	public String toString() {
		return "ExpressPushVO [state=" + state + ", expressList=" + expressList
				+ "]";
	}

}
