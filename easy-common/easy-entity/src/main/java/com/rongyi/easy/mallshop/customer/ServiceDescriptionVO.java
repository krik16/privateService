package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by WUH
 * on 2017/1/14.
 * 售后说明返回
 */
public class ServiceDescriptionVO implements Serializable {
    private int  id;               //主键
    private String userId;   //用户id
    private String  remark;        //备注
    private String content;        //说明内容
    private int isDefault;     //是否默认

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "ServiceDescriptionVO{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", remark='" + remark + '\'' +
                ", content='" + content + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
