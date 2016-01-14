package com.rongyi.easy.mms;

import java.io.Serializable;
import java.util.Date;

public class ExchangeRule implements Serializable {
  private static final long serialVersionUID = -2607585733180766611L;

  /**  */
  private Integer id;

  /** 商城id */
  private String mallId;

  /** 每天限制数量 */
  private Integer number;

  /** 生效日期 */
  private Date activeAt;

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
   * 商城id
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 商城id
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  /**
   * 每天限制数量
   * 
   * @return number
   */
  public Integer getNumber() {
    return number;
  }

  /**
   * 每天限制数量
   * 
   * @param number
   */
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * 生效日期
   * 
   * @return activeAt
   */
  public Date getActiveAt() {
    return activeAt;
  }

  /**
   * 生效日期
   * 
   * @param activeAt
   */
  public void setActiveAt(Date activeAt) {
    this.activeAt = activeAt;
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
