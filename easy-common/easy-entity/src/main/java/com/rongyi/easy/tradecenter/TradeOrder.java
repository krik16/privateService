package com.rongyi.easy.tradecenter;

import com.rongyi.core.common.util.JsonUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeOrder implements Serializable {
    private BigDecimal rate = new BigDecimal(100);

    private Integer id;

    private String orderNo;

    private String payNo;

    private String payAccount;

    private Byte payChannel;

    private Byte type;

    private Byte business;

    private String source;

    private Integer codeNum;

    private Byte status;

    private Byte subStatus;

    private String userId;

    private String userName;

    private String userPhone;

    private String mallId;

    private String openId;

    private String guideId;

    private Integer totalAmount;

    private Integer payAmount;

    private Integer discountAmount;

    private Integer expressFee;

    private Integer refundAmount;

    private Integer sellerCutAmount;

    private Byte discountBitmap;

    private String deviceId;

    private String deviceType;

    private String hbCode;

    private Integer hbDiscount;

    private Integer score;

    private Integer scoreDiscount;

    private String rebateCode;

    private Integer rebateDiscount;

    private Byte reduceType;

    private Integer statusHold;

    private Date nextStatusTime;

    private String addressId;

    private Integer rebackAmount;

    private String userTips;

    private Byte isDelete;

    private Date payTime;

    private Date createAt;

    private Date updateAt;

    private List<TradeSubOrder> subOrderList;

    private Byte hbSource;

    private Byte hbType;

    private String idfa;
    /**
     * 微信标准版支付记录appid
     */
    private String weixinAppId;

    /**
     * 下单渠道
     */
    private String orderChannel;

    // 总积分
    private Integer totalCredit;
    // 用户类型
    private Integer userType ;
    /**
     * 元
     *
     * @return
     */
    public Double getTotalAmount_Y() {
        return new BigDecimal(this.totalAmount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getPayAmount_Y() {
        return new BigDecimal(this.payAmount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getDiscountAmount_Y() {
        return new BigDecimal(this.discountAmount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getSellerCutAmount_Y() {
        return new BigDecimal(this.sellerCutAmount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getRebackAmount_Y() {
        return new BigDecimal(this.rebackAmount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getScoreDiscount_Y() {
        return new BigDecimal(this.scoreDiscount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getHbDiscount_Y() {
        return new BigDecimal(this.hbDiscount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 元
     *
     * @return
     */
    public String getDiscountInfo_Y() {
        Map<String, Object> discountMap = new HashMap<>();
        if (this.hbDiscount > 0) {
            discountMap.put("cashCouponDiscount", new BigDecimal(this.hbDiscount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        if (this.score > 0) {
            discountMap.put("score", this.score);
        }
        if (this.scoreDiscount > 0) {
            discountMap.put("scoreDiscount", new BigDecimal(this.scoreDiscount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        if(this.rebateDiscount != null && this.rebateDiscount > 0){
            discountMap.put("platformRebateAmount", new BigDecimal(this.rebateDiscount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }


        if (discountMap.keySet().size() > 0) {
            return JsonUtil.getJSONString(discountMap);
        }
        return "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Byte getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Byte payChannel) {
        this.payChannel = payChannel;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getBusiness() {
        return business;
    }

    public void setBusiness(Byte business) {
        this.business = business;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(Integer codeNum) {
        this.codeNum = codeNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(Byte subStatus) {
        this.subStatus = subStatus;
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(Integer expressFee) {
        this.expressFee = expressFee;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getSellerCutAmount() {
        return sellerCutAmount;
    }

    public void setSellerCutAmount(Integer sellerCutAmount) {
        this.sellerCutAmount = sellerCutAmount;
    }

    public Byte getDiscountBitmap() {
        return discountBitmap;
    }

    public void setDiscountBitmap(Byte discountBitmap) {
        this.discountBitmap = discountBitmap;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getHbCode() {
        return hbCode;
    }

    public void setHbCode(String hbCode) {
        this.hbCode = hbCode;
    }

    public Integer getHbDiscount() {
        return hbDiscount;
    }

    public void setHbDiscount(Integer hbDiscount) {
        this.hbDiscount = hbDiscount;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(Integer scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public String getRebateCode() {
        return rebateCode;
    }

    public void setRebateCode(String rebateCode) {
        this.rebateCode = rebateCode;
    }

    public Integer getRebateDiscount() {
        return rebateDiscount;
    }

    public void setRebateDiscount(Integer rebateDiscount) {
        this.rebateDiscount = rebateDiscount;
    }

    public Byte getReduceType() {
        return reduceType;
    }

    public void setReduceType(Byte reduceType) {
        this.reduceType = reduceType;
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

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public Integer getRebackAmount() {
        return rebackAmount;
    }

    public void setRebackAmount(Integer rebackAmount) {
        this.rebackAmount = rebackAmount;
    }

    public String getUserTips() {
        return userTips;
    }

    public void setUserTips(String userTips) {
        this.userTips = userTips;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public List<TradeSubOrder> getSubOrderList() {
        return subOrderList;
    }

    public void setSubOrderList(List<TradeSubOrder> subOrderList) {
        this.subOrderList = subOrderList;
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

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Integer totalCredit) {
        this.totalCredit = totalCredit;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}