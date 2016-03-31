package com.rongyi.easy.redi.param;


import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 
 * @author rongyi-13 2015年1月14日 下午5:41:38
 */
public class BailianSubmitOrderParam extends BaseParam implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;

  private String memberId;

  private String member_token;

  private String shoppingCartId;

  private List<BailianOrderInfo> orderList; // 订单信息

  // private List<BailianCouponInfo> couponList ; //用券信息

  private String totalOrderAmount; // 各个子订单商品总金额

  private String totalCouponAmout; // 订单优惠金额

  private String totalDeliveryCharge; // 运费

  private String totalOrderPay; // 订单实际应支付金额


  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getMember_token() {
    return member_token;
  }

  public void setMember_token(String member_token) {
    this.member_token = member_token;
  }

  public String getShoppingCartId() {
    return shoppingCartId;
  }

  public void setShoppingCartId(String shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public List<BailianOrderInfo> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<BailianOrderInfo> orderList) {
    this.orderList = orderList;
  }

  // public List<BailianCouponInfo> getCouponList() {
  // return couponList;
  // }
  //
  // public void setCouponList(List<BailianCouponInfo> couponList) {
  // this.couponList = couponList;
  // }

  public String getTotalOrderAmount() {
    return totalOrderAmount;
  }

  public void setTotalOrderAmount(String totalOrderAmount) {
    this.totalOrderAmount = totalOrderAmount;
  }

  public String getTotalCouponAmout() {
    return totalCouponAmout;
  }

  public void setTotalCouponAmout(String totalCouponAmout) {
    this.totalCouponAmout = totalCouponAmout;
  }

  public String getTotalDeliveryCharge() {
    return totalDeliveryCharge;
  }

  public void setTotalDeliveryCharge(String totalDeliveryCharge) {
    this.totalDeliveryCharge = totalDeliveryCharge;
  }

  public String getTotalOrderPay() {
    return totalOrderPay;
  }

  public void setTotalOrderPay(String totalOrderPay) {
    this.totalOrderPay = totalOrderPay;
  }


}
