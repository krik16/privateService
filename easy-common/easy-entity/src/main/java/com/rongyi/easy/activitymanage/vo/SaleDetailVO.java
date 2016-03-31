package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
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
    private String activityUrl;
    private String contentUrl;
    private List<CommodityBuyerVO> commodityList;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("bannerPic", bannerPic)
                .append("name", name)
                .append("activityUrl", activityUrl)
                .append("contentUrl", contentUrl)
                .append("commodityList", commodityList)
                .toString();
    }
}
