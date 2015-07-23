package com.rongyi.easy.coupon.old_vo;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 优惠券信息
 */
public class OldCoupon extends OldMallShop implements Serializable {
    protected String thumbnail;//缩略图
    protected String vistedNum;//访问次数
    protected String couponPrice;//优惠劵价格
    protected String grouponNum;//优惠劵数量
    protected String buyedAmount;//已购买数量
    protected String restAmount;//剩余数量
    protected String useRestriction;//使用限制
    protected String useMode;//使用方式
    protected String grouponPrice; // 团购价格
    protected String grouponOriginal; // 团购原价
    protected String grouponStyle; // 团购类型
    protected boolean hasCoupon;//有优惠劵
    protected String title;
    protected String description;

    protected String start_time;

    protected String end_time;

    protected String holder_id;

    protected String holder_type;
    protected List<String> carouselImg;

    protected boolean any_activity;

    protected int limitPublishCount;  // 每日限量发行张数
    protected int limitUseCount;   // 每人每日限用张数
    protected int limitCount; // 每人限购数量

    private List<Integer> afterSaleService = Arrays.asList(1, 1, 1);  //[1,1,1] 1为支持，0为不支持。第一位：随时退、第二位：过期退 第三位： 免预约

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getVistedNum() {
        return vistedNum;
    }

    public void setVistedNum(String vistedNum) {
        this.vistedNum = vistedNum;
    }

    public String getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(String couponPrice) {
        this.couponPrice = couponPrice;
    }

    public String getGrouponNum() {
        return grouponNum;
    }

    public void setGrouponNum(String grouponNum) {
        this.grouponNum = grouponNum;
    }

    public String getBuyedAmount() {
        return buyedAmount;
    }

    public void setBuyedAmount(String buyedAmount) {
        this.buyedAmount = buyedAmount;
    }

    public String getRestAmount() {
        return restAmount;
    }

    public void setRestAmount(String restAmount) {
        this.restAmount = restAmount;
    }

    public String getUseRestriction() {
        return useRestriction;
    }

    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }

    public String getUseMode() {
        return useMode;
    }

    public void setUseMode(String useMode) {
        this.useMode = useMode;
    }

    public String getGrouponPrice() {
        return grouponPrice;
    }

    public void setGrouponPrice(String grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    public String getGrouponOriginal() {
        return grouponOriginal;
    }

    public void setGrouponOriginal(String grouponOriginal) {
        this.grouponOriginal = grouponOriginal;
    }

    public String getGrouponStyle() {
        return grouponStyle;
    }

    public void setGrouponStyle(String grouponStyle) {
        this.grouponStyle = grouponStyle;
    }

    public boolean isHasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getHolder_id() {
        return holder_id;
    }

    public void setHolder_id(String holder_id) {
        this.holder_id = holder_id;
    }

    public String getHolder_type() {
        return holder_type;
    }

    public void setHolder_type(String holder_type) {
        this.holder_type = holder_type;
    }

    public List<String> getCarouselImg() {
        return carouselImg;
    }

    public void setCarouselImg(List<String> carouselImg) {
        this.carouselImg = carouselImg;
    }

    public boolean isAny_activity() {
        return any_activity;
    }

    public void setAny_activity(boolean any_activity) {
        this.any_activity = any_activity;
    }

    public List<Integer> getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(List<Integer> afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public int getLimitPublishCount() {
        return limitPublishCount;
    }

    public void setLimitPublishCount(int limitPublishCount) {
        this.limitPublishCount = limitPublishCount;
    }

    public int getLimitUseCount() {
        return limitUseCount;
    }

    public void setLimitUseCount(int limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int limitCount) {
        this.limitCount = limitCount;
    }
}
