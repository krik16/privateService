package com.rongyi.easy.activity.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("push_task")
public class PushTask implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private ObjectId id;
	
	private String name;    //名称
	
	@Property("task_type")
	private int taskType;	//任务类型
	
	private String content; //推送内容
	
	private int status;	//状态
	
	@Property("push_at")
	private Date pushDate;//推送时间
	
	@Property("create_at")
	private Date createDate;//创建时间
	
	@Property("update_at")
	private Date updateDate;//更新时间
	
	@Property("create_user")
	private String createUser;//创建用户
	
	@Property("update_user")
	private String updateUser;//更新用户
	
	@Embedded
	private List<PushCoupon> coupons;//对应的优惠券现金卷列表

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaskType() {
		return taskType;
	}

	public void setTaskType(int taskType) {
		this.taskType = taskType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getPushDate() {
		return pushDate;
	}

	public void setPushDate(Date pushDate) {
		this.pushDate = pushDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public List<PushCoupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<PushCoupon> coupons) {
		this.coupons = coupons;
	}

	
	
}
