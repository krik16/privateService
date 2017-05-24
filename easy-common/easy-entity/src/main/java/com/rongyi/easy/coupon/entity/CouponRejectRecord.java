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

    private Integer status;

    /**
     * 操作人
     */
    private String createUser;

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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponRejectRecord{");
        sb.append("id=").append(id);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append(", reason='").append(reason).append('\'');
        sb.append(", type=").append(type);
        sb.append(", createAt=").append(createAt);
        sb.append(", status=").append(status);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
