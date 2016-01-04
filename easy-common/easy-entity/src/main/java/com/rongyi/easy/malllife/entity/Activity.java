package com.rongyi.easy.malllife.entity;

import java.io.Serializable;
import java.util.Date;



import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class Activity  extends MalllifeBaseParam  implements Serializable {

 
	private Integer id;

    private String userId;

    private String commodityId;

    private Integer type;

    private Integer discountAmount;

    private Date createAt;

    private String friendId;

    private String headUrl;

    private String nickName;

    private Integer totalDiscountAmount;
    
    private float originalPrice;
  

	private Integer status;
    private String activityId;
    private String mobile;
    private int isSelf;

	public int getIsSelf() {
		return isSelf;
	}

	public void setIsSelf(int isSelf) {
		this.isSelf = isSelf;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(Integer totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", userId=" + userId + ", commodityId="
				+ commodityId + ", type=" + type + ", discountAmount="
				+ discountAmount + ", createAt=" + createAt + ", friendId="
				+ friendId + ", headUrl=" + headUrl + ", nickName=" + nickName
				+ ", totalDiscountAmount=" + totalDiscountAmount + ", status="
				+ status + ", activityId=" + activityId + ", mobile=" + mobile
				+ ", isSelf=" + isSelf + "]";
	}
 
 
 
}