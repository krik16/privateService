//package com.rongyi.easy.rmmm.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//
//public class ShoppingCartEntity implements Serializable{
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	/** 主键 */
//    private Integer id;
//
//    /** 买家 mongo id */
//    private String buyerMid;
//
//    /** 商品 mongo_id */
//    private String commodityMid;
//
//    /** 商品规格 mongo id */
//    private String specMid;
//
//    /** 商品最终数量 */
//    private Integer commodityCount;
//
//    /** 店铺id */
//    private Integer shopId;
//
//    /** 创建人 */
//    private Integer createBy;
//
//    /** 创建时间 */
//    private Date createAt;
//
//    /**
//     * 主键
//     * @return id
//     */
//    public Integer getId() {
//        return id;
//    }
//
//    /**
//     * 主键
//     * @param id
//     */
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    /**
//     * 买家 mongo id
//     * @return buyerMid
//     */
//    public String getBuyerMid() {
//        return buyerMid;
//    }
//
//    /**
//     * 买家 mongo id
//     * @param buyerMid
//     */
//    public void setBuyerMid(String buyerMid) {
//        this.buyerMid = buyerMid;
//    }
//
//    /**
//     * 商品 mongo_id
//     * @return commodityMid
//     */
//    public String getCommodityMid() {
//        return commodityMid;
//    }
//
//    /**
//     * 商品 mongo_id
//     * @param commodityMid
//     */
//    public void setCommodityMid(String commodityMid) {
//        this.commodityMid = commodityMid;
//    }
//
//    /**
//     * 商品规格 mongo id
//     * @return specMid
//     */
//    public String getSpecMid() {
//        return specMid;
//    }
//
//    /**
//     * 商品规格 mongo id
//     * @param specMid
//     */
//    public void setSpecMid(String specMid) {
//        this.specMid = specMid;
//    }
//
//    /**
//     * 商品最终数量
//     * @return commodityCount
//     */
//    public Integer getCommodityCount() {
//        return commodityCount;
//    }
//
//    /**
//     * 商品最终数量
//     * @param commodityCount
//     */
//    public void setCommodityCount(Integer commodityCount) {
//        this.commodityCount = commodityCount;
//    }
//
//    /**
//     * 店铺id
//     * @return shopId
//     */
//    public Integer getShopId() {
//        return shopId;
//    }
//
//    /**
//     * 店铺id
//     * @param shopId
//     */
//    public void setShopId(Integer shopId) {
//        this.shopId = shopId;
//    }
//
//    /**
//     * 创建人
//     * @return createBy
//     */
//    public Integer getCreateBy() {
//        return createBy;
//    }
//
//    /**
//     * 创建人
//     * @param createBy
//     */
//    public void setCreateBy(Integer createBy) {
//        this.createBy = createBy;
//    }
//
//    /**
//     * 创建时间
//     * @return createAt
//     */
//    public Date getCreateAt() {
//        return createAt;
//    }
//
//    /**
//     * 创建时间
//     * @param createAt
//     */
//    public void setCreateAt(Date createAt) {
//        this.createAt = createAt;
//    }
//}