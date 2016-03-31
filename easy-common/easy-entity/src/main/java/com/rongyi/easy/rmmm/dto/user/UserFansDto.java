package com.rongyi.easy.rmmm.dto.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/19              1.0            创建文件
 *
 */

import java.io.Serializable;

public class UserFansDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 卖家(买手)用户Id */
    private Integer sellerId;

    /** 买家ID */
    private String buyerId;

    /** 用户类型 1 导购，2买手 */
    private Integer sellerType;


    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getSellerType() {
        return sellerType;
    }

    public void setSellerType(Integer sellerType) {
        this.sellerType = sellerType;
    }
}
