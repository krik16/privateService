package com.rongyi.easy.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.rongyi.easy.mms.ExchangeIntegralType;
import com.rongyi.easy.mms.UserGradeGift;

public class IntegralCommodity implements Serializable {
  /**
     * 
     */
  private static final long serialVersionUID = -5422405701947207799L;

  /**  */
  private Long id;

  /** 积分商品名称 */
  private String title;

  /** 所需积分 */
  private Long integral;

  /** 用户限购数量 -1代表不限制购买数量 */
  private Long userLimit;

  /** 总数量 */
  private Long totalNumer;

  /** 积分商品类型0：商场 1：店铺 */
  private Long type;

  /** 验证方式 */
  private Long useMode;

  /** 发布开始时间 */
  /** 发布开始时间 */
  @JSONField(format = "yyyy-MM-dd HH:mm")
  private Date publicStart;

  /** 发布结束时间 */
  /** 发布开始时间 */
  @JSONField(format = "yyyy-MM-dd HH:mm")
  private Date publicEnd;

  /** 兑换开始时间 */
  /** 发布开始时间 */
  @JSONField(format = "yyyy-MM-dd HH:mm")
  private Date startTime;

  /** 兑换结束时间 */
  /** 发布开始时间 */
  @JSONField(format = "yyyy-MM-dd HH:mm")
  private Date endTime;

  /**  */
  private String description;

  /** 创建时间 */
  private Date createdTime;

  /** 修改时间 */
  private Date updatedTime;

  /**  */
  private Long operateUser;

  /** 展示icon图片 */
  private String icon;

  /** 商场id */
  private String mallId;

  /** 关联的店铺id如果类型为店铺 */
  private String relationShopIds;

  /** 发布状态 */
  private Long publicStatus;

  /** 已购买数量 */
  private Long buyedNumber;

  /** 关联的店铺id如果类型为店铺 */
  private String mallName;
  /**
   * 兑换积分类型(0:统一条件设置,1按会员等级设置)
   */
  private ExchangeIntegralType exchangeIntegralType;
  private List<UserGradeGift> userGradeGiftList;

  public List<UserGradeGift> getUserGradeGiftList() {
    return userGradeGiftList;
  }

  public void setUserGradeGiftList(List<UserGradeGift> userGradeGiftList) {
    this.userGradeGiftList = userGradeGiftList;
  }

  public ExchangeIntegralType getExchangeIntegralType() {
    return exchangeIntegralType;
  }

  public void setExchangeIntegralType(ExchangeIntegralType exchangeIntegralType) {
    this.exchangeIntegralType = exchangeIntegralType;
  }


  /** 审核状态 0审核中,1审核不通过,2审核通过,3修改审核中 */


  private Integer checkStatus;

  /** 同步状态 0未同步，1已同步 */
  private Integer syncStatus;

  /**
   * 创建人姓名（申请）
   */
  private String createName;

  /**
   * 删除状态 0正常,1删除审核,2删除
   */
  private Integer delStatus;

  /**
   * 申请删除人姓名
   */
  private String delName;

  /**
   * 删除申请时间
   */
  private Date delAt;

  /**
   * 
   * @return id
   */
  public Long getId() {
    return id;
  }

  /**
   * 
   * @param id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * 积分商品名称
   * 
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * 积分商品名称
   * 
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 所需积分
   * 
   * @return integral
   */
  public Long getIntegral() {
    return integral;
  }

  /**
   * 所需积分
   * 
   * @param integral
   */
  public void setIntegral(Long integral) {
    this.integral = integral;
  }

  /**
   * 用户限购数量 -1代表不限制购买数量
   * 
   * @return userLimit
   */
  public Long getUserLimit() {
    return userLimit;
  }

  /**
   * 用户限购数量 -1代表不限制购买数量
   * 
   * @param userLimit
   */
  public void setUserLimit(Long userLimit) {
    this.userLimit = userLimit;
  }

  /**
   * 总数量
   * 
   * @return totalNumer
   */
  public Long getTotalNumer() {
    return totalNumer;
  }

  /**
   * 总数量
   * 
   * @param totalNumer
   */
  public void setTotalNumer(Long totalNumer) {
    this.totalNumer = totalNumer;
  }

  /**
   * 积分商品类型0：商场 1：店铺
   * 
   * @return type
   */
  public Long getType() {
    return type;
  }

  /**
   * 积分商品类型0：商场 1：店铺
   * 
   * @param type
   */
  public void setType(Long type) {
    this.type = type;
  }

  /**
   * 验证方式
   * 
   * @return useMode
   */
  public Long getUseMode() {
    return useMode;
  }

  /**
   * 验证方式
   * 
   * @param useMode
   */
  public void setUseMode(Long useMode) {
    this.useMode = useMode;
  }

