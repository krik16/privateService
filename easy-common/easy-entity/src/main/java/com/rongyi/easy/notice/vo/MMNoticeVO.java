package com.rongyi.easy.notice.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.rongyi.easy.notice.entity.NoticeRecordEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 
 * @author lijing
 * @time 2015-09-14
 *
 */
public class MMNoticeVO implements Serializable{
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
    private Integer praiseCount;
    /**图片集合*/
    private List<String> picList;
    /**修改时间*/
    private Date updateAt;
    /**ze*/
    private List<NoticeRecordEntity> reasonSta;
    
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
	public Integer getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(Integer praiseCount) {
		this.praiseCount = praiseCount;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}

		public Date getUpdateAt() {
		return updateAt;
	}
		
	public List<NoticeRecordEntity> getReasonSta() {
			return reasonSta;
		}
		public void setReasonSta(List<NoticeRecordEntity> reasonSta) {
			this.reasonSta = reasonSta;
		}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
		@Override
		public String toString() {
				return new ToStringBuilder(this).append("id", id).append("content", content).append("shopName", shopName).append("shopMid", shopMid).append("status", status).append("publishBeginAt", publishBeginAt).append("publishEndAt", publishEndAt).append("createUserid", createUserid).append("createAt", createAt).append("praiseCount", praiseCount).append("picList", picList).append("updateAt",updateAt).toString();
		}
}
