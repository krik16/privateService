package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class CommodityCommentPageVO  implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5237213517350700176L;
	
	private int commentCount;//
	private int praiseCount;//好评的数量
	private int totalPage;//
	private int pageSize;//
	private int currentPage;//
	private List<CommodityCommentVO> comments;
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(int praiseCount) {
		this.praiseCount = praiseCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public List<CommodityCommentVO> getComments() {
		return comments;
	}
	public void setComments(List<CommodityCommentVO> comments) {
		this.comments = comments;
	}

}
