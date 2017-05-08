package com.rongyi.easy.mallshop.customer;


import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

/**
 * Created by 武辉 on 2016/12/15.
 * 售后服务说明参数
 */
public class ServiceDescriptionParam implements Serializable {
    private int  id;               //主键
    private String userId;   //用户id
    private String  jsessionid;//用户信息jsessionid
    private String  remark;        //备注
    private String content;        //说明内容
    private int isDefault;     //是否默认
    private int currentPage  = 1; //当前页
    private int  pageSize ; //分页大小
    private int offset;

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        offset = (this.currentPage -1) * this.pageSize;
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                append(", jsessionid: ").append(jsessionid).
                append("，isDefault: ").append(isDefault);
        return sb.toString();
    }

}
