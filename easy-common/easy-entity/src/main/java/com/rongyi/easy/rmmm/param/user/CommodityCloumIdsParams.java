package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2017/3/31.
 */
public class CommodityCloumIdsParams implements Serializable{

    private List<String>  cloumIds;

    public List<String> getCloumIds() {
        return cloumIds;
    }

    public void setCloumIds(List<String> cloumIds) {
        this.cloumIds = cloumIds;
    }
}
