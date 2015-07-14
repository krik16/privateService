package com.rongyi.easy.domain.member;

/**
 * 
 * ClassName: MallGroup <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 商场信息表<br/>
 * date: 2015年4月30日 下午10:20:42 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class MallGroup {
  /** 商场id */
  private String mallId;

  /** 商场名称 */
  private String mallName;

  /** 集团id */
  private String groupId;

  /** 集团名字 */
  private String groupName;

  /** 供应商id */
  private String ownerId;

  /** 供应商名 */
  private String ownerName;

  /**
   * 商场id
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 商场id
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  /**
   * 商场名称
   * 
   * @return mallName
   */
  public String getMallName() {
    return mallName;
  }

  /**
   * 商场名称
   * 
   * @param mallName
   */
  public void setMallName(String mallName) {
    this.mallName = mallName;
  }

  /**
   * 集团id
   * 
   * @return groupId
   */
  public String getGroupId() {
    return groupId;
  }

  /**
   * 集团id
   * 
   * @param groupId
   */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   * 集团名字
   * 
   * @return groupName
   */
  public String getGroupName() {
    return groupName;
  }

  /**
   * 集团名字
   * 
   * @param groupName
   */
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * 供应商id
   * 
   * @return ownerId
   */
  public String getOwnerId() {
    return ownerId;
  }

  /**
   * 供应商id
   * 
   * @param ownerId
   */
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * 供应商名
   * 
   * @return ownerName
   */
  public String getOwnerName() {
    return ownerName;
  }

  /**
   * 供应商名
   * 
   * @param ownerName
   */
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
}
