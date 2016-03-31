package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value="mcmc_commodity_comment",noClassnameStored=true)
public class CommodityComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6485844585603479486L;
	@Id
	private ObjectId id;
	private ObjectId commodityId;// 商品编号
	private ObjectId specId;// 规格编号，可能为空
	private int commentLevel;// 好评1 中评2 差评3
	private String commentContent;// 评价内容
	private Date createAt;// 数据创建日期
	private String username;// 评价人用户名
	private String userlogo;// 评价人头像url地址
	private String userid;// 评价人用户id（预留，暂未使用）

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	private List<String> picList;

	public List<String> getPicList() {
		return picList;
	}

	public void setPicList(List<String> picList) {
		this.picList = picList;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getTranDate() {
		return tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	private Date tranDate;// 用户购买时间

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(ObjectId commodityId) {
		this.commodityId = commodityId;
	}

	public ObjectId getSpecId() {
		return specId;
	}

	public void setSpecId(ObjectId specId) {
		this.specId = specId;
	}

	public int getCommentLevel() {
		return commentLevel;
	}

	public void setCommentLevel(int commentLevel) {
		this.commentLevel = commentLevel;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserlogo() {
		return userlogo;
	}

	public void setUserlogo(String userlogo) {
		this.userlogo = userlogo;
	}

}
