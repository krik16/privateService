package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/11/24 21:05
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class IflashDetailVO implements Serializable {
    private Integer id;
    private String bannerPic;
    private String name;
    private List<CommodityBuyerVO> commodityList;
    private String subtitle;
    private Long startAt;
    private Long nowAt;
    private Long endAt;
    private String activityUrl;
    private String contentUrl;

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CommodityBuyerVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<CommodityBuyerVO> commodityList) {
        this.commodityList = commodityList;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public Long getNowAt() {
        return nowAt;
    }

    public void setNowAt(Long nowAt) {
        this.nowAt = nowAt;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("bannerPic", bannerPic)
                .append("name", name)
                .append("commodityList", commodityList)
                .append("subtitle", subtitle)
                .append("startAt", startAt)
                .append("nowAt", nowAt)
                .append("endAt", endAt)
                .append("activityUrl", activityUrl)
                .append("contentUrl", contentUrl)
                .toString();
    }
}
