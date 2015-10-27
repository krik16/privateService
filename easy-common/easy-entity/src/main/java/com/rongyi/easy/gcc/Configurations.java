package com.rongyi.easy.gcc;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

@Entity("rmmm_configurations")
public class Configurations implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 964113614463716857L;

	@Id
	private ObjectId id;

	private Date createAt;

	/* 维权次数上限 */
	private int apealCountMax = 0;
	/* 退款次数上限 */
	private int refundCountMax = 0 ;
	/* 子订单退款超时时间 */
	private long subOrderRefundWaitMax = 0L;
	/* 订单关闭超时时间 */
	private long orderCloseWaitMax = 0L;
	/* 订单买家收货确认超时时间 */
	private long commodityCommitWaitMax = 0L;
	/* 订单卖家发货超时时间 */
	private long commodityDeliverWaitMax = 0L;
	/* 订单买家付款超时时间 */
	private long paymentWaitMax = 0L;
//	/* 子订单维权超时时间 */
//	private long subOrderSafeguardWaitMax;
	/* 官方介入超时时间 */
	private long officialJudgementWaitMax = 0L;
	/* 评价关闭时间 */
	private long commentCloseWaitMax = 0L;

	/**
	 * 以下是买手相关的配置
	 */
	/* 维权次数上限 */
	private int maiShouApealCountMax = 0;
	/* 退款次数上限 */
	private int maiShouRefundCountMax = 0 ;
	/* 子订单退款超时时间 */
	private long maiShouSubOrderRefundWaitMax = 0L;
	/* 订单关闭超时时间 */
	private long maiShouOrderCloseWaitMax = 0L;
	/* 订单买家收货确认超时时间 */
	private long maiShouCommodityCommitWaitMax = 0L;
	/* 订单卖家发货超时时间 */
	private long maiShouCommodityDeliverWaitMax = 0L;
	/* 订单买家付款超时时间 */
	private long maiShouPaymentWaitMax = 0L;
	//	/* 子订单维权超时时间 */
//	private long maiShouSubOrderSafeguardWaitMax;
	/* 官方介入超时时间 */
	private long maiShouOfficialJudgementWaitMax = 0L;
	/* 评价关闭时间 */
	private long maiShouCommentCloseWaitMax = 0L;


	public int getRefundCountMax() {
		return refundCountMax;
	}

	public void setRefundCountMax(int refundCountMax) {
		this.refundCountMax = refundCountMax;
	}

	public long getSubOrderRefundWaitMax() {
		return subOrderRefundWaitMax;
	}

	public void setSubOrderRefundWaitMax(long subOrderRefundWaitMax) {
		this.subOrderRefundWaitMax = subOrderRefundWaitMax;
	}

	public long getOrderCloseWaitMax() {
		return orderCloseWaitMax;
	}

	public void setOrderCloseWaitMax(long orderCloseWaitMax) {
		this.orderCloseWaitMax = orderCloseWaitMax;
	}

	public long getCommodityCommitWaitMax() {
		return commodityCommitWaitMax;
	}

	public void setCommodityCommitWaitMax(long commodityCommitWaitMax) {
		this.commodityCommitWaitMax = commodityCommitWaitMax;
	}

	public long getCommodityDeliverWaitMax() {
		return commodityDeliverWaitMax;
	}

	public void setCommodityDeliverWaitMax(long commodityDeliverWaitMax) {
		this.commodityDeliverWaitMax = commodityDeliverWaitMax;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public int getApealCountMax() {
		return apealCountMax;
	}

	public void setApealCountMax(int apealCountMax) {
		this.apealCountMax = apealCountMax;
	}

	public long getPaymentWaitMax() {
		return paymentWaitMax;
	}

	public void setPaymentWaitMax(long paymentWaitMax) {
		this.paymentWaitMax = paymentWaitMax;
	}

//	public long getSubOrderSafeguardWaitMax() {
//		return subOrderSafeguardWaitMax;
//	}
//
//	public void setSubOrderSafeguardWaitMax(long subOrderSafeguardWaitMax) {
//		this.subOrderSafeguardWaitMax = subOrderSafeguardWaitMax;
//	}

	public long getOfficialJudgementWaitMax() {
		return officialJudgementWaitMax;
	}

	public void setOfficialJudgementWaitMax(long officialJudgementWaitMax) {
		this.officialJudgementWaitMax = officialJudgementWaitMax;
	}

	public long getCommentCloseWaitMax() {
		return commentCloseWaitMax;
	}

	public void setCommentCloseWaitMax(long commentCloseWaitMax) {
		this.commentCloseWaitMax = commentCloseWaitMax;
	}

	public int getMaiShouApealCountMax() {
		return maiShouApealCountMax;
	}

	public void setMaiShouApealCountMax(int maiShouApealCountMax) {
		this.maiShouApealCountMax = maiShouApealCountMax;
	}

	public int getMaiShouRefundCountMax() {
		return maiShouRefundCountMax;
	}

	public void setMaiShouRefundCountMax(int maiShouRefundCountMax) {
		this.maiShouRefundCountMax = maiShouRefundCountMax;
	}

	public long getMaiShouSubOrderRefundWaitMax() {
		return maiShouSubOrderRefundWaitMax;
	}

	public void setMaiShouSubOrderRefundWaitMax(long maiShouSubOrderRefundWaitMax) {
		this.maiShouSubOrderRefundWaitMax = maiShouSubOrderRefundWaitMax;
	}

	public long getMaiShouOrderCloseWaitMax() {
		return maiShouOrderCloseWaitMax;
	}

	public void setMaiShouOrderCloseWaitMax(long maiShouOrderCloseWaitMax) {
		this.maiShouOrderCloseWaitMax = maiShouOrderCloseWaitMax;
	}

	public long getMaiShouCommodityCommitWaitMax() {
		return maiShouCommodityCommitWaitMax;
	}

	public void setMaiShouCommodityCommitWaitMax(long maiShouCommodityCommitWaitMax) {
		this.maiShouCommodityCommitWaitMax = maiShouCommodityCommitWaitMax;
	}

	public long getMaiShouCommodityDeliverWaitMax() {
		return maiShouCommodityDeliverWaitMax;
	}

	public void setMaiShouCommodityDeliverWaitMax(long maiShouCommodityDeliverWaitMax) {
		this.maiShouCommodityDeliverWaitMax = maiShouCommodityDeliverWaitMax;
	}

	public long getMaiShouPaymentWaitMax() {
		return maiShouPaymentWaitMax;
	}

	public void setMaiShouPaymentWaitMax(long maiShouPaymentWaitMax) {
		this.maiShouPaymentWaitMax = maiShouPaymentWaitMax;
	}

	public long getMaiShouOfficialJudgementWaitMax() {
		return maiShouOfficialJudgementWaitMax;
	}

	public void setMaiShouOfficialJudgementWaitMax(long maiShouOfficialJudgementWaitMax) {
		this.maiShouOfficialJudgementWaitMax = maiShouOfficialJudgementWaitMax;
	}

	public long getMaiShouCommentCloseWaitMax() {
		return maiShouCommentCloseWaitMax;
	}

	public void setMaiShouCommentCloseWaitMax(long maiShouCommentCloseWaitMax) {
		this.maiShouCommentCloseWaitMax = maiShouCommentCloseWaitMax;
	}
}
