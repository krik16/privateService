package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.UserRedenvelope;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户红包
 * Created by lqy on 2015/11/23.
 */
public class UserRedPacketVO implements Serializable {
    /**
     * 券id
     */
    private String couponId;

    /**
     * 券码
     */
    private String couponCode;

    /**
     * 抵扣券名称
     */
    private String name;

    /**
     * 抵扣金额(分)
     */
    private Integer discount;

    /**
     * 状态：未使用[0] 已使用[1] 已过期[2]
     */
    private Integer status;

    /**
     * 有效期开始时间
     */
    private Date validStartAt;

    /**
     * 有效期结束时间
     */
    private Date validEndAt;

    /**
     * 满多少可使用，满的金额（分）
     */
    private Integer origPrice;

    /**
     * 平台促销券适用对象，商家/买手[0] 商家[1] 买手[2] （作用角色）
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
     * 商品id集合
     */
    private List<String> commodityIds;

    /**
     * 抵扣券关联的代金券结合
     */
    private List<VoucherVO> voucherVOs;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getOrigPrice() {
        return origPrice;
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

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public List<VoucherVO> getVoucherVOs() {
        return voucherVOs;
    }

    public void setVoucherVOs(List<VoucherVO> voucherVOs) {
        this.voucherVOs = voucherVOs;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    // 券状态 0:未使用 1:已使用 2:已过期
    public void setConvertStatus(Integer status, Date validEndAt) {
        if (UserRedenvelope.STATUS_UNUSE.equals(status) && new Date().before(validEndAt))
            this.setStatus(0);
        else if (UserRedenvelope.STATUS_USED.equals(status))
            this.setStatus(1);
        else if (UserRedenvelope.STATUS_UNUSE.equals(status) && new Date().after(validEndAt))
            this.setStatus(2);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("couponId", couponId)
                .append("couponCode", couponCode)
                .append("name", name)
                .append("discount", discount)
                .append("status", status)
                .append("validStartAt", validStartAt)
                .append("validEndAt", validEndAt)
                .append("origPrice", origPrice)
                .append("applyObject", applyObject)
                .append("applyGoods", applyGoods)
                .append("relatedType", relatedType)
                .append("usageDesc", usageDesc)
                .append("limitDesc", limitDesc)
                .append("commodityIds", commodityIds)
                .append("voucherVOs", voucherVOs)
                .toString();
    }
}
