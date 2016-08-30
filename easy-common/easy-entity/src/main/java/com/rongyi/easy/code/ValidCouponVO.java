package com.rongyi.easy.code;


		import java.io.Serializable;
		import java.util.Date;
/**
 * 券码验证页页面显示
 * @author hebo 2015/09/13
 *
 */
public class ValidCouponVO implements Serializable {

		private String name;//券名称
		private Date validStartAt;//有效期始
		private Date validEndAt;//有效期止
		private String limitUseCount;//每人每日限用张数
		private Integer useredCount;//当天已使用次数
		private String limitDesc;//使用限制
		private String usageDesc;//使用说明
		private String activityName;
		private Integer couponType;// 0:代金券 ;1：活动券；2：礼品；3：停车券 4 活动奖品券
		private String buyerPhone;
		private String buyerName;
		private String validStartAtStr;
		private String validEndAtStr;
		private Integer stock;
		private Double currentPrice;
		private Double originalPrice;
		private Integer point;

		public String getName() {
				return name;
		}
		public void setName(String name) {
				this.name = name;
		}
		public Date getValidStartAt() {
				return validStartAt;
		}
		public void setValidStartAt(Date validStartAt) {
				this.validStartAt = validStartAt;
		}
		public Date getValidEndAt() {
				return validEndAt;
		}
		public void setValidEndAt(Date validEndAt) {
				this.validEndAt = validEndAt;
		}
		public String getLimitUseCount() {
				return limitUseCount;
		}
		public void setLimitUseCount(String limitUseCount) {
				this.limitUseCount = limitUseCount;
		}
		public Integer getUseredCount() {
				return useredCount;
		}
		public void setUseredCount(Integer useredCount) {
				this.useredCount = useredCount;
		}
		public String getLimitDesc() {
				return limitDesc;
		}
		public void setLimitDesc(String limitDesc) {
				this.limitDesc = limitDesc;
		}
		public String getUsageDesc() {
				return usageDesc;
		}
		public void setUsageDesc(String usageDesc) {
				this.usageDesc = usageDesc;
		}

		public String getActivityName() {
				return activityName;
		}

		public void setActivityName(String activityName) {
				this.activityName = activityName;
		}

		public Integer getCouponType() {
				return couponType;
		}

		public void setCouponType(Integer couponType) {
				this.couponType = couponType;
		}

		public String getBuyerPhone() {
				return buyerPhone;
		}

		public void setBuyerPhone(String buyerPhone) {
				this.buyerPhone = buyerPhone;
		}

		public String getBuyerName() {
				return buyerName;
		}

		public void setBuyerName(String buyerName) {
				this.buyerName = buyerName;
		}

		public String getValidStartAtStr() {
				return validStartAtStr;
		}

		public void setValidStartAtStr(String validStartAtStr) {
				this.validStartAtStr = validStartAtStr;
		}

		public String getValidEndAtStr() {
				return validEndAtStr;
		}

		public void setValidEndAtStr(String validEndAtStr) {
				this.validEndAtStr = validEndAtStr;
		}

		public Integer getStock() {
				return stock;
		}

		public void setStock(Integer stock) {
				this.stock = stock;
		}

		public Double getCurrentPrice() {
				return currentPrice;
		}

		public void setCurrentPrice(Double currentPrice) {
				this.currentPrice = currentPrice;
		}

		public Double getOriginalPrice() {
				return originalPrice;
		}

		public void setOriginalPrice(Double originalPrice) {
				this.originalPrice = originalPrice;
		}

		public Integer getPoint() {
				return point;
		}

		public void setPoint(Integer point) {
				this.point = point;
		}

		@Override
		public String toString() {
				final StringBuffer sb = new StringBuffer("ValidCouponVO{");
				sb.append("name='").append(name).append('\'');
				sb.append(", validStartAt=").append(validStartAt);
				sb.append(", validEndAt=").append(validEndAt);
				sb.append(", limitUseCount='").append(limitUseCount).append('\'');
				sb.append(", useredCount=").append(useredCount);
				sb.append(", limitDesc='").append(limitDesc).append('\'');
				sb.append(", usageDesc='").append(usageDesc).append('\'');
				sb.append(", activityName='").append(activityName).append('\'');
				sb.append(", couponType=").append(couponType);
				sb.append(", buyerPhone='").append(buyerPhone).append('\'');
				sb.append(", buyerName='").append(buyerName).append('\'');
				sb.append(", validStartAtStr='").append(validStartAtStr).append('\'');
				sb.append(", validEndAtStr='").append(validEndAtStr).append('\'');
				sb.append(", stock=").append(stock);
				sb.append(", currentPrice=").append(currentPrice);
				sb.append(", originalPrice=").append(originalPrice);
				sb.append(", point=").append(point);
				sb.append('}');
				return sb.toString();
		}


}
