package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;

public class CommodityCommentParam implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1917095448754132191L;
	private String sonOrderId;//子订单ID
	private String commodityId;
	private String specId;
	private String userlogo;
	private String nickname;
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserlogo() {
		return userlogo;
	}
	public void setUserlogo(String userlogo) {
		this.userlogo = userlogo;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	private int commentLevel;//评价级别1好评，2中评，3差评",
	private String commentDetail;//评价内容",
	private List<String> commentPicList;
	public String getSonOrderId() {
		return sonOrderId;
	}
	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}
	public int getCommentLevel() {
		return commentLevel;
	}
	public void setCommentLevel(int commentLevel) {
		this.commentLevel = commentLevel;
	}
	public String getCommentDetail() {
		return commentDetail;
	}
	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}
	public List<String> getCommentPicList() {
		return commentPicList;
	}
	public void setCommentPicList(List<String> commentPicList) {
		this.commentPicList = commentPicList;
	}
	

}
