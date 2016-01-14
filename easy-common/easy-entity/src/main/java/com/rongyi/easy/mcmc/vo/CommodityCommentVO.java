package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.CommodityComment;

import java.io.Serializable;
import java.util.List;

public class CommodityCommentVO  implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4198839633282715971L;

	private String userAvatar;//头像url
	private String userName;//昵称
	private String createdTime;//评价时间
	private String content;//评价内容
	private String purchaseTime;//购买日期
	private String specId;//我是规格编号
	private List<CommoditySpecColumnVO> specColumnValues;
	private int type;//1好评，2中评，3差评
	private String commodityId;
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public CommodityCommentVO(){
		
	}
	public CommodityCommentVO(CommodityComment comment){
		this.userAvatar = comment.getUserlogo();
		this.userName = comment.getUsername();
		this.content = comment.getCommentContent();
		this.specId = comment.getSpecId().toString();
		this.type = comment.getCommentLevel();
		this.commodityPictures = comment.getPicList();
		this.commodityId = comment.getCommodityId().toString();
	}
	public String getUserAvatar() {
		return userAvatar;
	}
	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPurchaseTime() {
		return purchaseTime;
	}
	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}
	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}
	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	private List<String> commodityPictures;

	public List<String> getCommodityPictures() {
		return commodityPictures;
	}
	public void setCommodityPictures(List<String> commodityPictures) {
		this.commodityPictures = commodityPictures;
	}
	
	
}
