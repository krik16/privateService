package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.entity.PostageTemplateEntity;
import com.rongyi.easy.mcmc.param.PostageTemplateParam;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostageTemplateVO implements Serializable{
    private Integer id;

    private Double postage;

    private String mallMid;

    private String createAt;

    private Integer createBy;

    private String updateAt;

    private Integer updateBy;

    private Integer status;

    private String mallName;

    public PostageTemplateVO() {
    }

    public PostageTemplateVO(PostageTemplateEntity postage) {
        this.id = postage.getId();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.postage =postage.getPostage()/100.0;
        this.mallMid = postage.getMallMid();
        if(postage.getCreateAt()!=null)
            this.createAt = sdf.format(postage.getCreateAt());
        this.createBy = postage.getCreateBy();
        if(postage.getUpdateAt()!=null)
            this.updateAt = sdf.format(postage.getUpdateAt());
        this.updateBy = postage.getUpdateBy();
        this.status = postage.getStatus();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
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

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }
}