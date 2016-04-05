package com.rongyi.easy.activitymanage.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 审核记录
 * 
 * @author wangjh
 * @date 2016年3月16日
 */
public class ActivityGoodsCheckRecordVO implements Serializable {

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public Integer getActivityGoodsId() {
		return activityGoodsId;
	}
	public void setActivityGoodsId(Integer activityGoodsId) {
		this.activityGoodsId = activityGoodsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 8526421406547603783L;

	private Integer id;
	private Integer activityId;
	private Integer activityGoodsId;
	private String content;
	private String createUser;
	private Date createdAt;
}
