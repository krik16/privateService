package com.rongyi.easy.notice.vo;


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
	/**公告状态   0正常  1已下线*/
	private Integer noticeStatus;
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
    /**审核不通过内容*/
    private List<NoticeRecordEntity> reasonSta;
	/**下线内容*/
	private List<NoticeRecordEntity> noticeReasonSta;
    /**创建人*/
    private String createUser;
    
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

	public List<NoticeRecordEntity> getNoticeReasonSta() {
		return noticeReasonSta;
	}

	public void setNoticeReasonSta(List<NoticeRecordEntity> noticeReasonSta) {
		this.noticeReasonSta = noticeReasonSta;
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
	
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getNoticeStatus() {
		return noticeStatus;
	}

	public void setNoticeStatus(Integer noticeStatus) {
		this.noticeStatus = noticeStatus;
	}

	@Override
	public String toString() {
		return "MMNoticeVO [id=" + id + ", content=" + content + ", shopName="
				+ shopName + ", shopMid=" + shopMid + ", status=" + status
				+ ", publishBeginAt=" + publishBeginAt + ", publishEndAt="
				+ publishEndAt + ", createUserid=" + createUserid
				+ ", createAt=" + createAt + ", praiseCount=" + praiseCount
				+ ", picList=" + picList + ", updateAt=" + updateAt
				+ ", reasonSta=" + reasonSta + ",noticeStatus="+ noticeStatus +",noticeReasonSta="+ noticeReasonSta +", createUser=" + createUser
				+ "]";
	}
	
}
