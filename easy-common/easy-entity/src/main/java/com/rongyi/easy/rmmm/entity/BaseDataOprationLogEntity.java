package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseDataOprationLogEntity implements Serializable{

    private static final long serialVersionUID = -5744289970781493523L;
    /** 主键 */
    private Integer id;
    /**0:商场,1店铺*/
    private Integer type;

    private String logContent;

    private Date createAt;


    private Date updateAt;

    /** 0:未处理,1已处理*/
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BaseDataOprationLogEntity{" +
                "id=" + id +
                ", type=" + type +
                ", logContent='" + logContent + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", state=" + state +
                '}';
    }
}