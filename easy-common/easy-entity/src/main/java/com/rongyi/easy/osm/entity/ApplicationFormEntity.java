package com.rongyi.easy.osm.entity;

import java.io.Serializable;
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

    /** 状态 1申请退款 2商家拒绝处理 3已退款  4申请维权 5维权中 6维权结束 7放弃退款 8放弃维权*/
    private Integer status;

    /** 拒绝退款理由 */
    private String rejectReason;

    /** 维权结论 */
    private String appealResult;

    /** 创建时间 */
    private Date createAt;

    /** 商家处理退款时间 */
    private Date sellerTime;

    /** 物流信息主键id */
    private String expressInfoId;

    /** 退货原因id */
    private Long refundReasonId;

    /** 退款类型id */
    private Long refundTypeId;

    /** 官方介入时间 */
    private Date agentCreateAt;

    /** 官方描述 */
    private String agentComment;

    /** 维权结束时间 */
    private Date endAt;

    /** 退款或维权说明 */
    private String appealComment;

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
     * 拒绝退款理由
     * @return rejectReason
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * 拒绝退款理由
     * @param rejectReason
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * 维权结论
     * @return appealResult
     */
    public String getAppealResult() {
        return appealResult;
    }

    /**
     * 维权结论
     * @param appealResult
     */
    public void setAppealResult(String appealResult) {
        this.appealResult = appealResult;
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
     * 商家处理退款时间
     * @return sellerTime
     */
    public Date getSellerTime() {
        return sellerTime;
    }

    /**
     * 商家处理退款时间
     * @param sellerTime
     */
    public void setSellerTime(Date sellerTime) {
        this.sellerTime = sellerTime;
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
     * 官方介入时间
     * @return agentCreateAt
     */
    public Date getAgentCreateAt() {
        return agentCreateAt;
    }

    /**
     * 官方介入时间
     * @param agentCreateAt
     */
    public void setAgentCreateAt(Date agentCreateAt) {
        this.agentCreateAt = agentCreateAt;
    }

    /**
     * 官方描述
     * @return agentComment
     */
    public String getAgentComment() {
        return agentComment;
    }

    /**
     * 官方描述
     * @param agentComment
     */
    public void setAgentComment(String agentComment) {
        this.agentComment = agentComment;
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
}