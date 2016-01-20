package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * ClassName: IDCard <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:身份证信息. <br/>
 * date: 2015年8月3日 下午4:04:27 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class IDCard implements Serializable {

  /**
   * serialVersionUID:TODO(用一句话描述这个变量表示什么).
   * 
   * @since JDK 1.6
   */
  private static final long serialVersionUID = -1690385581502656158L;

  /** 身份证号 */
  private String idNo;

  /** 姓名 */
  private String name;

  /** 性别(F女, M男) */
  private String gender;

  /** 民族 */
  private String nation;

  /** 年 */
  private Integer year;

  /** 月 */
  private Integer month;

  /** 日 */
  private Integer day;

  /** 住址 */
  private String address;

  /** 签发机关 */
  private String publisher;

  /** 有效期限开始 */
  private Date validStart;

  /** 有效期限结束 */
  private Date validEnd;

  /** 创建时间 */
  private Date createAt;

  /** 最后更新时间 */
  private Date updateAt;

  /**
   * 身份证号
   * 
   * @return idNo
   */
  public String getIdNo() {
    return idNo;
  }

  /**
   * 身份证号
   * 
   * @param idNo
   */
  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  /**
   * 姓名
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * 姓名
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
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
   * 民族
   * 
   * @return nation
   */
  public String getNation() {
    return nation;
  }

  /**
   * 民族
   * 
   * @param nation
   */
  public void setNation(String nation) {
    this.nation = nation;
  }

  /**
   * 年
   * 
   * @return year
   */
  public Integer getYear() {
    return year;
  }

  /**
   * 年
   * 
   * @param year
   */
  public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * 月
   * 
   * @return month
   */
  public Integer getMonth() {
    return month;
  }

  /**
   * 月
   * 
   * @param month
   */
  public void setMonth(Integer month) {
    this.month = month;
  }

  /**
   * 日
   * 
   * @return day
   */
  public Integer getDay() {
    return day;
  }

  /**
   * 日
   * 
   * @param day
   */
  public void setDay(Integer day) {
    this.day = day;
  }

  /**
   * 住址
   * 
   * @return address
   */
  public String getAddress() {
    return address;
  }

  /**
   * 住址
   * 
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * 签发机关
   * 
   * @return publisher
   */
  public String getPublisher() {
    return publisher;
  }

  /**
   * 签发机关
   * 
   * @param publisher
   */
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  /**
   * 有效期限开始
   * 
   * @return validStart
   */
  public Date getValidStart() {
    return validStart;
  }

  /**
   * 有效期限开始
   * 
   * @param validStart
   */
  public void setValidStart(Date validStart) {
    this.validStart = validStart;
  }

  /**
   * 有效期限结束
   * 
   * @return validEnd
   */
  public Date getValidEnd() {
    return validEnd;
  }

  /**
   * 有效期限结束
   * 
   * @param validEnd
   */
  public void setValidEnd(Date validEnd) {
    this.validEnd = validEnd;
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
}
