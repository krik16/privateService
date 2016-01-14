package com.rongyi.easy.roa.vo;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 订单详情VO类
 *
 * @author LiuChao
 */

public class OrderDetailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderNo;//订单号

    private Integer tradeStatus;// 交易状态

    private String orderTime;// 下单时间

    private String payTime;// 付款时间

    private BigDecimal unitPrice;// 单价

    private Integer unitNum;// 下单数量

    private BigDecimal orderPrice;// 下单总价

    private String itemName; // 商品名称

    private String couponId; //卡券Id

    private String couponName;//卡券名称
    /**
     * 券码发行量
     */
    private Integer totalCount;

    /**
     * 每人每日限用张数
     */
    private Integer limitUseCount;

    /**
     * 每日最大发行张数
     */
    private Integer limitPublishCount;

    /**
     * 每人限购数量
     */
    private Integer limitCount;


    private double origPrice;// 原价

    private double currPrice;//现价

    private String afterSaleService;

    private String listPicUrl;

    private String limitDesc;//使用限制

    private String usageDesc;//使用说明

    private List<ActivityDetailVO> codeList; // 本订单所含的优惠券信息

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public String getItemName() {
        return itemName;
    }


    @Deprecated
    public List<ActivityDetailVO> getActivityDetailVOs() {
        return codeList;
    }

    @Deprecated
    public void setActivityDetailVOs(List<ActivityDetailVO> codeList) {
        this.codeList = codeList;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public List<ActivityDetailVO> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<ActivityDetailVO> codeList) {
        this.codeList = codeList;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

    public String getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(String afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getLimitUseCount() {
        return limitUseCount;
    }

    public void setLimitUseCount(Integer limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    public Integer getLimitPublishCount() {
        return limitPublishCount;
    }

    public void setLimitPublishCount(Integer limitPublishCount) {
        this.limitPublishCount = limitPublishCount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }
}
