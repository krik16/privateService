package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author WZH
 * 
 *         合作商场列表VO
 * 
 */
public class ExpressListVO extends PageVO implements Serializable {

	private List<ExpressVO> list;
	
	private List<ExpressVO> commonList;//常用物流公司列表
	
	private List<ExpressVO> expressList;//快递公司列表

	public List<ExpressVO> getCommonList() {
		return commonList;
	}

	public void setCommonList(List<ExpressVO> commonList) {
		this.commonList = commonList;
	}

	public List<ExpressVO> getExpressList() {
		return expressList;
	}

	public void setExpressList(List<ExpressVO> expressList) {
		this.expressList = expressList;
	}

	public List<ExpressVO> getList() {
		return list;
	}

	public void setList(List<ExpressVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ExpressListVO [list=" + list + ", commonList=" + commonList
				+ ", expressList=" + expressList + "]";
	}
}
