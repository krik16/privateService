package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by lqy on 2015/11/17.
 * 平台促销券VO
 */
public class RedenvelopVO implements Serializable {

    /**
     * 促销券id
     */
    private Integer id;

    /**
     * 促销券名称
     */
    private String name;

    /**
     * 发行量
     */
    private Integer totalCount;

    /**
     * 库存
     */
    private Integer stockCount;

    /**
     * 金额（元）
     */
    private Double discount;

    /**
     * 促销券类型：注册[0] 常规[1]
     */
    private Integer type;

    /**
     * 状态:待审核[0] 审核未通过[1] 待发布[2] 进行中[3] 已结束[4] 已下架[5]
     */
    private Integer status;

    /**
     * 适用范围维度1：商品/代金券配[0] 商品[1] 代金券[2])
     */
    private Integer applyGoods;

    /**
     * 适用范围维度2：全场[0] 品牌[1] 商场[2] 店铺[3] 分类[4] 信息[5]
     */
    private Integer relatedType;

    /**
     * 审核未通过原因
     */
    private List<CouponRejectRecord> unpassReasons;

    /**
     * 下架原因列表
     */
    private List<CouponRejectRecord> offShelfReasons;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public List<CouponRejectRecord> getUnpassReasons() {
        return unpassReasons;
    }

    public void setUnpassReasons(List<CouponRejectRecord> unpassReasons) {
        this.unpassReasons = unpassReasons;
    }

    public List<CouponRejectRecord> getOffShelfReasons() {
        return offShelfReasons;
    }

    public void setOffShelfReasons(List<CouponRejectRecord> offShelfReasons) {
        this.offShelfReasons = offShelfReasons;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("totalCount", totalCount)
                .append("stockCount", stockCount)
                .append("discount", discount)
                .append("type", type)
                .append("status", status)
                .append("applyGoods", applyGoods)
                .append("relatedType", relatedType)
                .append("unpassReasons", unpassReasons)
                .append("offShelfReasons", offShelfReasons)
                .toString();
    }
}
