package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/10/20.
 */
public class SearchGoodsIdInActivity implements Serializable {

    private List<String> goodIds;

    private Integer type;

    public List<String> getGoodIds() {
        return goodIds;
    }

    public void setGoodIds(List<String> goodIds) {
        this.goodIds = goodIds;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
