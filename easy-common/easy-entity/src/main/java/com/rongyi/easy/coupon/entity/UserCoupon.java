package com.rongyi.easy.coupon.entity;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 老用户代金券
 * 红包移出去
 *
 * @author Breggor
 * @see UserRedenvelope --用户红包
 */
@Deprecated
public class UserCoupon implements Serializable {

    private Long id;

    /**
     * 活动Id：目前只有翻牌购
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 卡券Id
     */
    private String couponId;

    /**
     * 卡券券来源 1:表示老系统用户优惠券
     */
    private String couponSource;

    /**
     * 卡券码
     */
    private String couponCode;

    /**
     * 卡券名称
     */
    private String title;

    /**
     * 卡券缩略图
     */
    private String thumbnail;

    /**
     * 买家Id
     */
    private String userId;

    /**
     * 所属订单Id
     */
    private Long orderId;

    /**
     * 所属订单项Id
     */
    private Long itemId;

    /**
     * 券类型: 优惠券[02] 红包[03]
     */
    private String couponType;

    /**
     * 红包: 0: 全场 1: 商品; 优惠券：0：商场 1：店铺
     */
    private String type;

    /**
     * 使用说明
     */
    private String useDescription;

    /**
     * 推荐说明
     */
    private String recommend;

    /**
     * 显示优先级： 退款中>未消费>已退款>已过期>已使用
     * 使用状态: 未使用[1],已使用[2],已过期[3],退款中[4],已退款:[5]
     */
    private Integer status;

    /**
     * 红包 商品ids，多个以逗号分隔
     */
    private String productIds;

    /**
     * 原价
     */
    private Double orgPrice;

    /**
     * 折扣价
     */
    private Double discount;

    /**
     * 现价
     */
    private Double unitPrice;

    /**
     * 发放时间
     */
    private Date provideTime;

    /**
     * 使用(验码)时间
     */
    private Date useTime;

    /**
     * 有效期始
     */
    private Date startTime;

    /**
     * 有效起止
     */
    private Integer checkUserId;

    /**
     * 验码人
     */
    private String shopId;

    /**
     * 有效起止
     */
    private Date endTime;


    private Double refundAmount;

    /**
     * 退款id
     */
    private String refundId;


    private Integer couponChannel;//券码类型 5哈根达斯 6中影 7纵漫线美漫大趴 8星巴克

    private Integer couponShowType;//券码展示类型 0默认 1url 2二维码

    /**
     * 品牌券 品牌logo
     * 同商场的多店铺券 表示商场logo
     * 单个店铺券 店铺Logo
     */
    private String couponLogo;

    public UserCoupon() {

    }

    public UserCoupon(String activityId,
                      String activityName,
                      String couponId,
                      String couponCode,
                      String title,
                      String thumbnail,
                      String userId,
                      Long orderId,
                      Long itemId,
                      String couponType,
                      String type,
                      String useDescription,
                      String recommend,
                      Integer status,
                      String productIds,
                      Double orgPrice,
                      Double discount,
                      Double unitPrice,
                      Date provideTime,
                      Date useTime,
                      Date startTime,
                      Date endTime,
                      Double refundAmount) {
        super();
        this.activityId = activityId;
        this.activityName = activityName;
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.title = title;
        this.thumbnail = thumbnail;
        this.userId = userId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.couponType = couponType;
        this.type = type;
        this.useDescription = useDescription;
        this.recommend = recommend;
        this.status = status;
        this.productIds = productIds;
        this.orgPrice = orgPrice;
        this.discount = discount;
        this.unitPrice = unitPrice;
        this.provideTime = provideTime;
        this.useTime = useTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.refundAmount = refundAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Integer getStatus() {
        return status;
    }

    public String getCouponLogo() {
        return couponLogo;
    }

    public void setCouponLogo(String couponLogo) {
        this.couponLogo = couponLogo;
    }

    public Integer getConvertStatus() {
        Integer val = status;
        if (Integer.valueOf(1).equals(status)) {
            val = Integer.valueOf(0);
        } else if (Integer.valueOf(2).equals(status)) {
            val = Integer.valueOf(1);
        } else if (Integer.valueOf(3).equals(status)) {
            val = Integer.valueOf(0);
        }
        return val;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }

    public Double getOrgPrice() {
        return (orgPrice == null) ? Double.valueOf(0D) : this.orgPrice;
    }

    public void setOrgPrice(Double orgPrice) {
        this.orgPrice = orgPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public Integer getDiscount2Int() {
        return discount == null ? 0 : discount.intValue() * 100;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
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


    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Transient
    public Boolean existProduct(String productId) {
        if (StringUtils.isNotBlank(this.getProductIds())) {
            for (String id : this.getProductIds().split(",")) {
                if (productId.equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getCouponSource() {
        return couponSource;
    }

    public void setCouponSource(String couponSource) {
        this.couponSource = couponSource;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundId()
    {
        return refundId;
    }

    public void setRefundId(String refundId)
    {
        this.refundId = refundId;
    }

    public Integer getCouponChannel()
    {
        return couponChannel;
    }

    public void setCouponChannel(Integer couponChannel)
    {
        this.couponChannel = couponChannel;
    }

    public Integer getCouponShowType()
    {
        return couponShowType;
    }

    public void setCouponShowType(Integer couponShowType)
    {
        this.couponShowType = couponShowType;
    }

    //    使用状态: 未使用[1],已使用[2],已过期[3]
    public void setConvertStatus(Integer status, Date validEndAt) {
        if (UserRedenvelope.STATUS_UNUSE.equals(status))
            this.setStatus(1);
        else if (UserRedenvelope.STATUS_USED.equals(status))
            this.setStatus(2);
        else if (new Date().after(validEndAt))
            this.setStatus(3);
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("activityName", activityName)
                .append("couponId", couponId)
                .append("couponSource", couponSource)
                .append("couponCode", couponCode)
                .append("title", title)
                .append("thumbnail", thumbnail)
                .append("userId", userId)
                .append("orderId", orderId)
                .append("itemId", itemId)
                .append("couponType", couponType)
                .append("type", type)
                .append("useDescription", useDescription)
                .append("recommend", recommend)
                .append("status", status)
                .append("productIds", productIds)
                .append("orgPrice", orgPrice)
                .append("discount", discount)
                .append("unitPrice", unitPrice)
                .append("provideTime", provideTime)
                .append("useTime", useTime)
                .append("startTime", startTime)
                .append("endTime", endTime)
                .append("checkUserId", checkUserId)
                .append("refundAmount", refundAmount)
                .append("refundId", refundId)
                .append("couponChannel", couponChannel)
                .append("couponShowType", couponShowType)
                .toString();
    }

    private String holderId;

    private String holderType;
    
    private String holderName;

    private Integer apply_shops_count; // 可用店铺数
    
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
