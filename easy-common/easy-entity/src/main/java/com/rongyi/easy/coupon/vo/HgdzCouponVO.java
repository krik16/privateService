package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.SimpleCouponEntity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * 哈根达斯中秋券-生成券实体
 *
 * @author wangjh7
 * @date 2016-08-04
 */
@XmlRootElement(name = "CouponBatchResult")
public class HgdzCouponVO implements Serializable {

    public HgdzCouponVO() {
        super();
    }

    /**
     * 请求状态码
     */
    private String rtnCode;

    /**
     * 实体
     */
    List<SimpleCouponEntity> listCoupon;

    @XmlElementWrapper(name = "listCoupon")
    @XmlElement(name = "Coupon")
    public List<SimpleCouponEntity> getListCoupon() {
        return listCoupon;
    }

    public void setListCoupon(List<SimpleCouponEntity> listCoupon) {
        this.listCoupon = listCoupon;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    @Override
    public String toString() {
        return "HgdzCouponVO{" +
                "listCoupon=" + listCoupon +
                ", rtnCode='" + rtnCode + '\'' +
                '}';
    }
}
