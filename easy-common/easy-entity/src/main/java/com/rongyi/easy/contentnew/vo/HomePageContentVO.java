package com.rongyi.easy.contentnew.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.List;

/**
 * 容易逛首页-内容
 * Created by Breggor on 2015/9/10.
 */
public class HomePageContentVO {
    private List<BannerVO> banner;
    private List<QuickEntryVO> quickEntry;
    private List<HotHeadlineVO> hotHeadline;
    private StarShopVO starShop;
    private List<ActivityRecommendVO> activityRecommend;
    private List<CouponRecommendVO> couponRecommend;
    private FloatAdVO floatAd;

    public List<BannerVO> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerVO> banner) {
        this.banner = banner;
    }

    public List<QuickEntryVO> getQuickEntry() {
        return quickEntry;
    }

    public void setQuickEntry(List<QuickEntryVO> quickEntry) {
        this.quickEntry = quickEntry;
    }

    public List<HotHeadlineVO> getHotHeadline() {
        return hotHeadline;
    }

    public void setHotHeadline(List<HotHeadlineVO> hotHeadline) {
        this.hotHeadline = hotHeadline;
    }

    public StarShopVO getStarShop() {
        return starShop;
    }

    public void setStarShop(StarShopVO starShop) {
        this.starShop = starShop;
    }

    public List<ActivityRecommendVO> getActivityRecommend() {
        return activityRecommend;
    }

    public void setActivityRecommend(List<ActivityRecommendVO> activityRecommend) {
        this.activityRecommend = activityRecommend;
    }

    public List<CouponRecommendVO> getCouponRecommend() {
        return couponRecommend;
    }

    public void setCouponRecommend(List<CouponRecommendVO> couponRecommend) {
        this.couponRecommend = couponRecommend;
    }

    public FloatAdVO getFloatAd() {
        return floatAd;
    }

    public void setFloatAd(FloatAdVO floatAd) {
        this.floatAd = floatAd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append("banner", banner)
                .append("quickEntry", quickEntry)
                .append("hotHeadline", hotHeadline)
                .append("starShop", starShop)
                .append("activityRecommend", activityRecommend)
                .append("couponRecommend", couponRecommend)
                .append("floatAd", floatAd)
                .toString();
    }
}
