package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeSubOrder implements Serializable {
    private Integer id;

    private Integer orderId;

    private String orderNo;

    private Byte orderType;

    private Byte status;

    private Byte subStatus;

    private String unitId;

    private String unitSpecId;

    private String unitName;

    private Integer origPrice;

    private Integer unitPrice;

    private Integer unitCount;

    private Integer realAmount;

    private Integer discountAmount;

    private Integer refundAmount;

    private Integer sellerCutAmount;

    private Integer commissionAmount;

    private Byte discountBitmap;

    private String hbCode;

    private Integer hbDiscount;

    private String expressId;

    private String commentId;

    private Integer refundId;

    private Integer appealId;

    private Short refundTimes;

    private Short appealTimes;

    private Byte isDelete;

    private String thumbnail;

    private Date saleStartTime;

    private Date saleEndTime;

    private Date startTime;

    private Date endTime;

    private Date createAt;

    private Date updateAt;

    private Byte hbType;

    private Byte hbSource;

    private Byte activityType;

    //文章类型 1潮人攻略
    private Integer articleType;

    //文章id
    private String articleId;

    // 兑换类型（1：兑换 2：换购）
    private int exchangeType;
    // 积分支付部分
    private int partOfCredit ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
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

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitSpecId() {
        return unitSpecId;
    }

    public void setUnitSpecId(String unitSpecId) {
        this.unitSpecId = unitSpecId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public Double getUnitPrice_Y() {
        return new BigDecimal(this.unitPrice).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    public Integer getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Integer realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
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

    public Integer getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Integer commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Byte getDiscountBitmap() {
        return discountBitmap;
    }

    public void setDiscountBitmap(Byte discountBitmap) {
        this.discountBitmap = discountBitmap;
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

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Integer getAppealId() {
        return appealId;
    }

    public void setAppealId(Integer appealId) {
        this.appealId = appealId;
    }

    public Short getRefundTimes() {
        return refundTimes;
    }

    public void setRefundTimes(Short refundTimes) {
        this.refundTimes = refundTimes;
    }

    public Short getAppealTimes() {
        return appealTimes;
    }

    public void setAppealTimes(Short appealTimes) {
        this.appealTimes = appealTimes;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Date getSaleStartTime() {
        return saleStartTime;
    }

    public void setSaleStartTime(Date saleStartTime) {
        this.saleStartTime = saleStartTime;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
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

    public Byte getHbType() {
        return hbType;
    }

    public void setHbType(Byte hbType) {
        this.hbType = hbType;
    }

    public Byte getHbSource() {
        return hbSource;
    }

    public void setHbSource(Byte hbSource) {
        this.hbSource = hbSource;
    }

    public Byte getActivityType()
    {
        return activityType;
    }

    public void setActivityType(Byte activityType)
    {
        this.activityType = activityType;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public int getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(int exchangeType) {
        this.exchangeType = exchangeType;
    }

    public int getPartOfCredit() {
        return partOfCredit;
    }

    public void setPartOfCredit(int partOfCredit) {
        this.partOfCredit = partOfCredit;
    }
}