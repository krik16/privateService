package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 退款配置（请求参数）
 *
 * @author wangjh7
 * @date 2017-04-06
 **/
public class RefundConfigParam implements Serializable {
    // 主账号关联的店铺/商城ID
    private String chiefId;
    // 状态（1：开启 0：关闭）
    private int status;
    // 售后、维权电话
    private String contactTel;
    // 客户单笔订单下单商品可重复退款次数上限
    private int maxRefundCount;
    // 买家申请退款，店铺几天未处理自动退款（单位：秒）
    private int limitTimeForMoney;
    // 买家申请退货退款，店铺几天未处理自动退款（单位：秒）
    private int limitTimeForCommodity;
    // 店铺同意退货退款后，买家几天未寄出退款商品视为放弃退款	（单位：秒）
    private int limitTimeForNonDelivery;
    // 店铺同意退货退款后，买家几天未上门退货视为放弃退款（单位：秒）
    private int limitTimeForNonVisit;
    // 买家寄出退款商品后，店铺几天未确认收货，则自动退款（单位：秒）
    private int limitTimeForNonCofirm;
    // 店铺拒绝接收退货后，允许买家几天内发起申诉（单位：秒）
    private int maxComplaintTime;

    public String getChiefId() {
        return chiefId;
    }

    public void setChiefId(String chiefId) {
        this.chiefId = chiefId;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public int getLimitTimeForCommodity() {
        return limitTimeForCommodity;
    }

    public void setLimitTimeForCommodity(int limitTimeForCommodity) {
        this.limitTimeForCommodity = limitTimeForCommodity;
    }

    public int getLimitTimeForMoney() {
        return limitTimeForMoney;
    }

    public void setLimitTimeForMoney(int limitTimeForMoney) {
        this.limitTimeForMoney = limitTimeForMoney;
    }

    public int getLimitTimeForNonCofirm() {
        return limitTimeForNonCofirm;
    }

    public void setLimitTimeForNonCofirm(int limitTimeForNonCofirm) {
        this.limitTimeForNonCofirm = limitTimeForNonCofirm;
    }

    public int getLimitTimeForNonDelivery() {
        return limitTimeForNonDelivery;
    }

    public void setLimitTimeForNonDelivery(int limitTimeForNonDelivery) {
        this.limitTimeForNonDelivery = limitTimeForNonDelivery;
    }

    public int getLimitTimeForNonVisit() {
        return limitTimeForNonVisit;
    }

    public void setLimitTimeForNonVisit(int limitTimeForNonVisit) {
        this.limitTimeForNonVisit = limitTimeForNonVisit;
    }

    public int getMaxComplaintTime() {
        return maxComplaintTime;
    }

    public void setMaxComplaintTime(int maxComplaintTime) {
        this.maxComplaintTime = maxComplaintTime;
    }

    public int getMaxRefundCount() {
        return maxRefundCount;
    }

    public void setMaxRefundCount(int maxRefundCount) {
        this.maxRefundCount = maxRefundCount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RefundSettingConfigEntity{" +
                "chiefId='" + chiefId + '\'' +
                ", status=" + status +
                ", contactTel='" + contactTel + '\'' +
                ", maxRefundCount=" + maxRefundCount +
                ", limitTimeForMoney=" + limitTimeForMoney +
                ", limitTimeForCommodity=" + limitTimeForCommodity +
                ", limitTimeForNonDelivery=" + limitTimeForNonDelivery +
                ", limitTimeForNonVisit=" + limitTimeForNonVisit +
                ", limitTimeForNonCofirm=" + limitTimeForNonCofirm +
                ", maxComplaintTime=" + maxComplaintTime +
                '}';
    }
}
