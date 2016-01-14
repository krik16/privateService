package com.rongyi.easy.mms.param;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 会员信息
 * 
 * @author lim
 */
public class MemberInfo implements Serializable {

	private String id;

	/** 用户ID */
	private String userId;

	/** 微信会员订阅号ID */
	private String openId;

	/** 容易网商场ID */
	private ObjectId mallId;

	/** 会员名 */
	private String name;

	/** 手机号1 */
	private String phone1;

	/** 会员密码 */
	private String password;

	/** 会员编号 */
	private String memberNo;

	/** 会员类型 */
	private String memberType;

	/** 会员昵称 */
	private String nickName;

	/** 会员等级 */
	private String rank;

	/** 会员群组 */
	// private String groupId;

	/** 注册时间 */
	private Date registrationTime;

	/** 激活时间 */
	private Date activationTime;

	/** 失效时间 */
	private Date expireTime;

	/** 发行服务商id */

	/** 当前状态(有效，无效等) */
	private Integer status;

	/** 最后更新日期 */
	private Date lastUpdatedTime;

	/** 是否接受促销信息（短信） */
	private boolean receiveSms;

	/** 首次消费日期 */
	private Date firstConsumeTime;

	/** 上次消费日期 */
	private Date lastConsumeTime;

	/** 累计消费金额 */
	private Double consumeAmount;

	/** 累计消费次数 */
	private Integer consumeTimes;

	/** 会员剩余积分 */
	private Integer integral;

	/** 头像url */
	private String avatarUrl;

	/** 电子剩余积分 */
	private Integer electronicIntegral;

	/** 实体剩余积分 */
	private Integer entityIntegral;
	/** 性别 */
	private String sex;
	/** 会员性质:实体会员1 OR 电子会员2,这个要去MONGO里面的电子会员表查询一下才能知道是哪个性质 */
	private short memberNature;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public ObjectId getMallId() {
		return mallId;
	}

	public void setMallId(ObjectId mallId) {
		this.mallId = mallId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	public Date getActivationTime() {
		return activationTime;
	}

	public void setActivationTime(Date activationTime) {
		this.activationTime = activationTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public boolean isReceiveSms() {
		return receiveSms;
	}

	public void setReceiveSms(boolean receiveSms) {
		this.receiveSms = receiveSms;
	}

	public Date getFirstConsumeTime() {
		return firstConsumeTime;
	}

	public void setFirstConsumeTime(Date firstConsumeTime) {
		this.firstConsumeTime = firstConsumeTime;
	}

	public Date getLastConsumeTime() {
		return lastConsumeTime;
	}

	public void setLastConsumeTime(Date lastConsumeTime) {
		this.lastConsumeTime = lastConsumeTime;
	}

	public Double getConsumeAmount() {
		return consumeAmount;
	}

	public void setConsumeAmount(Double consumeAmount) {
		this.consumeAmount = consumeAmount;
	}

	public Integer getConsumeTimes() {
		return consumeTimes;
	}

	public void setConsumeTimes(Integer consumeTimes) {
		this.consumeTimes = consumeTimes;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Integer getElectronicIntegral() {
		return electronicIntegral;
	}

	public void setElectronicIntegral(Integer electronicIntegral) {
		this.electronicIntegral = electronicIntegral;
	}

	public Integer getEntityIntegral() {
		return entityIntegral;
	}

	public void setEntityIntegral(Integer entityIntegral) {
		this.entityIntegral = entityIntegral;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public short getMemberNature() {
		return memberNature;
	}

	public void setMemberNature(short memberNature) {
		this.memberNature = memberNature;
	}
}
