package com.rongyi.easy.malllife.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value = "activities", noClassnameStored = true)
public class ActivityEntity  implements Serializable{
	private static String YUN_ACTIVITY_THUMBNAIL = "http://rongyi.b0.upaiyun.com/system/favour/img/";

    @Id
    private ObjectId id;

    private String title; // 团购名称

    @Property("terminel_title")
    private String terminelTitle;

    @Property("visted_num")
    private int vistedNum;

    @Property("activity_type")
    private String activityType; // 类型 0 brand, 1 mall, 2 shop 值为3时用钱

    @Property("holder_id")
    private String holderId;

    @Property("holder_type")
    private String holderType;

    private String label;//标签（用#分割）

    private String valid;

    private String status;

    @Property("shop_ids")
    private List<ObjectId> shopIds;

    @Property("mall_ids")
    private List<ObjectId> mallIds;

    @Property("zone_ids")
    private List<ObjectId> zoneIds;

    private List<Double> location;

    @Property("public_start")
    private Date publicStart; // 发布时间开始

    @Property("public_end")
    private Date publicEnd; // 发布时间结束

    @Property("sale_start")
    private Date saleStart; // 销售时间开始

    @Property("sale_end")
    private Date saleEnd; // 销售时间结束

    @Property("sale_type")
    private Integer saleType; // 销售时间类型

    @Property("start_time")
    private Date startTime; // 使用开始时间（有效期开始时间）

    @Property("updated_at")
    private Date updatedAt;

    @Property("created_at")
    private Date createdAt;

    @Property("end_time")
    private Date endTime; // 使用结束时间（有效期结束时间）

    private Integer recommend; // 顶置 0 no 1;

    @Property("user_quota")
    private String userQuota; // 用户限购数量

    @Property("groupon_original")
    private String grouponOriginal; // 原价

    private String thumbnail; // 缩略图

    @Property("groupon_price")
    private String grouponPrice; // 优惠券价格

    @Property("groupon_num")
    private String grouponNum; // 优惠券数量

    @Property("buyed_amount")
    private String buyedAmount; // 已购买数量

    @Property("rest_amount")
    private String restAmount; // 剩余数量

    @Property("use_restriction")
    private String useRestriction; // 使用限制

    @Property("use_mode")
    private String useMode; // 使用方式

    private String position; // 置顶位置

    @Property("groupon_status")
    private String grouponStatus; // 团购状态

    @Property("created_user")
    private Integer createdUser; // 创建人

    @Property("updated_user")
    private Integer updatedUser; // 更新人

    private String description; // 描述

    @Property("buyed_num")
    private Integer buyedNum; // 此商品被多少人购买过

    private String name;// holder_id对应的名称

    @Property("groupon_type")
    private String grouponType; // 团购类型，3为外部导入码

    private String cooperater; // 合作商ID， 0 属于容易，团购中没有合作商是为0

    @Property("alarm_num")
    private Integer alarmNum; // 库存紧张字段

    @Property("mall_id")
    private String mallId; // 此优惠券所在商场

    @Property("brand_cate_ids")
    private List<String> brandCateIds;

    private String showChannel; // 展示渠道

    private List<String> carouselImg = new ArrayList<>(); //轮播图片

    @Property("buy_type")
    private String buyType;// 购买类型 0 普通类型 1：每日限购券

    @Property("buy_quota_num")
    private Integer buyQuotaNum;// 每日限购券的购买限制数

    @Property("wechat_ad_Img")
    private String wechatAdImg; //优惠微信广告图

    @Property("wechat_icon")
    private String wechatIcon; //优惠微信图标

    @Property("syn_flag")
    private String synFlag; //新老优惠券同步标识

    public String getSynFlag() {
        return synFlag;
    }

    public void setSynFlag(String synFlag) {
        this.synFlag = synFlag;
    }

