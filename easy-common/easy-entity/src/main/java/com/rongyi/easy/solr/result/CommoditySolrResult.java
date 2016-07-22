package com.rongyi.easy.solr.result;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/1/25.
 */
public class CommoditySolrResult implements Serializable{

    private List<ObjectId> ids  ;

    private Long totalCount;

    private Integer totalPage ;
    private Integer nextFrom;

    public List<ObjectId> getIds() {
        return ids;
    }

    public void setIds(List<ObjectId> ids) {
        this.ids = ids;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getNextFrom() {
        return nextFrom;
    }

    public void setNextFrom(Integer nextFrom) {
        this.nextFrom = nextFrom;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
