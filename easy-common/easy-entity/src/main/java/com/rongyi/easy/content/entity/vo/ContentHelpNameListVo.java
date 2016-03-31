package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
import java.util.List;

public class ContentHelpNameListVo extends PageVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ContentHelpNameVo> helpNameList;//帮助标题列表

	public List<ContentHelpNameVo> getHelpNameList() {
		return helpNameList;
	}
	public void setHelpNameList(List<ContentHelpNameVo> helpNameList) {
		this.helpNameList = helpNameList;
	}
	
}
