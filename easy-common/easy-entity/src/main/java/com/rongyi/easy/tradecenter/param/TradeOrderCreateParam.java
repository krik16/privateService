package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ROA调用
 * 优惠券订单创建参数
 * 0元单、非0元单、扫码领券、翻牌购、推送
 * 使用场合：微信公众号优惠劵 互动屏优惠券 容易逛
 */
public class TradeOrderCreateParam implements Serializable {

    /**
     * 0普通单
     * 1 “0元单”
     * 2扫码领券
     * 3短信push
     * 4翻牌购
     */
    private Byte business = 0;
    /**
     * 优惠券ID
     */
    private String unitId;
    /**
     * 购买份数
     */
    private Integer unitNum = 0;
    /**
     * 容易逛对应的用户ID，只用“容易逛”下单的用户，才需要记录用户ID
     */
    private String buyerId;
    /**
     * 购买用户ID
     */
    private String buyerName;
    /**
     * 用户手机号
     */
    private String buyerMobile;
    /**
     * 红包
     */
    private String hbCode;
    /**
     * 积分
     */
    private Integer score = 0;
    /**
     * 积分抵扣金额 元
     */
    private Double scoreDeduction = 0D;
    /**
     * 下单渠道, 0为容易逛，1为微网站，2为终端机，3其他
     */
    private Integer orderSource = 0;
    /**
     * 1:手机用户登陆终端机领取优惠券状态
     */
    private String tmStatus = "0";
    /**
     * 商场对应的ID
     */
    private String mallId;
    /**
     * 当下单渠道是“微网站”时，需传入openid
     */
    private String openId;
    /**
     * 设备ID，购买优惠券时限购使用
     */
    private String devId;
    /**
     * 扫码、翻牌时券码已经生成好了
     */
    private String code;
    /**
     * 活动id 翻牌购
     */
    private String activityId;
    /**
     * 活动名字 翻牌购
     */
    private String activityName;
    /**
     * 券码列表,用于一个订单多张卡券（中秋哈根达斯活动）
     */
    private List<String> couponCodes;

    /**
     * 抵扣券券码
     */
    private String platformRebateCode;

    /**
     * 抵扣券金额
     */
    private Double rebateDiscount;

    /**
     * 促销券来源 1：平台 2：商家
     */
    private Byte hbSource = 2;

    /**
     * 促销券类型 1：满减 2：立减
     */
    private Byte hbType;

    /**
     * 广告标志
     */
    private String idfa;


    /**
     * start
     * 以下字段是内部处理流程时使用，非外部传入
     * 金额字段均为分
     */
    private boolean useHb = false;//是否使用红包

    private boolean useScore = false;//是否使用积分

    private boolean usePlatFormRebate = false;//是否使用抵扣券

    private BigDecimal discountWithOutScore = new BigDecimal(0);//除积分外优惠金额 分

    private BigDecimal totalAmount = new BigDecimal(0);//原结算金额 分

    private BigDecimal payAmount = new BigDecimal(0);//实际支付金额 分

    private BigDecimal discountAmount = new BigDecimal(0);//总优惠金额 分

    private BigDecimal scoreDiscount = new BigDecimal(0);//积分抵扣金额 分

    private Byte discountBitMap = 0;

    private Integer statusHold = 0;

    private Date nextStatusTime;

    /**
     * 微信标准版支付记录appid
     */
    private String weixinAppId;

    /**
     * 微信标准版支付渠道
     */
    private String orderChannel;

    /**
     * end
     */

    public Byte getBusiness() {
        return business;
    }

    public void setBusiness(Byte business) {
        this.business = business;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public Integer getOrderSource() {
        return this.orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getTmStatus() {
        return tmStatus;
    }

    public void setTmStatus(String tmStatus) {
        this.tmStatus = tmStatus;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getHbCode() {
        return hbCode;
    }

    public void setHbCode(String hbCode) {
        this.hbCode = hbCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBusiness(byte business) {
        this.business = business;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getScoreDeduction() {
        return scoreDeduction;
    }

    public void setScoreDeduction(Double scoreDeduction) {
        this.scoreDeduction = scoreDeduction;
    }

    public boolean isUseScore() {
        return useScore;
    }

    public void setUseScore(boolean useScore) {
        this.useScore = useScore;
    }

    public BigDecimal getDiscountWithOutScore() {
        return discountWithOutScore;
    }

    public void setDiscountWithOutScore(BigDecimal discountWithOutScore) {
        this.discountWithOutScore = discountWithOutScore;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(BigDecimal scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public Byte getDiscountBitMap() {
        return discountBitMap;
    }

    public void setDiscountBitMap(Byte discountBitMap) {
        this.discountBitMap = discountBitMap;
    }

    public boolean isUseHb() {
        return useHb;
    }

    public void setUseHb(boolean useHb) {
        this.useHb = useHb;
    }

    public Integer getStatusHold() {
        return statusHold;
    }

    public void setStatusHold(Integer statusHold) {
        this.statusHold = statusHold;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public List<String> getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }

    public String getPlatformRebateCode() {
        return platformRebateCode;
    }

    public void setPlatformRebateCode(String platformRebateCode) {
        this.platformRebateCode = platformRebateCode;
    }

    public Byte getHbSource() {
        return hbSource;
    }

    public void setHbSource(Byte hbSource) {
        this.hbSource = hbSource;
    }

    public Byte getHbType() {
        return hbType;
    }

    public void setHbType(Byte hbType) {
        this.hbType = hbType;
    }

    public boolean isUsePlatFormRebate() {
        return usePlatFormRebate;
    }

    public void setUsePlatFormRebate(boolean usePlatFormRebate) {
        this.usePlatFormRebate = usePlatFormRebate;
    }

    public Double getRebateDiscount() {
        return rebateDiscount;
    }

    public void setRebateDiscount(Double rebateDiscount) {
        this.rebateDiscount = rebateDiscount;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getWeixinAppId() {
        return weixinAppId;
    }

    public void setWeixinAppId(String weixinAppId) {
        this.weixinAppId = weixinAppId;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    @Override
    public String toString() {
        return "TradeOrderCreateParam{" +
                "business=" + business +
                ", unitId='" + unitId + '\'' +
                ", unitNum=" + unitNum +
                ", buyerId='" + buyerId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerMobile='" + buyerMobile + '\'' +
                ", hbCode='" + hbCode + '\'' +
                ", score=" + score +
                ", scoreDeduction=" + scoreDeduction +
                ", orderSource=" + orderSource +
                ", tmStatus='" + tmStatus + '\'' +
                ", mallId='" + mallId + '\'' +
                ", openId='" + openId + '\'' +
                ", devId='" + devId + '\'' +
                ", code='" + code + '\'' +
                ", activityId='" + activityId + '\'' +
                ", activityName='" + activityName + '\'' +
                ", couponCodes=" + couponCodes +
                ", useHb=" + useHb +
                ", useScore=" + useScore +
                ", discountWithOutScore=" + discountWithOutScore +
                ", totalAmount=" + totalAmount +
                ", payAmount=" + payAmount +
                ", discountAmount=" + discountAmount +
                ", scoreDiscount=" + scoreDiscount +
                ", discountBitMap=" + discountBitMap +
                ", statusHold=" + statusHold +
                ", nextStatusTime=" + nextStatusTime +
                ", platformRebateCode=" + platformRebateCode +
                ", weixinAppId=" + weixinAppId +
                ", orderChannel=" + orderChannel +
                '}';
    }
}
