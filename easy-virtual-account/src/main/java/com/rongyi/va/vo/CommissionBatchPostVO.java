/** 
 * @Title: CommissionBatchPostVO.java 
 * @Package com.rongyi.va.vo 
 * @Description: 批量导入佣金
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月28日 下午5:48:46 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.vo;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 * 
 */
public class CommissionBatchPostVO {

	/** 佣金金额 */
	private BigDecimal commissionAmount;

	/** 导购Id */
	private String guideId;

	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

}
