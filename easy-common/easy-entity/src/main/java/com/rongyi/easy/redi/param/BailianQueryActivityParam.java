package com.rongyi.easy.redi.param;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 
 * @author PC
 *
 */
public class BailianQueryActivityParam extends BaseParam implements java.io.Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  private String fromType;

  private String channelType;

  private String businessId;

  private String beginTime;

  private String endTime;

  private String shopId;

  private String pageSize;

  private String pageNum;

  private String queryType;

  private String shopIds;

  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;


  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getFromType() {
    return fromType;
  }

  public void setFromType(String fromType) {
    this.fromType = fromType;
  }

  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public String getPageSize() {
    return pageSize;
  }

  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }

  public String getPageNum() {
    return pageNum;
  }

  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }

  public String getQueryType() {
    return queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }

  public String getShopIds() {
    return shopIds;
  }

  public void setShopIds(String shopIds) {
    this.shopIds = shopIds;
  }


}
