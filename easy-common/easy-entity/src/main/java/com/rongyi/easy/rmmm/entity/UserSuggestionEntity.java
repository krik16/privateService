package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class UserSuggestionEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 创建时间 */
    private Date createAt;

    /** 提交人ID */
    private String submitBy;

    /** 来源：0000（终端机），0001（app），0002（微信），0003为 移动微商城， 0004-9999（其他，包括发码，活动等） */
    private Integer sugSource;

    /** 联系号码 */
    private String sugPhone;

    /** 状态：0正常，1禁用 */
    private Integer status;

    /** 建议内容 */
    private String sugContent;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 提交人ID
     * @return submitBy
     */
    public String getSubmitBy() {
        return submitBy;
    }

    /**
     * 提交人ID
     * @param submitBy
     */
    public void setSubmitBy(String submitBy) {
        this.submitBy = submitBy;
    }

    /**
     * 来源：0000（终端机），0001（app），0002（微信），0003为 移动微商城， 0004-9999（其他，包括发码，活动等）
     * @return sugSource
     */
    public Integer getSugSource() {
        return sugSource;
    }

    /**
     * 来源：0000（终端机），0001（app），0002（微信），0003为 移动微商城， 0004-9999（其他，包括发码，活动等）
     * @param sugSource
     */
    public void setSugSource(Integer sugSource) {
        this.sugSource = sugSource;
    }

    /**
     * 联系号码
     * @return sugPhone
     */
    public String getSugPhone() {
        return sugPhone;
    }

    /**
     * 联系号码
     * @param sugPhone
     */
    public void setSugPhone(String sugPhone) {
        this.sugPhone = sugPhone;
    }

    /**
     * 状态：0删除，1正常
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：0删除，1正常
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 建议内容
     * @return sugContent
     */
    public String getSugContent() {
        return sugContent;
    }

    /**
     * 建议内容
     * @param sugContent
     */
    public void setSugContent(String sugContent) {
        this.sugContent = sugContent;
    }
}