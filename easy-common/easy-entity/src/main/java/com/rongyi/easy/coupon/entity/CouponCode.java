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

	/** 状态 0:待领取 1:已领取 2:已删除 */
	private Integer status;

		/**是否是第三方码*/
		private Boolean outStatus=false;

	/** 创建时间 */
	private Date createdTime;

	/** 领取券码的时间 */
	private Date updatedTime;

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

		public Integer getStatus() {
				return status;
		}

		public void setStatus(Integer status) {
				this.status = status;
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

		public Boolean getOutStatus() {
				return outStatus;
		}

		public void setOutStatus(Boolean outStatus) {
				this.outStatus = outStatus;
		}

		@Override
		public boolean equals(Object o) {
				if (this == o)
						return true;
				if (o == null || getClass() != o.getClass())
						return false;

				CouponCode that = (CouponCode) o;

				if (code != null ? !code.equals(that.code) : that.code != null)
						return false;
				if (couponId != null ? !couponId.equals(that.couponId) : that.couponId != null)
						return false;
				return !(outStatus != null ? !outStatus.equals(that.outStatus) : that.outStatus != null);

		}

		@Override
		public int hashCode() {
				int result = code != null ? code.hashCode() : 0;
				result = 31 * result + (couponId != null ? couponId.hashCode() : 0);
				result = 31 * result + (outStatus != null ? outStatus.hashCode() : 0);
				return result;
		}

		@Override
		public String toString() {
				return new ToStringBuilder(this).append("id", id).append("code", code).append("couponId", couponId).append("status", status).append("createdTime", createdTime).append("updatedTime", updatedTime).toString();
		}

		public CouponCode(String code, String couponId) {
				super();
				this.code = code;
				this.couponId = couponId;
		}

		public CouponCode() {

		}
}
