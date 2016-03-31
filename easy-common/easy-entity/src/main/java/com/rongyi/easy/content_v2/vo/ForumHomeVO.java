package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.core.common.util.DateTool;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ForumHomeVO implements Serializable{
	 /**主键id*/
	private Integer id;
    /**内容标题*/
    private String title;
    /**状态 0代表启用，1代表关闭*/
    private Integer status;
    /**顺序（位置） 从1开始*/
    private Integer sortIdx;
  
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
    /**子模版个数*/
    private Integer positionCount;
	private String forumCode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSortIdx() {
		return sortIdx;
	}
	public void setSortIdx(Integer sortIdx) {
		this.sortIdx = sortIdx;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateAt() {
		return DateTool.date2String(updateAt, DateTool.FORMAT_DATETIME2);
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getPositionCount() {
		return positionCount;
	}
	public void setPositionCount(Integer positionCount) {
		this.positionCount = positionCount;
	}

	public String getForumCode() {
		return forumCode;
	}

	public void setForumCode(String forumCode) {
		this.forumCode = forumCode;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("title", title)
				.append("status", status)
				.append("sortIdx", sortIdx)
				.append("updateUser", updateUser)
				.append("updateAt", updateAt)
				.append("positionCount", positionCount)
				.append("forumCode", forumCode)
				.toString();
	}
}
