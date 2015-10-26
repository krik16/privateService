package com.rongyi.easy.bdata.vo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc: ad vo
 * User: chris
 * Date: 2015/10/27 1:38
 */
public class AdVO implements Serializable {
    private String   id;
    private String   mallId;
    private String   mallName;
    private int      holder;
    private int      position;
    private int      type;
    private Date     publishStart;
    private Date     publishEnd;
    private ObjectId materialId;
    private String   materialUrl;
    private int      valid;
    private int      verifyStu;
    private int      published;
    private Date     createdAt;
    private Date     updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getPublishStart() {
        return publishStart;
    }

    public void setPublishStart(Date publishStart) {
        this.publishStart = publishStart;
    }

    public Date getPublishEnd() {
        return publishEnd;
    }

    public void setPublishEnd(Date publishEnd) {
        this.publishEnd = publishEnd;
    }

    public ObjectId getMaterialId() {
        return materialId;
    }

    public void setMaterialId(ObjectId materialId) {
        this.materialId = materialId;
    }

    public String getMaterialUrl() {
        return materialUrl;
    }

    public void setMaterialUrl(String materialUrl) {
        this.materialUrl = materialUrl;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public int getVerifyStu() {
        return verifyStu;
    }

    public void setVerifyStu(int verifyStu) {
        this.verifyStu = verifyStu;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
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
