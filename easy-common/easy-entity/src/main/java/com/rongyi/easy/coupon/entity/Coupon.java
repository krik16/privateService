package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.time.DateUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Version;

/**
 * 卡券信息
 * 类型：代金券、红包、抵扣券
 *
 * @author Breggor
 */
@Entity(value = "coupon", noClassnameStored = true)
public class Coupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;// 券id

    private String title;// 券名称

    @Property("coupon_type")
    private String couponType;// 券类型: 抵扣券[01] 代金券[02] 红包[03]

    @Property("total_count")
    private Integer totalCount;// 总量

    @Property("limit_count")
    private Integer limitCount;// 每人限购数量

    @Property("receive_count")
    private Integer receiveCount = Integer.valueOf(0);// 已领取数

    private Double discount;// 折扣价

    private String recommend;// 推荐说明

    @Property("validate_type")
    private String validateType;// 验证方式 0：容易后验证 1:互动屏票据 2:两者兼容

    @Property("original_price")
    private Double originalPrice;// 原价

    @Property("current_price")
    private Double currentPrice;// 现价

    /**
     * 关联类型
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3]
     * 红包 ：全场[0],商品[1]
     */
    private String type;

    @Property("check_description")
    private String checkDescription;// 审核未通过信息描述

    @Property("list_pic_url")
    private String listPicUrl;// 列表图url

    @Property("detail_pic_urls")
    private List<String> detailPicUrls;// 详情图url

    @Property("source_target")
    private String sourceTarget;// 信息渠道 0：大运营管理平台 1：百货管理平台 2:摩店管理平台 3：摩店App

    @Property("syn_target")
    private String synTarget;// 信息同步终端包含“互动屏:0、微信:1、摩生活:2”。（考虑）

    @Property("syn_status")
    private String synStatus;// 同步状态 0： 待同步 1：已同步 审核已通过将状态置为 1 反之置为0

    @Property("operate_type")
    private String operateType;// 新增 [0] 修改[1] 删除[2] 用来百货今日重点显示用 信息渠道为1：百货管理平台

    @Embedded("malls")
    private List<CouponMall> malls = new ArrayList<CouponMall>();// 关联商场集合

    @Embedded("shops")
    private List<CouponShop> shops = new ArrayList<CouponShop>();// 关联店铺集合

    private String status; // 状态(审核中[0]、已上线[1]、已使用[2]、已过期[3]、已下线[4]), 规则：比如100张优惠券有一张被领用将状态置为2，被领用后就不能对优惠券进行操作了


    @Property("check_status")
    private String checkStatus;// 审核状态 0：待审核 1：未通过 2：已通过

    @Property("activity_status")
    private String activityStatus;// 是否关联活动 未关联 [0] 关联翻牌购[1] 关联推送[2]

    @Property("del_status")
    private String delStatus;// 是否删除 'Y' 删除 'N' 未删除

    @Property("publish_begin_date")
    private Date publishBeginDate;// 发布开始时间

    @Property("publish_end_date")
    private Date publishEndDate;// 发布结束时间

    @Property("valid_begin_date")
    private Date validBeginDate;// 有效期开始时间

    @Property("valid_end_date")
    private Date validEndDate;// 有效期结束时间

    @Property("create_user")
    private String createUser;// 创建人id

    @Property("create_date")
    private Date createDate;// 创建时间

    @Property("update_user")
    private String updateUser;// 修改人id

    @Property("update_date")
    private Date updateDate;// 修改时间

    @Property("use_restriction")
    private String useRestriction;// 使用限制

    @Property("use_description")
    private String useDescription;// 使用说明 对应老优惠券使用方式

    @Property("source_mall_id")
    private String sourceMallId;// 百货平台当前管理员所在的商场id

    @Embedded("products")
    private List<CouponProduct> products = new ArrayList<CouponProduct>(); // 现金劵关联商品

    @Property("visited_count")
    private Integer visitedCount = Integer.valueOf(0);//卡券详情浏览数

    @Property("sort_index")
    private Integer sortIndex = Integer.valueOf(0);//优惠券排序字段，目前作用是置顶

    @Version
    private Long version; // 乐观锁

    /******新增字段 start******/

    /**
     * 分类 ： 一级分类，二级分类
     */
    @Embedded("categories")
    private CouponCategories categories = new CouponCategories();

    /**
     * 大运营平台，平台代金券
     * 展示区域：常规区域,活动区域
     * 未选中：[0]，选中：[1] "1,1"表示都选中
     */
    @Property("display_region")
    private String displayRegion;

    /**
     * 大运营平台，平台代金券
     * 售后:随时退,过期退,免预约
     * 未选中：[0]，选中：[1] "1,1,1"表示都选中
     */
    @Property("after_sale_service")
    private String afterSaleService;

    /**
     * 大运营平台，平台代金券
     * 备注
     */
    private String remark;

    /**
     * 大运营平台，平台代金券
     * 关联品牌集合
     */
    @Embedded("brands")
    private List<CouponBrand> brands = new ArrayList<>();

    /**
     * 大运营品台，平台代金券
     * 每日限量发行张数
     */
    @Property("limit_publish_count")
    private Integer limitPublishCount;

    /**
     * 大运营品台，平台代金券
     * 每人每日限用张数
     */
    @Property("limit_use_count")
    private Integer limitUseCount;

    /**
     * 是否是第三方导入
     * [Y]是 [N]不是
     */
    @Property("out_status")
    private String outStatus;

    @Property("check_fail_reason")
    private List<String> checkFailReason;
    //推广渠道待定
    //导入渠道待定

    /**
     * 商家管理平台
     * 商场集团、品牌、商场、店铺id
     */
    @Property("source_id")
    private String sourceId;

	/**
	 * 商家管理平台
	 * 商场集团[0]、品牌[1]、商场[2]、店铺[3]
	 */
    @Property("source_type")
	private Integer sourceType;
    /******新增字段 end******/

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

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Integer getTotalCount() {
        return (totalCount == null) ? Integer.valueOf(0) : totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
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

	public Integer getReceiveCount() {
        return (receiveCount == null) ? Integer.valueOf(0) : receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Double getDiscount() {
        return (discount == null) ? Double.valueOf(0.00D) : discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getValidateType() {
        return validateType;
    }

    public void setValidateType(String validateType) {
        this.validateType = validateType;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckDescription() {
        return checkDescription;
    }

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public List<String> getDetailPicUrls() {
        return detailPicUrls;
    }

    public void setDetailPicUrls(List<String> detailPicUrls) {
        this.detailPicUrls = detailPicUrls;
    }

    public String getSourceTarget() {
        return sourceTarget;
    }

    public void setSourceTarget(String sourceTarget) {
        this.sourceTarget = sourceTarget;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public String getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(String synStatus) {
        this.synStatus = synStatus;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public List<CouponMall> getMalls() {
        return malls;
    }

    public void setMalls(List<CouponMall> malls) {
        this.malls = malls;
    }

    public List<CouponShop> getShops() {
        return shops;
    }

    public void setShops(List<CouponShop> shops) {
        this.shops = shops;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }

    public Date getPublishBeginDate() {
        return publishBeginDate;
    }

    public void setPublishBeginDate(Date publishBeginDate) {
        if (publishBeginDate != null) {
            publishBeginDate = DateUtils.setHours(publishBeginDate, 0);
            publishBeginDate = DateUtils.setMinutes(publishBeginDate, 0);
            publishBeginDate = DateUtils.setSeconds(publishBeginDate, 0);
        }
        this.publishBeginDate = publishBeginDate;
    }

    public Date getPublishEndDate() {
        return publishEndDate;
    }

    public void setPublishEndDate(Date publishEndDate) {
        if (publishEndDate != null) {
            publishEndDate = DateUtils.setHours(publishEndDate, 23);
            publishEndDate = DateUtils.setMinutes(publishEndDate, 59);
            publishEndDate = DateUtils.setSeconds(publishEndDate, 59);
        }
        this.publishEndDate = publishEndDate;
    }

    public Date getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(Date validBeginDate) {
        if (validBeginDate != null) {
            validBeginDate = DateUtils.setHours(validBeginDate, 0);
            validBeginDate = DateUtils.setMinutes(validBeginDate, 0);
            validBeginDate = DateUtils.setSeconds(validBeginDate, 0);
        }
        this.validBeginDate = validBeginDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        if (validEndDate != null) {
            validEndDate = DateUtils.setHours(validEndDate, 23);
            validEndDate = DateUtils.setMinutes(validEndDate, 59);
            validEndDate = DateUtils.setSeconds(validEndDate, 59);
        }
        this.validEndDate = validEndDate;
    }

    public String getCreateUser() {
        return StringUtils.isBlank(createUser) ? "" : createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUseRestriction() {
        return useRestriction;
    }

    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getSourceMallId() {
        return sourceMallId;
    }

    public void setSourceMallId(String sourceMallId) {
        this.sourceMallId = sourceMallId;
    }

    public List<CouponProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CouponProduct> products) {
        this.products = products;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getVisitedCount() {
        return visitedCount;
    }

    public void setVisitedCount(Integer visitedCount) {
        this.visitedCount = visitedCount;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    /**
     * 剩余库存量
     *
     * @return
     */
    public int getRestAmount() {
        int amount = this.getTotalCount() - this.getReceiveCount();
        return (amount < 0) ? 0 : amount;
    }

    /**
     * 优惠券缩略图
     *
     * @return
     */
    public String getThumbnail() {
        String pic = "";
        if (this.detailPicUrls != null && !this.detailPicUrls.isEmpty())
            pic = this.detailPicUrls.get(0);
        return pic;
    }


    public String getDisplayRegion() {
		return displayRegion;
	}

	public void setDisplayRegion(String displayRegion) {
		this.displayRegion = displayRegion;
	}

	public String getAfterSaleService() {
		return afterSaleService;
	}

	public void setAfterSaleService(String afterSaleService) {
		this.afterSaleService = afterSaleService;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<CouponBrand> getBrands() {
		return brands;
	}

	public void setBrands(List<CouponBrand> brands) {
		this.brands = brands;
	}

	public String getOutStatus() {
		return outStatus;
	}

	public void setOutStatus(String outStatus) {
		this.outStatus = outStatus;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	public CouponCategories getCategories() {
		return categories;
	}

	public void setCategories(CouponCategories categories) {
		this.categories = categories;
	}

	public List<String> getCheckFailReason() {
		return checkFailReason;
	}

	public void setCheckFailReason(List<String> checkFailReason) {
		this.checkFailReason = checkFailReason;
	}


	public static class CouponProduct implements Serializable {

        private static final long serialVersionUID = 1L;

        @Property("product_id")
        private String productId;

        @Property("market_name")
        private String marketName;

        @Property("shop_name")
        private String shopName;

        @Property("product_num")
        private String productNum;

        @Property("product_name")
        private String productName;

        private List<String> pics;// 商品图片

        private String status;

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getMarketName() {
            return marketName;
        }

        public void setMarketName(String marketName) {
            this.marketName = marketName;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getProductNum() {
            return productNum;
        }

        public void setProductNum(String productNum) {
            this.productNum = productNum;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<String> getPics() {
            return pics;
        }

        public void setPics(List<String> pics) {
            this.pics = pics;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("productId", productId).append("marketName", marketName)
                    .append("shopName", shopName).append("productNum", productNum).append("productName", productName)
                    .append("pics", pics).append("status", status).toString();
        }

    }

    public static class CouponMall implements Serializable {

        private static final long serialVersionUID = 1L;
        private String id;

        @Property("mall_name")
        private String mallName;

        @Property("mall_address")
        private String mallAddress;

        @Property("mall_logo_url")
        private String mallLogoUrl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMallName() {
            return mallName;
        }

        public void setMallName(String mallName) {
            this.mallName = mallName;
        }

        public String getMallAddress() {
            return mallAddress;
        }

        public void setMallAddress(String mallAddress) {
            this.mallAddress = mallAddress;
        }

        public String getMallLogoUrl() {
            return mallLogoUrl;
        }

        public void setMallLogoUrl(String mallLogoUrl) {
            this.mallLogoUrl = mallLogoUrl;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("id", id).append("mallName", mallName)
                    .append("mallAddress", mallAddress).append("mallLogoUrl", mallLogoUrl).toString();
        }

    }

    public static class CouponShop implements Serializable {

        private static final long serialVersionUID = 1L;
        private String id;

        @Property("shop_name")
        private String shopName;

        @Property("mall_name")
        private String mallName;

        @Property("shop_logo_url")
        private String shopLogoUrl;

        @Property("brand_name")
        private String brandName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getMallName() {
            return mallName;
        }

        public void setMallName(String mallName) {
            this.mallName = mallName;
        }

        public String getShopLogoUrl() {
            return shopLogoUrl;
        }

        public void setShopLogoUrl(String shopLogoUrl) {
            this.shopLogoUrl = shopLogoUrl;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("id", id).append("shopName", shopName).append("mallName", mallName)
                    .append("shopLogoUrl", shopLogoUrl).append("brandName", brandName).toString();
        }

    }

    public static class CouponBrand implements Serializable {

        private static final long serialVersionUID = 1L;
        private String id;

        private String cname;

        private String ename;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}
    }

    public static class CouponCategories implements Serializable {

    	private static final long serialVersionUID = 1L;

    	@Property("first_id")
    	private String firstId;

    	@Property("first_name")
    	private String firstName;

    	@Property("second_id")
    	private String secondId;

    	@Property("second_name")
    	private String secondName;

    }


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coupon [id=").append(id).append(", title=")
				.append(title).append(", couponType=").append(couponType)
				.append(", totalCount=").append(totalCount)
				.append(", limitCount=").append(limitCount)
				.append(", limitPublishCount=").append(limitPublishCount)
				.append(", limitUseCount=").append(limitUseCount)
				.append(", receiveCount=").append(receiveCount)
				.append(", discount=").append(discount).append(", recommend=")
				.append(recommend).append(", validateType=")
				.append(validateType).append(", originalPrice=")
				.append(originalPrice).append(", currentPrice=")
				.append(currentPrice).append(", type=").append(type)
				.append(", checkDescription=").append(checkDescription)
				.append(", listPicUrl=").append(listPicUrl)
				.append(", detailPicUrls=").append(detailPicUrls)
				.append(", sourceTarget=").append(sourceTarget)
				.append(", synTarget=").append(synTarget)
				.append(", synStatus=").append(synStatus)
				.append(", operateType=").append(operateType)
				.append(", malls=").append(malls).append(", shops=")
				.append(shops).append(", status=").append(status)
				.append(", checkStatus=").append(checkStatus)
				.append(", activityStatus=").append(activityStatus)
				.append(", delStatus=").append(delStatus)
				.append(", publishBeginDate=").append(publishBeginDate)
				.append(", publishEndDate=").append(publishEndDate)
				.append(", validBeginDate=").append(validBeginDate)
				.append(", validEndDate=").append(validEndDate)
				.append(", createUser=").append(createUser)
				.append(", createDate=").append(createDate)
				.append(", updateUser=").append(updateUser)
				.append(", updateDate=").append(updateDate)
				.append(", useRestriction=").append(useRestriction)
				.append(", useDescription=").append(useDescription)
				.append(", sourceMallId=").append(sourceMallId)
				.append(", products=").append(products)
				.append(", visitedCount=").append(visitedCount)
				.append(", sortIndex=").append(sortIndex).append(", version=")
				.append(version).append("]");
		return builder.toString();
	}

}
