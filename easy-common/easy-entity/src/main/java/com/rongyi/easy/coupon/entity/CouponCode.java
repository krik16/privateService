package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券现金劵生成的券码
 *
 * @author Breggor
 *
 */

public class CouponCode implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 券码ID */
	private Long id;

	/** 券码 */
	private String code;

	/** 优惠、现金券ID */
	private String couponId;

	/** 商场ID */
	private String mallId;

	/** 店铺ID */
	private String shopId;

	/** 券码类型 */
	private String type;

	/** 状态 0:待领取 1:已领取 2:已使用 3:已过期。 */
	private Integer status;

	/** 领用券码用户ID */
	private String userId;

	/** 领用券码用户类型 */
	private String userType;

	/** 领用券码用户手机 */
	private String mobile;

	/** 创建时间 */
	private Date createdTime;

	/** 更新时间（验证时间）(废弃) */
	private Date updatedTime;

	/** 编码是否被删除：n-没有删除 y-已删除 */
	private String isDelete;
	
	/** 用户渠道：(废弃) */
	private String userSrc;
	
	/** 有效期开始时间(废弃) */
	private Date validBeginDate;
	
	/** 有效期结束时间(废弃) */
	private Date validEndDate;
	
	/** 抵扣金额 (废弃)*/
	private Double discount;
	
	
	public Date getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(Date validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public Date getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getUserSrc() {
		return userSrc;
	}

	public void setUserSrc(String userSrc) {
		this.userSrc = userSrc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("code", code).append("couponId", couponId)
				.append("mallId", mallId).append("shopId", shopId).append("type", type).append("status", status)
				.append("userId", userId).append("userType", userType).append("mobile", mobile)
				.append("createdTime", createdTime).append("updatedTime", updatedTime).append("isDelete", isDelete)
				.toString();
	}

		@Override
		public boolean equals(Object o) {
				if (this == o)
						return true;
				if (o == null || getClass() != o.getClass())
						return false;

				CouponCode that = (CouponCode) o;

				if (id != null ? !id.equals(that.id) : that.id != null)
						return false;
				if (code != null ? !code.equals(that.code) : that.code != null)
						return false;
				if (couponId != null ? !couponId.equals(that.couponId) : that.couponId != null)
						return false;
				if (mallId != null ? !mallId.equals(that.mallId) : that.mallId != null)
						return false;
				if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null)
						return false;
				if (type != null ? !type.equals(that.type) : that.type != null)
						return false;
				if (status != null ? !status.equals(that.status) : that.status != null)
						return false;
				if (userId != null ? !userId.equals(that.userId) : that.userId != null)
						return false;
				if (userType != null ? !userType.equals(that.userType) : that.userType != null)
						return false;
				if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null)
						return false;
				if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null)
						return false;
				if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null)
						return false;
				if (isDelete != null ? !isDelete.equals(that.isDelete) : that.isDelete != null)
						return false;
				if (userSrc != null ? !userSrc.equals(that.userSrc) : that.userSrc != null)
						return false;
				if (validBeginDate != null ?
						!validBeginDate.equals(that.validBeginDate) :
						that.validBeginDate != null)
						return false;
				if (validEndDate != null ?
						!validEndDate.equals(that.validEndDate) :
						that.validEndDate != null)
						return false;
				return !(discount != null ? !discount.equals(that.discount) : that.discount != null);

		}

		@Override
		public int hashCode() {
				int result = id != null ? id.hashCode() : 0;
				result = 31 * result + (code != null ? code.hashCode() : 0);
				result = 31 * result + (couponId != null ? couponId.hashCode() : 0);
				result = 31 * result + (mallId != null ? mallId.hashCode() : 0);
				result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
				result = 31 * result + (type != null ? type.hashCode() : 0);
				result = 31 * result + (status != null ? status.hashCode() : 0);
				result = 31 * result + (userId != null ? userId.hashCode() : 0);
				result = 31 * result + (userType != null ? userType.hashCode() : 0);
				result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
				result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
				result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
				result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
				result = 31 * result + (userSrc != null ? userSrc.hashCode() : 0);
				result = 31 * result + (validBeginDate != null ? validBeginDate.hashCode() : 0);
				result = 31 * result + (validEndDate != null ? validEndDate.hashCode() : 0);
				result = 31 * result + (discount != null ? discount.hashCode() : 0);
				return result;
		}
}
