package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ApplicationFormEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3107656524101208105L;

	/** 主键id */
    private Integer id;

    /** 大订单号 */
    private String orderNo;

    /** 子订单号 */
    private String orderItemNo;

    /** 买家账号（会员编号） */
    private String buyerId;

    /** 微店id */
    private String weidianId;

    /** 图片列表（以";"隔开） */
    private String picUrls;

    /** 状态 0：申请退款 1：退款中 2：拒绝退款 3：已退款 4：待买家发货 5：带卖家收货 6：退款关闭*/
    private Integer status;

    /** 创建时间 */
    private Date createAt;

    /** 物流信息主键id */
    private String expressInfoId;

    /** 退货原因id */
    private Long refundReasonId;

    /** 退款类型id */
    private Long refundTypeId;

    /** 维权结束时间 */
    private Date endAt;

    /** 退款或维权说明 */
    private String appealComment;

    /** 退款单号' */
    private String refundNo;

    /** 退款金额 */
    private BigDecimal refundFee;

    /** 退款邮费金额 */
    private BigDecimal refundExpressFee;

    /** 退款来源 0：系统 1：用户'*/
    private Integer refundSource;

    /** 当前退款事件ID'*/
    private Integer orderEventId;

    /** 下次处理时间' */
    private Date nextStatusTime;

    /** 是否删除（买家）0 未删除 1 删除*/
    private Integer buyerDeleteFlag;

    /** 寄回地址ID*/
    private Integer extraId;

    /** 退款或维权说明 */
    private String buyerName;

    /** 申诉状态（1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭）*/
    private Integer complaintStatus;

    /** 更新时间 */
    private Date updateAt;

    private OrderEventEntity orderEvent;

    /**
     * 主键id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 大订单号
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 大订单号
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 子订单号
     * @return orderItemNo
     */
    public String getOrderItemNo() {
        return orderItemNo;
    }

    /**
     * 子订单号
     * @param orderItemNo
     */
    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
    }

    /**
     * 买家账号（会员编号）
     * @return buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * 买家账号（会员编号）
     * @param buyerId
     */
    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 微店id
     * @return weidianId
     */
    public String getWeidianId() {
        return weidianId;
    }

    /**
     * 微店id
     * @param weidianId
     */
    public void setWeidianId(String weidianId) {
        this.weidianId = weidianId;
    }

    /**
     * 图片列表（以";"隔开）
     * @return picUrls
     */
    public String getPicUrls() {
        return picUrls;
    }

    /**
     * 图片列表（以";"隔开）
     * @param picUrls
     */
    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * 状态 1申请退款 2商家拒绝处理 3已退款  4申请维权 5维权中 6维权结束
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 1申请退款 2商家拒绝处理 3已退款  4申请维权 5维权中 6维权结束
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 物流信息主键id
     * @return expressInfoId
     */
    public String getExpressInfoId() {
        return expressInfoId;
    }

    /**
     * 物流信息主键id
     * @param expressInfoId
     */
    public void setExpressInfoId(String expressInfoId) {
        this.expressInfoId = expressInfoId;
    }

    /**
     * 退货原因id
     * @return refundReasonId
     */
    public Long getRefundReasonId() {
        return refundReasonId;
    }

    /**
     * 退货原因id
     * @param refundReasonId
     */
    public void setRefundReasonId(Long refundReasonId) {
        this.refundReasonId = refundReasonId;
    }

    /**
     * 退款类型id
     * @return refundTypeId
     */
    public Long getRefundTypeId() {
        return refundTypeId;
    }

    /**
     * 退款类型id
     * @param refundTypeId
     */
    public void setRefundTypeId(Long refundTypeId) {
        this.refundTypeId = refundTypeId;
    }

    /**
     * 维权结束时间
     * @return endAt
     */
    public Date getEndAt() {
        return endAt;
    }

    /**
     * 维权结束时间
     * @param endAt
     */
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    /**
     * 退款或维权说明
     * @return appealComment
     */
    public String getAppealComment() {
        return appealComment;
    }

    /**
     * 退款或维权说明
     * @param appealComment
     */
    public void setAppealComment(String appealComment) {
        this.appealComment = appealComment;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

    public BigDecimal getRefundExpressFee() {
        return refundExpressFee;
    }

    public void setRefundExpressFee(BigDecimal refundExpressFee) {
        this.refundExpressFee = refundExpressFee;
    }

    public Integer getRefundSource() {
        return refundSource;
    }

    public void setRefundSource(Integer refundSource) {
        this.refundSource = refundSource;
    }

    public Integer getOrderEventId() {
        return orderEventId;
    }

    public void setOrderEventId(Integer orderEventId) {
        this.orderEventId = orderEventId;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public Integer getBuyerDeleteFlag() {
        return buyerDeleteFlag;
    }

    public void setBuyerDeleteFlag(Integer buyerDeleteFlag) {
        this.buyerDeleteFlag = buyerDeleteFlag;
    }

    public Integer getExtraId() {
        return extraId;
    }

    public void setExtraId(Integer extraId) {
        this.extraId = extraId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Integer getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(Integer complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public OrderEventEntity getOrderEvent() {
        return orderEvent;
    }

    public void setOrderEvent(OrderEventEntity orderEvent) {
        this.orderEvent = orderEvent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}