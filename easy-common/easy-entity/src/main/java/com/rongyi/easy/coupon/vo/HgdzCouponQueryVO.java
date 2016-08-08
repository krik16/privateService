package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.HgdzCouponQueryEntity;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * 哈根达斯中秋券-查询券结果
 *
 * @author wangjh7
 * @date 2016-08-04
 */
@XmlRootElement(name = "CouponResult")
public class HgdzCouponQueryVO implements Serializable {
    /**
     * 请求状态码
     */
    private String rtnCode;

    /**
     * 订单id
     */
    private String dealId;

    /**
     * 实体
     */
    HgdzCouponQueryEntity coupon;

    @XmlElementWrapper(name = "coupon")
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
                ", dealId='" + dealId + '\'' +
                '}';
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }
}
