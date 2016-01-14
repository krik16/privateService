package com.rongyi.easy.roa.vo;

import com.rongyi.easy.roa.entity.AreaEntity;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/12/24 14:01
 * .com.rongyi.easy.roa.vo
 * easy-api
 */
public class AreaCityVO implements Serializable {
    private Integer currentPage =1;

    private Integer pageSize = 10;

    private long totalCount = 0;

    private List<AreaEntity> areaEntityList;


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

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<AreaEntity> getAreaEntityList() {
        return areaEntityList;
    }

    public void setAreaEntityList(List<AreaEntity> areaEntityList) {
        this.areaEntityList = areaEntityList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("totalCount", totalCount)
                .append("areaEntityList", areaEntityList)
                .toString();
    }
}
