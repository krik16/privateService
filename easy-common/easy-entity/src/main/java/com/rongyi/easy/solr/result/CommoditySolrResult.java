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
}
