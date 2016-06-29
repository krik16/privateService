package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ExpressList2VO implements Serializable {
	
	private List<Express2VO> commonList;//常用物流公司列表
	
	private List<Express2VO> expressList;//快递公司列表

	public List<Express2VO> getCommonList() {
		return commonList;
	}

	public void setCommonList(List<Express2VO> commonList) {
		this.commonList = commonList;
	}

	public List<Express2VO> getExpressList() {
		return expressList;
	}

	public void setExpressList(List<Express2VO> expressList) {
		this.expressList = expressList;
	}

	@Override
	public String toString() {
		return "ExpressList2VO [commonList=" + commonList + ", expressList="
				+ expressList + "]";
	}
}
