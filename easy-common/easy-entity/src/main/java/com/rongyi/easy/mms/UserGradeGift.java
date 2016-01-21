package com.rongyi.easy.mms;

import java.util.Date;

/**
 * 用户等级积分
 * 
 * @author bin.zhang
 *
 */
public class UserGradeGift {
  /**  */
  private Integer id;

  /** 积分id */
  private Long giftId;

  /** 等级id */
  private Integer gradeId;

  /** 积分 */
  private Long integral;

  /** 创建用户id */
  private String createId;

  /** 创建用户名 */
  private String createName;

  /** 创建时间 */
  private Date createAt;

  /** 更新用户id */
  private Integer updateId;

  /** 更新用户名 */
  private String updateName;

  /** 最后更新时间 */
  private Date updateAt;

  /** version */
  private Long version;



  public Long getGiftId() {
    return giftId;
  }

  public void setGiftId(Long giftId) {
    this.giftId = giftId;
  }

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * 
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * 等级id
   * 
   * @return gradeId
   */
  public Integer getGradeId() {
    return gradeId;
  }

  /**
   * 等级id
   * 
   * @param gradeId
   */
  public void setGradeId(Integer gradeId) {
    this.gradeId = gradeId;
  }

  /**
   * 积分
   * 
   * @return integral
   */
  public Long getIntegral() {
    return integral;
  }

  /**
   * 积分
   * 
   * @param integral
   */
  public void setIntegral(Long integral) {
    this.integral = integral;
  }

  /**
   * 创建用户id
   * 
   * @return createId
   */
  public String getCreateId() {
    return createId;
  }

  /**
   * 创建用户id
   * 
   * @param createId
   */
  public void setCreateId(String createId) {
    this.createId = createId;
  }

  /**
   * 创建用户名
   * 
   * @return createName
   */
  public String getCreateName() {
    return createName;
  }

  /**
   * 创建用户名
   * 
   * @param createName
   */
  public void setCreateName(String createName) {
    this.createName = createName;
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
   * 更新用户id
   * 
   * @return updateId
   */
  public Integer getUpdateId() {
    return updateId;
  }

  /**
   * 更新用户id
   * 
   * @param updateId
   */
  public void setUpdateId(Integer updateId) {
    this.updateId = updateId;
  }

  /**
   * 更新用户名
   * 
   * @return updateName
   */
  public String getUpdateName() {
    return updateName;
  }

  /**
   * 更新用户名
   * 
   * @param updateName
   */
  public void setUpdateName(String updateName) {
    this.updateName = updateName;
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
   * version
   * 
   * @return version
   */
  public Long getVersion() {
    return version;
  }

  /**
   * version
   * 
   * @param version
   */
  public void setVersion(Long version) {
    this.version = version;
  }
}
