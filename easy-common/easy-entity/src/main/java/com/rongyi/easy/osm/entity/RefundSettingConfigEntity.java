package com.rongyi.easy.osm.entity;

import java.io.Serializable;

/**
 * 退款配置信息
 *
 * @author wangjh7
 * @date 2017-04-06
 **/
public class RefundSettingConfigEntity implements Serializable {
    private int id;
    // 主账号关联的店铺/商城ID
    private String chiefId;
    // 是否删除 0：未删除 1：删除
    private int isDeleted;
    // 状态（1：开启 0：关闭）
    private Integer status;
    // 售后、维权电话
    private String contactTel;
    // 客户单笔订单下单商品可重复退款次数上限
    private Integer maxRefundCount;
    // 最大申请申诉次数
    private Integer maxComplaintCount;
    // 买家申请退款，店铺几天未处理自动退款（单位：秒）
    private Integer limitTimeForMoney;
    // 买家申请退货退款，店铺几天未处理自动退款（单位：秒）
    private Integer limitTimeForCommodity;
    // 店铺同意退货退款后，买家几天未寄出退款商品视为放弃退款	（单位：秒）
    private Integer limitTimeForNonDelivery;
    // 店铺同意退货退款后，买家几天未上门退货视为放弃退款（单位：秒）
    private Integer limitTimeForNonVisit;
    // 买家寄出退款商品后，店铺几天未确认收货，则自动退款（单位：秒）
    private Integer limitTimeForNonCofirm;
    // 店铺拒绝接收退货后，允许买家几天内发起申诉（单位：秒）
    private Integer maxComplaintTime;
    // 退款间隔时间
    private Integer intevalRefundTime;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIntevalRefundTime() {
        return intevalRefundTime;
    }

    public void setIntevalRefundTime(Integer intevalRefundTime) {
        this.intevalRefundTime = intevalRefundTime;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getLimitTimeForCommodity() {
        return limitTimeForCommodity;
    }

    public void setLimitTimeForCommodity(Integer limitTimeForCommodity) {
        this.limitTimeForCommodity = limitTimeForCommodity;
    }

    public Integer getLimitTimeForMoney() {
        return limitTimeForMoney;
    }

    public void setLimitTimeForMoney(Integer limitTimeForMoney) {
        this.limitTimeForMoney = limitTimeForMoney;
    }

    public Integer getLimitTimeForNonCofirm() {
        return limitTimeForNonCofirm;
    }

    public void setLimitTimeForNonCofirm(Integer limitTimeForNonCofirm) {
        this.limitTimeForNonCofirm = limitTimeForNonCofirm;
    }

    public Integer getLimitTimeForNonDelivery() {
        return limitTimeForNonDelivery;
    }

    public void setLimitTimeForNonDelivery(Integer limitTimeForNonDelivery) {
        this.limitTimeForNonDelivery = limitTimeForNonDelivery;
    }

    public Integer getLimitTimeForNonVisit() {
        return limitTimeForNonVisit;
    }

    public void setLimitTimeForNonVisit(Integer limitTimeForNonVisit) {
        this.limitTimeForNonVisit = limitTimeForNonVisit;
    }

    public Integer getMaxComplaintTime() {
        return maxComplaintTime;
    }

    public void setMaxComplaintTime(Integer maxComplaintTime) {
        this.maxComplaintTime = maxComplaintTime;
    }

    public Integer getMaxRefundCount() {
        return maxRefundCount;
    }

    public void setMaxRefundCount(Integer maxRefundCount) {
        this.maxRefundCount = maxRefundCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMaxComplaintCount() {
        return maxComplaintCount;
    }

    public void setMaxComplaintCount(Integer maxComplaintCount) {
        this.maxComplaintCount = maxComplaintCount;
    }

    @Override
    public String toString() {
        return "RefundSettingConfigEntity{" +
                "chiefId='" + chiefId + '\'' +
                ", id=" + id +
                ", isDeleted=" + isDeleted +
                ", status=" + status +
                ", contactTel='" + contactTel + '\'' +
                ", maxRefundCount=" + maxRefundCount +
                ", maxComplaintCount=" + maxComplaintCount +
                ", limitTimeForMoney=" + limitTimeForMoney +
                ", limitTimeForCommodity=" + limitTimeForCommodity +
                ", limitTimeForNonDelivery=" + limitTimeForNonDelivery +
                ", limitTimeForNonVisit=" + limitTimeForNonVisit +
                ", limitTimeForNonCofirm=" + limitTimeForNonCofirm +
                ", maxComplaintTime=" + maxComplaintTime +
                ", intevalRefundTime=" + intevalRefundTime +
                '}';
    }
}
