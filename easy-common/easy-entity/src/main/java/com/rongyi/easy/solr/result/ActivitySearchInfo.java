package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ActivitySearchInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5991538172808720465L;

    private String id; //id
    private String name; //name
    private String addr; //地址
    private String pic_url; //品牌logo （优惠券需要么）
    private List<Double> location; //坐标
    private String description; //描述
    private String city_name; //城市名
    private String shop_own; //店铺所属名
    private String title; //标题
    private Date start_time; //开始时间
    private Date end_time; //结束时间
    private String holder_id; //持有者id;
    private String holder_type; //持有者类型 shop/mall/brand
    private String thumbnail; //缩略图
    private List<String> carouselImg; //详情图
    private String vistedNum; //访问量
    @Deprecated
    private String userQuota; //每人限购数（废弃）
    private String grouponPrice; //现价
    private String grouponOriginal; //原价
    private String grouponNum; //优惠券数量
    private String buyedAmount; //购买量
    private String restAmount; //剩余量
    private String useRestriction; //使用限制
    private String useMode; //使用方式
    private String grouponStyle; //这是啥 优惠券类型 0是优惠券，不传就是普通优惠
    private Integer limitPublishCount; //每天限发放数
    private Integer limitUseCount; //每人限用数
    private Integer limitCount; //每人限购数
    private List<Integer> afterSaleService;//售后服务

    private Integer payDownTime; //支付剩余时间(单位是秒)
    private List<String> customCategoryIds; //卡券对应店铺的自定义分类
    private Integer apply_shops_count; // 卡券支持的店铺数量

    private int activityStatus = 0;  //活动状态[0其他(不参与逻辑) 未开始1 正常2 结束3]
    private String workTime = "9:30~18:30（周一至周五）\n法定假日除外";

    private String activityType = "0";  //活动类型[0其他 闪购1、特卖2、秒杀3]

    private List<String> shopIdList = null;

    private Integer publishChannel;//发布渠道(0:大运营；1：商家后台；2:摩店)
    private Integer isRelateAll;//是否关联全部店铺  0：否；1：是
    private String isMall;//商场通用；"mall" "shop"
    private String shopName;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<String> getShopIdList() {
        return shopIdList;
    }

    public void setShopIdList(List<String> shopIdList) {
        this.shopIdList = shopIdList;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    /**
     * 使用限制
     */
    private String limitDesc;

    /**
     * 使用说明
     */
    private String usageDesc;

    /**
     * 备注
     */
    private String remark;

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getShop_own() {
        return shop_own;
    }

    public void setShop_own(String shop_own) {
        this.shop_own = shop_own;
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

    @Deprecated
    public String getUserQuota() {
        return userQuota;
    }

    @Deprecated
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

    /**
     * @return the customCategoryIds
     */
    public List<String> getCustomCategoryIds() {
        return customCategoryIds;
    }

    /**
     * @param customCategoryIds the customCategoryIds to set
     */
    public void setCustomCategoryIds(List<String> customCategoryIds) {
        this.customCategoryIds = customCategoryIds;
    }

    /**
     * @return the apply_shops_count
     */
    public Integer getApply_shops_count() {
        return apply_shops_count;
    }

    /**
     * @param apply_shops_count the apply_shops_count to set
     */
    public void setApply_shops_count(Integer apply_shops_count) {
        this.apply_shops_count = apply_shops_count;
    }

    public int getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(int activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public Integer getIsRelateAll() {
        return isRelateAll;
    }

    public void setIsRelateAll(Integer isRelateAll) {
        this.isRelateAll = isRelateAll;
    }

    public String getIsMall() {
        if (isRelateAll != null && isRelateAll == 0) {
            return "shop";
        } else if (isRelateAll != null && isRelateAll == 1) {
            return "mall";
        }
        return isMall;
    }

    public void setIsMall(String isMall) {
        this.isMall = isMall;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActivitySearchInfo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", addr='").append(addr).append('\'');
        sb.append(", pic_url='").append(pic_url).append('\'');
        sb.append(", location=").append(location);
        sb.append(", description='").append(description).append('\'');
        sb.append(", city_name='").append(city_name).append('\'');
        sb.append(", shop_own='").append(shop_own).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", holder_id='").append(holder_id).append('\'');
        sb.append(", holder_type='").append(holder_type).append('\'');
        sb.append(", thumbnail='").append(thumbnail).append('\'');
        sb.append(", carouselImg=").append(carouselImg);
        sb.append(", vistedNum='").append(vistedNum).append('\'');
        sb.append(", userQuota='").append(userQuota).append('\'');
        sb.append(", grouponPrice='").append(grouponPrice).append('\'');
        sb.append(", grouponOriginal='").append(grouponOriginal).append('\'');
        sb.append(", grouponNum='").append(grouponNum).append('\'');
        sb.append(", buyedAmount='").append(buyedAmount).append('\'');
        sb.append(", restAmount='").append(restAmount).append('\'');
        sb.append(", useRestriction='").append(useRestriction).append('\'');
        sb.append(", useMode='").append(useMode).append('\'');
        sb.append(", grouponStyle='").append(grouponStyle).append('\'');
        sb.append(", limitPublishCount=").append(limitPublishCount);
        sb.append(", limitUseCount=").append(limitUseCount);
        sb.append(", limitCount=").append(limitCount);
        sb.append(", afterSaleService=").append(afterSaleService);
        sb.append(", payDownTime=").append(payDownTime);
        sb.append(", customCategoryIds=").append(customCategoryIds);
        sb.append(", apply_shops_count=").append(apply_shops_count);
        sb.append(", activityStatus=").append(activityStatus);
        sb.append(", workTime='").append(workTime).append('\'');
        sb.append(", activityType='").append(activityType).append('\'');
        sb.append(", shopIdList=").append(shopIdList);
        sb.append(", publishChannel=").append(publishChannel);
        sb.append(", isRelateAll=").append(isRelateAll);
        sb.append(", limitDesc='").append(limitDesc).append('\'');
        sb.append(", usageDesc='").append(usageDesc).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
