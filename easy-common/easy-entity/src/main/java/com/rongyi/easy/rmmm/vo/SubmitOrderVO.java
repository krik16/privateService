package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class SubmitOrderVO implements Serializable {

	private List<String> parentOrderNumList;// 父订单号集合

	public List<String> getParentOrderNumList() {
		return parentOrderNumList;
	}

	public void setParentOrderNumList(List<String> parentOrderNumList) {
		this.parentOrderNumList = parentOrderNumList;
	}

}
