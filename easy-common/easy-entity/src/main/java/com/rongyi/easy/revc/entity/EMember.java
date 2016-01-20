package com.rongyi.easy.revc.entity;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.domain.member.MallMember;

/**
 * 
 * ClassName: EMember <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:电子会员. <br/>
 * date: 2015年8月3日 下午4:03:54 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class EMember implements Serializable {

  /**
   * serialVersionUID:TODO(用一句话描述这个变量表示什么).
   * 
   * @since JDK 1.6
   */
  private static final long serialVersionUID = 4002656073727989954L;

  /** 电子会员号 */
  private String memberId;

  /** openId */
  private String openId;

  /** 手机 */
  private String phone;

  /** 商场id */
  private String mallId;

  /** 密码 */
  private String password;

  /** 注册时间 */
  private Date createAt;

  /** 最后更新时间 */
  private Date updateAt;

  /** 会员积分 */
  private Integer integral;

  /** 商场会员主键 */
  private Integer mallMemberId;
  /**
   * 实体会员
   */
  private MallMember mallMember;



  public MallMember getMallMember() {
    return mallMember;
  }

  public void setMallMember(MallMember mallMember) {
    this.mallMember = mallMember;
  }

  /**
   * 电子会员号
   * 
   * @return memberId
   */
  public String getMemberId() {
    return memberId;
  }

  /**
   * 电子会员号
   * 
   * @param memberId
   */
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * openId
   * 
   * @return openId
   */
  public String getOpenId() {
    return openId;
  }

  /**
   * openId
   * 
   * @param openId
   */
  public void setOpenId(String openId) {
    this.openId = openId;
  }

  /**
   * 手机
   * 
   * @return phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * 手机
   * 
   * @param phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * 商场id
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 商场id
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
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
   * 注册时间
   * 
   * @return createAt
   */
  public Date getCreateAt() {
    return createAt;
  }

  /**
   * 注册时间
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

  /**
   * 会员积分
   * 
   * @return integral
   */
  public Integer getIntegral() {
    return integral;
  }

  /**
   * 会员积分
   * 
   * @param integral
   */
  public void setIntegral(Integer integral) {
    this.integral = integral;
  }

  /**
   * 
   * @return mallMemberId
   */
  public Integer getMallMemberId() {
    return mallMemberId;
  }

  /**
   * 
   * @param mallMemberId
   */
  public void setMallMemberId(Integer mallMemberId) {
    this.mallMemberId = mallMemberId;
  }
}
