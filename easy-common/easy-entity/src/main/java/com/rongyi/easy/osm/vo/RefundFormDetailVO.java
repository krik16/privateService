package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.RefundEventEntity;
import com.rongyi.easy.rmmm.vo.ExpressPushVO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 退款列表
 *
 * @author wangjh7
 * @date 2017-04-15
 **/
public class RefundFormDetailVO extends RefundFormVO implements Serializable {
    //  退款运费
    private String refundExpressFee;
    // 退款说明
    private String appealComment;
    // 退款凭证
    private String picUrls;
    // 下个状态时间
    private Date nextStatusTime;
    // 购买金额
    private String totalAmount;
    // 实付金额
    private String payAmount;
    // 满减金额
    private String reductionFee;
    // 运费
    private String expressFee;
    // 物流信息Id
    private String expressInfoId;
    // 物流
    private ExpressPushVO expressPushVO;
    // 事件列表
    private List<RefundEventEntity> eventList;

    public String getAppealComment() {
        return appealComment;
    }

    public void setAppealComment(String appealComment) {
        this.appealComment = appealComment;
    }

    public String getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(String expressFee) {
        this.expressFee = expressFee;
    }

    public String getExpressInfoId() {
        return expressInfoId;
    }

    public void setExpressInfoId(String expressInfoId) {
        this.expressInfoId = expressInfoId;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public String getReductionFee() {
        return reductionFee;
    }

    public void setReductionFee(String reductionFee) {
        this.reductionFee = reductionFee;
    }

    public String getRefundExpressFee() {
        return refundExpressFee;
    }

    public void setRefundExpressFee(String refundExpressFee) {
        this.refundExpressFee = refundExpressFee;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ExpressPushVO getExpressPushVO() {
        return expressPushVO;
    }

    public void setExpressPushVO(ExpressPushVO expressPushVO) {
        this.expressPushVO = expressPushVO;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public List<RefundEventEntity> getEventList() {
        return eventList;
    }

    public void setEventList(List<RefundEventEntity> eventList) {
        this.eventList = eventList;
    }

    @Override
    public String toString() {
        return "RefundFormDetailVO{" +
                "appealComment='" + appealComment + '\'' +
                ", refundExpressFee='" + refundExpressFee + '\'' +
                ", picUrls='" + picUrls + '\'' +
                ", nextStatusTime=" + nextStatusTime +
                ", totalAmount='" + totalAmount + '\'' +
                ", payAmount='" + payAmount + '\'' +
                ", reductionFee='" + reductionFee + '\'' +
                ", expressFee='" + expressFee + '\'' +
                ", expressInfoId='" + expressInfoId + '\'' +
                "} " + super.toString();
    }
}
