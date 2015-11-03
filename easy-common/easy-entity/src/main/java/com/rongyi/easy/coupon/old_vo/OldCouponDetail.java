package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * 优惠券订单详情信息 （优惠券基本信息与券码信息）
 *
 * @author Breggor
 * @date 2015-08-13
 */
public class OldCouponDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;//券名称

    //新版本废弃
    @Deprecated
    private String activityCode;// 团购券验证码

    private Integer status;// 未使用:0,已使用:1,退款中:2,已退款:3,已过期:4

    private String useTime;// 使用日期

    private String startTime;// 有效期始

    private String endTime;// 有效期止

    private String useLimit;// 使用限制

    private String useWay;// 使用方式

    private Integer num;// 可使用商家数

    private List<OldShopVO> mallvos;// 相关商家

    private String thumbnail;// 缩略图

    //新版本废弃
    @Deprecated
    private List<OldUserCode> myActivityList;// 老用户优惠VO列表

    private List<OldUserCode> userCodeList; //用户券码列表

    private Integer ticketTotalNumber;// 订单项对应的用户优惠总数量

    private BigDecimal grouponPrice; // 优惠券单价

    private boolean notOutCodeFlag = true; // 外部导入券标志 true 不是外部导入券,false 是外部导入券

    private double currentPrice;//当前价格（优惠券价格-红包折扣）

    private String couponId;//优惠券id

    private int integral;  // 购买时使用的积分

    private double couponDiscount; //购买时使用的红包价格

    private int unUsered;  //未使用的数量

    private Double orderPrice;//订单总价

    private int refundNum;//最大退款数量


    private List<Integer> afterSaleService;


    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //新版本废弃
    @Deprecated
    public String getActivityCode() {
        return activityCode;
    }

    //新版本废弃
    @Deprecated
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(String useLimit) {
        this.useLimit = useLimit;
    }

    public String getUseWay() {
        return useWay;
    }

    public void setUseWay(String useWay) {
        this.useWay = useWay;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<OldShopVO> getMallvos() {
        return mallvos;
    }

    public void setMallvos(List<OldShopVO> mallvos) {
        this.mallvos = mallvos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Deprecated
    public List<OldUserCode> getMyActivityList() {
        return myActivityList;
    }

    @Deprecated
    public void setMyActivityList(List<OldUserCode> myActivityList) {
        this.myActivityList = myActivityList;
    }

    public Integer getTicketTotalNumber() {
        return ticketTotalNumber;
    }

    public void setTicketTotalNumber(Integer ticketTotalNumber) {
        this.ticketTotalNumber = ticketTotalNumber;
    }

    public BigDecimal getGrouponPrice() {
        return grouponPrice;
    }

    public void setGrouponPrice(BigDecimal grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    public boolean isNotOutCodeFlag() {
        return notOutCodeFlag;
    }

    public void setNotOutCodeFlag(boolean notOutCodeFlag) {
        this.notOutCodeFlag = notOutCodeFlag;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public double getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(double couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public int getUnUsered() {
        return unUsered;
    }

    public void setUnUsered(int unUsered) {
        this.unUsered = unUsered;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }


    public int getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(int refundNum) {
        this.refundNum = refundNum;
    }

    public List<Integer> getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(List<Integer> afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public List<OldUserCode> getUserCodeList() {
        return userCodeList;
    }

    public void setUserCodeList(List<OldUserCode> userCodeList) {
        this.userCodeList = userCodeList;
    }
}
