package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;

public class ContentHelpNameVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String helpId;//帮助id
	private String helpTitle;//帮助标题
	
	public String getHelpId() {
		return helpId;
	}
	public void setHelpId(String helpId) {
		this.helpId = helpId;
	}
	public String getHelpTitle() {
		return helpTitle;
	}
	public void setHelpTitle(String helpTitle) {
		this.helpTitle = helpTitle;
	}
	
}
