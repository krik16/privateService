package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.List;

public class ActivitySearchResult implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4494629862633761013L;

    private SearchMeta meta;
    private List<ActivitySearchInfo> result;

    public SearchMeta getMeta() {
        return meta;
    }

    public void setMeta(SearchMeta meta) {
        this.meta = meta;
    }

    public List<ActivitySearchInfo> getResult() {
        return result;
    }

    public void setResult(List<ActivitySearchInfo> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ActivitySearchResult{" +
                "meta=" + meta +
                ", result_count=" + (result == null ? 0 : result.size()) +
                '}';
    }
}
