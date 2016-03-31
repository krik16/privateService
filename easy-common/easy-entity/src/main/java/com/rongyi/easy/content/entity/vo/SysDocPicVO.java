
package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;

/**
 * 推荐版块内容图片返回数据
 * @author WZH
 *
 */
public class SysDocPicVO implements Serializable{
	
	public static final long serialVersionUID = 1L;

	private String fileTitle;

	private String fileUrl;

	private Integer fileSort;

	public String getFileTitle() {
		return fileTitle;
	}

	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Integer getFileSort() {
		return fileSort;
	}

	public void setFileSort(Integer fileSort) {
		this.fileSort = fileSort;
	}

}
