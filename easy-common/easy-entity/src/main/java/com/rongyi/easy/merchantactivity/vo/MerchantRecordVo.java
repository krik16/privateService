package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 21:18
 * ideaworkspace.
 */
public class MerchantRecordVo implements Serializable {
    private String mallName;

    private Date createAt;

    private String createUser;

    private String record;

    private Integer status;

    public String getMallName() {
        if(status != null){
            if(status == 1){
                return "审核未通过";
            }else if(status == 2){
                return "审核通过";
            }else if(status == 3){
                return "下线";
            }else if(status == 4){
                return "申请撤销";
            }else if(status == 5){
                return "申请撤销通过";
            }else if(status == 6){
                return "申请撤销拒绝";
            }
        }
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("mallName", mallName)
                .append("createAt", createAt)
                .append("createUser", createUser)
                .append("record", record)
                .append("status", status)
                .toString();
    }
}
