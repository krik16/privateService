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
    private Integer isShowWx;
    private Integer isShowTer;
    private Date createAt;

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

    public Integer getIsShowWx() {
        return isShowWx;
    }

    public void setIsShowWx(Integer isShowWx) {
        this.isShowWx = isShowWx;
    }

    public Integer getIsShowTer() {
        return isShowTer;
    }

    public void setIsShowTer(Integer isShowTer) {
        this.isShowTer = isShowTer;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MerchantOpVO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", publishStartAt=").append(publishStartAt);
        sb.append(", publishEndAt=").append(publishEndAt);
        sb.append(", publishChannel=").append(publishChannel);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append(", isShowWx=").append(isShowWx);
        sb.append(", isShowTer=").append(isShowTer);
        sb.append(", createAt=").append(createAt);
        sb.append('}');
        return sb.toString();
    }
}
