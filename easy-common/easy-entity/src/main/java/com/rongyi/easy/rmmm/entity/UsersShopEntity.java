package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class UsersShopEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**  */
    private Long id;

    /** 品牌ID */
    private Long brandId;

    /** 商场ID */
    private Long mallId;

    /** 店铺ID */
    private Long shopId;

    /** 状态：0删除，1正常 */
    private Integer status;

    /** 创建时间 */
    private Date createAt;

    /** 用户ID */
    private Long userId;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 品牌ID
     * @return brandId
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 品牌ID
     * @param brandId
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 商场ID
     * @return mallId
     */
    public Long getMallId() {
        return mallId;
    }

    /**
     * 商场ID
     * @param mallId
     */
    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    /**
     * 店铺ID
     * @return shopId
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 店铺ID
     * @param shopId
     */
    public void setShopId(Long shopId) {
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
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}