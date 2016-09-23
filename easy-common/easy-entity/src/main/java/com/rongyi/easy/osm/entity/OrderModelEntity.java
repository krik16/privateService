package com.rongyi.easy.osm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderModelEntity {
    /** 主键 */
    private Integer id;

    /** 微店id */
    private String weidianId;

    /** 导购id */
    private Integer guideId;

    /** 订单模板创建时间 */
    private Date createAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 版本 */
    private Integer version;

    /** 订单价格 */
    private BigDecimal orderPrice;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 微店id
     * @return weidianId
     */
    public String getWeidianId() {
        return weidianId;
    }

    /**
     * 微店id
     * @param weidianId
     */
    public void setWeidianId(String weidianId) {
        this.weidianId = weidianId;
    }

    /**
     * 导购id
     * @return guideId
     */
    public Integer getGuideId() {
        return guideId;
    }

    /**
     * 导购id
     * @param guideId
     */
    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    /**
     * 订单模板创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 订单模板创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 订单价格
     * @return orderPrice
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 订单价格
     * @param orderPrice
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}