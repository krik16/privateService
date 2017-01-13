package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by 武辉 on 2016/12/15.
 * 售后服务说明参数
 */
public class ServiceDescriptionParam implements Serializable {
    private int  id;               //主键
    private String userId;            //买手或导购id
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

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        StringBuilder  sb = new StringBuilder("");
        sb.append("{id: ").append(id).
                append(", userId: ").append(userId).
                append(", remark: ").append(remark).
                append(", content: ").append(content).
                append("，isDefault: ").append(isDefault);
        return sb.toString();
    }

}
