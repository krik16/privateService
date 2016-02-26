package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.tms.entity.v2.SalesCommission;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * Created by hebo on 2016/2/26.
 */
public class SalesCommissionVO extends SalesCommission implements Serializable{
    private Integer registerType;//注册人类型

    private String reason;//审核未通过原因
    private String orderNo;//首单订单号
    private String orderCreateAt;//订单创建时间
    private BigDecimal orderAmount;//订单金额

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
                "registerType=" + registerType +
                ", reason='" + reason + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderCreateAt='" + orderCreateAt + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
