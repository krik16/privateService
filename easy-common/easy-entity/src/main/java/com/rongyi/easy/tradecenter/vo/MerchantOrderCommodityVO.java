package com.rongyi.easy.tradecenter.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantOrderCommodityVO implements Serializable
{

    private String icon;//商品图 url，多个以”,”分隔
    private String commodityName;//商品名
    private String commodityNo;//商品编码
    private String commoditySpec;//商品规格，多个以”,”分隔
    private String commodityCategory;//商品分类
    private String commodityNum;//商品数量
    private String unitPrice;//商品单价 元
    private BigDecimal totalPrice;//商品总价 元
    private String payPrice;//买家支付 元Ԫ
    private String discountInfo;//优惠信息
    private String discountAmount;//优惠金额
    private Integer commodityStatus; //商品状态
    private String id;//商品id
    private String postage;//商品邮费
    private boolean supportCourierDeliver=true;//支持快递发货字段  true 是    false否
    private boolean supportSelfPickup=true;//支持到店自提  true 是    false否
    private Integer couponDiscountType;//红包补贴类型 0：平台补贴 1：商家补贴
    private BigDecimal hongBaoDiscount;//红包抵扣金额
    private BigDecimal rebateDiscount;//抵扣券抵扣金额
    private BigDecimal discountFee; ///< 卖家折扣（改）价
    /**
     * 退款状态（1：退款申请中 2：待买家发货 3：待买家上门  4：待卖家收货 5退款中 6：退款成功 7：退款已拒绝 8：退款关闭）
     */
    private Integer refundStatus;
    /**
     * 对应的字符串
     **/
    private String refundStatusString;
    // 退款单号
    private String refundNo;

    public boolean isSupportCourierDeliver() {
        return supportCourierDeliver;
    }

    public void setSupportCourierDeliver(boolean supportCourierDeliver) {
        this.supportCourierDeliver = supportCourierDeliver;
    }

    public boolean isSupportSelfPickup() {
        return supportSelfPickup;
    }

    public void setSupportSelfPickup(boolean supportSelfPickup) {
        this.supportSelfPickup = supportSelfPickup;
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
    }

    public String getCommoditySpec() {
        return commoditySpec;
    }

    public void setCommoditySpec(String commoditySpec) {
        this.commoditySpec = commoditySpec;
    }

    public String getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }
    public String getCommodityCategory() {
        return commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
    }

    public Integer getCouponDiscountType() {
        return couponDiscountType;
    }

    public void setCouponDiscountType(Integer couponDiscountType) {
        this.couponDiscountType = couponDiscountType;
    }

    public BigDecimal getHongBaoDiscount() {
        return hongBaoDiscount;
    }

    public void setHongBaoDiscount(BigDecimal hongBaoDiscount) {
        this.hongBaoDiscount = hongBaoDiscount;
    }

    public BigDecimal getRebateDiscount() {
        return rebateDiscount;
    }

    public void setRebateDiscount(BigDecimal rebateDiscount) {
        this.rebateDiscount = rebateDiscount;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundStatusString() {
        return refundStatusString;
    }

    public void setRefundStatusString(String refundStatusString) {
        this.refundStatusString = refundStatusString;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
