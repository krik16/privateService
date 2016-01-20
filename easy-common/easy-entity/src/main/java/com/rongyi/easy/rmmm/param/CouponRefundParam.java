/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年1月20日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年1月20日               1.0              创建文件
 */
public class CouponRefundParam extends MalllifeBaseParam implements Serializable{
	
	private String refundId;//退款id

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	@Override
	public String toString() {
		return "CouponRefundParam [refundId=" + refundId + "]";
	}

}
