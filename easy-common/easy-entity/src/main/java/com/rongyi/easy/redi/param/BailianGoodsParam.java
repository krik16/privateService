package com.rongyi.easy.redi.param;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 商品
 * 
 * @author
 */
public class BailianGoodsParam extends BaseParam {

  private String goodsSid; // 商品SID

  private String comSid; // 业态SID

  private String mdmGoodsSid; // MDM商品sid

  private String supplierSid;// 供应商SID

  private String channelSid;// 渠道sid

  private String specCodes;// 图片规格code列表

  private String promotionType;// 活动类型

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

  public String getGoodsSid() {
    return goodsSid;
  }

  public void setGoodsSid(String goodsSid) {
    this.goodsSid = goodsSid;
  }

  public String getComSid() {
    return comSid;
  }

  public void setComSid(String comSid) {
    this.comSid = comSid;
  }

  public String getMdmGoodsSid() {
    return mdmGoodsSid;
  }

  public void setMdmGoodsSid(String mdmGoodsSid) {
    this.mdmGoodsSid = mdmGoodsSid;
  }

  public String getSupplierSid() {
    return supplierSid;
  }

  public void setSupplierSid(String supplierSid) {
    this.supplierSid = supplierSid;
  }

  public String getChannelSid() {
    return channelSid;
  }

  public void setChannelSid(String channelSid) {
    this.channelSid = channelSid;
  }

  public String getSpecCodes() {
    return specCodes;
  }

  public void setSpecCodes(String specCodes) {
    this.specCodes = specCodes;
  }

  public String getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


}
