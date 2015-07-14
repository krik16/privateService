package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class UserShopEntity implements Serializable{
    /** 主键 */
    private Integer id;

    /** 品牌ID */
    private Integer brandId;

    /** 商场ID */
    private Integer mallId;

    /** 店铺ID */
    private Integer shopId;

    /** 状态：0删除，1正常 */
    private Integer status;

    /** 创建时间 */
    private Date createAt;

    /** 用户ID */
    private Integer userId;

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
     * 品牌ID
     * @return brandId
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 品牌ID
     * @param brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 商场ID
     * @return mallId
     */
    public Integer getMallId() {
        return mallId;
    }

    /**
     * 商场ID
     * @param mallId
     */
    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    /**
     * 店铺ID
     * @return shopId
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 店铺ID
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 状态：0删除，1正常
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：0删除，1正常
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 用户ID
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}