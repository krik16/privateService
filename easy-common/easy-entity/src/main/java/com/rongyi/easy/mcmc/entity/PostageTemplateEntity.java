package com.rongyi.easy.mcmc.entity;

import com.rongyi.easy.mcmc.param.PostageTemplateParam;

import java.io.Serializable;
import java.util.Date;

public class PostageTemplateEntity implements Serializable{
    private Integer id;

    private Integer postage;

    private String mallMid;

    private Date createAt;

    private Integer createBy;

    private Date updateAt;

    private Integer updateBy;

    private Integer status;

    public PostageTemplateEntity() {
    }

    public PostageTemplateEntity(PostageTemplateParam param) {
        this.id = param.getId();
        this.postage = Double.valueOf(param.getPostage()*100).intValue();
        this.mallMid = param.getMallMid();
        this.createAt = param.getCreateAt();
        this.createBy = param.getCreateBy();
        this.updateAt = param.getUpdateAt();
        this.updateBy = param.getUpdateBy();
        this.status = param.getStatus();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}