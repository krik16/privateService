package com.rongyi.easy.notice.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MSNoticeVO implements Serializable{
	/**id*/
    private Integer id;
    /**公告内容*/
    private String content;
    /**店铺名字*/
    private String shopName;
    /**店铺id*/
    private String shopMid;
    /**状态0待审核 1审核通过 2 未通过*/
    private Integer status;
    /**发布时间*/
    private Date publishBeginAt;
    /**结束时间*/
    private Date publishEndAt;
    /**创建人id*/
    private String createUserid;
    /**创建时间*/
    private Date createAt;
    
     
    /**用户点赞总量*/
    private Long praiseCount;
    /**图片集合*/
    private List<String> picList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getPublishBeginAt() {
		return publishBeginAt;
	}
	public void setPublishBeginAt(Date publishBeginAt) {
		this.publishBeginAt = publishBeginAt;
	}
	public Date getPublishEndAt() {
		return publishEndAt;
	}
	public void setPublishEndAt(Date publishEndAt) {
		this.publishEndAt = publishEndAt;
	}
	public String getCreateUserid() {
		return createUserid;
	}
	public void setCreateUserid(String createUserid) {
		this.createUserid = createUserid;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Long getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(Long praiseCount) {
		this.praiseCount = praiseCount;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}
    
    
}
