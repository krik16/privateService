package com.rongyi.easy.solr;

import com.rongyi.core.constant.Constants;
import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

/**
 * 用户索引文档
<<<<<<< HEAD
 *
=======
 * 
>>>>>>> 8ac4f139117d5067f4648c7f153e4d4a7cc9c7a0
 * @author baodk
 */
public class UserDocument implements java.io.Serializable {

  /**
<<<<<<< HEAD
	 *
=======
	 * 
>>>>>>> 8ac4f139117d5067f4648c7f153e4d4a7cc9c7a0
	 */
  private static final long serialVersionUID = 1L;
  /** 身份证号 */
  @Field
  private String identify;

  @Field
  private String id;

  /** 会员编号 */
  @Field("member_no")
  private String memberNo;

  /** 会员真实姓名 */
  @Field("name")
  private String name;

  /** 手机号1 */
  @Field
  private String phone1;

  /** 手机号2 */
  @Field
  private String phone2;

  /** 手机号3 */
  @Field
  private String phone3;

  /** 实体积分 */
  @Field("entity_integral")
  private Integer entityIntegral;

  /** 电子剩余积分 */
  // @Property("electronic_integral")
  // private Integer electronicIntegral;

  /** 会员类型 1:实体会员， 2:电子会员 */
  @Field("member_nature")
  private Integer memberNature;

  /** 是否会员 0:绑定会员， 1:非绑定会员 */
  @Field("member_bind")
  private Integer memberBind;

  /** 首次消费时间 */
  @Field("first_consume_time")
  private Date firstConsumeTime;

  /** 上次消费日期,最后交易时间 */
  @Field("last_consume_time")
  private Date lastConsumeTime;

  /** 软件提供商ID */
  @Field("owner_id")
  private String ownerId;

  /** 商场ID */
  @Field("mall_id")
  private String mallId;

  /** 商场名称 */
  @Field("mall_name")
  private String mallName;

  /** 注册时间 */
  @Field("registration_time")
  private Date registrationTime;

  /** 出生年 */
  @Field("birth_year")
  private String birthYear;

  /** 出生月 */
  @Field("birth_month")
  private String birthMonth;

  /** 出生日 */
  @Field("birth_day")
  private String birthDay;

  /** 电子会员积分 */
  @Field("elec_integral")
  private Integer elecIntegral;

  /** 性别 */
  @Field
  private String sex;

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

  // public Integer getElectronicIntegral() {
  // return electronicIntegral;
  // }
  //
  // public void setElectronicIntegral(Integer electronicIntegral) {
  // this.electronicIntegral = electronicIntegral;
  // }

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

  public Integer getElecIntegral() {
    return elecIntegral;
  }

  public void setElecIntegral(Integer elecIntegral) {
    this.elecIntegral = elecIntegral;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    /** 性别: M=Male男性, F=Female女性 */
    String _sex = "男";
    if (Constants.MemberSex.FEMALE.equalsIgnoreCase(sex)) {
      _sex = "女";
    }
    this.sex = _sex;
  }

  public Integer getMemberBind() {
    return memberBind;
  }

  public void setMemberBind(Integer memberBind) {
    this.memberBind = memberBind;
  }

  public Date getLastConsumeTime() {
    return lastConsumeTime;
  }

  public void setLastConsumeTime(Date lastConsumeTime) {
    this.lastConsumeTime = lastConsumeTime;
  }

  public String getIdentify() {
    return identify;
  }

  public void setIdentify(String identify) {
    this.identify = identify;
  }

  /**
   * Creates a new instance of UserDocument.
   * 
   */

  public UserDocument() {

    this.memberNature = com.rongyi.core.constant.MemberNature.ELECTRONIC_MEMBER;
    this.memberBind = Constants.MemberBind.UNBIND;
    this.elecIntegral = 0;
  }

  @Override
  public String toString() {
    return "UserDocument [identify=" + identify + ", id=" + id + ", memberNo=" + memberNo
        + ", name=" + name + ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3=" + phone3
        + ", entityIntegral=" + entityIntegral + ", memberNature=" + memberNature + ", memberBind="
        + memberBind + ", firstConsumeTime=" + firstConsumeTime + ", lastConsumeTime="
        + lastConsumeTime + ", ownerId=" + ownerId + ", mallId=" + mallId + ", mallName="
        + mallName + ", registrationTime=" + registrationTime + ", birthYear=" + birthYear
        + ", birthMonth=" + birthMonth + ", birthDay=" + birthDay + ", elecIntegral="
        + elecIntegral + ", sex=" + sex + "]";
  }


}
