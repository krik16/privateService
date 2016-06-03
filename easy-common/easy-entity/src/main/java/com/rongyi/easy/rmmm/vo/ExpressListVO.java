package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author WZH
 * 
 *   
 * 
 */
public class ExpressListVO extends PageVO implements Serializable {

	private List<ExpressVO> list;

	public List<ExpressVO> getList() {
		return list;
	}

	public void setList(List<ExpressVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ExpressListVO [list=" + list + "]";
	}
}
