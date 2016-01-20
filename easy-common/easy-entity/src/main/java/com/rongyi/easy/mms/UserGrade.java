package com.rongyi.easy.mms;

import java.io.Serializable;
import java.util.Date;

public class UserGrade implements Serializable {
  /**
	 * 
	 */
  private static final long serialVersionUID = -1610690472289834345L;

  /**  */
  private Integer id;

  /** 商城id */
  private String mallId;

  /** 用户等级 */
  private String grade;

  /** 等级描述 */
  private String gradeDesc;

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
   * 用户等级
   * 
   * @return grade
   */
  public String getGrade() {
    return grade;
  }

  /**
   * 用户等级
   * 
   * @param grade
   */
  public void setGrade(String grade) {
    this.grade = grade;
  }

  /**
   * 等级描述
   * 
   * @return gradeDesc
   */
  public String getGradeDesc() {
    return gradeDesc;
  }

  /**
   * 等级描述
   * 
   * @param gradeDesc
   */
  public void setGradeDesc(String gradeDesc) {
    this.gradeDesc = gradeDesc;
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

  @Override
  public String toString() {
    return "UserGrade [id=" + id + ", mallId=" + mallId + ", grade=" + grade + ", gradeDesc="
        + gradeDesc + ", createId=" + createId + ", createName=" + createName + ", createAt="
        + createAt + ", updateId=" + updateId + ", updateName=" + updateName + ", updateAt="
        + updateAt + ", version=" + version + "]";
  }


}
