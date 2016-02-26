package com.rongyi.tms.web.controller.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * Created by hebo on 2016/2/26.
 */
public class SalesCommissionVO implements Serializable{
    private Integer id;
    private String commNo;//返佣流水号
    private String remarks;//返佣说明
    private String createAt;//佣金生成时间
    private Integer guideType;//导购类型：1-导购  2-买手
    private Integer registerType;//注册人类型
    private String invitePhone;//邀请人账号
    private String registerPhone;//注册人账号
    private BigDecimal commissionAmount;//佣金金额
    private String reason;//审核未通过原因
    private Integer status;//佣金状态( 1：商家待审核 2：财务待审核（商家审核通过） 3：财务审核通过 -1：商家审核不通过 -2：财务审核不通过   )

    private String orderNo;//首单订单号
    private String orderCreateAt;//订单创建时间
    private BigDecimal orderAmount;//订单金额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommNo() {
        return commNo;
    }

    public void setCommNo(String commNo) {
        this.commNo = commNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public String getInvitePhone() {
        return invitePhone;
    }

    public void setInvitePhone(String invitePhone) {
        this.invitePhone = invitePhone;
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderCreateAt() {
        return orderCreateAt;
    }

    public void setOrderCreateAt(String orderCreateAt) {
        this.orderCreateAt = orderCreateAt;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "SalesCommissionVO{" +
                "id=" + id +
                ", commNo='" + commNo + '\'' +
                ", remarks='" + remarks + '\'' +
                ", createAt='" + createAt + '\'' +
                ", guideType=" + guideType +
                ", registerType=" + registerType +
                ", invitePhone='" + invitePhone + '\'' +
                ", registerPhone='" + registerPhone + '\'' +
                ", commissionAmount=" + commissionAmount +
                ", reason='" + reason + '\'' +
                ", status=" + status +
                ", orderNo='" + orderNo + '\'' +
                ", orderCreateAt='" + orderCreateAt + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
