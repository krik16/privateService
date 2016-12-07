package com.rongyi.easy.coupon.vo.merchant;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 卡券运营返回VO
 * Author: yb
 * DATE: 2016/12/7 15:01
 * Package:com.rongyi.easy.coupon.vo.merchant
 * Project:easy-api
 */
public class MerchantOpVO implements Serializable{
    private String id;
    private String name;
    private Date publishStartAt;
    private Date publishEndAt;
    private Integer publishChannel;
    private String createUser;
    private Boolean isShowWx;
    private Boolean isShowTer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishStartAt() {
        return publishStartAt;
    }

    public void setPublishStartAt(Date publishStartAt) {
        this.publishStartAt = publishStartAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Boolean getIsShowWx() {
        return isShowWx;
    }

    public void setIsShowWx(Boolean isShowWx) {
        this.isShowWx = isShowWx;
    }

    public Boolean getIsShowTer() {
        return isShowTer;
    }

    public void setIsShowTer(Boolean isShowTer) {
        this.isShowTer = isShowTer;
    }
}
