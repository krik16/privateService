package com.rongyi.easy.coupon.entity.mysql;

import java.io.Serializable;

public class CouponGroup implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 卡券id
     */
    private Integer couponId;

    /**
     * 集团id
     */
    private String groupId;

    /**
     * 集团名称
     */
    private String groupName;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponGroup [id=").append(id).append(", couponId=").append(couponId).append(", groupId=")
				.append(groupId).append(", groupName=").append(groupName).append("]");
		return builder.toString();
	}

    public CouponGroup() {
    }

    public CouponGroup(Integer couponId, String groupId) {
        this.couponId = couponId;
        this.groupId = groupId;
    }

    public CouponGroup(Integer couponId, String groupId, String groupName) {
        this.couponId = couponId;
        this.groupId = groupId;
        this.groupName = groupName;
    }
}
