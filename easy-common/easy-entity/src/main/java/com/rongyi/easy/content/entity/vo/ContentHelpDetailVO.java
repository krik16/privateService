package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;

public class ContentHelpDetailVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String helpTitle;//帮助标题
	private String helpComment;//帮助内容
	
	public String getHelpTitle() {
		return helpTitle;
	}
	public void setHelpTitle(String helpTitle) {
		this.helpTitle = helpTitle;
	}
	public String getHelpComment() {
		return helpComment;
	}
	public void setHelpComment(String helpComment) {
		this.helpComment = helpComment;
	}
	
}
