package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;

public class MalllifeWelfareEntity implements Serializable {
    /**  */
    private Long id;

    /** 用户ID */
    private String userId;

    /** 微信openId */
    private String openId;

    /** 活动ID */
    private String activityId;

    /** 卡券Id */
    private String couponId;

    /** 卡券金额 */
    private Integer couponAmount;

    /** 单位分（微信金额) */
    private Integer wechatAmount;

    /** 来源渠道 */
    private String channel;

    /** 订单状态 **/
    private Integer orderStatus; //0支付中 1已经完成 2领取红包 3删除

    /** 订单号 */
    private String orderNo;

    /** 支付账号 */
    private String payNo;

    private static final long serialVersionUID = 1L;

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 微信openId
     * @return openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信openId
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 活动ID
     * @return activityId
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * 活动ID
     * @param activityId
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 卡券Id
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 卡券Id
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * 卡券金额
     * @return couponAmount
     */
    public Integer getCouponAmount() {
        return couponAmount;
    }

    /**
     * 卡券金额
     * @param couponAmount
     */
    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 单位分（微信金额)
     * @return wechatAmount
     */
    public Integer getWechatAmount() {
        return wechatAmount;
    }

    /**
     * 单位分（微信金额)
     * @param wechatAmount
     */
    public void setWechatAmount(Integer wechatAmount) {
        this.wechatAmount = wechatAmount;
    }

    /**
     * 来源渠道
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 来源渠道
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

	@Override
	public String toString() {
		return "MalllifeWelfareEntity [id=" + id + ", userId=" + userId
				+ ", openId=" + openId + ", activityId=" + activityId
				+ ", couponId=" + couponId + ", couponAmount=" + couponAmount
				+ ", wechatAmount=" + wechatAmount + ", channel=" + channel
				+ "]";
	}
}