package com.rongyi.easy.settle.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xgq on 2015/9/22.
 */
public class PaymentStatementDto implements Serializable {

    private Integer id;

    private Byte type;

    private String batchNo;

    private Byte bussinessType;

    private Date cycleStartTime;

    private Date cycleEndTime;

    private String bussinessName;

    private Byte payChannel;

    private String payAccount;

    private String blankName;

    private Integer payTotal;

    private String bussinessEmail;

    private Date statusUpdateTime;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
