package com.rongyi.easy.rmc.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.domain.member.IntegralChangeAction;

/**
 * 
 * ClassName: MemberBonusParam <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 会员积分调整. <br/>
 * date: 2015年7月19日 下午8:49:38 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class MemberBonusParam extends BaseParam implements Serializable {


  private static final long serialVersionUID = 8805668220362809361L;

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
  private int bonusPoint;
  /**
   * 调整理由
   */
  private String adjustReason;

  /**
   * 订单号,流水号
   */
  private String orderNo;
  /**
   * 手机
   */
  private String phone;
  /**
   * 积分变化动作
   */
  private IntegralChangeAction action;



  public IntegralChangeAction getAction() {
    return action;
  }

  public void setAction(IntegralChangeAction action) {
    this.action = action;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }


  public int getBonusPoint() {
    return bonusPoint;
  }

  public void setBonusPoint(int bonusPoint) {
    this.bonusPoint = bonusPoint;
  }

  public String getAdjustReason() {
    return adjustReason;
  }

  public void setAdjustReason(String adjustReason) {
    this.adjustReason = adjustReason;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


}
