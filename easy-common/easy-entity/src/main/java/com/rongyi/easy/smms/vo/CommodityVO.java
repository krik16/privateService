package com.rongyi.easy.smms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CommodityVO implements Serializable {

    private static final long serialVersionUID = -3340617058381363939L;

    /**  */
    private Long              id;

    /** 商品名称 */
    private String            name;

    /** 展示渠道 1 标超 2大卖场 3便利店 */
    private Byte              channel;

    /** 一级分类 关联一级分类id */
    private Long              firstCate;

    /** 二级分类 关联二级分类id */
    private Long              secondCate;

    /** 商品规格 */
    private String            specification;

    /** 原价 */
    private BigDecimal        originalCost;

    /** 现价 */
    private BigDecimal        currentPrice;

    /** 描述 */
    private String            description;

    /** 宣传图片 */
    private String            picture;

    /** 商场id */
    private String            mallId;

    /** 集团id */
    private String            groupId;

    /** 0 发布 1 关闭 2删除 */
    private Byte              status;
    
    /** 商品参数 */
    private String            parameters;

    /** 详情图片 */
    private List              detailImg;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getChannel() {
        return channel;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public Long getFirstCate() {
        return firstCate;
    }

    public void setFirstCate(Long firstCate) {
        this.firstCate = firstCate;
    }

    public Long getSecondCate() {
        return secondCate;
    }

    public void setSecondCate(Long secondCate) {
        this.secondCate = secondCate;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public List getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(List detailImg) {
        this.detailImg = detailImg;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
