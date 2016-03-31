package com.rongyi.easy.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员信息
 * 
 * @author baodk
 */
@Entity(value = "rmc_member_info", noClassnameStored = true)
public class MemberInformationDel implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  /** 用户ID */
  @Property("user_id")
  private String userId;

  /** 微信会员订阅号ID */
  @Property("open_id")
  private String openId;

  /** 软件提供商ID */
  @Property("owner_id")
  private String ownerId;

  /** 发行服务商id==集团ID */
  @Property("facilitator_id")
  private String facilitatorId;

  /** 容易网商场ID */
  @Property("mall_id")
  private String mallId;
  /** 发行商场id */
  // @Property("market_id")
  // private String marketId;

  /** 发行店铺id==容易网的店铺ID */
  @Property("shop_id")
  private String shopId;

  /** 会员名 */
  private String name;

  /** 会员密码 */
  private String password;

  /** 会员编号 */
  @Property("member_no")
  private String memberNo;

  /** 会员类型 */
  @Property("member_type")
  private String memberType;

  /** 会员昵称 */
  @Property("nick_name")
  private String nickName;

  /** 会员等级 */
  private String rank;
  /**
   * 身份证
   */
  private String identity;

  /** 会员群组 */
  // @Property("group_id")
  // private String groupId;


  /** 注册时间 */
  @Property("registration_time")
  private Date registrationTime;

  /** 激活时间 */
  @Property("activation_time")
  private Date activationTime;

  /** 失效时间 */
  @Property("expire_time")
  private Date expireTime;

  /** 发行终端收银机ID */
  @Property("terminal_id")
  private String terminalId;

  /** 当前状态(有效，无效等) */
  private Integer status;

  /** 最后更新日期 */
  @Property("last_updated_time")
  private Date lastUpdatedTime;

  /** 是否接受促销信息（短信） */
  @Property("receive_sms")
  private boolean receiveSms;

  /** 首次消费日期 */
  @Property("first_consume_time")
  private Date firstConsumeTime;

  /** 上次消费日期 */
  @Property("last_consume_time")
  private Date lastConsumeTime;

  /** 累计消费金额 */
  @Property("consume_amount")
  private Double consumeAmount;

  /** 累计消费次数 */
  @Property("consume_times")
  private Integer consumeTimes;

  /** 会员卡类型（积分卡or储值卡） */
  @Property("card_type")
  private String cardType;

  /** 上次积分清零日期 */
  @Property("last_reset_time")
  private Date lastResetTime;

  /** 会员剩余积分 */
  private Integer integral;

  /** 电子剩余积分 */
  @Property("electronic_integral")
  private Integer electronicIntegral;

  /** 实体剩余积分 */
  @Property("entity_integral")
  private Integer entityIntegral;

  /** 剩余储值金额 */
  @Property("stored_value")
  private Double storedValue;

  /** 头像url */
  @Property("avatar_url")
  private String avatarUrl;

  /** 月收入水平 */
  @Property("income_level")
  private String incomeLevel;

  /** 介绍人会员ID */
  @Property("intro_member_id")
  private String introMemberId;

  /**
   * 绿地的会员卡号码 001开头的是VIP等级， 010开关的是普通等级
   * */
  @Property("vipcardno")
  private String vipcardno;// VIPCARDNO

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getFacilitatorId() {
    return facilitatorId;
  }

  public void setFacilitatorId(String facilitatorId) {
    this.facilitatorId = facilitatorId;
  }

  // public String getMarketId() {
  // return marketId;
  // }
  //
  // public void setMarketId(String marketId) {
  // this.marketId = marketId;
  // }
  //
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
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

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public Date getLastResetTime() {
    return lastResetTime;
  }

  public void setLastResetTime(Date lastResetTime) {
    this.lastResetTime = lastResetTime;
  }

  public Integer getIntegral() {
    return integral;
  }

  public void setIntegral(Integer integral) {
    this.integral = integral;
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

  public Double getStoredValue() {
    return storedValue;
  }

  public void setStoredValue(Double storedValue) {
    this.storedValue = storedValue;
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

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getMemberType() {
    return memberType;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  public String getIncomeLevel() {
    return incomeLevel;
  }

  public void setIncomeLevel(String incomeLevel) {
    this.incomeLevel = incomeLevel;
  }

  public String getIntroMemberId() {
    return introMemberId;
  }

  public void setIntroMemberId(String introMemberId) {
    this.introMemberId = introMemberId;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getVipcardno() {
    return vipcardno;
  }

  public void setVipcardno(String vipcardno) {
    this.vipcardno = vipcardno;
  }

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  @Override
  public String toString() {
    return "MemberInformation [id=" + id + ", userId=" + userId + ", openId=" + openId
        + ", ownerId=" + ownerId + ", facilitatorId=" + facilitatorId + ", mallId=" + mallId
        + ", shopId=" + shopId + ", name=" + name + ", password=" + password + ", memberNo="
        + memberNo + ", memberType=" + memberType + ", nickName=" + nickName + ", rank=" + rank
        + ", registrationTime=" + registrationTime + ", activationTime=" + activationTime
        + ", expireTime=" + expireTime + ", terminalId=" + terminalId + ", status=" + status
        + ", lastUpdatedTime=" + lastUpdatedTime + ", receiveSms=" + receiveSms
        + ", firstConsumeTime=" + firstConsumeTime + ", lastConsumeTime=" + lastConsumeTime
        + ", consumeAmount=" + consumeAmount + ", consumeTimes=" + consumeTimes + ", cardType="
        + cardType + ", lastResetTime=" + lastResetTime + ", integral=" + integral
        + ", identity=" + identity + ", registrationTime=" + registrationTime + ", activationTime="
        + activationTime + ", expireTime=" + expireTime + ", terminalId=" + terminalId
        + ", status=" + status + ", lastUpdatedTime=" + lastUpdatedTime + ", receiveSms="
        + receiveSms + ", firstConsumeTime=" + firstConsumeTime + ", lastConsumeTime="
        + lastConsumeTime + ", consumeAmount=" + consumeAmount + ", consumeTimes=" + consumeTimes
        + ", cardType=" + cardType + ", lastResetTime=" + lastResetTime + ", integral=" + integral
        + ", electronicIntegral=" + electronicIntegral + ", entityIntegral=" + entityIntegral
        + ", storedValue=" + storedValue + ", avatarUrl=" + avatarUrl + ", incomeLevel="
        + incomeLevel + ", introMemberId=" + introMemberId + ", vipcardno=" + vipcardno + "]";
  }



}
