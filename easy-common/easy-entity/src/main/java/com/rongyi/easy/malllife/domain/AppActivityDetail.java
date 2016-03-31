package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppActivityDetail implements Serializable{
    private Integer id;

    private String activityId;

    private String activityCode;

    private String title;
    
    private String thumbnail;

    private String buyerId;

    private String buyerName;

    private String buyerMobile;

    private String orderId;
    
    private Integer status; //使用状态:未使用:0,已使用:1,退款中:2,已退款:3,已过期:4

    private Date provideTime;

    private Date useTime;

    private Date startTime;

    private Date endTime;

    private String cooperater; //合作商ID， 0 属于容易，团购中没有合作商是为0
    
    private BigDecimal grouponOriginal; //原价
    
    private BigDecimal grouponPrice; //单价
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode == null ? null : activityCode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile == null ? null : buyerMobile.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getProvideTime() {
        return provideTime;
    }

    public void setProvideTime(Date provideTime) {
        this.provideTime = provideTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

	public String getCooperater() {
		return cooperater;
	}

	public BigDecimal getGrouponOriginal() {
		return grouponOriginal;
	}

	public BigDecimal getGrouponPrice() {
		return grouponPrice;
	}

	public void setCooperater(String cooperater) {
		this.cooperater = cooperater;
	}

	public void setGrouponOriginal(BigDecimal grouponOriginal) {
		this.grouponOriginal = grouponOriginal;
	}

	public void setGrouponPrice(BigDecimal grouponPrice) {
		this.grouponPrice = grouponPrice;
	}
    
}