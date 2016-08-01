package com.rongyi.easy.coupon.vo;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/28 17:41
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-market
 */
public class SpecialVO implements Serializable {
    /**
     * 可领取的次数
     */
    private Integer count;

    /**
     * 0:成功。1：用户id 为空；2：没有设置可领取的卡券;3:该用户的次数已经用完了;4:卡券已经领完了
     */
    private Integer status;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SpecialVO() {
        this.count = 0;
        this.status = 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SpecialVO{");
        sb.append("count=").append(count);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
