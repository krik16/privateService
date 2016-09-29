/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class UserOperateVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer newCoupon = 0;//上次操作我的代金券之后领取的代金券数量
	private Integer newHongBao = 0;	//上次操作我的红包之后领取的红包数量
	private Integer newRebate = 0;//上次操作我的抵扣券之后领取的抵扣券数量
	private Integer newTempNum = 0;// 系统消息数量
	private Integer myIntegral = 0;//我的容颜值
	private Integer myCouponNum = 0;//我的代金券数量
	private Integer myHongBaoNum = 0;//我的红包数量
	private Integer myRebateNum = 0;//我的抵扣券数量
	private Integer invitaNum   =0;//推荐红包
	private Integer nonPayment = 0;//待付款订单数量（含商品订单和优惠券订单）
	private Integer nonReceived = 0;//待收货订单数量
	private Integer unPaidOrderCount = 0;//待付款商品订单数量
	private Integer unPaidCouponOrderCount = 0;//待付款优惠券订单数量
	private Boolean hasUnCheckedRepliedWish;//是否有已回复的未查看的心愿
	private String easyMoney;//容颜币
	private Integer afterSaleCount;//售后数量
	private Integer unEvalueCount;//待评价数量
	private Integer unReceiveCount2;//待收货数量（不包括待发货数量）
	private Integer unDeliverCount;//待发货数量

	public String getEasyMoney() {
		return easyMoney;
	}

	public void setEasyMoney(String easyMoney) {
		this.easyMoney = easyMoney;
	}

	public Integer getInvitaNum() {
		return invitaNum;
	}

	public void setInvitaNum(Integer invitaNum) {
		this.invitaNum = invitaNum;
	}

	public Boolean getHasUnCheckedRepliedWish() {
		return hasUnCheckedRepliedWish;
	}
	public void setHasUnCheckedRepliedWish(Boolean hasUnCheckedRepliedWish) {
		this.hasUnCheckedRepliedWish = hasUnCheckedRepliedWish;
	}
	public Integer getMyCouponNum() {
		return myCouponNum;
	}
	public void setMyCouponNum(Integer myCouponNum) {
		this.myCouponNum = myCouponNum;
	}
	public Integer getMyHongBaoNum() {
		return myHongBaoNum;
	}
	public void setMyHongBaoNum(Integer myHongBaoNum) {
		this.myHongBaoNum = myHongBaoNum;
	}
	public Integer getMyRebateNum() {
		return myRebateNum;
	}
	public void setMyRebateNum(Integer myRebateNum) {
		this.myRebateNum = myRebateNum;
	}
	public Integer getMyIntegral() {
		return myIntegral;
	}
	public void setMyIntegral(Integer myIntegral) {
		this.myIntegral = myIntegral;
	}
	public Integer getNewCoupon() {
		return newCoupon;
	}
	public void setNewCoupon(Integer newCoupon) {
		this.newCoupon = newCoupon;
	}
	public Integer getNewHongBao() {
		return newHongBao;
	}
	public void setNewHongBao(Integer newHongBao) {
		this.newHongBao = newHongBao;
	}
	public Integer getNewRebate() {
		return newRebate;
	}
	public void setNewRebate(Integer newRebate) {
		this.newRebate = newRebate;
	}
	public Integer getNewTempNum() {
		return newTempNum;
	}
	public void setNewTempNum(Integer newTempNum) {
		this.newTempNum = newTempNum;
	}
	public Integer getNonPayment() {
		return nonPayment;
	}
	public void setNonPayment(Integer nonPayment) {
		this.nonPayment = nonPayment;
	}
	public Integer getNonReceived() {
		return nonReceived;
	}
	public void setNonReceived(Integer nonReceived) {
		this.nonReceived = nonReceived;
	}
	public Integer getUnPaidOrderCount() {
		return unPaidOrderCount;
	}
	public void setUnPaidOrderCount(Integer unPaidOrderCount) {
		this.unPaidOrderCount = unPaidOrderCount;
	}
	public Integer getUnPaidCouponOrderCount() {
		return unPaidCouponOrderCount;
	}
	public void setUnPaidCouponOrderCount(Integer unPaidCouponOrderCount) {
		this.unPaidCouponOrderCount = unPaidCouponOrderCount;
	}
	
	public Integer getAfterSaleCount() {
		return afterSaleCount;
	}

	public void setAfterSaleCount(Integer afterSaleCount) {
		this.afterSaleCount = afterSaleCount;
	}
	
	public Integer getUnEvalueCount() {
		return unEvalueCount;
	}

	public void setUnEvalueCount(Integer unEvalueCount) {
		this.unEvalueCount = unEvalueCount;
	}

	public Integer getUnReceiveCount2() {
		return unReceiveCount2;
	}

	public void setUnReceiveCount2(Integer unReceiveCount2) {
		this.unReceiveCount2 = unReceiveCount2;
	}
	
	public Integer getUnDeliverCount() {
		return unDeliverCount;
	}

	public void setUnDeliverCount(Integer unDeliverCount) {
		this.unDeliverCount = unDeliverCount;
	}

	@Override
	public String toString() {
		return "UserOperateVO [newCoupon=" + newCoupon + ", newHongBao="
				+ newHongBao + ", newRebate=" + newRebate + ", newTempNum="
				+ newTempNum + ", myIntegral=" + myIntegral + ", myCouponNum="
				+ myCouponNum + ", myHongBaoNum=" + myHongBaoNum
				+ ", myRebateNum=" + myRebateNum + ", invitaNum=" + invitaNum
				+ ", nonPayment=" + nonPayment + ", nonReceived=" + nonReceived
				+ ", unPaidOrderCount=" + unPaidOrderCount
				+ ", unPaidCouponOrderCount=" + unPaidCouponOrderCount
				+ ", hasUnCheckedRepliedWish=" + hasUnCheckedRepliedWish
				+ ", easyMoney=" + easyMoney + ", afterSaleCount="
				+ afterSaleCount + ", unEvalueCount=" + unEvalueCount
				+ ", unReceiveCount2=" + unReceiveCount2 + ", unDeliverCount="
				+ unDeliverCount + "]";
	}
	
}
