/*

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

    /*/
/* 环信账户ID

	@Property("im_id")
	private String IMId;
	@Property("nickname")
	private String nickname;// 卖家昵称

	@Property("usual_address")
	private String usualAddress;

	@Property("channel")
	private String channel;

	private String devUuid;//设备Id号 uuid

	private String idfa; //

	@Property("device_type")
    private String deviceType; //设备型号

	@Property("terminal_type")
	private String terminalType;//终端平台 IOS || android


	private Integer sex;

	@Property("authentication_token")
	private String token;


	@Property("login_red")
	private Integer isLoginRed;

	@Property("updated_at")
	private Date updatedAt;

	@Property("created_at")
	private Date createdAt;

	@Property("push_channel_id")
	private String pushChanelId;//百度推送Id

	@Property("last_sign_in_at")
	private Date lastSignInAt; //最新登录时间
	@Property("last_sign_in_ip")
	private String   lastSignInIp;//最新登录Ip地址

	@Property("share_code")
	private String shareCode;//摩店邀请注册码

	@Property("regist_in_ip")
	private String   registInIp;//注册IP

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

	public String getPushChanelId() {
		return pushChanelId;
	}

	public void setPushChanelId(String pushChanelId) {
		this.pushChanelId = pushChanelId;
	}

	public Date getLastSignInAt() {
		return lastSignInAt;
	}

	public void setLastSignInAt(Date lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public String getLastSignInIp() {
		return lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
	}

	public String getShareCode() {
		return shareCode;
	}

	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}

	public String getRegistInIp() {
		return registInIp;
	}

	public void setRegistInIp(String registInIp) {
		this.registInIp = registInIp;
	}

	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
}

*/
