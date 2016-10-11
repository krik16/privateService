package com.rongyi.easy.settle.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xgq on 2015/9/22.
 */
public class PaymentStatementDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5216265731481877728L;

    private Integer id;

    private Byte type;

    private String batchNo;

    private String ruleCode;

    private Byte bussinessType;

    private Date cycleStartTime;

    private Date cycleEndTime;

    private String bussinessName;

    private Byte payChannel;

    private String payAccount;

    private String blankName;

    private Integer payTotal;

    private String bussinessEmail;

    private String bussinessId;

    private String desc;

    private Date statusUpdateTime;

    private Byte status;

    private Date createAt;

    private Integer paymentId;

    /**  付款单号 */
    private String payNo;

    private Date payTime;

    private String tradeNo;

    /**  支付姓名 */
    private String payName;

    /**
     * 下载人
     */
    private String downLoadUser;

    /**
     * 下载时间
     */
    private Date downLoadTime;

    /**
     * 预计付款时间
     */
    private Date predictPayTime;

    /**
     * 付款模式
     */
    private Byte payMode;

    /**
     * 滚动类型
     */
    private Byte rollType;

    /**
     * 滚动日期
     */
    private String rollDay;

    /**
     * 操作时间
     */
    private Date opTime;

    /**
     * 再次支付
     */
    private boolean rePay = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Byte getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(Byte bussinessType) {
        this.bussinessType = bussinessType;
    }

    public Date getCycleStartTime() {
        return cycleStartTime;
    }

    public void setCycleStartTime(Date cycleStartTime) {
        this.cycleStartTime = cycleStartTime;
    }

    public Date getCycleEndTime() {
        return cycleEndTime;
    }

    public void setCycleEndTime(Date cycleEndTime) {
        this.cycleEndTime = cycleEndTime;
    }

    public String getBussinessName() {
        return bussinessName;
    }

    public void setBussinessName(String bussinessName) {
        this.bussinessName = bussinessName;
    }

    public Byte getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Byte payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getBlankName() {
        return blankName;
    }

    public void setBlankName(String blankName) {
        this.blankName = blankName;
    }

    public Integer getPayTotal() {
        return payTotal;
    }

    public void setPayTotal(Integer payTotal) {
        this.payTotal = payTotal;
    }

    public String getBussinessEmail() {
        return bussinessEmail;
    }

    public void setBussinessEmail(String bussinessEmail) {
        this.bussinessEmail = bussinessEmail;
    }

    public Date getStatusUpdateTime() {
        return statusUpdateTime;
    }

    public void setStatusUpdateTime(Date statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDownLoadUser() {
        return downLoadUser;
    }

    public void setDownLoadUser(String downLoadUser) {
        this.downLoadUser = downLoadUser;
    }

    public Date getDownLoadTime() {
        return downLoadTime;
    }

    public void setDownLoadTime(Date downLoadTime) {
        this.downLoadTime = downLoadTime;
    }

    public Date getPredictPayTime() {
        return predictPayTime;
    }

    public void setPredictPayTime(Date predictPayTime) {
        this.predictPayTime = predictPayTime;
    }

    public Byte getPayMode() {
        return payMode;
    }

    public void setPayMode(Byte payMode) {
        this.payMode = payMode;
    }

    public Byte getRollType() {
        return rollType;
    }

    public void setRollType(Byte rollType) {
        this.rollType = rollType;
    }

    public String getRollDay() {
        return rollDay;
    }

    public void setRollDay(String rollDay) {
        this.rollDay = rollDay;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public boolean isRePay() {
        return rePay;
    }

    public void setRePay(boolean rePay) {
        this.rePay = rePay;
    }
}
