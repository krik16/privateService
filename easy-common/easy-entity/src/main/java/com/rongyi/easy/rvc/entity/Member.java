package com.rongyi.easy.rvc.entity;

import java.util.Date;

public class Member implements java.io.Serializable {
  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  /** 表ID */
  private Long id;

  /** 会员编号 */
  private String memberNo;

  /** 会员真实姓名 */
  private String realName;

  /** 昵称 */
  private String nickName;

  /** 性别: M=Male男性, F=Female女性 */
  private String gender;

  /** 身份证号 */
  private String identify;

  /**  */
  private String email;

  /** 手机号 */
  private String mobile;

  /**  */
  private String password;

  /** 积分 */
  private Integer integral;

  /** 注册时间 */
  private Date registTime;

  /** 固定电话 */
  private String telephone;

  /** QQ号 */
  private String qq;

  /** 地址 */
  private String address;

  /** 邮编 */
  private String postCode;

  /** 微信 */
  private String weixin;

  /** 支付宝帐号 */
  private String alipayId;

  /** 微博 */
  private String weiboId;

  /** 头像 */
  private String avatarUrl;

  /** 备注 */
  private String memo;

  /** 最后领卡时间 */
  private Date cardFetchTime;

  /** 会员类型 */
  private Integer memberType;

  /** 国家 */
  private String contry;

  /** 省 */
  private String province;

  /** 城市 */
  private String city;

  /** 区域 */
  private String district;

  /** 商场ID */
  private String mallId;

  /** 渠道：1微信，2终端，3APP */
  private Integer channel;

  /** 软件提供商ID */
  private String ownerId;

  /** 生成时间 */
  private Date insDt;

  /** 更新时间 */
  private Date updDt;

  /** 首次消费时间 */
  private Date firstConsumeTime;

  /** 集团ID */
  private String groupId;

  /** 会员生日 */
  private Date birthday;

  /** 最后交易时间 */
  private Date lastConsumeTime;

  /** 会员等级 描述 */
  private String memberLevel;
  /**
   * 会员等级
   */
  private String grade;

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  /**
   * 表ID
   * 
   * @return id
   */
  public Long getId() {
    return id;
  }

  /**
   * 表ID
   * 
   * @param id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * 会员编号
   * 
   * @return memberNo
   */
  public String getMemberNo() {
    return memberNo;
  }

