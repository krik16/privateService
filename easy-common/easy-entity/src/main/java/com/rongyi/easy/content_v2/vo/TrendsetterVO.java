package com.rongyi.easy.content_v2.vo;

import com.google.inject.internal.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/5/11.
 */
public class TrendsetterVO implements Serializable {

    private String describution;
    private String picUrl;
    private String title;
    private List<TrendActivity> trendActivityList = Lists.newArrayList();

    public String getDescribution() {
        return describution;
    }

    public void setDescribution(String describution) {
        this.describution = describution;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TrendActivity> getTrendActivityList() {
        return trendActivityList;
    }

    public void setTrendActivityList(List<TrendActivity> trendActivityList) {
        this.trendActivityList = trendActivityList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("describution", describution)
                .append("title", title)
                .append("picUrl", picUrl)
                .append("trendActivityList", trendActivityList)
                .toString();
    }
}
