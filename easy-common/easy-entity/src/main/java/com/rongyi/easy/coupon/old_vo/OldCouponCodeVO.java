package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;


public class OldCouponCodeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String activityId;//优惠券Id
    private String title;//优惠券名称
    private String activityCode;//优惠券码
    private Integer status;//使用状态：1-未使用、2-已使用、3-退款中、已退款、已过期
    private String startTime;//有效期始
    private String endTime;//有效期止
    private Double origPrice; //原价
    private Double currPrice; //现价
    private String thumbnail; //列表图
    private String holderId;

    private String holderType;
    
    private String holderName;
    
    private Integer apply_shops_count;
    
    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

	/**
	 * @return the origPrice
	 */
	public Double getOrigPrice() {
		return origPrice;
	}

	/**
	 * @param origPrice the origPrice to set
	 */
	public void setOrigPrice(Double origPrice) {
		this.origPrice = origPrice;
	}

	/**
	 * @return the currPrice
	 */
	public Double getCurrPrice() {
		return currPrice;
	}

	/**
	 * @param currPrice the currPrice to set
	 */
	public void setCurrPrice(Double currPrice) {
		this.currPrice = currPrice;
	}

	/**
	 * @return the thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	/**
	 * @return the holderId
	 */
	public String getHolderId() {
		return holderId;
	}

	/**
	 * @param holderId the holderId to set
	 */
	public void setHolderId(String holderId) {
		this.holderId = holderId;
	}

	/**
	 * @return the holderType
	 */
	public String getHolderType() {
		return holderType;
	}

	/**
	 * @param holderType the holderType to set
	 */
	public void setHolderType(String holderType) {
		this.holderType = holderType;
	}

	/**
	 * @return the holderName
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * @param holderName the holderName to set
	 */
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	/**
	 * @return the apply_shops_count
	 */
	public Integer getApply_shops_count() {
		return apply_shops_count;
	}

	/**
	 * @param apply_shops_count the apply_shops_count to set
	 */
	public void setApply_shops_count(Integer apply_shops_count) {
		this.apply_shops_count = apply_shops_count;
	}

}
