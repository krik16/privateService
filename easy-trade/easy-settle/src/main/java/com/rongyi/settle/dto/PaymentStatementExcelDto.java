package com.rongyi.settle.dto;

import java.util.List;

/**
 * Created by xgq on 2015/9/25.
 */
public class PaymentStatementExcelDto {
    private String batchNo;
    private String shopName;
    private String cycleTime;
    private String mallName;

    private String rongyiAccountName;
    private String rongyiAccountNo;
    private String rongyiBank;
    private String rongyiBankAddress;

    private String shopAccountName;
    private String shopAccountNo;
    private String shopBank;
    private String payChannel;

    private Double payTotal;
    private Double rongyiDiscount;

    private List<CouponExcelDto> couponExcelDtoList;
    private List<CouponCodeExcelDto> couponCodeExcelDtoList;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getRongyiAccountName() {
        return rongyiAccountName;
    }

    public void setRongyiAccountName(String rongyiAccountName) {
        this.rongyiAccountName = rongyiAccountName;
    }

    public String getRongyiAccountNo() {
        return rongyiAccountNo;
    }

    public void setRongyiAccountNo(String rongyiAccountNo) {
        this.rongyiAccountNo = rongyiAccountNo;
    }

    public String getRongyiBank() {
        return rongyiBank;
    }

    public void setRongyiBank(String rongyiBank) {
        this.rongyiBank = rongyiBank;
    }

    public String getRongyiBankAddress() {
        return rongyiBankAddress;
    }

    public void setRongyiBankAddress(String rongyiBankAddress) {
        this.rongyiBankAddress = rongyiBankAddress;
    }

    public String getShopAccountName() {
        return shopAccountName;
    }

    public void setShopAccountName(String shopAccountName) {
        this.shopAccountName = shopAccountName;
    }

    public String getShopAccountNo() {
        return shopAccountNo;
    }

    public void setShopAccountNo(String shopAccountNo) {
        this.shopAccountNo = shopAccountNo;
    }

    public String getShopBank() {
        return shopBank;
    }

    public void setShopBank(String shopBank) {
        this.shopBank = shopBank;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Double getPayTotal() {
        return payTotal;
    }

    public void setPayTotal(Double payTotal) {
        this.payTotal = payTotal;
    }

    public Double getRongyiDiscount() {
        return rongyiDiscount;
    }

    public void setRongyiDiscount(Double rongyiDiscount) {
        this.rongyiDiscount = rongyiDiscount;
    }

    public List<CouponExcelDto> getCouponExcelDtoList() {
        return couponExcelDtoList;
    }

    public void setCouponExcelDtoList(List<CouponExcelDto> couponExcelDtoList) {
        this.couponExcelDtoList = couponExcelDtoList;
    }

    public List<CouponCodeExcelDto> getCouponCodeExcelDtoList() {
        return couponCodeExcelDtoList;
    }

    public void setCouponCodeExcelDtoList(List<CouponCodeExcelDto> couponCodeExcelDtoList) {
        this.couponCodeExcelDtoList = couponCodeExcelDtoList;
    }
}
