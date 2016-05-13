package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 特卖的详情
 * Created by lijing on 2015/11/24 21:03
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class SaleDetailVO implements Serializable {
    private Integer id;
    private String bannerPic;
    private String name;
    private String subTitle;
    private Long startAt;
    private Long endAt;
    private String shareTitle;
    private String shareDesc;
    private String activityUrl;
    private String contentUrl;
    private List<CommodityBuyerVO> commodityList;
    private Integer nextTemplateRoundId;//null没有下一场字段，0没有下一场，其余有下一场
    private Integer nextId;
    private Integer nextContentId;

    public Integer getNextTemplateRoundId() {
        return nextTemplateRoundId;
    }

    public void setNextTemplateRoundId(Integer nextTemplateRoundId) {
        this.nextTemplateRoundId = nextTemplateRoundId;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public Integer getNextContentId() {
        return nextContentId;
    }

    public void setNextContentId(Integer nextContentId) {
        this.nextContentId = nextContentId;
    }


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

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }



    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("bannerPic", bannerPic)
                .append("name", name)
                .append("subTitle", subTitle)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("shareTitle", shareTitle)
                .append("shareDesc", shareDesc)
                .append("activityUrl", activityUrl)
                .append("contentUrl", contentUrl)
                .append("commodityList", commodityList)
                .append("nextActTemplateId",nextTemplateRoundId)
                .append("nextId",nextId)
                .append("nextContentId",nextContentId)
                .toString();
    }
}
