package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/9/20.
 */
public class EntryLimitMallShopDTO implements Serializable {
    private Integer type;//1 表示分类 2表示店铺,0全部店铺

    private List<RelevanDTO> relevances;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<RelevanDTO> getRelevances() {
        return relevances;
    }

    public void setRelevances(List<RelevanDTO> relevances) {
        this.relevances = relevances;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("relevances", relevances)
                .toString();
    }
}