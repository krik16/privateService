
/**
 * @Title: CouponPushVo.java
 * @Package: com.rongyi.easy.activity.entity.vo
 * @Description: TODO
 * @author user
 * @date 2015年5月5日 下午5:58:11
 */


package com.rongyi.easy.activity.entity.vo;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.malllife.common.util.DateTool;

import java.text.SimpleDateFormat;

/**
 * @author yb
 * @Description 传递给推送前台页面显示的卡券
 * @date 2015年5月5日 下午5:58:11
 */

public class CouponPushVo {
    private String id;
    private String status;
    private String checkStatus;
    private String publishStartTime;
    private String publishEndTime;
    private String validateStartTime;
    private String validateEndTime;
    private String sourceTarget;
    private String title;
    private String discount;
    private String couponType;
    private Double currentPrice;

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    private int restCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getSourceTarget() {
        return sourceTarget;
    }

    public void setSourceTarget(String sourceTarget) {
        this.sourceTarget = sourceTarget;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getRestCount() {
        return restCount;
    }

    public void setRestCount(int restCount) {
        this.restCount = restCount;
    }


    public String getValidateStartTime() {
        return validateStartTime;
    }

    public void setValidateStartTime(String validateStartTime) {
        this.validateStartTime = validateStartTime;
    }

    public String getValidateEndTime() {
        return validateEndTime;
    }

    public void setValidateEndTime(String validateEndTime) {
        this.validateEndTime = validateEndTime;
    }

    public String getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(String publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public String getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(String publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    /**
     * Creates a new instance of CouponPushVo.
     * Description
     */

    public CouponPushVo(Coupon coupon) {
        super();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss");
        if (coupon.getStatus() != null) {
            this.checkStatus = coupon.getStatus().equals(2) ? "已通过" : (coupon.getStatus().equals("0") ? "待审核" : "未通过");

        }
        if (coupon.getCouponType() != null) {
            this.couponType = coupon.getCouponType()==0 ? "代金券" : (coupon.getCouponType()==2?"红包":"抵扣券");
        }
        this.currentPrice = coupon.getCurrPrice2Double();
        this.id = coupon.getId().toString();
        this.publishEndTime = coupon.getPublishEndAt() == null ? "" : DateTool.date2String(coupon.getPublishEndAt(), DateTool.FORMAT_DATETIME);
        this.publishStartTime = coupon.getPublishStartAt() == null ? "" : DateTool.date2String(coupon.getPublishStartAt(),DateTool.FORMAT_DATETIME);
        this.validateStartTime = coupon.getValidStartAt() == null ? "" : DateTool.date2String(coupon.getValidEndAt(), DateTool.FORMAT_DATETIME);
        this.validateEndTime = coupon.getValidEndAt() == null ? "" : DateTool.date2String(coupon.getValidEndAt(),DateTool.FORMAT_DATETIME);
        this.restCount = coupon.getStockCount();
        this.sourceTarget=coupon.getPublishChannel()==null?"":(coupon.getPublishChannel()==0?"大运营平台":"商家管理后台");
        this.title = coupon.getName();
        this.discount = coupon.getDiscount() == null ? "0" : coupon.getDiscount2Double() + "";
    }


}
