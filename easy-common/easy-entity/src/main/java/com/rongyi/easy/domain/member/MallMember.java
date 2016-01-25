package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * ClassName: MallMember <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 商场会员信息. <br/>
 * date: 2015年8月3日 下午4:04:56 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class MallMember implements Serializable {
  /**
   * serialVersionUID:TODO(用一句话描述这个变量表示什么).
   * 
   * @since JDK 1.6
   */
  private static final long serialVersionUID = 3325996336532182859L;

  /** 用户ID */
  private Integer id;

  /** 商场ID */
  private String mallId;

  /** 会员号 */
  private String memberNo;

  /** 真实姓名 */
  private String name;

  /** 昵称 */
  private String nickname;

  /** 密码 */
  private String password;

  /** 固定电话 */
  private String telephone;

  /** 地址 */
  private String address;

  /** 手机号 */
  private String phone;

  /** 身份证号 */
  private String idCard;

  /** 性别(F女, M男) */
  private String gender;

  /** 出生日期 */
  private Date birthday;

  /** 积分 */
  private Integer integral;

  /** 会员等级 */
  private String level;
  /**
   * 等级描述
   */
  private String levelDes;

  /** 邮件 */
  private String email;

  /** qq号 */
  private String qq;

  /** 支付宝 */
  private String alipay;

  /** 微博 */
  private String weibo;

  /** 邮编 */
  private String zipcode;

  /** 微信 */
  private String weixin;

  /** 创建时间 */
  private Date createAt;

  /** 最后更新时间 */
  private Date updateAt;


  /**
   * 用户ID
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * 用户ID
   * 
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
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
   * 会员号
   * 
   * @return memberNo
   */
  public String getMemberNo() {
    return memberNo;
  }

  /**
   * 会员号
   * 
   * @param memberNo
   */
  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }

  /**
   * 真实姓名
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * 真实姓名
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 昵称
   * 
   * @return nickname
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * 昵称
   * 
   * @param nickname
   */
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * 密码
   * 
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * 密码
   * 
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
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


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * 身份证号
   * 
   * @return idCard
   */
  public String getIdCard() {
    return idCard;
  }

  /**
   * 身份证号
   * 
   * @param idCard
   */
  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  /**
   * 性别(F女, M男)
   * 
   * @return gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * 性别(F女, M男)
   * 
   * @param gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * 出生日期
   * 
   * @return birthday
   */
  public Date getBirthday() {
    return birthday;
  }

  /**
   * 出生日期
   * 
   * @param birthday
   */
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
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
   * 会员等级
   * 
   * @return level
   */
  public String getLevel() {
    return level;
  }

  /**
   * 会员等级
   * 
   * @param level
   */
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   * 邮件
   * 
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * 邮件
   * 
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * qq号
   * 
   * @return qq
   */
  public String getQq() {
    return qq;
  }

  /**
   * qq号
   * 
   * @param qq
   */
  public void setQq(String qq) {
    this.qq = qq;
  }

  /**
   * 支付宝
   * 
   * @return alipay
   */
  public String getAlipay() {
    return alipay;
  }

  /**
   * 支付宝
   * 
   * @param alipay
   */
  public void setAlipay(String alipay) {
    this.alipay = alipay;
  }

  /**
   * 微博
   * 
   * @return weibo
   */
  public String getWeibo() {
    return weibo;
  }

  /**
   * 微博
   * 
   * @param weibo
   */
  public void setWeibo(String weibo) {
    this.weibo = weibo;
  }

  /**
   * 邮编
   * 
   * @return zipcode
   */
  public String getZipcode() {
    return zipcode;
  }

  /**
   * 邮编
   * 
   * @param zipcode
   */
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
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
   * 创建时间
   * 
   * @return createAt
   */
  public Date getCreateAt() {
    return createAt;
  }

  /**
   * 创建时间
   * 
   * @param createAt
   */
  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  /**
   * 最后更新时间
   * 
   * @return updateAt
   */
  public Date getUpdateAt() {
    return updateAt;
  }

  /**
   * 最后更新时间
   * 
   * @param updateAt
   */
  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }

  public String getLevelDes() {
    return levelDes;
  }

  public void setLevelDes(String levelDes) {
    this.levelDes = levelDes;
  }


}
