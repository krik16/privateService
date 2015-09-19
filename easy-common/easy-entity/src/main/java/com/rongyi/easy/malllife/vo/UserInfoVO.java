package com.rongyi.easy.malllife.vo;

import com.rongyi.easy.huanxin.HuanXinConfig;

import java.io.Serializable;
import java.util.Set;

public class UserInfoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;// 表id
	private String userName;
	private String password;
	private String email;
	private String userPhone;
	private String headImg;
	private String uid;// 用戶登錄名
	private String openId;
	private String nickName;// 呢称

	private String imId;// IM账户

	private String usualAddress;
	private boolean hasBindingPhone = false;
	private int sex;
	private long credit;

	private String devUuid;

	private String hasPwd;

	private String appCode = HuanXinConfig.IMCODE_SECOND;

	private Boolean ischeck = false;

	private int isLoginRed;// 是否领过红包

	private String devId;// 登录时设备的ID

	private Set<String> collectCommoditys;// 收藏的商品编号

	private String       pushChanelId;//百度推送服务ID app传给后台
	private String      lastSignInIp;//最新登录Ip地址
	private String channel;// 容易逛(MALLLIFE),其他第三方全民财富（QMCAIFU）


	private String shareCode;//摩店邀请注册码


	public String getPushChanelId() {
		return pushChanelId;
	}

	public void setPushChanelId(String pushChanelId) {
		this.pushChanelId = pushChanelId;
	}

	public String getLastSignInIp() {
		return lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getImId() {
		return imId;
	}

	public void setImId(String imId) {
		this.imId = imId;
	}

	public String getUsualAddress() {
		return usualAddress;
	}

	public void setUsualAddress(String usualAddress) {
		this.usualAddress = usualAddress;
	}

	public boolean isHasBindingPhone() {
		return hasBindingPhone;
	}

	public void setHasBindingPhone(boolean hasBindingPhone) {
		this.hasBindingPhone = hasBindingPhone;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public long getCredit() {
		return credit;
	}

	public void setCredit(long credit) {
		this.credit = credit;
	}

	public String getDevUuid() {
		return devUuid;
	}

	public void setDevUuid(String devUuid) {
		this.devUuid = devUuid;
	}

	public String getHasPwd() {
		return hasPwd;
	}

	public void setHasPwd(String hasPwd) {
		this.hasPwd = hasPwd;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public Boolean getIscheck() {
		return ischeck;
	}

	public void setIscheck(Boolean ischeck) {
		this.ischeck = ischeck;
	}

	public int getIsLoginRed() {
		return isLoginRed;
	}

	public void setIsLoginRed(int isLoginRed) {
		this.isLoginRed = isLoginRed;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Set<String> getCollectCommoditys() {
		return collectCommoditys;
	}

	public void setCollectCommoditys(Set<String> collectCommoditys) {
		this.collectCommoditys = collectCommoditys;
	}

	public String getSharCode() {
		return shareCode;
	}

	public void setSharCode(String sharCode) {
		this.shareCode = sharCode;
	}
}
