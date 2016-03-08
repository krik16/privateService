package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.tms.entity.v2.SalesCommission;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * Created by hebo on 2016/2/26.
 */
public class SalesCommissionVO extends SalesCommission implements Serializable{
    private Integer registerType;//注册人类型

    private String reason;//审核未通过原因
    private String orderNo;//首单订单号
    private Date orderCreateAt;//订单创建时间
    private BigDecimal orderAmount;//订单金额

    private Integer commissionType; //返佣类型 1 容易逛、2 摩店、 3首单

    public Integer getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Integer commissionType) {
        this.commissionType = commissionType;
    }

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String getOrderNo() {
        return orderNo;
    }

    @Override
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderCreateAt() {
        return orderCreateAt;
    }

    public void setOrderCreateAt(Date orderCreateAt) {
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
                "registerType=" + registerType +
                ", reason='" + reason + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderCreateAt='" + orderCreateAt + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
