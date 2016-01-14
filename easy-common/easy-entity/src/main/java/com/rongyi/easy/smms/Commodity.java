package com.rongyi.easy.smms;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Commodity implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**  */
    private Long id;

    /** 商品名称 */
    private String name;

    /** 展示渠道 1 标超 2大卖场 3便利店 */
    private Byte channel;

    /** 一级分类 关联一级分类id */
    private Long firstCate;

    /** 二级分类 关联二级分类id */
    private Long secondCate;

    /** 商品规格 */
    private String specification;

    /** 原价 */
    private BigDecimal originalCost;

    /** 现价 */
    private BigDecimal currentPrice;

    /** 描述 */
    private String description;

    /** 宣传图片 */
    private String picture;

    /** 创建时间 */
    private Date createdTime;

    /** 更新时间 */
    private Date updatedTime;

    /** 商场id -1没有关联商场 直接关联集团 */
    private String mallId;

    /** 集团id */
    private String groupId;

    /** 0 发布 1 关闭 2删除 */
    private Byte status;

    /** 商品参数 */
    private String parameters;

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
     * 商品名称
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 展示渠道 1 标超 2大卖场 3便利店
     * @return channel
     */
    public Byte getChannel() {
        return channel;
    }

    /**
     * 展示渠道 1 标超 2大卖场 3便利店
     * @param channel
     */
    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    /**
     * 一级分类 关联一级分类id
     * @return firstCate
     */
    public Long getFirstCate() {
        return firstCate;
    }

    /**
     * 一级分类 关联一级分类id
     * @param firstCate
     */
    public void setFirstCate(Long firstCate) {
        this.firstCate = firstCate;
    }

    /**
     * 二级分类 关联二级分类id
     * @return secondCate
     */
    public Long getSecondCate() {
        return secondCate;
    }

    /**
     * 二级分类 关联二级分类id
     * @param secondCate
     */
    public void setSecondCate(Long secondCate) {
        this.secondCate = secondCate;
    }

    /**
     * 商品规格
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 商品规格
     * @param specification
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * 原价
     * @return originalCost
     */
    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    /**
     * 原价
     * @param originalCost
     */
    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    /**
     * 现价
     * @return currentPrice
     */
    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 现价
     * @param currentPrice
     */
    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 宣传图片
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 宣传图片
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 商场id -1没有关联商场 直接关联集团
     * @return mallId
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * 商场id -1没有关联商场 直接关联集团
     * @param mallId
     */
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    /**
     * 集团id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 集团id
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 0 发布 1 关闭 2删除
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 0 发布 1 关闭 2删除
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 商品参数
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * 商品参数
     * @param parameters
     */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}