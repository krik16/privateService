package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc: materinal vo
 * User: chris
 * Date: 2015/10/27 15:59
 */
public class MaterialVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String   id;
    private String   name;
    private String   ownerId;
    private String   picType;
    private String   type;
    private String   file;
    private String   fullFile;
    private Integer  valid;
    private Integer  status;
    private String   source;
    private Date     createdAt;
    private Date     updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFullFile() {
        return fullFile;
    }

    public void setFullFile(String fullFile) {
        this.fullFile = fullFile;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
