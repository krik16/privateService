package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class RefundReasonEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 退款原因 */
    private String refundReason;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

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
     * 退款原因
     * @return refundReason
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * 退款原因
     * @param refundReason
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }
}