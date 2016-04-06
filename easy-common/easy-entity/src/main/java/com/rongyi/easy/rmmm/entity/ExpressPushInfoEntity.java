package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 快递100推送
 * @author user
 *
 */
public class ExpressPushInfoEntity implements Serializable{
	
	/** 主键  */
    private Integer id;

    /** 物流单号  */
    private String expressBillId;

    /** 原来的公司编码 */
    private String oldCompany;
    
    /** 新的公司编码 */
    private String newCompany;

    /** 监控状态 : 1 polling(监控中),2 shutdown(结束),3 abort(中止),4 updateall(重新推送) */
    private Integer status;

    /** 监控状态相关消息，如:3天查询无记录，60天无变化  */
    private String message;

    /** 快递当前状态 :0在途中、1已揽收、2疑难、3正常签收或者退回签收  */
    private Integer state;

    /** 创建时间  */
    private Date createAt;

    /** 修改时间  */
    private Date updateAt;

    /** 是否禁用0正常 1禁用  */
    private Integer isDisabled;

    /** 快递100推送的物流信息  */
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpressBillId() {
        return expressBillId;
    }

    public void setExpressBillId(String expressBillId) {
        this.expressBillId = expressBillId;
    }

    public String getOldCompany() {
		return oldCompany;
	}

	public void setOldCompany(String oldCompany) {
		this.oldCompany = oldCompany;
	}

	public String getNewCompany() {
		return newCompany;
	}

	public void setNewCompany(String newCompany) {
		this.newCompany = newCompany;
	}

	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

	@Override
	public String toString() {
		return "ExpressPushInfoEntity [id=" + id + ", expressBillId="
				+ expressBillId + ", oldCompany=" + oldCompany
				+ ", newCompany=" + newCompany + ", status=" + status
				+ ", message=" + message + ", state=" + state + ", createAt="
				+ createAt + ", updateAt=" + updateAt + ", isDisabled="
				+ isDisabled + ", data=" + data + "]";
	}
}