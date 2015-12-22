package com.rongyi.easy.notice.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 店铺公告实体
 * @author lijing
 * @time 2015-09-09
 *
 */
public class NoticeEntity implements Serializable{
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
    /**修改人*/
    private String updateUserid;
    /**版本*/
    private Integer version;
    /**修改时间*/
    private Date updateAt;
    /**是否删除 false 没有删除   true 删除了*/
    private Boolean isDeleted;
    /**公告状态   0正常  1已下线*/
    private Integer noticeStatus;
   /**自动审核时间*/
    private Date autoCheckAt;

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

    public String getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Date getAutoCheckAt() {
        return autoCheckAt;
    }

    public void setAutoCheckAt(Date autoCheckAt) {
        this.autoCheckAt = autoCheckAt;
    }
}