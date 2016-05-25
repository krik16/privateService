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
	@Override
	public String toString() {
		return "ValidCouponVO [name=" + name + ", validStartAt=" + validStartAt
				+ ", validEndAt=" + validEndAt + ", limitUseCount="
				+ limitUseCount + ", useredCount=" + useredCount
				+ ", limitDesc=" + limitDesc + ", usageDesc=" + usageDesc + "]";
	}
	
	
}
