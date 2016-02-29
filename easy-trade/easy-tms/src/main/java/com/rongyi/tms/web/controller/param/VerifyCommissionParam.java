package com.rongyi.tms.web.controller.param;

import java.io.Serializable;

/**
 * Created by hebo on 2016/2/29.
 */
public class VerifyCommissionParam implements Serializable {
    private String ids;
    private Integer status;
    private String desc;
    private Integer operateType;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "VerifyCommissionParam{" +
                "ids='" + ids + '\'' +
                ", status=" + status +
                ", desc='" + desc + '\'' +
                '}';
    }
}
