package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class ShopInfoEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 店铺名称 */
    private String shopName;

    /** 店铺所属商场名称 */
    private Integer mallId;

    /** 品牌名称 */
    private Integer brandId;

    /** 店铺Mongo ID */
    private String shopMid;

    /** 评分总人数 */
    private Integer scoreTotalNo;

    /** 总评分 */
    private Integer totalScore;

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
     * 店铺名称
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 店铺名称
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 店铺所属商场名称
     * @return mallId
     */
    public Integer getMallId() {
        return mallId;
    }

    /**
     * 店铺所属商场名称
     * @param mallId
     */
    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    /**
     * 品牌名称
     * @return brandId
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 品牌名称
     * @param brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 店铺Mongo ID
     * @return shopMid
     */
    public String getShopMid() {
        return shopMid;
    }

    /**
     * 店铺Mongo ID
     * @param shopMid
     */
    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    /**
     * 评分总人数
     * @return scoreTotalNo
     */
    public Integer getScoreTotalNo() {
        return scoreTotalNo;
    }

    /**
     * 评分总人数
     * @param scoreTotalNo
     */
    public void setScoreTotalNo(Integer scoreTotalNo) {
        this.scoreTotalNo = scoreTotalNo;
    }

    /**
     * 总评分
     * @return totalScore
     */
    public Integer getTotalScore() {
        return totalScore;
    }

    /**
     * 总评分
     * @param totalScore
     */
    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }
}