  /**
   * 发布开始时间
   * 
   * @return publicStart
   */
  public Date getPublicStart() {
    return publicStart;
  }

  /**
   * 发布开始时间
   * 
   * @param publicStart
   */
  public void setPublicStart(Date publicStart) {
    this.publicStart = publicStart;
  }

  /**
   * 发布结束时间
   * 
   * @return publicEnd
   */
  public Date getPublicEnd() {
    return publicEnd;
  }

  /**
   * 发布结束时间
   * 
   * @param publicEnd
   */
  public void setPublicEnd(Date publicEnd) {
    this.publicEnd = publicEnd;
  }

  /**
   * 兑换开始时间
   * 
   * @return startTime
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * 兑换开始时间
   * 
   * @param startTime
   */
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * 兑换结束时间
   * 
   * @return endTime
   */
  public Date getEndTime() {
    return endTime;
  }

  /**
   * 兑换结束时间
   * 
   * @param endTime
   */
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * 
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 创建时间
   * 
   * @return createdTime
   */
  public Date getCreatedTime() {
    return createdTime;
  }

  /**
   * 创建时间
   * 
   * @param createdTime
   */
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 修改时间
   * 
   * @return updatedTime
   */
  public Date getUpdatedTime() {
    return updatedTime;
  }

  /**
   * 修改时间
   * 
   * @param updatedTime
   */
  public void setUpdatedTime(Date updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * 
   * @return operateUser
   */
  public Long getOperateUser() {
    return operateUser;
  }

  /**
   * 
   * @param operateUser
   */
  public void setOperateUser(Long operateUser) {
    this.operateUser = operateUser;
  }

  /**
   * 展示icon图片
   * 
   * @return icon
   */
  public String getIcon() {
    return icon;
  }

  /**
   * 展示icon图片
   * 
   * @param icon
   */
  public void setIcon(String icon) {
    this.icon = icon;
  }

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
   * 关联的店铺id如果类型为店铺
   * 
   * @return relationShopIds
   */
  public String getRelationShopIds() {
    return relationShopIds;
  }

  /**
   * 关联的店铺id如果类型为店铺
   * 
   * @param relationShopIds
   */
  public void setRelationShopIds(String relationShopIds) {
    this.relationShopIds = relationShopIds;
  }

  /**
   * 发布状态
   * 
   * @return publicStatus
   */
  public Long getPublicStatus() {
    return publicStatus;
  }

  /**
   * 发布状态
   * 
   * @param publicStatus
   */
  public void setPublicStatus(Long publicStatus) {
    this.publicStatus = publicStatus;
  }

  /**
   * 已购买数量
   * 
   * @return buyedNumber
   */
  public Long getBuyedNumber() {
    return buyedNumber;
  }

  /**
   * 已购买数量
   * 
   * @param buyedNumber
   */
  public void setBuyedNumber(Long buyedNumber) {
    this.buyedNumber = buyedNumber;
  }

  public String getMallName() {
    return mallName;
  }

  public void setMallName(String mallName) {
    this.mallName = mallName;
  }

  public Integer getCheckStatus() {
    return checkStatus;
  }

  public void setCheckStatus(Integer checkStatus) {
    this.checkStatus = checkStatus;
  }

  public Integer getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(Integer syncStatus) {
    this.syncStatus = syncStatus;
  }

  public String getCreateName() {
    return createName;
  }

  public void setCreateName(String createName) {
    this.createName = createName;
  }

  public Integer getDelStatus() {
    return delStatus;
  }

  public void setDelStatus(Integer delStatus) {
    this.delStatus = delStatus;
  }

  public String getDelName() {
    return delName;
  }

  public void setDelName(String delName) {
    this.delName = delName;
  }

  public Date getDelAt() {
    return delAt;
  }

  public void setDelAt(Date delAt) {
    this.delAt = delAt;
  }

  @Override
  public String toString() {
    return "IntegralCommodity [id=" + id + ", title=" + title + ", integral=" + integral
        + ", userLimit=" + userLimit + ", totalNumer=" + totalNumer + ", type=" + type
        + ", useMode=" + useMode + ", publicStart=" + publicStart + ", publicEnd=" + publicEnd
        + ", startTime=" + startTime + ", endTime=" + endTime + ", description=" + description
        + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", operateUser="
        + operateUser + ", icon=" + icon + ", mallId=" + mallId + ", relationShopIds="
        + relationShopIds + ", publicStatus=" + publicStatus + ", buyedNumber=" + buyedNumber
        + ", mallName=" + mallName + ", exchangeIntegralType=" + exchangeIntegralType
        + ", userGradeGiftList=" + userGradeGiftList + ", checkStatus=" + checkStatus
        + ", syncStatus=" + syncStatus + ", createName=" + createName + ", delStatus=" + delStatus
        + ", delName=" + delName + ", delAt=" + delAt + "]";
  }



}
