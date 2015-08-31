package com.rongyi.easy.entity;


import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity(value = "users", noClassnameStored = true)
public class MallLifeUserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;// 表id
	 @Property("name")
	 private String userName;
	@Property("encrypted_password")
	private String password;// 加密后的
	private String email;
	private String phone;
	@Property("avatar")
	private String headImg;
	private String uid;// 用戶登錄名
	@Property("open_id")
	private String openId;
	@Property("collect_commoditys")
	private Set<String> collectCommoditys;// 收藏的商品编号
	/** 环信账户ID */
	@Property("im_id")
	private String IMId;
	@Property("nickname")
	private String nickname;// 卖家昵称

	@Property("usual_address")
	private String usualAddress;

	private String channel;

	private Integer sex;

	private String devUuid;//设备Id号

	@Property("authentication_token")
	private String token;


	@Property("login_red")
	private Integer isLoginRed;




	@Property("updated_at")
	private Date updatedAt;

	@Property("created_at")
	private Date createdAt;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	 public String getUserName() {
	 return userName;
	 }
	
	 public void setUserName(String userName) {
	 this.userName = userName;
	 }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIMId() {
		return IMId;
	}

	public void setIMId(String iMId) {
		IMId = iMId;
	}

	public Set<String> getCollectCommoditys() {
		return collectCommoditys;
	}

	public void setCollectCommoditys(Set<String> collectCommoditys) {
		this.collectCommoditys = collectCommoditys;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getUsualAddress() {
		return usualAddress;
	}

	public void setUsualAddress(String usualAddress) {
		this.usualAddress = usualAddress;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getDevUuid() {
		return devUuid;
	}

	public void setDevUuid(String devUuid) {
		this.devUuid = devUuid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public Integer getIsLoginRed() {
		return isLoginRed;
	}

	public void setIsLoginRed(Integer isLoginRed) {
		this.isLoginRed = isLoginRed;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
