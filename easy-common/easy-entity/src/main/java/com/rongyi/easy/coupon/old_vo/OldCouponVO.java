package com.rongyi.easy.coupon.old_vo;


import java.io.Serializable;
import java.util.List;

/**
 * 老优惠券VO
 */
public class   OldCouponVO implements Serializable {
    private static final long serialVersionUID = 3;
    private String id;
    @Deprecated
    private String holder_id;//关联商场（店铺）的第一个商场（店铺）Id
    @Deprecated
    private String holder_name;//holder_id对应的名称
    @Deprecated
    private String holder_type;//关联类型

    private String mallName;//商场名
    private String mallId; //商场Id
    private String shopName;//店铺名
    private String shopId;//店铺Id
    private String relatedType;//卡券配置类型

    private String title;//团购名称
    private Integer recommend;//置顶
    private String groupon_price;//团购价格（优惠券当前价格）
    private String groupon_original;//团购原价（优惠前原价）
    private String groupon_num;//团购数量(优惠券总数量)

    private String user_quota;//购买限制
    private String start_time;//有效期开始
    private String end_time;//有效期结束
    private String public_start;//发布开始时间
    private String public_end;//发布结束时间
    private String sale_start;//发售开始时间
    private String sale_end;//发售结束时间
    private String thumbnail;//列标图url

    private List carouselImg;//详情图url集合
    private Integer buyed_amount;//已购买数量
    private String after_sale_service = "任何关于优惠券的使用，退款问题均可致电：400-040-8989";
    private String use_restriction; // 使用限制
    private String description;//描述
    private String use_mode;        // 使用方式
    private int inventoryQuantity;//剩余库存

    @Deprecated
    private List<OldShopVO> apply_shops;
    private List<OldShopVO> shops;//关联店铺列表

    private Integer limitPublishCount;// 每日限量发行张数
    private Integer limitUseCount;// 每人每日限用张数
    private List<Integer> afterSaleService;//= CouponConst.AFTER_SALE_SERVICE; //[1,1,1] 1为支持，0为不支持。第一位：随时退、第二位：过期退 第三位： 免预约

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Deprecated
    public String getHolder_id() {
        return holder_id;
    }

    @Deprecated
    public void setHolder_id(String holder_id) {
        this.holder_id = holder_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getGroupon_price() {
        return groupon_price;
    }

    public void setGroupon_price(String groupon_price) {
        this.groupon_price = groupon_price;
    }

    public String getGroupon_original() {
        return groupon_original;
    }

    public void setGroupon_original(String groupon_original) {
        this.groupon_original = groupon_original;
    }

    public String getGroupon_num() {
        return groupon_num;
    }

    public void setGroupon_num(String groupon_num) {
        this.groupon_num = groupon_num;
    }

    public String getUser_quota() {
        return user_quota;
    }

    public void setUser_quota(String user_quota) {
        this.user_quota = user_quota;
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

    public String getPublic_start() {
        return public_start;
    }

    public void setPublic_start(String public_start) {
        this.public_start = public_start;
    }

    public String getPublic_end() {
        return public_end;
    }

    public void setPublic_end(String public_end) {
        this.public_end = public_end;
    }

    public String getSale_start() {
        return sale_start;
    }

    public void setSale_start(String sale_start) {
        this.sale_start = sale_start;
    }

    public String getSale_end() {
        return sale_end;
    }

    public void setSale_end(String sale_end) {
        this.sale_end = sale_end;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Deprecated
    public String getHolder_type() {
        return holder_type;
    }

    @Deprecated
    public void setHolder_type(String holder_type) {
        this.holder_type = holder_type;
    }

    public List getCarouselImg() {
        return carouselImg;
    }

    public void setCarouselImg(List carouselImg) {
        this.carouselImg = carouselImg;
    }

    @Deprecated
    public List<OldShopVO> getApply_shops() {
        return apply_shops;
    }

    @Deprecated
    public void setApply_shops(List<OldShopVO> apply_shops) {
        this.apply_shops = apply_shops;
    }

    public Integer getBuyed_amount() {
        return buyed_amount;
    }

    public void setBuyed_amount(Integer buyed_amount) {
        this.buyed_amount = buyed_amount;
    }

    public String getAfter_sale_service() {
        return after_sale_service;
    }

    public void setAfter_sale_service(String after_sale_service) {
        this.after_sale_service = after_sale_service;
    }

    public String getUse_restriction() {
        return use_restriction;
    }

    public void setUse_restriction(String use_restriction) {
        this.use_restriction = use_restriction;
    }

    public String getUse_mode() {
        return use_mode;
    }

    public void setUse_mode(String use_mode) {
        this.use_mode = use_mode;
    }

    @Deprecated
    public String getHolder_name() {
        return holder_name;
    }

    @Deprecated
    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
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

    public List<Integer> getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(List<Integer> afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType;
    }

    public List<OldShopVO> getShops() {
        return shops;
    }

    public void setShops(List<OldShopVO> shops) {
        this.shops = shops;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }
}
