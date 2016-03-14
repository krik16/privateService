package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:摩店建券，白名单
 * Author: 袁波
 * DATE: 2016/1/27 20:08
 * Package:com.rongyi.easy.coupon.entity
 * Project:easy-common
 */
public class MshopWhiteList implements Serializable{
    private Integer id;
    private Integer type;
    private Integer merchantType;
    private String merchantId;
    private String merchantName;
    private Date createAt;
    private Integer status;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MshopWhiteList{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", merchantType=").append(merchantType);
        sb.append(", merchantId='").append(merchantId).append('\'');
        sb.append(", merchantName='").append(merchantName).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
