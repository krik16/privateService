package com.rongyi.easy.solr.retrival.result;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityData extends Data implements Serializable {
    public  static final String  HOLDER_TYPE_MALL = "Mall";
    public  static final String  HOLDER_TYPE_SHOP = "Shop";

    private static final long serialVersionUID = -7005312631637437963L;
    private String _id;
    private String title;
    private Date start_time;
    private Date end_time;
    private Date updated_at;
    private ArrayList<String> shop_ids = new ArrayList<String>();
    private ArrayList<String> mall_ids = new ArrayList<String>();
    private String holder_id;
    private String holder_type;

    private String thumbnail; //缩略图
    private List<String> carouselImg = new ArrayList<>(); //轮播图片

    private String vistedNum; //访问次数
    private String userQuota; // 用户限购数量
    private String grouponPrice; // 团购价格
    private String grouponOriginal; // 团购原价
    private String grouponNum; // 团购数量
    private String buyedAmount; // 已购买数量
    private String restAmount; // 剩余数量
    private String useRestriction; // 使用限制
    private String useMode; // 使用方式
    private String grouponStyle; // 使用方式 暂时只有0.以后有了在往后加。没有的就是最普通的优惠
    private String type;//类型


    protected Integer limitPublishCount;  // 每日限量发行张数
    protected Integer limitUseCount;   // 每人每日限用张数
    protected Integer limitCount; // 每人限购数量
    private List<Integer> afterSaleService;//CouponConst.AFTER_SALE_SERVICE;//[1,1,1] 1为支持，0为不支持。第一位：随时退、第二位：过期退 第三位： 免预约
    private Integer payDownTime; //支付剩余时间(单位是秒)

    private String easyOrder;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String> getCarouselImg() {
        return carouselImg;
    }

    public void setCarouselImg(List<String> carouselImg) {
        this.carouselImg = carouselImg;
    }

    public String getVistedNum() {
        return vistedNum;
    }

    public void setVistedNum(String vistedNum) {
        this.vistedNum = vistedNum;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getShop_ids() {
        return shop_ids;
    }

    public void setShop_ids(ArrayList<String> shop_ids) {
        this.shop_ids = shop_ids;
    }

    public ArrayList<String> getMall_ids() {
        return mall_ids;
    }

    public void setMall_ids(ArrayList<String> mall_ids) {
        this.mall_ids = mall_ids;
    }

    public String getUserQuota() {
        return userQuota;
    }

    public void setUserQuota(String userQuota) {
        this.userQuota = userQuota;
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

    public String getGrouponNum() {
        return grouponNum;
    }

    public void setGrouponNum(String grouponNum) {
        this.grouponNum = grouponNum;
    }

    public String getUseMode() {
        return useMode;
    }

    public void setUseMode(String useMode) {
        this.useMode = useMode;
    }

    public String getGrouponStyle() {
        return grouponStyle;
    }

    public void setGrouponStyle(String grouponStyle) {
        this.grouponStyle = grouponStyle;
    }

    public Integer getLimitPublishCount() {
        return limitPublishCount;
    }

    public void setLimitPublishCount(Integer limitPublishCount) {
        this.limitPublishCount = limitPublishCount;
    }

    public Integer getLimitUseCount() {
        return limitUseCount;
    }

    public void setLimitUseCount(Integer limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public List<Integer> getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(List<Integer> afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public Integer getPayDownTime() {
        return payDownTime;
    }

    public void setPayDownTime(Integer payDownTime) {
        this.payDownTime = payDownTime;
    }

    public String getEasyOrder() {
        return easyOrder;
    }

    public void setEasyOrder(String easyOrder) {
        this.easyOrder = easyOrder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("_id", _id)
                .append("title", title)
                .append("start_time", start_time)
                .append("end_time", end_time)
                .append("updated_at", updated_at)
                .append("shop_ids", shop_ids)
                .append("mall_ids", mall_ids)
                .append("holder_id", holder_id)
                .append("holder_type", holder_type)
                .append("thumbnail", thumbnail)
                .append("carouselImg", carouselImg)
                .append("vistedNum", vistedNum)
                .append("userQuota", userQuota)
                .append("grouponPrice", grouponPrice)
                .append("grouponOriginal", grouponOriginal)
                .append("grouponNum", grouponNum)
                .append("buyedAmount", buyedAmount)
                .append("restAmount", restAmount)
                .append("useRestriction", useRestriction)
                .append("useMode", useMode)
                .append("grouponStyle", grouponStyle)
                .append("type", type)
                .append("limitPublishCount", limitPublishCount)
                .append("limitUseCount", limitUseCount)
                .append("limitCount", limitCount)
                .append("afterSaleService", afterSaleService)
                .append("payDownTime", payDownTime)
                .toString();
    }
}
