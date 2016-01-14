package com.rongyi.easy.roa.param;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 会员礼品参数
 * 
 * @author baodk
 */
public class MemberGiftParam extends BaseParam {

  /** 商场唯一标识 */
  private String ownerId;

  /** 商场编码 */
  private String mallId;

  /** 是否查询有库存的 （绿地接口特有） */
  private String isHaveQoh;

  /** 会员编码 */
  private String memberNo;


  /**
   * 会员名字
   */
  private String memberName;
  /**
   * 礼品名称
   */
  private String giftName;


  /**
   * 手机号
   */
  private String mobile;

  /** 礼品编码 */
  private String giftCode;

  /** 兑换数量 */
  private String redeemQty;

  /** 兑换号码 （金地接口特有） */
  private String redemptionNo;

  /** 所需积分 （绿地接口特有） */
  private String bonus;

  /** 指定积分兑换周期 （绿地接口特有） */
  private String isSpecificBonusPeriod;

  /** 兑换起始时间 */
  private String bonusStartDate;

  /** 兑换结束时间 */
  private String bonusEndDate;

  private Integer pageSize;
  private Integer currentPage;

  private int channel;

  /**
   * 礼品ID
   */
  private String giftId;
  /**
   * 起始时间
   */
  private String startDate;
  /**
   * 结束时间
   */
  private String endDate;

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getGiftName() {
    return giftName;
  }

  public void setGiftName(String giftName) {
    this.giftName = giftName;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }



  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getGiftCode() {
    return giftCode;
  }

  public void setGiftCode(String giftCode) {
    this.giftCode = giftCode;
  }

  public String getRedeemQty() {
    return redeemQty;
  }

  public void setRedeemQty(String redeemQty) {
    this.redeemQty = redeemQty;
  }

  public String getIsHaveQoh() {
    return isHaveQoh;
  }

  public void setIsHaveQoh(String isHaveQoh) {
    this.isHaveQoh = isHaveQoh;
  }

  public String getRedemptionNo() {
    return redemptionNo;
  }

  public void setRedemptionNo(String redemptionNo) {
    this.redemptionNo = redemptionNo;
  }

  public String getBonus() {
    return bonus;
  }

  public void setBonus(String bonus) {
    this.bonus = bonus;
  }

  public String getIsSpecificBonusPeriod() {
    return isSpecificBonusPeriod;
  }

  public void setIsSpecificBonusPeriod(String isSpecificBonusPeriod) {
    this.isSpecificBonusPeriod = isSpecificBonusPeriod;
  }

  public String getBonusStartDate() {
    return bonusStartDate;
  }

  public void setBonusStartDate(String bonusStartDate) {
    this.bonusStartDate = bonusStartDate;
  }

  public String getBonusEndDate() {
    return bonusEndDate;
  }

  public void setBonusEndDate(String bonusEndDate) {
    this.bonusEndDate = bonusEndDate;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public String getGiftId() {
    return giftId;
  }

  public void setGiftId(String giftId) {
    this.giftId = giftId;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

}
