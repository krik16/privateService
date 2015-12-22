package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

public class CouponRejectRecord implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 卡券id
     */
    private String couponId;

    /**
     * 未通过或者下架原因
     */
    private String reason;

    /**
     * 审核[0], 下架[1]
     */
    private Integer type;
    

    /**
     * 创建时间
     */
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponRejectRecord [id=").append(id).append(", couponId=").append(couponId).append(", reason=")
				.append(reason).append(", type=").append(type).append(", createAt=").append(createAt).append("]");
		return builder.toString();
	}
    
}