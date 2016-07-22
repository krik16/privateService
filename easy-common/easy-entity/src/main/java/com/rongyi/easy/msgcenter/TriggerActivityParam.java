package com.rongyi.easy.msgcenter;

import java.io.Serializable;
import java.util.Date;

public class TriggerActivityParam implements Serializable {
    private String userId;  //被邀请人
    private String uId; //邀请人
    private String goodsId; //商品或者卡券id
    private String shopId;
    private Integer id;
    private Integer pushActivityId;

    /**
     * 1:注册，2交易，3邀请，4激活
     */
    private Byte pushCondition;

    /**
     * '交易品类;“1,2”，1商品，2卡券',
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
    private Integer tradeEndtAmount;

    /**
     * 交易范围：1全部，2品牌，3商城，4店铺'
     */
    private Byte tradeRange;

    /**
     * 获取时间
     */
    private Byte obtainTimes;

    /**
     * 邀请人：1不限，2导购，3买手，4容易逛用户
     */
    private Byte invite;

    /**
     * 获益人：1邀请人，2被邀请人
     */
    private Byte fruitful;

    /**
     * 获益场景 1:注册，2注册并交易
     */
    private Byte fruitfulRange;

    /**
     * 未打开应用天数
     */
    private Integer notActivateDay;

    /**
     * 未消费天数
     */
    private Integer notConsumerDay;

    private Date startAt;


    private Date endAt;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getTradeStartAmount() {
        return tradeStartAmount;
    }

    public void setTradeStartAmount(Integer tradeStartAmount) {
        this.tradeStartAmount = tradeStartAmount;
    }

    public Integer getTradeEndtAmount() {
        return tradeEndtAmount;
    }

    public void setTradeEndtAmount(Integer tradeEndtAmount) {
        this.tradeEndtAmount = tradeEndtAmount;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TriggerActivityParam{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", uId='").append(uId).append('\'');
        sb.append(", goodsId='").append(goodsId).append('\'');
        sb.append(", shopId='").append(shopId).append('\'');
        sb.append(", id=").append(id);
        sb.append(", pushActivityId=").append(pushActivityId);
        sb.append(", pushCondition=").append(pushCondition);
        sb.append(", tradeCategory='").append(tradeCategory).append('\'');
        sb.append(", tradeTimes=").append(tradeTimes);
        sb.append(", tradeStartAmount=").append(tradeStartAmount);
        sb.append(", tradeEndtAmount=").append(tradeEndtAmount);
        sb.append(", tradeRange=").append(tradeRange);
        sb.append(", obtainTimes=").append(obtainTimes);
        sb.append(", invite=").append(invite);
        sb.append(", fruitful=").append(fruitful);
        sb.append(", fruitfulRange=").append(fruitfulRange);
        sb.append(", notActivateDay=").append(notActivateDay);
        sb.append(", notConsumerDay=").append(notConsumerDay);
        sb.append(", startAt=").append(startAt);
        sb.append(", endAt=").append(endAt);
        sb.append('}');
        return sb.toString();
    }
}
