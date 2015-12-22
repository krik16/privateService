package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ExclusiveGuideListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<UserExclusiveGuideVO> list;

	public List<UserExclusiveGuideVO> getList() {
		return list;
	}

	public void setList(List<UserExclusiveGuideVO> list) {
		this.list = list;
	}
	
}
