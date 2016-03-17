
package com.rongyi.easy.settle.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 柯军
 * @Description: 对账配置表
 * @datetime:2015年9月17日上午10:44:44
 **/
public class StatementConfig implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6319099252654638886L;

    private Integer id;

    /**
     * 规则编码
     */
    private String ruleCode;

    /**
     * 合作方式（0:合作,1:非合作,默认合作）
     */
    private Byte cooperateType;

    /**
     * 商户类型(0:店铺，1:商场，2:品牌，3:分公司，4:集团公司，默认店铺)
     */
    private Byte bussinessType;

    /**
     * 商户代码
     */
    private String bussinessCode;

    /**
     * 商户mongoId
     */
    private String bussinessId;

    /**
     * 商户名称
     */
    private String bussinessName;

    /**
     * 商户真实地址
     */
    private String bussinessRealAddress;

    /** 0:所有,1:自身,2:部分 */
    private Byte linkType;
    
    /** 关联角色(0:全部,1:导购，2:买手) */
    private Byte linkRole;

    /**
     * 关联店铺操作(0:选择,1:排除)
     */
    private Byte linkShopOp;

    /**
     * 计算周期（0:日，1:周，2:月，3:自定义）
     */
    private Byte countCycle;

    /**
     * 周期开始时间
     */
    private Date cycleStartTime;

    /**
     * 周期结束时间
     */
    private Date cycleEndTime;

    /**
     * 计算周期（单位：天）
     */
    private Integer cycleDay;
    
    /** 
     * 对账单生成的日期（自定义类型），如每月5日15日25日生成订单，记为5&15&25 
     */
    private String cycleRegularDay;
    
    /**
     * 是否滚动账期（0:是，1:否，默认是）
     */
    private Byte isLoop;

    /**
     * 审核方式(0:系统，1:人工，默认系统)
     */
    private Byte verifyType;

    /**
     * 生成时间前置部分
     */
    private String generateHeaderTime;

    /**
     * 生成时间时分部分
     */
    private String generateHmTime;

    /**
     * 对账单发送时间
     */
    private Date sendTime;

    /**
     * 付款基准类型(0:系统确认，1：商户确认)
     */
    private Byte datumType;

    /**
     * 付款模式（0:固定日期，1:滚动日期，默认固定日期）
     */
    private Byte payMode;

    /**
     * 固定日期（多个值用&分隔）
     */
    private String regularDay;

    /**
     * 滚动日期
     */
    private String rollDay;

    /**
     * 滚动类型(0:天，1:时，默认天)
     */
    private Byte rollType;

    /**
     * 生效起始时间
     */
    private Date effectStartTime;

    /**
     * 生效结束时间
     */
    private Date effectEndTime;

    /**
     * 结算方式(0:支付宝，1:微信，2:银联，3:现金，默认支付宝)
     */
    private Byte payChannel;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 关联规则编号
     */
    private String linkedRuleCode;

    /**
     * 状态（0:待审核,1:已通过，2：未通过，3:变更待审核中，4:停用）
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 标记删除(0:整除，1:删除)
     */
    private Byte isDelete;

    /**
     * 创建人账号
     */
    private String createBy;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public Byte getCooperateType() {
        return cooperateType;
    }

    public void setCooperateType(Byte cooperateType) {
        this.cooperateType = cooperateType;
    }

    public Byte getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(Byte bussinessType) {
        this.bussinessType = bussinessType;
    }

    public String getBussinessCode() {
        return bussinessCode;
    }

    public void setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
    }

    public String getBussinessName() {
        return bussinessName;
    }

    public void setBussinessName(String bussinessName) {
        this.bussinessName = bussinessName;
    }

    public Byte getCountCycle() {
        return countCycle;
    }

    public void setCountCycle(Byte countCycle) {
        this.countCycle = countCycle;
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

    public Byte getIsLoop() {
        return isLoop;
    }

    public void setIsLoop(Byte isLoop) {
        this.isLoop = isLoop;
    }

    public Byte getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(Byte verifyType) {
        this.verifyType = verifyType;
    }

    public String getGenerateHeaderTime() {
        return generateHeaderTime;
    }

    public void setGenerateHeaderTime(String generateHeaderTime) {
        this.generateHeaderTime = generateHeaderTime;
    }

    public String getGenerateHmTime() {
        return generateHmTime;
    }

    public void setGenerateHmTime(String generateHmTime) {
        this.generateHmTime = generateHmTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Byte getDatumType() {
        return datumType;
    }

    public void setDatumType(Byte datumType) {
        this.datumType = datumType;
    }

    public Byte getPayMode() {
        return payMode;
    }

    public void setPayMode(Byte payMode) {
        this.payMode = payMode;
    }

    public String getRegularDay() {
        return regularDay;
    }

    public void setRegularDay(String regularDay) {
        this.regularDay = regularDay;
    }

    public String getRollDay() {
        return rollDay;
    }

    public void setRollDay(String rollDay) {
        this.rollDay = rollDay;
    }

    public Byte getRollType() {
        return rollType;
    }

    public void setRollType(Byte rollType) {
        this.rollType = rollType;
    }

    public Date getEffectStartTime() {
        return effectStartTime;
    }

    public void setEffectStartTime(Date effectStartTime) {
        this.effectStartTime = effectStartTime;
    }

    public Date getEffectEndTime() {
        return effectEndTime;
    }

    public void setEffectEndTime(Date effectEndTime) {
        this.effectEndTime = effectEndTime;
    }

    public Byte getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Byte payChannel) {
        this.payChannel = payChannel;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getLinkedRuleCode() {
        return linkedRuleCode;
    }

    public void setLinkedRuleCode(String linkedRuleCode) {
        this.linkedRuleCode = linkedRuleCode;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId;
    }

    public String getBussinessRealAddress() {
        return bussinessRealAddress;
    }

    public void setBussinessRealAddress(String bussinessRealAddress) {
        this.bussinessRealAddress = bussinessRealAddress;
    }

    public Byte getLinkShopOp() {
        return linkShopOp;
    }

    public void setLinkShopOp(Byte linkShopOp) {
        this.linkShopOp = linkShopOp;
    }

	/**
	 * @return the linkType
	 */
	public Byte getLinkType() {
		return linkType;
	}

	/**
	 * @param linkType the linkType to set
	 */
	public void setLinkType(Byte linkType) {
		this.linkType = linkType;
	}

	/**
	 * @return the linkRole
	 */
	public Byte getLinkRole() {
		return linkRole;
	}

	/**
	 * @param linkRole the linkRole to set
	 */
	public void setLinkRole(Byte linkRole) {
		this.linkRole = linkRole;
	}

	/**
	 * @return the cycleDay
	 */
	public Integer getCycleDay() {
		return cycleDay;
	}

	/**
	 * @param cycleDay the cycleDay to set
	 */
	public void setCycleDay(Integer cycleDay) {
		this.cycleDay = cycleDay;
	}

	/**
	 * @return the cycleRegularDay
	 */
	public String getCycleRegularDay() {
		return cycleRegularDay;
	}

	/**
	 * @param cycleRegularDay the cycleRegularDay to set
	 */
	public void setCycleRegularDay(String cycleRegularDay) {
		this.cycleRegularDay = cycleRegularDay;
	}

    @Override
    public String toString() {
        return "StatementConfig{" +
                "id=" + id +
                ", ruleCode='" + ruleCode + '\'' +
                ", cooperateType=" + cooperateType +
                ", bussinessType=" + bussinessType +
                ", bussinessCode='" + bussinessCode + '\'' +
                ", bussinessId='" + bussinessId + '\'' +
                ", bussinessName='" + bussinessName + '\'' +
                ", bussinessRealAddress='" + bussinessRealAddress + '\'' +
                ", linkType=" + linkType +
                ", linkRole=" + linkRole +
                ", linkShopOp=" + linkShopOp +
                ", countCycle=" + countCycle +
                ", cycleStartTime=" + cycleStartTime +
                ", cycleEndTime=" + cycleEndTime +
                ", cycleDay=" + cycleDay +
                ", cycleRegularDay='" + cycleRegularDay + '\'' +
                ", isLoop=" + isLoop +
                ", verifyType=" + verifyType +
                ", generateHeaderTime='" + generateHeaderTime + '\'' +
                ", generateHmTime='" + generateHmTime + '\'' +
                ", sendTime=" + sendTime +
                ", datumType=" + datumType +
                ", payMode=" + payMode +
                ", regularDay='" + regularDay + '\'' +
                ", rollDay='" + rollDay + '\'' +
                ", rollType=" + rollType +
                ", effectStartTime=" + effectStartTime +
                ", effectEndTime=" + effectEndTime +
                ", payChannel=" + payChannel +
                ", contractNo='" + contractNo + '\'' +
                ", linkedRuleCode='" + linkedRuleCode + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", isDelete=" + isDelete +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}