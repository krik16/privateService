package com.rongyi.easy.malllife.vo;


import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2014/6/16  16:29.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2014/6/16        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class Coupon extends ShopMall implements Serializable{
    protected String thumbnail;//缩略图
    protected String vistedNum;//访问次数
    protected String couponPrice;//优惠劵价格
    protected String grouponNum;//优惠劵数量
	protected String buyedAmount;//已购买数量
    protected String restAmount;//剩余数量
    protected String useRestriction;//使用限制
    protected String useMode;//使用方式
	protected String grouponPrice; // 团购价格
    protected String grouponOriginal; // 团购原价
    protected String grouponStyle; // 团购类型
    protected boolean hasCoupon;//有优惠劵
    protected String title;
    protected String description;
    @SerializedName("start_time")
    protected String startTime;
    @SerializedName("end_time")
    protected String endTime;
    @SerializedName("holder_id")
    protected String holderId;
    @SerializedName("holder_type")
    protected String holderType;
    protected List<String> carouselImg;
    @SerializedName("any_activity")
    protected boolean isActivity;
    public List<String> getCarouselImg() {
        return carouselImg;
    }

    public String getGrouponPrice() {
        return grouponPrice;
    }

    public void setGrouponPrice(String grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    public String getGrouponOriginal() {
        return grouponOriginal;
    }

    public void setGrouponOriginal(String grouponOriginal) {
        this.grouponOriginal = grouponOriginal;
    }

    public void setCarouselImg(List<String> carouselImg) {
        this.carouselImg = carouselImg;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getVistedNum() {
        return vistedNum;
    }

    public void setVistedNum(String vistedNum) {
        this.vistedNum = vistedNum;
    }

    public String getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(String couponPrice) {
        this.couponPrice = couponPrice;
    }

    public String getBuyedAmount() {
        return buyedAmount;
    }

    public void setBuyedAmount(String buyedAmount) {
        this.buyedAmount = buyedAmount;
    }

    public String getRestAmount() {
        return restAmount;
    }

    public void setRestAmount(String restAmount) {
        this.restAmount = restAmount;
    }

    public String getUseRestriction() {
        return useRestriction;
    }

    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }
    
    public String getUseMode() {
		return useMode;
	}

	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}

    public boolean getHasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    public boolean isActivity() {
        return isActivity;
    }

    public void setActivity(boolean isActivity) {
        this.isActivity = isActivity;
    }
    
    public String getGrouponNum() {
		return grouponNum;
	}

	public void setGrouponNum(String grouponNum) {
		this.grouponNum = grouponNum;
	}

    public String getGrouponStyle() {
		return grouponStyle;
	}

	public void setGrouponStyle(String grouponStyle) {
		this.grouponStyle = grouponStyle;
	}

	public Coupon() {
    }

}
