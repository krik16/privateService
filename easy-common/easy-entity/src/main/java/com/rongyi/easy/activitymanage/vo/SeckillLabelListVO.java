package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/19
 * TIME : 14:40
 * ideaworkspace.
 */
public class SeckillLabelListVO implements Serializable {
    /**
     * labelId
     */
    private Integer labelId;
    /**
     * 标签标题
     */

    private String title;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 限时秒杀开始时间
     */
    private Date startAt;
    /**
     * 限时秒杀结束时间
     */
    private Date endAt;
    /**
     * 通用模版 url
     */
    private String moreUrl;
    /**
     * 商品
     */
    private List<SeckillCommodityVO> commoditys=new ArrayList<SeckillCommodityVO>();

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getMoreUrl() {
        return moreUrl;
    }

    public void setMoreUrl(String moreUrl) {
        this.moreUrl = moreUrl;
    }

    public List<SeckillCommodityVO> getCommoditys() {
        return commoditys;
    }

    public void setCommoditys(List<SeckillCommodityVO> commoditys) {
        this.commoditys = commoditys;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("labelId", labelId)
                .append("title", title)
                .append("type", type)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("moreUrl", moreUrl)
                .append("commoditys", commoditys)
                .toString();
    }
}
