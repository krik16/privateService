package com.rongyi.easy.rmmm.entity;

import java.util.Date;

public class UserFansEntity {
    /** 卖家(买手)用户Id */
    private Integer sellerId;

    /** 买家ID */
    private Integer buyerId;

    /** 用户类型 1 导购，2买手 */
    private Integer sellerType;

    /** 创建时间 */
    private Date createAt;

    /**
     * 卖家(买手)用户Id
     * @return sellerId
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 卖家(买手)用户Id
     * @param sellerId
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 买家ID
     * @return buyerId
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家ID
     * @param buyerId
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 用户类型 1 导购，2买手
     * @return sellerType
     */
    public Integer getSellerType() {
        return sellerType;
    }

    /**
     * 用户类型 1 导购，2买手
     * @param sellerType
     */
    public void setSellerType(Integer sellerType) {
        this.sellerType = sellerType;
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
}