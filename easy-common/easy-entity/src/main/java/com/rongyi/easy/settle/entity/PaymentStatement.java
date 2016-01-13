package com.rongyi.easy.settle.entity;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 对账单 
 * @datetime:2015年9月17日上午10:58:02
 *
 **/
public class PaymentStatement implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 9127540088502285733L;

	private Integer id;

    /**
     * 对账单配置主键
     */
    private Integer configId;

    /**
     * 规则编码
     */
    private String ruleCode;

    /**
     * 账单周期起始时间
     */
    private Date cycleStartTime;

    /**
     * 账单周期结束时间
     */
    private Date cycleEndTime;

    /**
     * 对账单类型(0:商家对账单,1:个人对账单,默认商家)
     */
    private Byte type;

    /**
     * 账单批次(商户ID+YYYYMMDD+01（笔数）)
     */
    private String batchNo;

    /**
     * 付款金额
     */
    private Integer payTotal;

    /**
     * 对账单状态(0:初始状态（生成对账单时）、1:人工审核通过、2：人工审核不通过、3：系统审核通过、4：商家确认通过、
     * 5：确认异常（商家确认不通过），6：付款审核通过（待付款审核通过）、7：付款审核不通过（付款审核时不通过）、8：作废（重新生成新对账单原对账单自动作废或手工作废）)、9：付款冻结（冻结付款）、10：付款解冻、11：已付款（付款完成）
     */
    private Byte status;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 付款单号
     */
    private String payNo;

    /**
     * 状态更新时间(最新状态更新时间)
     */
    private Date statusUpdateTime;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 标记删除(0:正常，1:删除，默认正常)
     */
    private Byte isDelete;

    /**
     * 预计付款时间
     */
    private Date predictPayTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public Date getCycleStartTime() {
        return cycleStartTime;
    }

    public void setCycleStartTime(Date cycleStartTime) {
        this.cycleStartTime = cycleStartTime;
    }

    public Date getCycleEndTime() {
        return cycleEndTime;
    }

    public void setCycleEndTime(Date cycleEndTime) {
        this.cycleEndTime = cycleEndTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getPayTotal() {
        return payTotal;
    }

    public void setPayTotal(Integer payTotal) {
        this.payTotal = payTotal;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getStatusUpdateTime() {
        return statusUpdateTime;
    }

    public void setStatusUpdateTime(Date statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    public Date getPredictPayTime() {
        return predictPayTime;
    }

    public void setPredictPayTime(Date predictPayTime) {
        this.predictPayTime = predictPayTime;
    }
}