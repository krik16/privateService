package com.rongyi.easy.redi.param;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 百联篮筐接口参数
 * 
 * @author rongyi
 */
public class BailianCartParam extends BaseParam implements java.io.Serializable {
  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;
  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;
  private String sysid;// 系统id
  private String channelId;// 渠道id
  private String buid;// 业态id
  private String shopId;// 门店id
  private String memberId;
  private Integer pageNum; // 当前页数
  private Integer pageSize; // 每页显示数
  private String basketId;
  private String id;



  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }


  public String getSysid() {
    return sysid;
  }

  public void setSysid(String sysid) {
    this.sysid = sysid;
  }

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public String getBuid() {
    return buid;
  }

  public void setBuid(String buid) {
    this.buid = buid;
  }

  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public Integer getPageNum() {
    return pageNum;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  @Override
  public String toString() {
    return "BailianCartParam [ownerId=" + ownerId + ", sysid=" + sysid + ", channelId=" + channelId
        + ", buid=" + buid + ", shopId=" + shopId + ", memberId=" + memberId + ", pageNum="
        + pageNum + ", pageSize=" + pageSize + ", basketId=" + basketId + ", id=" + id + "]";
  }

}
