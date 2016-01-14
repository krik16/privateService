package com.rongyi.easy.coupon.entity;


import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.rongyi.core.util.AmountConversion;

/**
 * 用户抵扣券
 */
public class UserRedenvelope implements Serializable {
    public final static Integer STATUS_UNUSE = 0;//未使用
    public final static Integer STATUS_USED = 1;//已使用

    public final static Integer CHANNEL_APP = 0;// 领取渠道:容易逛[0] 互动屏[1] 微商[2]
    public final static Integer CHANNEL_TERMINAL = 1;// 领取渠道:容易逛[0] 互动屏[1] 微商[2]
    public final static Integer CHANNEL_WECHAT = 2;// 领取渠道:容易逛[0] 互动屏[1] 微商[2]


    private Integer id;

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
     * 活动Id：目前支持：翻牌购、推送
     */
    private String activityId;

    /**
     * 活动名称：目前支持：翻牌购、推送
     */
    private String activityName;

    /**
     * 是否删除
     */
    private Boolean isDeleted;


    /********************* coupon表模板表信息冗余 **********************/
    /**
     * 卡券名称
     */
    private String couponName;

    /**
     * 满多少可使用，满的金额（元）
     */
    private Integer origPrice;

    /**
     * 适用对象，商家/买手[0] 商家[1] 买手[2] （作用角色）
     */
    private Integer applyObject;

    /**
     * 适用范围维度1,商品/代金券[0] 商品[1] 代金券[2] （作用对象）
     */
    private Integer applyGoods;

    /**
     * 适用范围维度1 (作用范围)
     * 全场[0]，品牌[1]，商场[2]，店铺[3]，分类[4]，信息[5]
     */
    private Integer relatedType;

    /**
     * 使用说明
     */
    private String usageDesc;

    /**
     * 使用规则
     */
    private String limitDesc;

    /**
     * 推荐说明
     */
    private String recommend;

    /**
     * 适用规则 满减[0] 立减[1]
     */
    private Integer preferentialType;

    /********************* coupon表模板表信息冗余 **********************/

    public UserRedenvelope() {
    }


    public UserRedenvelope(String userId, String couponId, String couponCode, Integer discount, Integer status, Date receiveAt, Integer channel, Date validStartAt, Date validEndAt, String activityName) {
        this.userId = userId;
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.discount = discount;
        this.status = status;
        this.receiveAt = receiveAt;
        this.channel = channel;
        this.validStartAt = validStartAt;
        this.validEndAt = validEndAt;
        this.activityName = activityName;
    }

    public UserRedenvelope(String userId, String couponId, String couponCode, Integer discount, Integer status, Date receiveAt, Integer channel, Date validStartAt, Date validEndAt, String activityId, String activityName) {
        this.userId = userId;
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.discount = discount;
        this.status = status;
        this.receiveAt = receiveAt;
        this.channel = channel;
        this.validStartAt = validStartAt;
        this.validEndAt = validEndAt;
        this.activityId = activityId;
        this.activityName = activityName;
    }

    public UserRedenvelope(String userId, String userName, String couponId, String couponCode, Integer discount, Integer status, String userAccount, Date receiveAt, Date useAt, Integer channel, String orderNo, Date validStartAt, Date validEndAt, String activityId, String activityName) {
        this.userId = userId;
        this.userName = userName;
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.discount = discount;
        this.status = status;
        this.userAccount = userAccount;
        this.receiveAt = receiveAt;
        this.useAt = useAt;
        this.channel = channel;
        this.orderNo = orderNo;
        this.validStartAt = validStartAt;
        this.validEndAt = validEndAt;
        this.activityId = activityId;
        this.activityName = activityName;
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

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getDiscount() {
        return discount;
    }

    public double getDiscount2Double() {
        double dis = 0D;
        if (discount != null) {

            dis = AmountConversion.fenToYuan(discount);
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

    public Integer getOrigPrice() {
        return origPrice;
    }

    public double getOrigPrice2Double() {
        double dis = 0D;
        if (origPrice != null) {

            dis = AmountConversion.fenToYuan(origPrice);
        }
        return dis;
    }
    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getApplyObject() {
        return applyObject;
    }

    public void setApplyObject(Integer applyObject) {
        this.applyObject = applyObject;
    }

    public Integer getApplyGoods() {
        return applyGoods;
    }

    public void setApplyGoods(Integer applyGoods) {
        this.applyGoods = applyGoods;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 判断是否可使用
     * @return
     */
    public boolean isUsable() {
        if (UserRedenvelope.STATUS_UNUSE.equals(status) && new Date().before(validEndAt) && new Date().after(validStartAt))
            return true;
        else if (UserRedenvelope.STATUS_USED.equals(status))
            return false;
        else if (UserRedenvelope.STATUS_UNUSE.equals(status) && new Date().after(validEndAt))
            return false;
        return false;
    }

    /**
     * 判断是否可使用(不校验状态)
     * 下单后如果商品改价了，这个时候不校验状态，默认校验[抵扣券购买商品时]
     * @return
     */
    public boolean isUsableNotValidStatus() {
        if (new Date().before(validEndAt) && new Date().after(validStartAt)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
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
                .append("couponName", couponName)
                .append("origPrice", origPrice)
                .append("applyObject", applyObject)
                .append("applyGoods", applyGoods)
                .append("relatedType", relatedType)
                .append("usageDesc", usageDesc)
                .append("limitDesc", limitDesc)
                .append("preferentialType", preferentialType)
                .append("isDeleted", isDeleted)
                .toString();
    }
}