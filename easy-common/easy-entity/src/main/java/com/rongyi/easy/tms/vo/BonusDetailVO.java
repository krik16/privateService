/** 
* @Title: BonusDetailVO.java 
* @Package com.rongyi.easy.tms.vo 
* @Description: 奖金明细
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月5日 下午2:08:43 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.tms.vo;

import java.io.Serializable;

/**
 * @author ZhengYl
 *
 */
public class BonusDetailVO implements Serializable {
    private static final long serialVersionUID = -7647979818874548559L;
    
	/** 时间 2015-02-08 11:14 */
	private String date;

	/** 资金来源 */
	private String from;

	/** 金额 */
	private String amount;

	/** 状态: 全部[0] 已发放[1] 处理中[2] 失败[3] */
	private String status;

	/** 奖励原因 */
	private String awardReason;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getAwardReason() {
		return awardReason;
	}

	public void setAwardReason(String awardReason) {
		this.awardReason = awardReason;
	}
}