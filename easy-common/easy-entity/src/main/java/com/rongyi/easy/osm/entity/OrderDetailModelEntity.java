package com.rongyi.easy.osm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetailModelEntity {
    /** 主键id */
    private Integer id;

    /** 父模板id */
    private Integer orderModelId;

    /** 购买数量 */
    private Integer quantity;

    /** 商品编号 */
    private String commodityMid;

    /** 商品规格id */
    private String commoditySpecMid;

    /** 商品佣金 */
    private BigDecimal commodityCommission;

    /** 商品单价 */
    private BigDecimal unitPrice;

    /** 子订单模板创建时间 */
    private Date createAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 版本 */
    private Integer version;

    //文章类型 1潮人攻略
    private Integer articleType;

    //文章id
    private Integer articleId;

    /**
     * 主键id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 父模板id
     * @return orderModelId
     */
    public Integer getOrderModelId() {
        return orderModelId;
    }

    /**
     * 父模板id
     * @param orderModelId
     */
    public void setOrderModelId(Integer orderModelId) {
        this.orderModelId = orderModelId;
    }

    /**
     * 购买数量
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 购买数量
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
     * 商品规格id
     * @return commoditySpecMid
     */
    public String getCommoditySpecMid() {
        return commoditySpecMid;
    }

    /**
     * 商品规格id
     * @param commoditySpecMid
     */
    public void setCommoditySpecMid(String commoditySpecMid) {
        this.commoditySpecMid = commoditySpecMid;
    }

    /**
     * 商品佣金
     * @return commodityCommission
     */
    public BigDecimal getCommodityCommission() {
        return commodityCommission;
    }

    /**
     * 商品佣金
     * @param commodityCommission
     */
    public void setCommodityCommission(BigDecimal commodityCommission) {
        this.commodityCommission = commodityCommission;
    }

    /**
     * 商品单价
     * @return unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 商品单价
     * @param unitPrice
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 子订单模板创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 子订单模板创建时间
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

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}