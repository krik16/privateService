package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

public class ShoppingCartEntity  implements Serializable {
    /** 主键 */
    private Integer id;

    /** 用户id */
    private String userId;

    /** 店铺id */
    private String shopId;

    /** 导购或买手id */
    private Integer guideId;

    /** 商品编号 */
    private String commodityMid;

    /** 导购1 买手2 */
    private Integer guideType;

    /** 商品规格 */
    private String commoditySpecMid;

    /** 商品数量 */
    private Integer commodityCount;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    public ShoppingCartEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartEntity(String userId, String shopId, Integer guideId, String commodityMid, Integer guideType,
			String commoditySpecMid, Integer commodityCount) {
		super();
		this.userId = userId;
		this.shopId = shopId;
		this.guideId = guideId;
		this.commodityMid = commodityMid;
		this.guideType = guideType;
		this.commoditySpecMid = commoditySpecMid;
		this.commodityCount = commodityCount;
		this.createAt = new Date();
		this.updateAt = new Date();
		this.isDisabled = 0;
	}

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
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 店铺id
     * @return shopId
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 店铺id
     * @param shopId
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * 导购或买手id
     * @return guideId
     */
    public Integer getGuideId() {
        return guideId;
    }

    /**
     * 导购或买手id
     * @param guideId
     */
    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    /**
     * 商品编号
     * @return commodityMid
     */
    public String getCommodityMid() {
        return commodityMid;
    }

    /**
     * 商品编号
     * @param commodityMid
     */
    public void setCommodityMid(String commodityMid) {
        this.commodityMid = commodityMid;
    }

    /**
     * 导购1 买手2
     * @return guideType
     */
    public Integer getGuideType() {
        return guideType;
    }

    /**
     * 导购1 买手2
     * @param guideType
     */
    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    /**
     * 商品规格
     * @return commoditySpecMid
     */
    public String getCommoditySpecMid() {
        return commoditySpecMid;
    }

    /**
     * 商品规格
     * @param commoditySpecMid
     */
    public void setCommoditySpecMid(String commoditySpecMid) {
        this.commoditySpecMid = commoditySpecMid;
    }

    /**
     * 商品数量
     * @return commodityCount
     */
    public Integer getCommodityCount() {
        return commodityCount;
    }

    /**
     * 商品数量
     * @param commodityCount
     */
    public void setCommodityCount(Integer commodityCount) {
        this.commodityCount = commodityCount;
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
     * 更新时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
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

	@Override
	public String toString() {
		return "ShoppingCartEntity [id=" + id + ", userId=" + userId + ", shopId=" + shopId + ", guideId=" + guideId
				+ ", commodityMid=" + commodityMid + ", guideType=" + guideType + ", commoditySpecMid=" + commoditySpecMid
				+ ", commodityCount=" + commodityCount + ", createAt=" + createAt + ", updateAt=" + updateAt + ", isDisabled="
				+ isDisabled + "]";
	}
    
}