package com.rongyi.easy.content_v2.vo;

import com.google.inject.internal.Lists;
import com.rongyi.easy.malllife.vo.ActivityCommodityVO;
import com.rongyi.easy.malllife.vo.CommoditySaleVO;
import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * create by com.rongyi.easy.content_v2.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/4/8
 * TIME : 18:14
 * ideaworkspace.
 */
public class ActivityContentListVO implements Serializable{
    private Integer id;//特卖id
    private String title;
    private String bannerPic;
    private Integer type;//4商品  19特卖
    private String typeVal;//商品id
    /**活动url*/
    private String activityUrl;//活动url
    private String shareTitle;//分享标题
    private String shareDesc;//分享描述
    private String appTitle;//展示标题
    private String sharePic;//分享图片
    private String replacePic;//banner图片，展示的大图片
    private List<CommoditySaleVO> commoditySaleVOList = Lists.newArrayList();
    
    private ActivityCommodityVO activityCommodityVO;
    
    public ActivityCommodityVO getActivityCommodityVO() {
		return activityCommodityVO;
	}

	public void setActivityCommodityVO(ActivityCommodityVO activityCommodityVO) {
		this.activityCommodityVO = activityCommodityVO;
	}

	public List<CommoditySaleVO> getCommoditySaleVOList() {
		return commoditySaleVOList;
	}

	public void setCommoditySaleVOList(List<CommoditySaleVO> commoditySaleVOList) {
		this.commoditySaleVOList = commoditySaleVOList;
	}

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getReplacePic() {
        return replacePic;
    }

    public void setReplacePic(String replacePic) {
        this.replacePic = replacePic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
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

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

	@Override
	public String toString() {
		return "ActivityContentListVO [id=" + id + ", title=" + title
				+ ", bannerPic=" + bannerPic + ", type=" + type + ", typeVal="
				+ typeVal + ", activityUrl=" + activityUrl + ", shareTitle="
				+ shareTitle + ", shareDesc=" + shareDesc + ", appTitle="
				+ appTitle + ", sharePic=" + sharePic + ", replacePic="
				+ replacePic + ", commoditySaleVOList=" + commoditySaleVOList
				+ ", activityCommodityVO=" + activityCommodityVO + "]";
	}

    
}
