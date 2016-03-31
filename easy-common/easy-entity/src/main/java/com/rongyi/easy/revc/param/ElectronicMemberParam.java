package com.rongyi.easy.revc.param;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.domain.member.ChannelType;

public class ElectronicMemberParam extends BaseParam implements Serializable {

  private static final long serialVersionUID = 1L;

  /** app：0,微信：1 */
  private String channel;
  /**
   * 类型
   */
  private ChannelType channelType;

  public ChannelType getChannelType() {
    return channelType;
  }

  public void setChannelType(ChannelType channelType) {
    this.channelType = channelType;
  }

  /** OpenID */
  private String openId;

  /** 手机号 */
  private String phone;


  /** 电子会员编号 */
  private String memberNo;

  /** 电子会员密码 */
  private String memberPass;

  /** 注册日期 */
  private Date registrationTime;

  /** 所属商场唯一标识 */
  private String ownerId;

  /** 商场id */
  private String mallId;

  /** 电子会员积分 */
  private int elecIntegral;

  /** 会员编号 */
  private String vipCode;
  /** 身份证号 */
  private String identify;
  /**
   * 真实姓名
   */
  private String sureName;



  public String getIdentify() {
    return identify;
  }

  public void setIdentify(String identify) {
    this.identify = identify;
  }

  public String getSureName() {
    return sureName;
  }

  public void setSureName(String sureName) {
    this.sureName = sureName;
  }


  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
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

  public String getMemberPass() {
    return memberPass;
  }

  public void setMemberPass(String memberPass) {
    this.memberPass = memberPass;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getVipCode() {
    return vipCode;
  }

  public void setVipCode(String vipCode) {
    this.vipCode = vipCode;
  }

  public Date getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(Date registrationTime) {
    this.registrationTime = registrationTime;
  }

  public int getElecIntegral() {
    return elecIntegral;
  }

  public void setElecIntegral(int elecIntegral) {
    this.elecIntegral = elecIntegral;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }

}
