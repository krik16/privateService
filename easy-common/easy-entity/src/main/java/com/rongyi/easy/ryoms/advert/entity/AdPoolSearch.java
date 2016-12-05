package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by caohongjiang on 2016/11/11.
 */
public class AdPoolSearch implements Serializable {
    private static final long serialVersionUID = -6362248136398024024L;

    private Integer configId;
    private List<String> cityId;
    private  List<String> businessDistrictId;
    private Date begin;
    private Date end;
    private String mallLevel;
    private Integer isAllowPaly;
    private Integer isAllowDilivery;
    private String key;
    private Integer currentPage;

    private Integer pageSize;
    private Integer offset;

    public Integer getOffset() {
        return (currentPage-1)*pageSize;
    }



    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    @Override
    public String toString() {
        return "AdPoolSearch{" +
                "configId=" + configId +
                ", cityId='" + cityId + '\'' +
                ", businessDistrictId='" + businessDistrictId + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", mallLevel=" + mallLevel +
                ", isAllowPaly=" + isAllowPaly +
                ", isAllowDilivery=" + isAllowDilivery +
                ", key='" + key + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", offset=" + offset +
                '}';
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getCityId() {
        return cityId;
    }

    public void setCityId(List<String> cityId) {
        this.cityId = cityId;
    }

    public List<String> getBusinessDistrictId() {
        return businessDistrictId;
    }

    public void setBusinessDistrictId(List<String> businessDistrictId) {
        this.businessDistrictId = businessDistrictId;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getMallLevel() {
        return mallLevel;
    }

    public void setMallLevel(String mallLevel) {
        this.mallLevel = mallLevel;
    }

    public Integer getIsAllowPaly() {
        return isAllowPaly;
    }

    public void setIsAllowPaly(Integer isAllowPaly) {
        this.isAllowPaly = isAllowPaly;
    }

    public Integer getIsAllowDilivery() {
        return isAllowDilivery;
    }

    public void setIsAllowDilivery(Integer isAllowDilivery) {
        this.isAllowDilivery = isAllowDilivery;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
