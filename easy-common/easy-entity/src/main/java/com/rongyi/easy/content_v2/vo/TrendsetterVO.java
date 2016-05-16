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
    private List<TrendActivity> treActivityList = Lists.newArrayList();

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

    public List<TrendActivity> getTreActivityList() {
        return treActivityList;
    }

    public void setTreActivityList(List<TrendActivity> treActivityList) {
        this.treActivityList = treActivityList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("describution", describution)
                .append("title", title)
                .append("picUrl", picUrl)
                .append("trendActivityList", treActivityList)
                .toString();
    }
}
