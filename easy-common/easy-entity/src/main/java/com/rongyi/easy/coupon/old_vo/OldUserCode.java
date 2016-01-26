package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;
import java.math.BigDecimal;


public class OldUserCode implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String activityCode;//用户券码

    private String title;//优惠名称

    private String thumbnail;//缩略图

    private Integer status;//使用状态：0,已使用:1,退款中:2,已退款:3,已过期:4   默认值-1

    private String useTime;//使用时间

    private String startTime;//有效期始

    private String endTime;//有效期止

    private BigDecimal unit_price; // 单价

    private Integer activitiesId; // 用户优惠券主键Id
    
    private String refundId;//退款id
    
    private Integer couponChannel;//券码类型 5哈根达斯 6中影 7纵漫线美漫大趴 8星巴克


    public Integer getCouponChannel() {
		return couponChannel;
	}

	public void setCouponChannel(Integer couponChannel) {
		this.couponChannel = couponChannel;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
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

    public Integer getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(Integer activitiesId) {
        this.activitiesId = activitiesId;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }
}