    public String getPublicStartStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String publicStartStr = null;
        if (publicStart != null) {
            publicStartStr = format.format(publicStart);
        }
        return publicStartStr;
    }


    public String getPublicEndStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String publicEndStr = null;
        if (publicEnd != null) {
            publicEndStr = format.format(publicEnd);
        }
        return publicEndStr;
    }


    public String getSaleStartStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String saleStartStr = null;
        if (saleStart != null) {
            saleStartStr = format.format(saleStart);
        }
        return saleStartStr;
    }


    public String getSaleEndStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String saleEndStr = null;
        if (saleEnd != null) {
            saleEndStr = format.format(saleEnd);
        }
        return saleEndStr;
    }

    public String getStartTimeStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String startTimeStr = null;
        if (startTime != null) {
            startTimeStr = format.format(startTime);
        }
        return startTimeStr;
    }


    public String getEndTimeStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String endTimeStr = null;
        if (endTime != null) {
            endTimeStr = format.format(endTime);
        }
        return endTimeStr;
    }


    public String getFullThumbnail() {
        if (StringUtils.isNotBlank(thumbnail) && !thumbnail.equals("noImgupLoad")) {
            return YUN_ACTIVITY_THUMBNAIL + id + "/" + thumbnail;
        }
        return null;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTerminelTitle() {
        return terminelTitle;
    }

    public void setTerminelTitle(String terminelTitle) {
        this.terminelTitle = terminelTitle;
    }

    public int getVistedNum() {
        return vistedNum;
    }

    public void setVistedNum(int vistedNum) {
        this.vistedNum = vistedNum;
    }

    public String getActivityType() {
        return (activityType == null) ? "3" : activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ObjectId> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<ObjectId> shopIds) {
        this.shopIds = shopIds;
    }

    public List<ObjectId> getMallIds() {
        return mallIds;
    }

    public void setMallIds(List<ObjectId> mallIds) {
        this.mallIds = mallIds;
    }

    public List<ObjectId> getZoneIds() {
        return zoneIds;
    }

    public void setZoneIds(List<ObjectId> zoneIds) {
        this.zoneIds = zoneIds;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public Date getPublicStart() {
        return publicStart;
    }

    public void setPublicStart(Date publicStart) {
        this.publicStart = publicStart;
    }

    public Date getPublicEnd() {
        return publicEnd;
    }

    public void setPublicEnd(Date publicEnd) {
        this.publicEnd = publicEnd;
    }

    public Date getSaleStart() {
        return saleStart;
    }

    public void setSaleStart(Date saleStart) {
        this.saleStart = saleStart;
    }

    public Date getSaleEnd() {
        return saleEnd;
    }

    public void setSaleEnd(Date saleEnd) {
        this.saleEnd = saleEnd;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getUserQuota() {
        return userQuota;
    }

    public void setUserQuota(String userQuota) {
        this.userQuota = userQuota;
    }

    public String getGrouponOriginal() {
        return grouponOriginal;
    }

    public void setGrouponOriginal(String grouponOriginal) {
        this.grouponOriginal = grouponOriginal;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getGrouponPrice() {
        return grouponPrice;
    }

    public void setGrouponPrice(String grouponPrice) {
        this.grouponPrice = grouponPrice;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGrouponStatus() {
        return grouponStatus;
    }

    public void setGrouponStatus(String grouponStatus) {
        this.grouponStatus = grouponStatus;
    }

    public Integer getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Integer createdUser) {
        this.createdUser = createdUser;
    }

    public Integer getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(Integer updatedUser) {
        this.updatedUser = updatedUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBuyedNum() {
        return buyedNum;
    }

    public void setBuyedNum(Integer buyedNum) {
        this.buyedNum = buyedNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrouponType() {
        return grouponType;
    }

    public void setGrouponType(String grouponType) {
        this.grouponType = grouponType;
    }

    public String getCooperater() {
        return cooperater;
    }

    public void setCooperater(String cooperater) {
        this.cooperater = cooperater;
    }

    public Integer getAlarmNum() {
        return alarmNum;
    }

    public void setAlarmNum(Integer alarmNum) {
        this.alarmNum = alarmNum;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public List<String> getBrandCateIds() {
        return brandCateIds;
    }

    public void setBrandCateIds(List<String> brandCateIds) {
        this.brandCateIds = brandCateIds;
    }

    public String getShowChannel() {
        return showChannel;
    }

    public void setShowChannel(String showChannel) {
        this.showChannel = showChannel;
    }

    public List<String> getCarouselImg() {
        return carouselImg;
    }

    public void setCarouselImg(List<String> carouselImg) {
        this.carouselImg = carouselImg;
    }

    public String getBuyType() {
        return buyType;
    }

    public void setBuyType(String buyType) {
        this.buyType = buyType;
    }

    public Integer getBuyQuotaNum() {
        return buyQuotaNum;
    }

    public void setBuyQuotaNum(Integer buyQuotaNum) {
        this.buyQuotaNum = buyQuotaNum;
    }

    public String getWechatAdImg() {
        return wechatAdImg;
    }

    public void setWechatAdImg(String wechatAdImg) {
        this.wechatAdImg = wechatAdImg;
    }

    public String getWechatIcon() {
        return wechatIcon;
    }

    public void setWechatIcon(String wechatIcon) {
        this.wechatIcon = wechatIcon;
    }
}
