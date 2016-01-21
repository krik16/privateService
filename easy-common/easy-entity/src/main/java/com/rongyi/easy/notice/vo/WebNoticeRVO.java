package com.rongyi.easy.notice.vo;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.core.common.util.DateTool;

public class WebNoticeRVO implements Serializable{
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
    /**状态	0有效，1无效*/
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
	public String getCreateAt() {
		return DateTool.date2String(createAt, DateTool.FORMAT_DATETIME2);
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
		return "WebNoticeRVO [id=" + id + ", noticeId=" + noticeId
				+ ", reason=" + reason + ", createAt=" + createAt
				+ ", createUser=" + createUser + ", status=" + status + "]";
	}
	
    
}
