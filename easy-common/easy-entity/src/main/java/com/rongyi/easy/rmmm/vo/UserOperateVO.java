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
	private Integer nonPayment = 0;//待付款订单数量（含商品订单和优惠券订单）
	private Integer nonReceived = 0;//待收货订单数量
	private Integer unPaidOrderCount = 0;//待付款商品订单数量
	private Integer unPaidCouponOrderCount = 0;//待付款优惠券订单数量
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
	
}
