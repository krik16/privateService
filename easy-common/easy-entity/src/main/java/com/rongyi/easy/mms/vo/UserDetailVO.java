package com.rongyi.easy.mms.vo;

import java.util.Date;

/**
 * 会员详情
<<<<<<< HEAD
 *
=======
 * 
>>>>>>> 8ac4f139117d5067f4648c7f153e4d4a7cc9c7a0
 * @author lim
 */
public class UserDetailVO implements java.io.Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  private String id;

  /** 会员编号 */
  private String memberNo;
  /**
   * 实体卡卡号
   */
  private String memberCard;

  /** 会员真实姓名 */
  private String name;

  /** 手机号1 */
  private String phone1;

  /** 手机号2 */
  private String phone2;

  /** 手机号3 */
  private String phone3;

  /** 实体积分 */
  private Integer entityIntegral;

  /** 电子会员积分 */
  private Integer electronicIntegral;

  /** 会员类型 1:实体会员， 2:电子会员 */
  private Integer memberNature;

  /** 首次消费时间 */
  private Date firstConsumeTime;

  /** 集团ID */
  private String ownerId;

  /** 商场ID */
  private String mallId;

  /** 商场名称 */
  private String mallName;

  /** 注册时间 */
  private Date registrationTime;

  /** 出生年 */
  private String birthYear;

  /** 出生月 */
  private String birthMonth;

  /** 出生日 */
  private String birthDay;

  /** 可用积分 ，等于电子会员积分或者会员积分 */
  private Integer useIntegral;

  /** 性别 */
  private String sex;



  public String getMemberCard() {
    return memberCard;
  }

  public void setMemberCard(String memberCard) {
    this.memberCard = memberCard;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
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

  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public String getPhone3() {
    return phone3;
  }

  public void setPhone3(String phone3) {
    this.phone3 = phone3;
  }

  public Integer getEntityIntegral() {
    return entityIntegral;
  }

  public void setEntityIntegral(Integer entityIntegral) {
    this.entityIntegral = entityIntegral;
  }

  public Integer getElectronicIntegral() {
    return electronicIntegral;
  }

  public void setElectronicIntegral(Integer electronicIntegral) {
    this.electronicIntegral = electronicIntegral;
  }

  public Integer getMemberNature() {
    return memberNature;
  }

  public void setMemberNature(Integer memberNature) {
    this.memberNature = memberNature;
  }

  public Date getFirstConsumeTime() {
    return firstConsumeTime;
  }

  public void setFirstConsumeTime(Date firstConsumeTime) {
    this.firstConsumeTime = firstConsumeTime;
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

  public String getMallName() {
    return mallName;
  }

  public void setMallName(String mallName) {
    this.mallName = mallName;
  }

  public Date getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(Date registrationTime) {
    this.registrationTime = registrationTime;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  public String getBirthMonth() {
    return birthMonth;
  }

  public void setBirthMonth(String birthMonth) {
    this.birthMonth = birthMonth;
  }

  public String getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Integer getUseIntegral() {
    return useIntegral;
  }

  public void setUseIntegral(Integer useIntegral) {
    this.useIntegral = useIntegral;
  }

  @Override
  public String toString() {
    return "UserDetailVO [id=" + id + ", memberNo=" + memberNo + ", memberCard=" + memberCard
        + ", name=" + name + ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3=" + phone3
        + ", entityIntegral=" + entityIntegral + ", electronicIntegral=" + electronicIntegral
        + ", memberNature=" + memberNature + ", firstConsumeTime=" + firstConsumeTime
        + ", ownerId=" + ownerId + ", mallId=" + mallId + ", mallName=" + mallName
        + ", registrationTime=" + registrationTime + ", birthYear=" + birthYear + ", birthMonth="
        + birthMonth + ", birthDay=" + birthDay + ", useIntegral=" + useIntegral + ", sex=" + sex
        + "]";
  }
}
