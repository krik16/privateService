package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/11/2013:53
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class MallVO implements Serializable {
    private String mallId;
    private String mallName;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("mallId", mallId)
                .append("mallName", mallName)
                .toString();
    }
}
