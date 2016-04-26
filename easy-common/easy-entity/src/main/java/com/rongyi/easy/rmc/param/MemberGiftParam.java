package com.rongyi.easy.rmc.param;

import java.io.Serializable;

import com.rongyi.core.common.Page;
import com.rongyi.easy.base.param.BaseParam;

public class MemberGiftParam extends BaseParam implements Serializable {

  private static final long serialVersionUID = -1861395988338763425L;
  /** 商场编码 */
  private String mallId;
  /** 会员卡号 */
  private String memberNo;
  /**
   * 手机号
   */
  private String phone;
  /**
   * 数量
   */
  private Integer pageSize;
  /**
   * 当前页
   */
  private Integer currentPage;

  /** 兑换数量 */
  private String redeemQty;
  /**
   * 礼品ID
   */
  private String giftId;
  /**
   * 会员名字
   */
  private String memberName;
  /**
   * 1:发布时间;2:所需积分数量；3：积分产品总数量；4：积分商品已购买数量。默认值为1
   */
  private String order_by;
  /**
   * 0:正序;1:倒序。默认1
   */
  private String order_va;
  /**
   * 起始时间
   */
  private String startDate;
  /**
   * 结束时间
   */
  private String endDate;

  private int channel;
  private Page page;
  /**
   * 0:所有1:未发布;2:发布中;3:已过期。
   */
  private Integer validity;
  /**
   * 礼品积分
   */
  private Integer integral;


  public Integer getIntegral() {
    return integral;
  }

  public void setIntegral(Integer integral) {
    this.integral = integral;
  }

  public Integer getValidity() {
    return validity;
  }

  public void setValidity(Integer validity) {
    this.validity = validity;
  }

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

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

  public String getOrder_by() {
    return order_by;
  }

  public void setOrder_by(String order_by) {
    this.order_by = order_by;
  }

  public String getOrder_va() {
    return order_va;
  }

  public void setOrder_va(String order_va) {
    this.order_va = order_va;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public String getGiftId() {
    return giftId;
  }

  public void setGiftId(String giftId) {
    this.giftId = giftId;
  }

  public String getRedeemQty() {
    return redeemQty;
  }

  public void setRedeemQty(String redeemQty) {
    this.redeemQty = redeemQty;
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


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

/** 
* @Title: toString 
* @Description: TODO(这里用一句话描述这个方法的作用) 
* @param @return    设定文件 
* @author shaozhou
* @date 2016年4月9日 下午2:50:51
* @throws 
*/
@Override
public String toString() {
	return "MemberGiftParam [mallId=" + mallId + ", memberNo=" + memberNo + ", phone=" + phone + ", pageSize="
			+ pageSize + ", currentPage=" + currentPage + ", redeemQty=" + redeemQty + ", giftId=" + giftId
			+ ", memberName=" + memberName + ", order_by=" + order_by + ", order_va=" + order_va + ", startDate="
			+ startDate + ", endDate=" + endDate + ", channel=" + channel + ", page=" + page + ", validity=" + validity
			+ ", integral=" + integral + "]";
}
}
