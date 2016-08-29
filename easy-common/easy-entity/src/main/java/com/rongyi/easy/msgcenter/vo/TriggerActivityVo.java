package com.rongyi.easy.msgcenter.vo;

import java.io.Serializable;
import java.util.Date;

public class TriggerActivityVo implements Serializable {
    private Integer id;
    private String userId;
    private int isAllBuyer; //1:所有用户买手，2 部分买手
    private Integer pushActivityId;
    /**
     * 1:注册，2交易，3邀请，4激活,5分享 6 老推新
     */
    private Byte pushCondition;
    /**
     * '交易品类;“1,2”商品&卡券，1商品，2卡券',
     */
    private String tradeCategory;

    /**
     * 交易频次,
     */
    private Integer tradeTimes;

    /**
     * 交易区间开始-结束金额值
     */
    private Integer tradeStartAmount;

    private Integer tradeEndAmount;

    /**
     * 交易范围：1全部，2品牌，3商城，4店铺'
     */
    private Byte tradeRange;

    /**
     * 获取次数
     */
    private Byte obtainTimes;

    /**
     * 邀请人：  1：不限；2：导购；3：买手；4：容易逛用户
     */
    private Byte invite;

    /**
     * 获益人 1：邀请人；2：被邀请人
     */
    private Byte fruitful;

    /**
     * 获益场景  1：注册 ；2：注册并交易
     */
    private Byte fruitfulRange;

    /**
     * 未打开应用天数
     */
    private Integer notActivateDay;

    /**
     * 为消费天数
     */
    private Integer notConsumerDay;

    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;

    /**
     * 分享场景中 单用户每日获得该分享红包的次数的最高限制
     */
    private Integer obtainCount;
    /**
     * 分享场景中 用户每次分享的红包数
     */
    private Integer couponCount;

    /**
     * 分享红包发布商品角色，0：不限；1商户；2买手
     */
    private Integer role;

    private String activityRule;//活动规则

    private Integer redPackAmount;//红包或抵扣券总金额

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

    public int getIsAllBuyer() {
        return isAllBuyer;
    }

    public void setIsAllBuyer(int isAllBuyer) {
        this.isAllBuyer = isAllBuyer;
    }

    public Integer getPushActivityId() {
        return pushActivityId;
    }

    public void setPushActivityId(Integer pushActivityId) {
        this.pushActivityId = pushActivityId;
    }

    public Byte getPushCondition() {
        return pushCondition;
    }

    public void setPushCondition(Byte pushCondition) {
        this.pushCondition = pushCondition;
    }

    public String getTradeCategory() {
        return tradeCategory;
    }

    public void setTradeCategory(String tradeCategory) {
        this.tradeCategory = tradeCategory;
    }

    public Integer getTradeTimes() {
        return tradeTimes;
    }

    public void setTradeTimes(Integer tradeTimes) {
        this.tradeTimes = tradeTimes;
    }

    public Integer getTradeStartAmount() {
        return tradeStartAmount;
    }

    public void setTradeStartAmount(Integer tradeStartAmount) {
        this.tradeStartAmount = tradeStartAmount;
    }

    public Integer getTradeEndAmount() {
        return tradeEndAmount;
    }

    public void setTradeEndAmount(Integer tradeEndAmount) {
        this.tradeEndAmount = tradeEndAmount;
    }

    public Byte getTradeRange() {
        return tradeRange;
    }

    public void setTradeRange(Byte tradeRange) {
        this.tradeRange = tradeRange;
    }

    public Byte getObtainTimes() {
        return obtainTimes;
    }

    public void setObtainTimes(Byte obtainTimes) {
        this.obtainTimes = obtainTimes;
    }

    public Byte getInvite() {
        return invite;
    }

    public void setInvite(Byte invite) {
        this.invite = invite;
    }

    public Byte getFruitful() {
        return fruitful;
    }

    public void setFruitful(Byte fruitful) {
        this.fruitful = fruitful;
    }

    public Byte getFruitfulRange() {
        return fruitfulRange;
    }

    public void setFruitfulRange(Byte fruitfulRange) {
        this.fruitfulRange = fruitfulRange;
    }

    public Integer getNotActivateDay() {
        return notActivateDay;
    }

    public void setNotActivateDay(Integer notActivateDay) {
        this.notActivateDay = notActivateDay;
    }

    public Integer getNotConsumerDay() {
        return notConsumerDay;
    }

    public void setNotConsumerDay(Integer notConsumerDay) {
        this.notConsumerDay = notConsumerDay;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getObtainCount() {
        return obtainCount;
    }

    public void setObtainCount(Integer obtainCount) {
        this.obtainCount = obtainCount;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
    }

    public Integer getRedPackAmount() {
        return redPackAmount;
    }

    public void setRedPackAmount(Integer redPackAmount) {
        this.redPackAmount = redPackAmount;
    }

    @Override
    public String toString() {
        return "TriggerActivityVo{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", isAllBuyer=" + isAllBuyer +
                ", pushActivityId=" + pushActivityId +
                ", pushCondition=" + pushCondition +
                ", tradeCategory='" + tradeCategory + '\'' +
                ", tradeTimes=" + tradeTimes +
                ", tradeStartAmount=" + tradeStartAmount +
                ", tradeEndAmount=" + tradeEndAmount +
                ", tradeRange=" + tradeRange +
                ", obtainTimes=" + obtainTimes +
                ", invite=" + invite +
                ", fruitful=" + fruitful +
                ", fruitfulRange=" + fruitfulRange +
                ", notActivateDay=" + notActivateDay +
                ", notConsumerDay=" + notConsumerDay +
                ", startAt=" + startAt +
                ", endAt=" + endAt +
                ", obtainCount=" + obtainCount +
                ", couponCount=" + couponCount +
                ", role=" + role +
                ", activityRule='" + activityRule + '\'' +
                ", redPackAmount=" + redPackAmount +
                '}';
    }
}
