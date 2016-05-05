package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;

/**
 * 更新POI标签实体
 *
 * @author wangjh7
 * @date 2016-05-05
 */
public class POITipEntity implements Serializable {

    private String poiId = ""; ///< solr POI ID
    private int tip = 0; ///< solr POI 标签

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public POITipEntity(String poiId, int tip) {
        this.poiId = poiId;
        this.tip = tip;
    }

    public POITipEntity() {
    }

    @Override
    public String toString() {
        return "POITipEntity{" +
                "poiId='" + poiId + '\'' +
                ", tip=" + tip +
                '}';
    }
}
