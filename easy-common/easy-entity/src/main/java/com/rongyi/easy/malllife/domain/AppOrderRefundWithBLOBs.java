package com.rongyi.easy.malllife.domain;

import com.rongyi.easy.malllife.constants.Constants;
import com.rongyi.easy.malllife.vo.UserInfoVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 插入退款记录所需Domain类
 * 
 * @author Lc 2014/10/24 15:25
 *
 */
public class AppOrderRefundWithBLOBs extends AppOrderRefund implements Serializable{
	private String note;

	private String rejectNote;

	public AppOrderRefundWithBLOBs() {

	}

	/**
	 * 插入退款记录所需构造方法
	 * @author Lc
	 * @param number
	 * @param totalFee
	 * @param refundWay
	 * @param refundReason
	 * @param user
	 * @param appOrderDetail
	 * @param appOrderInfo
	 */
	public AppOrderRefundWithBLOBs(Integer number, BigDecimal totalFee, String refundWay, String refundReason, UserInfoVO user,
			AppOrderDetail appOrderDetail, AppOrderInfo appOrderInfo) {

		// 退款原因
		this.note = refundReason;
		// 需要退款总额
		super.setNeedRefundAmount(totalFee);
		// 需要退款数量
		super.setNeedRefundNum(number);
		// 退款路径
		super.setRefundWay(refundWay);
		// 订单ID
		super.setOrderId(appOrderInfo.getOrderId());
		// 团购ID
		super.setActivityId(appOrderDetail.getActivityId());
		// 处理状态
		super.setStatus(Constants.RefundStatus.NOT_REFUND);
		// 商品ID
		super.setItemId(appOrderDetail.getItemId());
		// 商品名称
		super.setItemName(appOrderDetail.getItemName());
		// 买家ID
		super.setBuyerId(appOrderInfo.getBuyerId());
		// 买家名称
		super.setBuyerName(appOrderInfo.getBuyerName());
		// 买家手机
		super.setBuyerMobile(appOrderInfo.getBuyerMobile());
		// 更新时间
		super.setUpdateTime(new Date());
		// 申请时间
		super.setCreateTime(new Date());
		// 申请人
		super.setCreateBy(user.getUserId());
		// 对应订单详情表的ID
		super.setOrderDetailId(appOrderDetail.getId());
		// 退款支付方式
		if(appOrderInfo.getTradeWay() != null){
			super.setPayment(appOrderInfo.getTradeWay().toString());
		}
		// 退款账号
		if(appOrderInfo.getBuyerPayId() != null){
			super.setPayAccount(appOrderInfo.getBuyerPayId()); 	
		}else{
			super.setPayAccount(appOrderInfo.getBuyerEmail()); 	
		}
       	
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	public String getRejectNote() {
		return rejectNote;
	}

	public void setRejectNote(String rejectNote) {
		this.rejectNote = rejectNote == null ? null : rejectNote.trim();
	}
}