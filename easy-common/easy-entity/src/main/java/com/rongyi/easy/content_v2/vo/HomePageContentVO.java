package com.rongyi.easy.content_v2.vo;

import com.rongyi.easy.mcmc.vo.LiveVO;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 容易逛首页-内容
 * Created by Breggor on 2015/9/10.
 */
public class HomePageContentVO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private List<BannerVO> banner;
    private QuickEntryVO quickEntry;
    private List<QuickEntryNewVO> quickEntries;
    private List<HotHeadlineVO> hotHeadline;
    private StarShopVO starShop;
    private List<StarShopVO> starShopVOList;
    private List<ActivityRecommendVO> activityRecommend;
    private List<CouponRecommendVO> couponRecommend;
    private FloatAdVO floatAd;
    private List<AppBuyerLiveVO> buyerLives;
    private RaidersHomeVo raidersHomeVo;

    public RaidersHomeVo getRaidersHomeVo() {
        return raidersHomeVo;
    }

    public void setRaidersHomeVo(RaidersHomeVo raidersHomeVo) {
        this.raidersHomeVo = raidersHomeVo;
    }

    public List<BannerVO> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerVO> banner) {
        this.banner = banner;
    }

    public QuickEntryVO getQuickEntry() {
        return quickEntry;
    }

    public void setQuickEntry(QuickEntryVO quickEntry) {
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


    public List<AppBuyerLiveVO> getBuyerLives() {
        return buyerLives;
    }

    public void setBuyerLives(List<AppBuyerLiveVO> buyerLives) {
        this.buyerLives = buyerLives;
    }

    public List<QuickEntryNewVO> getQuickEntries() {
        return quickEntries;
    }

    public void setQuickEntries(List<QuickEntryNewVO> quickEntries) {
        this.quickEntries = quickEntries;
    }

    public List<StarShopVO> getStarShopVOList() {
        return starShopVOList;
    }

    public void setStarShopVOList(List<StarShopVO> starShopVOList) {
        this.starShopVOList = starShopVOList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("banner", banner)
                .append("quickEntry", quickEntry)
                .append("quickEntries", quickEntries)
                .append("hotHeadline", hotHeadline)
                .append("starShop", starShop)
                .append("starShopVOList", starShopVOList)
                .append("activityRecommend", activityRecommend)
                .append("couponRecommend", couponRecommend)
                .append("floatAd", floatAd)
                .append("buyerLives", buyerLives)
                .append("RaidersHomeVo",raidersHomeVo)
                .toString();
    }
}
