package com.rongyi.easy.domain.member;

import java.util.Date;
import java.util.List;

public class PhotoReference {
  /**  */
  private Integer id;

  /**  */
  private String mallId;

  private Status status;

  /**  */
  private Integer createId;

  /**  */
  private Date createAt;

  /**  */
  private Integer updateId;

  /**  */
  private Date updateAt;

  /** 礼品名字图片类型 */
  private PhotoType photoType;

  private List<Photo> photoList;
  /**
   * 审核理由 审核用
   */
  private String memo;
  /** 更新用户名 */
  private String updateName;
  /** 创建用户名 */
  private String createName;



  public String getUpdateName() {
    return updateName;
  }

  public void setUpdateName(String updateName) {
    this.updateName = updateName;
  }

  public String getCreateName() {
    return createName;
  }

  public void setCreateName(String createName) {
    this.createName = createName;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public List<Photo> getPhotoList() {
    return photoList;
  }

  public void setPhotoList(List<Photo> photoList) {
    this.photoList = photoList;
  }

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public PhotoType getPhotoType() {
    return photoType;
  }

  public void setPhotoType(PhotoType photoType) {
    this.photoType = photoType;
  }

  /**
   * 
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
  }


  /**
   * 
   * @return createId
   */
  public Integer getCreateId() {
    return createId;
  }

  /**
   * 
   * @param createId
   */
  public void setCreateId(Integer createId) {
    this.createId = createId;
  }

  /**
   * 
   * @return createAt
   */
  public Date getCreateAt() {
    return createAt;
  }

  /**
   * 
   * @param createAt
   */
  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  /**
   * 
   * @return updateId
   */
  public Integer getUpdateId() {
    return updateId;
  }

  /**
   * 
   * @param updateId
   */
  public void setUpdateId(Integer updateId) {
    this.updateId = updateId;
  }

  /**
   * 
   * @return updateAt
   */
  public Date getUpdateAt() {
    return updateAt;
  }

  /**
   * 
   * @param updateAt
   */
  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }

  @Override
  public String toString() {
    return "PhotoReference [id=" + id + ", mallId=" + mallId + ", status=" + status + ", createId="
        + createId + ", createAt=" + createAt + ", updateId=" + updateId + ", updateAt=" + updateAt
        + ", photoType=" + photoType + ", photoList=" + photoList + "]";
  }



}
