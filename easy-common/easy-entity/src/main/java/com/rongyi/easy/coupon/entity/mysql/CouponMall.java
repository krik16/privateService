package com.rongyi.easy.coupon.entity.mysql;

public class CouponMall {
    private Integer id;

    /**
     * 卡券id
     */
    private Integer couponId;

    /**
     * 商场id
     */
    private String mallId;

    /**
     * 商场名称
     */
    private String mallName;

    /**
     * 商场地址
     */
    private String mallAddress;

    /**
     * 商场logo
     */
    private String mallLogUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallAddress() {
        return mallAddress;
    }

    public void setMallAddress(String mallAddress) {
        this.mallAddress = mallAddress;
    }

    public String getMallLogUrl() {
        return mallLogUrl;
    }

    public void setMallLogUrl(String mallLogUrl) {
        this.mallLogUrl = mallLogUrl;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponMall [id=").append(id).append(", couponId=").append(couponId).append(", mallId=")
				.append(mallId).append(", mallName=").append(mallName).append(", mallAddress=").append(mallAddress)
				.append(", mallLogUrl=").append(mallLogUrl).append("]");
		return builder.toString();
	}
    
}
