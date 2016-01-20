/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.coupon.old_vo.OldUserCode;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年1月20日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年1月20日               1.0              创建文件
 */
public class RefundActivityListVO implements Serializable{
	
    private String refundId;//退款id
    
    private List<OldUserCode> refundList; //用户退款券码列表

	public RefundActivityListVO() {
		super();
	}

	public RefundActivityListVO(String refundId, List<OldUserCode> refundList) {
		super();
		this.refundId = refundId;
		this.refundList = refundList;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public List<OldUserCode> getRefundList() {
		return refundList;
	}

	public void setRefundList(List<OldUserCode> refundList) {
		this.refundList = refundList;
	}

	@Override
	public String toString() {
		return "RefundActivityListVO [refundId=" + refundId + ", refundList=" + refundList + "]";
	}

}
