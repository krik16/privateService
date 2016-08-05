package com.rongyi.easy.coupon.entity;

/**
 * 哈根达斯中秋券-查询券结果实体
 *
 * @author wangjh7
 * @date 2016-08-04
 */
public class HgdzCouponQueryEntity extends SimpleCouponEntity {
    /**
     * 券码状态变更时间(比如已核销，就是核销时间)
     */
    private String statusChangeTime;
    /**
     * 销售点
     */
    private String seller;
    /**
     * 消费门店(提领门店)
     */
    private String shop;

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    @Override
    public String toString() {
        return "HgdzCouponQueryEntity{" +
                "seller='" + seller + '\'' +
                ", statusChangeTime='" + statusChangeTime + '\'' +
                ", shop='" + shop + '\'' +
                "} " + super.toString();
    }
}
