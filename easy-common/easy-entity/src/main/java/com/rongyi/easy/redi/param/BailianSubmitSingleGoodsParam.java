package com.rongyi.easy.redi.param;


import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 
 * @author rongyi-13 2015年1月14日 下午5:41:38
 */
public class BailianSubmitSingleGoodsParam extends BaseParam implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;



  private String memberId; // 会员ID

  private String member_token; // 访问token令牌

  private String shoppingCartId; // 购物车id

  private String orderSourceCode; // //订购途径,1-app,2-微信,3-pc,4-大屏

  private String addressId;

  private List<BailianGoodsInfo> goodsList;

  private List<BailianCouponInfo> couponList; // 用券信息


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


  public List<BailianCouponInfo> getCouponList() {
    return couponList;
  }

  public void setCouponList(List<BailianCouponInfo> couponList) {
    this.couponList = couponList;
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

  public String getOrderSourceCode() {
    return orderSourceCode;
  }

  public void setOrderSourceCode(String orderSourceCode) {
    this.orderSourceCode = orderSourceCode;
  }

  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public List<BailianGoodsInfo> getGoodsList() {
    return goodsList;
  }

  public void setGoodsList(List<BailianGoodsInfo> goodsList) {
    this.goodsList = goodsList;
  }



}
