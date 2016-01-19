package com.rongyi.easy.redi.param;

import java.util.List;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 类BailianParam.java的实现描述：百联接口参数
 * 
 * @author rongyi-13 2014年12月30日 下午6:18:51
 */
public class BailianParam extends BaseParam implements java.io.Serializable {
  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;
  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;
  /**
   * 门店更新优惠券状态（优惠券更新为已打印)的接口参数
   */
  private String memberToken;// 用户token
  private String sysid;// 系统id
  private String channelId;// 渠道id
  private String id;// 券Id
  /** 券Id,20150123 lim,IBM没照文档上面做，我们这边调整 */
  private String couponCode;//
  private String buid;// 业态id
  private String shopId;// 门店id
  private String equipmentId;// 设备id

  private String couponTemplateId;// 券模板ID
  private String memberId;

  private Integer pageNum; // 当前页数
  private Integer pageSize; // 每页显示数
  private String basketId;

  private String categoryId; // 分类id

  private String goodsId; // 商品id

  private List<String> goodsIds; // 商品id

  private String currentPage;// 起始页数


  private String mobile; //手机号码
  
	
  public String getMobile() {
	return mobile;
  }

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

 public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public List<String> getGoodsIds() {
    return goodsIds;
  }

  public void setGoodsIds(List<String> goodsIds) {
    this.goodsIds = goodsIds;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }

  public String getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(String currentPage) {
    this.currentPage = currentPage;
  }

  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  public String getMemberToken() {
    return memberToken;
  }

  public void setMemberToken(String memberToken) {
    this.memberToken = memberToken;
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getEquipmentId() {
    return equipmentId;
  }

  public void setEquipmentId(String equipmentId) {
    this.equipmentId = equipmentId;
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

  public String getCouponTemplateId() {
    return couponTemplateId;
  }

  public void setCouponTemplateId(String couponTemplateId) {
    this.couponTemplateId = couponTemplateId;
  }

  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

}
