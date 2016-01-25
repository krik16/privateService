package com.rongyi.easy.redi.param;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 商品
 * 
 * @author
 */
public class BailianCategoryParam extends BaseParam {

  private String clientIp; // 请求IP地址

  private String systemNo; // 请求的系统编号

  private String clientRequestTime; // 请求的时间

  private String role;// 角色

  private String token;// 指令

  private String categorySid;// 分类ID

  private String channelSid;// 分类所属渠道ID

  private String parentSid;// 活动类型

  private String lev; // 级别

  private String categoryType; // 目录类型

  private String picNorms; // 图片规格

  private String pageNo; // 当前页数

  private String pageSize; // 每页显示数量

  private static final long serialVersionUID = 1L;

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

  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public String getSystemNo() {
    return systemNo;
  }

  public void setSystemNo(String systemNo) {
    this.systemNo = systemNo;
  }

  public String getClientRequestTime() {
    return clientRequestTime;
  }

  public void setClientRequestTime(String clientRequestTime) {
    this.clientRequestTime = clientRequestTime;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getCategorySid() {
    return categorySid;
  }

  public void setCategorySid(String categorySid) {
    this.categorySid = categorySid;
  }

  public String getChannelSid() {
    return channelSid;
  }

  public void setChannelSid(String channelSid) {
    this.channelSid = channelSid;
  }

  public String getParentSid() {
    return parentSid;
  }

  public void setParentSid(String parentSid) {
    this.parentSid = parentSid;
  }

  public String getLev() {
    return lev;
  }

  public void setLev(String lev) {
    this.lev = lev;
  }

  public String getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }

  public String getPicNorms() {
    return picNorms;
  }

  public void setPicNorms(String picNorms) {
    this.picNorms = picNorms;
  }

  public String getPageNo() {
    return pageNo;
  }

  public void setPageNo(String pageNo) {
    this.pageNo = pageNo;
  }

  public String getPageSize() {
    return pageSize;
  }

  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public String toString() {
    return "BailianCategoryParam [clientIp=" + clientIp + ", systemNo=" + systemNo
        + ", clientRequestTime=" + clientRequestTime + ", role=" + role + ", token=" + token
        + ", categorySid=" + categorySid + ", channelSid=" + channelSid + ", parentSid="
        + parentSid + ", lev=" + lev + ", categoryType=" + categoryType + ", picNorms=" + picNorms
        + ", pageNo=" + pageNo + ", pageSize=" + pageSize + "]";
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }



}
