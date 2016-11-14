package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 统一用户（微信）
 *
 * @author wangjh7
 * @date 2016-11-14
 */
public class UserCenterParam implements Serializable {
    // 用户ID
    private String userId;
    // mallid
    private String mallId;
    // 积分数--> point
    private int creditNumber;
    // 积分操作类型
    private String opType;
    // 订单号 --> order_no
    private String orderNo;
    // 平台 --> platform
    private String orderChannel;
    // 描述 -->detail
    private String remark;

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserCenterParam{" +
                "creditNumber=" + creditNumber +
                ", userId='" + userId + '\'' +
                ", mallId='" + mallId + '\'' +
                ", opType=" + opType +
                ", orderNo='" + orderNo + '\'' +
                ", orderChannel='" + orderChannel + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
