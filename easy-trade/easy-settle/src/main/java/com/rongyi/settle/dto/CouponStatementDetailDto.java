package com.rongyi.settle.dto;

import com.rongyi.settle.util.AmountUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xgq on 2015/9/28.
 */
public class CouponStatementDetailDto {
    private String orderNo;
    private String payNo;
    private Date useTime;
    private Date createAt;
    private String couponId;
    private String couponCode;
    private String title;
    private String revenueType;
    private String payChannel;
    private Integer origPrice;
    private Integer payAmount;
    private Integer hbDiscount;
    private Integer scoreDiscount;
    private Integer discount;
    private String userPhone;
    private String shopId;
    private String shopName;
    private String mallId;
    private String mallName;
    private String userName;
    private String guidePhone;
    private String guideName;
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRevenueType() {
        return revenueType;
    }

    public void setRevenueType(String revenueType) {
        this.revenueType = revenueType;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getHbDiscount() {
        return hbDiscount;
    }

    public void setHbDiscount(Integer hbDiscount) {
        this.hbDiscount = hbDiscount;
    }

    public Integer getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(Integer scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGuidePhone() {
        return guidePhone;
    }

    public void setGuidePhone(String guidePhone) {
        this.guidePhone = guidePhone;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public CouponCodeExcelDto toCouponCodeExcelDto() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CouponCodeExcelDto dto = new CouponCodeExcelDto();
        dto.setOrderNo(getOrderNo());
        dto.setPayNo(getPayNo());
        dto.setValidTime(dateFormat.format(getUseTime()));
        dto.setOrderTime(dateFormat.format(getCreateAt()));
        dto.setCouponCode(getCouponCode());
        dto.setCouponName(getTitle());
        dto.setRevenueType(getRevenueType());
        dto.setPayChannel(getPayChannel());
        dto.setOrigPrice(getOrigPrice() == null ? 0.0 : AmountUtil.changFenToYuan(getOrigPrice()));
        dto.setPayAmount(getPayAmount() == null ? 0.0 : AmountUtil.changFenToYuan(getPayAmount()));
        dto.setHbAmount(getHbDiscount() == null ? 0.0 : AmountUtil.changFenToYuan(getHbDiscount()));
        dto.setDiscountAmount(getDiscount() == null ? 0.0 : AmountUtil.changFenToYuan(getDiscount()));
        dto.setScoreAmount(getScoreDiscount() == null ? 0.0 : AmountUtil.changFenToYuan(getScoreDiscount()));
        dto.setBuyerPhone(getUserPhone());
        dto.setShopName(getShopName());
        dto.setMallName(getMallName());
        dto.setBuyerName(getUserName());
        dto.setGuideName(getGuideName());
        dto.setGuidePhone(getGuidePhone());
        dto.setSource(getSource());
        return dto;
    }
}
