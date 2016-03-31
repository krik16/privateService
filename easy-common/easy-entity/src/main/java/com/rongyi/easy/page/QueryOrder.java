package com.rongyi.easy.page;

import java.io.Serializable;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:31.
 */
public class QueryOrder implements Serializable {
    private String orderColumn;

    public QueryOrder(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public QueryOrder() {
    }

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }
}
