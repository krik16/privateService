package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/1/25.
 */
public class ShopSearchResultAndTotalCount implements Serializable{

   private List<ShopSearchInfo> shopSearchInfoList;

    private Long totalCount;

    public List<ShopSearchInfo> getShopSearchInfoList() {
        return shopSearchInfoList;
    }

    public void setShopSearchInfoList(List<ShopSearchInfo> shopSearchInfoList) {
        this.shopSearchInfoList = shopSearchInfoList;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
