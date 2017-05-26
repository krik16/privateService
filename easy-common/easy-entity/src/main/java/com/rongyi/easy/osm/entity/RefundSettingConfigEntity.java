package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

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
    // 状态（0：开启 1：关闭）
    private int status;
    // 售后、维权电话
    private String contactTel;
    // 客户单笔订单下单商品可重复退款次数上限
    private int maxRefundCount;
    // 最大申请申诉次数
    private int maxComplaintCount;
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
    // 退款间隔时间
    private int intevalRefundTime;
    // JSON 格式内容
    private String content;
    // 1：退款/维权
    private int configType;
    // 创建时间
    private Date createAt;
    // 创建人
    private String createBy;
    // 订单确认收货到交易成功时间
    private int maxTimeoutForOrderClose;
    // 系统默认订单确认收货时间
    private int maxTimeoutForOrderCofirm;
    // 卖家超时未发货订单关闭时间
    private int maxTimeoutForOrderDelivery;
    // 买家逾期未支付订单关闭时间
    private int maxTimeoutForOrderPayment;

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

    public int getIntevalRefundTime() {
        return intevalRefundTime;
    }

    public void setIntevalRefundTime(int intevalRefundTime) {
        this.intevalRefundTime = intevalRefundTime;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
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

    public int getMaxComplaintCount() {
        return maxComplaintCount;
    }

    public void setMaxComplaintCount(int maxComplaintCount) {
        this.maxComplaintCount = maxComplaintCount;
    }

    public int getConfigType() {
        return configType;
    }

    public String getContent() {
        return content;
    }

    public void setConfigType(int configType) {
        this.configType = configType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public int getMaxTimeoutForOrderClose() {
        return maxTimeoutForOrderClose;
    }

    public void setMaxTimeoutForOrderClose(int maxTimeoutForOrderClose) {
        this.maxTimeoutForOrderClose = maxTimeoutForOrderClose;
    }

    public int getMaxTimeoutForOrderCofirm() {
        return maxTimeoutForOrderCofirm;
    }

    public void setMaxTimeoutForOrderCofirm(int maxTimeoutForOrderCofirm) {
        this.maxTimeoutForOrderCofirm = maxTimeoutForOrderCofirm;
    }

    public int getMaxTimeoutForOrderDelivery() {
        return maxTimeoutForOrderDelivery;
    }

    public void setMaxTimeoutForOrderDelivery(int maxTimeoutForOrderDelivery) {
        this.maxTimeoutForOrderDelivery = maxTimeoutForOrderDelivery;
    }

    public int getMaxTimeoutForOrderPayment() {
        return maxTimeoutForOrderPayment;
    }

    public void setMaxTimeoutForOrderPayment(int maxTimeoutForOrderPayment) {
        this.maxTimeoutForOrderPayment = maxTimeoutForOrderPayment;
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
                ", content='" + content + '\'' +
                ", configType=" + configType +
                ", createAt=" + createAt +
                ", createBy='" + createBy + '\'' +
                ", maxTimeoutForOrderClose=" + maxTimeoutForOrderClose +
                ", maxTimeoutForOrderCofirm=" + maxTimeoutForOrderCofirm +
                ", maxTimeoutForOrderDelivery=" + maxTimeoutForOrderDelivery +
                ", maxTimeoutForOrderPayment=" + maxTimeoutForOrderPayment +
                '}';
    }

    /**
     * 装换成JSON
     */
    public String toJson() {
        return "{" +
                "\"maxRefundCount\":" + maxRefundCount +
                ", \"maxComplaintCount\":" + maxComplaintCount +
                ", \"limitTimeForMoney\":" + limitTimeForMoney +
                ", \"limitTimeForCommodity\":" + limitTimeForCommodity +
                ", \"limitTimeForNonDelivery\":" + limitTimeForNonDelivery +
                ", \"limitTimeForNonVisit\":" + limitTimeForNonVisit +
                ", \"limitTimeForNonCofirm\":" + limitTimeForNonCofirm +
                ", \"maxComplaintTime\":" + maxComplaintTime +
                ", \"intevalRefundTime\":" + intevalRefundTime +
                ", \"chiefId\":\"" + chiefId + "\"" +
                ", \"id\":" + id +
                ", \"status\":" + status +
                ", \"isDeleted\":" + isDeleted +
                ", \"configType\":" + configType +
                ", \"contactTel\":\"" + contactTel + "\"" +
                ", \"maxTimeoutForOrderClose\":" + maxTimeoutForOrderClose +
                ", \"maxTimeoutForOrderCofirm\":" + maxTimeoutForOrderCofirm +
                ", \"maxTimeoutForOrderDelivery\":" + maxTimeoutForOrderDelivery +
                ", \"maxTimeoutForOrderPayment\":" + maxTimeoutForOrderPayment +
                '}';
    }

    /**
     * 初始化
     */
    public void init(String chiefId) {
        this.chiefId = chiefId;
        this.isDeleted = 1;
        this.status = 1;///< 关闭状态
        this.maxRefundCount = 5;
        this.maxComplaintCount = 1;
        this.limitTimeForMoney = 5 * 24 * 3600;
        this.limitTimeForCommodity = 5 * 24 * 3600;
        this.limitTimeForNonDelivery = 5 * 24 * 3600;
        this.limitTimeForNonVisit = 7 * 24 * 3600;
        this.limitTimeForNonCofirm = 7 * 24 * 3600;
        this.maxComplaintTime = 3 * 24 * 3600;
        this.intevalRefundTime = 24 * 3600;
        this.configType = 1;
        this.maxTimeoutForOrderClose = 1 * 60;
        this.maxTimeoutForOrderCofirm = 10 * 24 * 60 * 60;
        this.maxTimeoutForOrderDelivery = 10 * 24 * 60 * 60;
        this.maxTimeoutForOrderPayment = 60 * 60;
    }
}
