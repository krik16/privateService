package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 公告 VO
 * 
 * @author chenjun
 * 
 */
public class NoticeVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String notice;// 公告内容

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

}
