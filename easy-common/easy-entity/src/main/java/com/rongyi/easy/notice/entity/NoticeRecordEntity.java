package com.rongyi.easy.notice.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 店铺公告
 * @author lijing
 * @time 2015-09-09
 *
 */
public class NoticeRecordEntity implements Serializable{
	/**id*/
    private Integer id;
    /**店铺公告id*/
    private Integer noticeId;
    /**审核不通过原因*/
    private String reason;
    /**创建时间*/
    private Date createAt;
    /**创建人*/
    private String createUser;
    /**状态	1审核通过  2审核不通过   3 下线*/
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "NoticeRecordEntity [id=" + id + ", noticeId=" + noticeId
				+ ", reason=" + reason + ", createAt=" + createAt
				+ ", createUser=" + createUser + ", status=" + status + "]";
	}
    
    
}