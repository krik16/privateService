package com.rongyi.easy.roa.vo;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * solr 代金券转换VO
 *
 * @author Breggor
 */
public class CouponVO implements Serializable {

    private static String YUN_ACTIVITY_THUMBNAIL = "http://rongyi.b0.upaiyun.com/system/favour/img/";


    private String id;

    private String title; // 团购名称


    private String terminelTitle;


    private int vistedNum;


    private String activityType; // 类型 0 brand, 1 mall, 2 shop 值为3时用钱


    private String holderId;


    private String holderType;

    private String label;//标签（用#分割）

    private String valid;

    private String status;


    private List<ObjectId> shopIds;


    private List<ObjectId> mallIds;


    private List<ObjectId> zoneIds;

    private List<Double> location;


    private Date publicStart; // 发布时间开始


    private Date publicEnd; // 发布时间结束


    private Date saleStart; // 销售时间开始


    private Date saleEnd; // 销售时间结束


    private Integer saleType; // 销售时间类型


    private Date startTime; // 使用开始时间（有效期开始时间）


    private Date updatedAt;


    private Date createdAt;


    private Date endTime; // 使用结束时间（有效期结束时间）

    private Integer recommend; // 顶置 0 no 1;


    private String userQuota; // 用户限购数量


    private String grouponOriginal; // 原价

    private String thumbnail; // 缩略图


    private String grouponPrice; // 优惠券价格


    private String grouponNum; // 优惠券数量


    private String buyedAmount; // 已购买数量


    private String restAmount; // 剩余数量


    private String useRestriction; // 使用限制


    private String useMode; // 使用方式

    private String position; // 置顶位置


    private String grouponStatus; // 团购状态


    private Integer createdUser; // 创建人


    private Integer updatedUser; // 更新人

    private String description; // 描述


    private Integer buyedNum; // 此商品被多少人购买过

    private String name;// holder_id对应的名称,代金券显示名


    private String grouponType; // 团购类型，3为外部导入码

    private String cooperater; // 合作商ID， 0 属于容易，团购中没有合作商是为0


    private Integer alarmNum; // 库存紧张字段


    private String mallId; // 此优惠券所在商场


    private List<String> brandCateIds;

    private String showChannel; // 展示渠道

    private List<String> carouselImg = new ArrayList<>(); //轮播图片


    private String buyType;// 购买类型 0 普通类型 1：每日限购券


    private Integer buyQuotaNum;// 每日限购券的购买限制数


    private String wechatAdImg; //优惠微信广告图


    private String wechatIcon; //优惠微信图标


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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public void addShopId(ObjectId shopId) {
        if (this.shopIds == null)
            this.shopIds = new ArrayList<>();
        this.shopIds.add(shopId);
    }

    public List<ObjectId> getMallIds() {
        return mallIds;
    }

    public void setMallIds(List<ObjectId> mallIds) {
        this.mallIds = mallIds;
    }

    public void addMallId(ObjectId mallId) {
        if (this.mallIds == null)
            this.mallIds = new ArrayList<>();
        this.mallIds.add(mallId);
    }

    public List<ObjectId> getZoneIds() {
        return zoneIds;
    }

    public void setZoneIds(List<ObjectId> zoneIds) {
        this.zoneIds = zoneIds;
    }

    public void addZoneIds(List<ObjectId> zoneIds) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        this.zoneIds.addAll(zoneIds);
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

    public void addBrandCateIs(String brandCateId) {
        if (this.brandCateIds == null)
            this.brandCateIds = new ArrayList<>();
        this.brandCateIds.add(brandCateId);
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
