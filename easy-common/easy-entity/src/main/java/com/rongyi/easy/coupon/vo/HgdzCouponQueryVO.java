package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.HgdzCouponQueryEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 哈根达斯中秋券-查询券结果
 *
 * @author wangjh7
 * @date 2016-08-04
 */
public class HgdzCouponQueryVO implements Serializable {
    /**
     * 请求状态码
     */
    private String rtnCode;

    /**
     * 实体
     */
    HgdzCouponQueryEntity coupon;

    public HgdzCouponQueryEntity getCoupon() {
        return coupon;
    }

    public void setCoupon(HgdzCouponQueryEntity coupon) {
        this.coupon = coupon;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    @Override
    public String toString() {
        return "HgdzCouponQueryVO{" +
                "coupon=" + coupon +
                ", rtnCode='" + rtnCode + '\'' +
                '}';
    }
}
