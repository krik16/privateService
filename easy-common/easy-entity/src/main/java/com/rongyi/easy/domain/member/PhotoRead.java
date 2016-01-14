package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * ClassName: PhotoRead <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 审核过的图片对象. <br/>
 * date: 2015年6月1日 下午5:47:01 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class PhotoRead implements Serializable {
  private static final long serialVersionUID = -4234701235431430535L;

  /**  */
  private Integer id;

  /** 商城id */
  private String mallId;

  /** 礼品名字图片类型 */
  private PhotoType photoType;

  /**  */
  private String fileUrl;

  /** 状态：0删除，1正常 */
  private Integer status;

  /** 顺序 */
  private Integer sequence;

  /**  */
  private Integer createId;

  /**  */
  private Date createAt;

  /**  */
  private Integer updateId;

  /**  */
  private Date updateAt;



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
   * 
   * @return fileUrl
   */
  public String getFileUrl() {
    return fileUrl;
  }

  /**
   * 
   * @param fileUrl
   */
  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  /**
   * 状态：0删除，1正常
   * 
   * @return status
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * 状态：0删除，1正常
   * 
   * @param status
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * 顺序
   * 
   * @return sequence
   */
  public Integer getSequence() {
    return sequence;
  }

  /**
   * 顺序
   * 
   * @param sequence
   */
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
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
    return "PhotoRead [id=" + id + ", mallId=" + mallId + ", photoType=" + photoType + ", fileUrl="
        + fileUrl + ", status=" + status + ", sequence=" + sequence + ", createId=" + createId
        + ", createAt=" + createAt + ", updateId=" + updateId + ", updateAt=" + updateAt + "]";
  }


}
