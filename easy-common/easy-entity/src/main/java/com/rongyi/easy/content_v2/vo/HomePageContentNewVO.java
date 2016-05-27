package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 容易逛首页新的信息
 * Created by lijing on 2015/12/26 15:28
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class HomePageContentNewVO implements Serializable  {
    private static final long serialVersionUID = 1L;
    /**banner*/
    private List<BannerVO> banner;
    /**快捷入口*/
    private List<QuickEntryNewVO> quickEntries;
    /**热点头条*/
    private List<HotHeadlineVO> hotHeadline;
    /**好券推荐*/
    private List<CouponRecommendVO> couponRecommend;
    /**浮标广告*/
    private FloatAdVO floatAd;
    /**每日秒杀*/
    private DailySaleVO dailySale;
    /**爆抢福利*/
    private BenefitVO benefit;
    /**潮人攻略*/
    private TrendsetterVO trendsetter;

    public TrendsetterVO getTrendsetter() {
        return trendsetter;
    }

    public void setTrendsetter(TrendsetterVO trendsetter) {
        this.trendsetter = trendsetter;
    }

    public List<BannerVO> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerVO> banner) {
        this.banner = banner;
    }

    public List<QuickEntryNewVO> getQuickEntries() {
        return quickEntries;
    }

    public void setQuickEntries(List<QuickEntryNewVO> quickEntries) {
        this.quickEntries = quickEntries;
    }

    public List<HotHeadlineVO> getHotHeadline() {
        return hotHeadline;
    }

    public void setHotHeadline(List<HotHeadlineVO> hotHeadline) {
        this.hotHeadline = hotHeadline;
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

    public DailySaleVO getDailySale() {
        return dailySale;
    }

    public void setDailySale(DailySaleVO dailySale) {
        this.dailySale = dailySale;
    }

    public BenefitVO getBenefit() {
        return benefit;
    }

    public void setBenefit(BenefitVO benefit) {
        this.benefit = benefit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("banner", banner)
                .append("quickEntries", quickEntries)
                .append("hotHeadline", hotHeadline)
                .append("couponRecommend", couponRecommend)
                .append("floatAd", floatAd)
                .append("dailySale", dailySale)
                .append("benefit", benefit)
                .append("trendsetterVO", trendsetter)
                .toString();
    }
}
