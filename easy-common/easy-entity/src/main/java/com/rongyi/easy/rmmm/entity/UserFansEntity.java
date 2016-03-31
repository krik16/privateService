package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class UserFansEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 卖家(买手)用户Id */
    private Integer sellerId;

    /** 买家ID */
    private String buyerId;

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

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
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