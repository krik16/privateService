/** 
* @Title: CommissionInfoVO.java 
* @Package com.rongyi.tms.moudle.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月26日 下午4:16:36 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.moudle.vo;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 *
 */
public class CommissionInfoVO {
	
	/** 用户Id */
	private String userId;
	
	/** 待审核佣金（全部） */
	private BigDecimal commissionForAuditTotal;

	/** 待审核佣金（今日） */
	private BigDecimal commissionForAuditToday;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getCommissionForAuditTotal() {
		return commissionForAuditTotal;
	}

	public void setCommissionForAuditTotal(BigDecimal commissionForAuditTotal) {
		this.commissionForAuditTotal = commissionForAuditTotal;
	}

	public BigDecimal getCommissionForAuditToday() {
		return commissionForAuditToday;
	}

	public void setCommissionForAuditToday(BigDecimal commissionForAuditToday) {
		this.commissionForAuditToday = commissionForAuditToday;
	}
	
	
}