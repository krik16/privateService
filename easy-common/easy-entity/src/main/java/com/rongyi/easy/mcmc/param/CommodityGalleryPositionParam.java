package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by xuying on 2016/9/22.
 */
public class CommodityGalleryPositionParam implements Serializable{

    private String commodityId;

    private Integer galleryPosition;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getGalleryPosition() {
        return galleryPosition;
    }

    public void setGalleryPosition(Integer galleryPosition) {
        this.galleryPosition = galleryPosition;
    }
}
