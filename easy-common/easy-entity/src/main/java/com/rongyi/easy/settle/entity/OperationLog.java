package com.rongyi.easy.settle.entity;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 操作日志 
 * @datetime:2015年9月17日上午11:07:28
 *
 **/
public class OperationLog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3237830631078676431L;

	private Integer id;

    /**
     * 业务模块类型(0:对账单配置,1:对账单)
     */
    private Byte operationModel;

    /**
     * 业务主键
     */
    private Integer operationId;

    /**
     * 业务操作类型(对账单配置【0:待审核,1:已通过，2：未通过，3:变更待审核中，4：修改生效，5：修改待审核，6:停用】，对账单【0:初始状态（生成对账单时）、1:人工审核通过、2：人工审核不通过、
     * 3：系统审核通过、4：商家确认通过、5：、确认异常（商家确认不通过），6：付款审核通过（待付款审核通过）、7：付款审核不通过（付款审核时不通过）、8：作废（重新生成新对账单原对账单自动作废或手工作废）)、9：付款冻结（冻结付款）、10：付款解冻、11：已付款（付款完成）】)
     */
    private Byte operationType;

    /**
     * 创建用户id
     */
    private String createUserId;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 备注(审核原因描述等)
     */
    private String desc;

    /**
     * 标记删除(0:正常，1:删除)
     */
    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getOperationModel() {
        return operationModel;
    }

    public void setOperationModel(Byte operationModel) {
        this.operationModel = operationModel;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Byte getOperationType() {
        return operationType;
    }

    public void setOperationType(Byte operationType) {
        this.operationType = operationType;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }


    public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}