package com.rongyi.easy.content.entity.param;

import java.io.Serializable;

/**
 * 推荐版块请求参数
 * @author WZH
 *
 */
public class ContentForumParam implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private String forumCode;// 版块代码

	private String currentPage; // 从0页开始
	private String pageSize; // 每页数据显示数量

	private String version="0";  //默认老版本 1新版本

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getForumCode() {
		return forumCode;
	}

	public void setForumCode(String forumCode) {
		this.forumCode = forumCode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ContentForumParam [forumCode=" + forumCode + ", currentPage="
				+ currentPage + ", pageSize=" + pageSize + ", version="
				+ version + "]";
	}
}
