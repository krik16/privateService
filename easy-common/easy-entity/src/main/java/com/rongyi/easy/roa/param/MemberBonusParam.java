package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 会员积分参数
 * 
 * @author baodk
 */
public class MemberBonusParam extends BaseParam implements Serializable {

  private static final long serialVersionUID = 1L;

  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;
  /**
   * 会员号
   */
  private String memberNo;
  /**
   * 调整积分:+3 增加3积分,-3减少3积分
   */
  private String bonusPoint;
  /**
   * 调整理由
   */
  private String adjustReason;

  private String action;

  private String remark;

  private String issueby;

  private String methodName;

  private String amount;
  /**
   * 订单号,流水号
   */
  private String orderNo;



  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  private byte channel;

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getBonusPoint() {
    return bonusPoint;
  }

  public void setBonusPoint(String bonusPoint) {
    this.bonusPoint = bonusPoint;
  }

  public String getAdjustReason() {
    return adjustReason;
  }

  public void setAdjustReason(String adjustReason) {
    this.adjustReason = adjustReason;
  }

  public String getAction() {
    return action;
  }

  public String getRemark() {
    return remark;
  }

  public String getIssueby() {
    return issueby;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public void setIssueby(String issueby) {
    this.issueby = issueby;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public byte getChannel() {
    return channel;
  }

  public void setChannel(byte channel) {
    this.channel = channel;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }
}
