package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Desc: ad vo
 * User: chris
 * Date: 2015/10/27 1:38
 */
public class AdVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String    id;
    private String    mallId;//商场id
    private String    mallName;//商场名字
    private Integer   holder;//所属  0容易网 1商家
    private Integer   position;//位置
    private Integer   type;//0全屏广告  1banner广告
    private Date      publishStart;
    private Date      publishEnd;
    private List<MaterialVO>  material;
    private Integer   materialDetailType;//详情素材（给banner广告用）0图片|1Url|2无
    private String    materialDetailUrl; //详情Url（给banner广告用）
    private List<MaterialVO> materialDetails;//详情素材关联id 图片（给banner广告用）
    private Integer   valid;//系统状态
    private Integer   verifyStatus;
    private Integer   published;
    private Date      createdAt;
    private Date      updatedAt;
    private Integer adTime;
    private Integer adOrder;
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

    public Integer getHolder() {
        return holder;
    }

    public void setHolder(Integer holder) {
        this.holder = holder;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
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

    public List<MaterialVO> getMaterial() {
        return material;
    }

    public void setMaterial(List<MaterialVO> material) {
        this.material = material;
    }

    public Integer getMaterialDetailType() {
        return materialDetailType;
    }

    public void setMaterialDetailType(Integer materialDetailType) {
        this.materialDetailType = materialDetailType;
    }

    public String getMaterialDetailUrl() {
        return materialDetailUrl;
    }

    public void setMaterialDetailUrl(String materialDetailUrl) {
        this.materialDetailUrl = materialDetailUrl;
    }

    public List<MaterialVO> getMaterialDetails() {
        return materialDetails;
    }

    public void setMaterialDetails(List<MaterialVO> materialDetails) {
        this.materialDetails = materialDetails;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
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

	public Integer getAdTime() {
		return adTime;
	}

	public void setAdTime(Integer adTime) {
		this.adTime = adTime;
	}

	public Integer getAdOrder() {
		return adOrder;
	}

	public void setAdOrder(Integer adOrder) {
		this.adOrder = adOrder;
	}
}
