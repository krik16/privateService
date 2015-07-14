/** 
* @Title: DrawApplyInfoVO.java 
* @Package com.rongyi.tms.moudle.vo 
* @Description: 提现信息查询视图
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月26日 下午2:57:09 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.moudle.vo;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 *
 */
public class DrawApplyInfoVO {

	/** 用户Id */
	private String userId;
	
	/** 提现中（总计） */
	private BigDecimal drawForAuditTotal;
	
	/** 提现中（今日） */
	private BigDecimal drawForAuditToday;

	public BigDecimal getDrawForAuditTotal() {
		return drawForAuditTotal;
	}

	public void setDrawForAuditTotal(BigDecimal drawForAuditTotal) {
		this.drawForAuditTotal = drawForAuditTotal;
	}

	public BigDecimal getDrawForAuditToday() {
		return drawForAuditToday;
	}

	public void setDrawForAuditToday(BigDecimal drawForAuditToday) {
		this.drawForAuditToday = drawForAuditToday;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}