package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户抵扣券
 */
public class UserRedenvelope implements Serializable {
    public final static Integer STATUS_UNUSE = 0;//未使用
    public final static Integer STATUS_USED = 1;//已使用

    private Integer id;

    /**
     * 红包名称
     */
    private String name;
    /**
     * 领用人id
     */
    private String userId;

    /**
     * 领用人姓名
     */
    private String userName;

    /**
     * 卡券Id
     */
    private String couponId;

    /**
     * 红包券码
     */
    private String couponCode;

    /**
     * 抵扣价格
     */
    private Integer discount;

    /**
     * 未使用[0], 已使用[1]
     */
    private Integer status;

    /**
     * 用户领用账号
     */
    private String userAccount;

    /**
     * 用户领取红包时间
     */
    private Date receiveAt;

    /**
     * 使用红包时间
     */
    private Date useAt;

    /**
     * 领取渠道:容易逛[0] 互动屏[1] 微商[2]
     */
    private Integer channel;

    /**
     * 使用红包购买商品时的商品订单号
     */
    private String orderNo;

    /**
     * 有效期开始时间
     */
    private Date validStartAt;

    /**
     * 有效期结束时间
     */
    private Date validEndAt;

    /**
     * 活动Id：目前只有翻牌购
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    public UserRedenvelope() {
    }

    public UserRedenvelope(String name, String userId, String couponId, String couponCode, Integer discount, Integer status, Date receiveAt, Integer channel, Date validStartAt, Date validEndAt) {
        this.name = name;
        this.userId = userId;
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.discount = discount;
        this.status = status;
        this.receiveAt = receiveAt;
        this.channel = channel;
        this.validStartAt = validStartAt;
        this.validEndAt = validEndAt;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public Date getUseAt() {
        return useAt;
    }

    public void setUseAt(Date useAt) {
        this.useAt = useAt;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Date validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Date getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Date validEndAt) {
        this.validEndAt = validEndAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiscount() {
        return discount;
    }

    public double getDiscount2Double() {
        double dis = 0D;
        if (discount != null) {
            dis = BigDecimal.valueOf(discount).divide(BigDecimal.valueOf(100.00D)).setScale(2).doubleValue();
        }
        return dis;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("userId", userId)
                .append("userName", userName)
                .append("couponId", couponId)
                .append("couponCode", couponCode)
                .append("discount", discount)
                .append("status", status)
                .append("userAccount", userAccount)
                .append("receiveAt", receiveAt)
                .append("useAt", useAt)
                .append("channel", channel)
                .append("orderNo", orderNo)
                .append("validStartAt", validStartAt)
                .append("validEndAt", validEndAt)
                .append("activityId", activityId)
                .append("activityName", activityName)
                .toString();
    }
}
