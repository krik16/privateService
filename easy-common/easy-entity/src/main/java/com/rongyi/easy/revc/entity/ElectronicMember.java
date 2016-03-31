package com.rongyi.easy.revc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import com.rongyi.easy.rvc.entity.Member;

/**
 * 电子会员
 * 
 * @author baodk
 */
@Entity(value = "electronic_member", noClassnameStored = true)
public class ElectronicMember implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private ObjectId id;

  /** app：1,微信：2 */
  private String channel;

  /** OpenID */
  private String openId;

  /** 手机号 */
  private String phone;

  /** 电子会员ID */
  @Property("member_no")
  private String memberNo;

  /** 电子会员密码 */
  @Property("member_pass")
  private String memberPass;

  /** 注册日期 */
  @Property("registration_time")
  private Date registrationTime;

  /** 所属商场唯一标识 */
  @Property("owner_id")
  private String ownerId;

  /** 商场id */
  @Property("mall_id")
  private String mallId;

  /** 电子会员积分 */
  @Property("elec_integral")
  private int elecIntegral;

  /** 会员编号 */
  @Property("vip_codes")
  private List<String> vipCodes;
  /**
   * 实体会员信息
   */
  private Member member;

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
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

  public Date getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(Date registrationTime) {
    this.registrationTime = registrationTime;
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

  public int getElecIntegral() {
    return elecIntegral;
  }

  public void setElecIntegral(int elecIntegral) {
    this.elecIntegral = elecIntegral;
  }

  public List<String> getVipCodes() {
    return vipCodes;
  }

  public void setVipCodes(List<String> vipCodes) {
    this.vipCodes = vipCodes;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }

}
