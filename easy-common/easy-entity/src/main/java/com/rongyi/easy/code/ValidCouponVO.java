package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.Date;

/**
 * ȯ����֤ҳҳ����ʾ
 * @author hebo 2015/09/13
 *
 */
public class ValidCouponVO implements Serializable {

	private String name;//ȯ����
	private Date validStartAt;//��Ч��ʼ
	private Date validEndAt;//��Ч��ֹ
	private String limitUseCount;//ÿ��ÿ����������
	private Integer useredCount;//������ʹ�ô���
	private String limitDesc;//ʹ������
	private String usageDesc;//ʹ��˵��
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
