package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class MMValidHistoryListVO extends PageVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<MMValidHistoryVO> validHistoryVOList;

	public List<MMValidHistoryVO> getValidHistoryVOList() {
		return validHistoryVOList;
	}

	public void setValidHistoryVOList(List<MMValidHistoryVO> validHistoryVOList) {
		this.validHistoryVOList = validHistoryVOList;
	}
	
}
