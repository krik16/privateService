package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ExclusiveGuideListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<UserExclusiveGuideVO> userExclusiveGuideList;

	public List<UserExclusiveGuideVO> getUserExclusiveGuideList() {
		return userExclusiveGuideList;
	}

	public void setUserExclusiveGuideList(
			List<UserExclusiveGuideVO> userExclusiveGuideList) {
		this.userExclusiveGuideList = userExclusiveGuideList;
	}
	
}
