package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 提现申请审核日志 
 * @datetime:2015年5月11日下午3:18:11
 *
 **/
public class DrawVerifyLog implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 786515835935399927L;

    private Integer id;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 操作业务(0:一级审批，1:二级审批)
     */
    private Integer operateBiz;

    /**
     * 审核意见
     */
    private String memo;

    /**
     * 提现申请id
     */
    private Integer drawApplyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Integer getOperateBiz() {
        return operateBiz;
    }

    public void setOperateBiz(Integer operateBiz) {
        this.operateBiz = operateBiz;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getDrawApplyId() {
        return drawApplyId;
    }

    public void setDrawApplyId(Integer drawApplyId) {
        this.drawApplyId = drawApplyId;
    }
}