  /**
   * 会员编号
   * 
   * @param memberNo
   */
  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }

  /**
   * 会员真实姓名
   * 
   * @return realName
   */
  public String getRealName() {
    return realName;
  }

  /**
   * 会员真实姓名
   * 
   * @param realName
   */
  public void setRealName(String realName) {
    this.realName = realName;
  }

  /**
   * 昵称
   * 
   * @return nickName
   */
  public String getNickName() {
    return nickName;
  }

  /**
   * 昵称
   * 
   * @param nickName
   */
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  /**
   * 性别: M=Male男性, F=Female女性
   * 
   * @return gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * 性别: M=Male男性, F=Female女性
   * 
   * @param gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * 身份证号
   * 
   * @return identify
   */
  public String getIdentify() {
    return identify;
  }

  /**
   * 身份证号
   * 
   * @param identify
   */
  public void setIdentify(String identify) {
    this.identify = identify;
  }

  /**
   * 
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * 
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * 手机号
   * 
   * @return mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * 手机号
   * 
   * @param mobile
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * 
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * 
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * 积分
   * 
   * @return integral
   */
  public Integer getIntegral() {
    return integral;
  }

  /**
   * 积分
   * 
   * @param integral
   */
  public void setIntegral(Integer integral) {
    this.integral = integral;
  }

  /**
   * 注册时间
   * 
   * @return registTime
   */
  public Date getRegistTime() {
    return registTime;
  }

  /**
   * 注册时间
   * 
   * @param registTime
   */
  public void setRegistTime(Date registTime) {
    this.registTime = registTime;
  }

  /**
   * 固定电话
   * 
   * @return telephone
   */
  public String getTelephone() {
    return telephone;
  }

  /**
   * 固定电话
   * 
   * @param telephone
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   * QQ号
   * 
   * @return qq
   */
  public String getQq() {
    return qq;
  }

  /**
   * QQ号
   * 
   * @param qq
   */
  public void setQq(String qq) {
    this.qq = qq;
  }

  /**
   * 地址
   * 
   * @return address
   */
  public String getAddress() {
    return address;
  }

  /**
   * 地址
   * 
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * 邮编
   * 
   * @return postCode
   */
  public String getPostCode() {
    return postCode;
  }

  /**
   * 邮编
   * 
   * @param postCode
   */
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  /**
   * 微信
   * 
   * @return weixin
   */
  public String getWeixin() {
    return weixin;
  }

  /**
   * 微信
   * 
   * @param weixin
   */
  public void setWeixin(String weixin) {
    this.weixin = weixin;
  }

  /**
   * 支付宝帐号
   * 
   * @return alipayId
   */
  public String getAlipayId() {
    return alipayId;
  }

  /**
   * 支付宝帐号
   * 
   * @param alipayId
   */
  public void setAlipayId(String alipayId) {
    this.alipayId = alipayId;
  }

  /**
   * 微博
   * 
   * @return weiboId
   */
  public String getWeiboId() {
    return weiboId;
  }

  /**
   * 微博
   * 
   * @param weiboId
   */
  public void setWeiboId(String weiboId) {
    this.weiboId = weiboId;
  }

  /**
   * 头像
   * 
   * @return avatarUrl
   */
  public String getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * 头像
   * 
   * @param avatarUrl
   */
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * 备注
   * 
   * @return memo
   */
  public String getMemo() {
    return memo;
  }

  /**
   * 备注
   * 
   * @param memo
   */
  public void setMemo(String memo) {
    this.memo = memo;
  }

  /**
   * 最后领卡时间
   * 
   * @return cardFetchTime
   */
  public Date getCardFetchTime() {
    return cardFetchTime;
  }

  /**
   * 最后领卡时间
   * 
   * @param cardFetchTime
   */
  public void setCardFetchTime(Date cardFetchTime) {
    this.cardFetchTime = cardFetchTime;
  }

  /**
   * 会员类型
   * 
   * @return memberType
   */
  public Integer getMemberType() {
    return memberType;
  }

  /**
   * 会员类型
   * 
   * @param memberType
   */
  public void setMemberType(Integer memberType) {
    this.memberType = memberType;
  }

  /**
   * 国家
   * 
   * @return contry
   */
  public String getContry() {
    return contry;
  }

  /**
   * 国家
   * 
   * @param contry
   */
  public void setContry(String contry) {
    this.contry = contry;
  }

  /**
   * 省
   * 
   * @return province
   */
  public String getProvince() {
    return province;
  }

  /**
   * 省
   * 
   * @param province
   */
  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * 城市
   * 
   * @return city
   */
  public String getCity() {
    return city;
  }

  /**
   * 城市
   * 
   * @param city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * 区域
   * 
   * @return district
   */
  public String getDistrict() {
    return district;
  }

  /**
   * 区域
   * 
   * @param district
   */
  public void setDistrict(String district) {
    this.district = district;
  }

  /**
   * 商场ID
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 商场ID
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  /**
   * 渠道：1微信，2终端，3APP
   * 
   * @return channel
   */
  public Integer getChannel() {
    return channel;
  }

  /**
   * 渠道：1微信，2终端，3APP
   * 
   * @param channel
   */
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  /**
   * 软件提供商ID
   * 
   * @return ownerId
   */
  public String getOwnerId() {
    return ownerId;
  }

  /**
   * 软件提供商ID
   * 
   * @param ownerId
   */
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * 生成时间
   * 
   * @return insDt
   */
  public Date getInsDt() {
    return insDt;
  }

  /**
   * 生成时间
   * 
   * @param insDt
   */
  public void setInsDt(Date insDt) {
    this.insDt = insDt;
  }

  /**
   * 更新时间
   * 
   * @return updDt
   */
  public Date getUpdDt() {
    return updDt;
  }

  /**
   * 更新时间
   * 
   * @param updDt
   */
  public void setUpdDt(Date updDt) {
    this.updDt = updDt;
  }

  /**
   * 首次消费时间
   * 
   * @return firstConsumeTime
   */
  public Date getFirstConsumeTime() {
    return firstConsumeTime;
  }

  /**
   * 首次消费时间
   * 
   * @param firstConsumeTime
   */
  public void setFirstConsumeTime(Date firstConsumeTime) {
    this.firstConsumeTime = firstConsumeTime;
  }

  /**
   * 集团ID
   * 
   * @return groupId
   */
  public String getGroupId() {
    return groupId;
  }

  /**
   * 集团ID
   * 
   * @param groupId
   */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   * 会员生日
   * 
   * @return birthday
   */
  public Date getBirthday() {
    return birthday;
  }

  /**
   * 会员生日
   * 
   * @param birthday
   */
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   * 最后交易时间
   * 
   * @return lastConsumeTime
   */
  public Date getLastConsumeTime() {
    return lastConsumeTime;
  }

  /**
   * 最后交易时间
   * 
   * @param lastConsumeTime
   */
  public void setLastConsumeTime(Date lastConsumeTime) {
    this.lastConsumeTime = lastConsumeTime;
  }

  /**
   * 会员等级
   * 
   * @return memberLevel
   */
  public String getMemberLevel() {
    return memberLevel;
  }

  /**
   * 会员等级
   * 
   * @param memberLevel
   */
  public void setMemberLevel(String memberLevel) {
    this.memberLevel = memberLevel;
  }
}
