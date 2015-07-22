/** 
* @Title: PaymentAbnormalPageParam.java 
* @Package com.rongyi.tms.moudle.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月17日 下午2:30:10 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.moudle.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.rongyi.tms.constants.Constant;

/**
 * @author ZhengYl
 *
 */
public class PaymentAbnormalPageParam {
	/** 流水号 */
	private String id;

	/** 创建时间开始 */
	private String start;

	/** 创建时间截止 */
	private String end;

	/** 金额查询下限 */
	private String amountMin;

	/** 金额查询上限 */
	private String amountMax;

	/** 页数 */
	private String page;

	/** 订单号 */
	private String orderNo;

	/** 买家账号 */
	private String userAccount;

	/** 付款方式 */
	private String paymentType;

	/** 审核状态 */
	private String status;
	
	/** 订单类型 */
	private String paymentOrderType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getAmountMin() {
		return amountMin;
	}

	public void setAmountMin(String amountMin) {
		this.amountMin = amountMin;
	}

	public String getAmountMax() {
		return amountMax;
	}

	public void setAmountMax(String amountMax) {
		this.amountMax = amountMax;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentOrderType() {
		return paymentOrderType;
	}

	public void setPaymentOrderType(String paymentOrderType) {
		this.paymentOrderType = paymentOrderType;
	}
	
	public Map<String, Object> toParamsMap() {
		Map<String, Object> params = new HashMap<String, Object>();
		if (StringUtils.isNotBlank(this.getId())) {
			params.put("id", this.getId());
		}
		if (StringUtils.isNotBlank(this.getStart())) {
			params.put("start", this.getStart());
		}
		if (StringUtils.isNotBlank(this.getEnd())) {
			params.put("end", this.getEnd());
		}
		if (StringUtils.isNotBlank(this.getAmountMin())) {
			params.put("amountStart", this.getAmountMin());
		}
		if (StringUtils.isNotBlank(this.getAmountMax())) {
			params.put("amountEnd", this.getAmountMax());
		}
		if (StringUtils.isNotBlank(this.getOrderNo())) {
			params.put("orderNo", this.getOrderNo());
		}
		if (StringUtils.isNotBlank(this.getPaymentType())) {
			params.put("paymentType", this.getPaymentType());
		}
		if (StringUtils.isNotBlank(this.getUserAccount())) {
			params.put("userAccount", this.getUserAccount());
		}
		if (StringUtils.isNotBlank(this.getPaymentOrderType())) {
			params.put("paymentOrderType", this.getPaymentOrderType());
		}
		if (StringUtils.isNotBlank(page)) {
			params.put("begin", Constant.PAGE.PAGESIZE * (Integer.parseInt(page) - 1));
			params.put("pageNo", Integer.parseInt(page));
		} else {
			params.put("begin", 0);
			params.put("pageNo", 1);
		}
		List<Integer> statusList = new ArrayList<Integer>();
		if (StringUtils.isNotBlank(status)) {
			String[] statusStrArray = status.split(",");
			if (statusStrArray.length > 0) {
				for (int i = 0; i < statusStrArray.length; i++) {
					statusList.add(Integer.parseInt(statusStrArray[i]));
				}
			}
		}
		params.put("status", statusList);
		params.put("size", Constant.PAGE.PAGESIZE);
		params.put("orderBy", "-create_at");

		return params;
	}
}
