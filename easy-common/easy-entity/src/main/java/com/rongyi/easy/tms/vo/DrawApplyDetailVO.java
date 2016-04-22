/** 
* @Title: DrawApplyDetailVO.java 
* @Package com.rongyi.easy.tms.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月28日 上午11:03:10 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.tms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhengYl
 *
 */
public class DrawApplyDetailVO implements Serializable {
    private static final long serialVersionUID = -7647979818874548559L;

	private Integer id;

    /** 提现账号 */
    private String drawApplyAccount;
    
    /** 提现申请时间 */
    private Date createAt;
    
    /** 状态 */
    private Integer status;
    
    /** 提现金额 */
    private BigDecimal drawAmount;

	/** 审核时间 */
	private Date verifyAt;

	/** 发放时间 */
	private Date payAt;

	/** 轨迹跟踪状态  0 提现申请 1 审核成功 2审核失败 3 已发放 */
	private Integer traceStatus;

	/** 审核失败理由 */
	private String failReason;

	/**
	 * 卡名称（暂时只有支付宝）
	 */
	private String payAccountType;

	public String getDrawApplyAccount() {
		return drawApplyAccount;
	}

	public void setDrawApplyAccount(String drawApplyAccount) {
		this.drawApplyAccount = drawApplyAccount;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public BigDecimal getDrawAmount() {
		return drawAmount;
	}

	public void setDrawAmount(BigDecimal drawAmount) {
		this.drawAmount = drawAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPayAccountType() {
		return payAccountType;
	}

	public void setPayAccountType(String payAccountType) {
		this.payAccountType = payAccountType;
	}

	public Date getVerifyAt() {
		return verifyAt;
	}

	public void setVerifyAt(Date verifyAt) {
		this.verifyAt = verifyAt;
	}

	public Date getPayAt() {
		return payAt;
	}

	public void setPayAt(Date payAt) {
		this.payAt = payAt;
	}

	public Integer getTraceStatus() {
		return traceStatus;
	}

	public void setTraceStatus(Integer traceStatus) {
		this.traceStatus = traceStatus;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
}
