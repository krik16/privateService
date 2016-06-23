package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:摩店用户已读卡券数量
 * Author: 袁波
 * DATE: 2016/6/15 15:13
 * Package:com.rongyi.easy.coupon.entity
 * Project:easy-mobile
 */
public class CouponUserRead  implements Serializable{
    private Integer id;
    private String shopId;
    private Integer userId;
    private Date createAt;
    private Date updateAt;
    private Integer readCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponUserRead{");
        sb.append("id=").append(id);
        sb.append(", shopId='").append(shopId).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", readCount=").append(readCount);
        sb.append('}');
        return sb.toString();
    }
}
