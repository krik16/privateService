package com.rongyi.easy.activitymanage.entity;

import com.google.inject.internal.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 活动商品
 */
public class ActivityGoods implements Serializable {
    /**
     * PK
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 商品id
     */
    private String goodsId;

    private String goodsCode;

    /**
     * 类型 0代表红包，1代表代金券，2代表抵扣券 3代表商品  4代表活动券
     */
    private Integer type;

    /**
     * 商品/卡券名称
     */
    private String name;

    /**
     * 商品/卡券图片url
     */
    private String picUrl;

    /**
     * 单商品补贴方式 金额元[0] 百分比[1]
     */
    private Integer subsidyType;

    /**
     * subsidy_type = 0单商品补贴金额（分），subsidy_type=1时单品补贴百分比的数字，例如单品补贴10%，存入10
     */
    private Integer subsidyPrice;

    /**
     * 参与开始时间
     */
    private Date joinStartAt;

    /**
     * 参与结束时间
     */
    private Date joinEndAt;

    /**
     * 商品审核状态：0未审核1未通过、退回2通过3撤销报名4强制撤销
     */
    private Integer status;

    /**
     * 发布商品的机构类型, 大运营[0] 店铺[1] 商场[2] 品牌[3]
     */
    private Integer identity;

    /**
     * 发布商品的机构类型id
     */
    private String identityId;

    private String identityName;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改时间
     */
    private Date updateAt;

    /**
     * 是否删除: 默认否[0], 是[1]
     */
    private Boolean isDeleted;

    /**
     * 版本号
     */
    private Integer version;
    /**
     * 0:取消撤销状态  1:表示申请撤销中状态
     */
    private Integer applyStatus;
    /**
     * 描述
     */
    private String desc;
    private Integer groupNum;//成团人数
    private Integer openGroupLimit;//开团次数限制
    private Integer joinGroupLimit;//参团次数限制
    private Integer sortNum;//排序index
    private String remainStock;
    private String activityPrice;
    //开团起始人数（随机数）
    private Integer groupRandomNum;
    private String enrollSource;//0大运营后台 1摩店

    private ActivityGoodsRule activityGoodsRule;

    private Integer groupMaxNum;//最大成团人数
    private String subTitle;//副标题
    private Integer supModPrice;//是否支持按成团人数调价
    private String expectTotalAmount;//期望的金额

    /**
     * 商品图片合集(用户摩店报名详情)
     */
    private List<String> pics = Lists.newArrayList();

    /**
     * 商品价格(用户摩店报名详情)
     */
    private String currentPrice;
    /**
     * 商品价格(用户摩店报名详情)
     */
    private String commodityNo;

    /**
     * 退回原因
     */
    private String rejectReason;

    /**
     * 商品规格
     */
    private List<ActivityGoodsSpec>  activityGoodsSpecs  = Lists.newArrayList();

    /**
     * 商品分类
     */
    private List<ActivityGoodsCategory> activityGoodsCategories;

    /**
     * 场次信息
     */
    private   List<GoodShowStyleInRY>   goodShowStyleInRYArrayList = Lists.newArrayList();

    /**
     * 商品/卡券活动库存
     */
    private Integer stockCount;

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * 获取商品分类的层级信息
     * @return 餐饮 > 西餐 > 牛排
     */
    public String getCategoryString() {
        String categoryStr = "";
        if (CollectionUtils.isNotEmpty(activityGoodsCategories)) {
            List<String> categoryList = new ArrayList<>();
            for (ActivityGoodsCategory goodsCategory : activityGoodsCategories) {
                categoryList.add(goodsCategory.getCategoryName());
            }
            categoryStr = StringUtils.join(categoryList, " > ");
        }
        return categoryStr;
    }




    public Integer getGroupMaxNum() {
        return groupMaxNum;
    }

    public void setGroupMaxNum(Integer groupMaxNum) {
        this.groupMaxNum = groupMaxNum;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getSupModPrice() {
        return supModPrice;
    }

    public void setSupModPrice(Integer supModPrice) {
        this.supModPrice = supModPrice;
    }

    public String getExpectTotalAmount() {
        return expectTotalAmount;
    }

    public void setExpectTotalAmount(String expectTotalAmount) {
        this.expectTotalAmount = expectTotalAmount;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
    }

    public ActivityGoodsRule getActivityGoodsRule() {
        return activityGoodsRule;
    }

    public void setActivityGoodsRule(ActivityGoodsRule activityGoodsRule) {
        this.activityGoodsRule = activityGoodsRule;
    }

    public List<GoodShowStyleInRY> getGoodShowStyleInRYArrayList() {
        return goodShowStyleInRYArrayList;
    }

    public void setGoodShowStyleInRYArrayList(List<GoodShowStyleInRY> goodShowStyleInRYArrayList) {
        this.goodShowStyleInRYArrayList = goodShowStyleInRYArrayList;
    }

    public String getEnrollSource() {
        return enrollSource;
    }

    public void setEnrollSource(String enrollSource) {
        this.enrollSource = enrollSource;
    }

    public Integer getGroupRandomNum() {
        return groupRandomNum;
    }

    public void setGroupRandomNum(Integer groupRandomNum) {
        this.groupRandomNum = groupRandomNum;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getRemainStock() {
        return remainStock;
    }

    public void setRemainStock(String remainStock) {
        this.remainStock = remainStock;
    }

    public ActivityGoods(int type){
		this.type=type;
	}

    public ActivityGoods() {
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    public ActivityGoods(String goodsId){
		this.goodsId=goodsId;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getSubsidyType() {
        return subsidyType;
    }

    public void setSubsidyType(Integer subsidyType) {
        this.subsidyType = subsidyType;
    }

    public Integer getSubsidyPrice() {
        return subsidyPrice;
    }

    public void setSubsidyPrice(Integer subsidyPrice) {
        this.subsidyPrice = subsidyPrice;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<ActivityGoodsSpec> getActivityGoodsSpecs() {
        return activityGoodsSpecs;
    }

    public void setActivityGoodsSpecs(List<ActivityGoodsSpec> activityGoodsSpecs) {
        this.activityGoodsSpecs = activityGoodsSpecs;
    }

    public List<ActivityGoodsCategory> getActivityGoodsCategories() {
        return activityGoodsCategories;
    }

    public void setActivityGoodsCategories(List<ActivityGoodsCategory> activityGoodsCategories) {
        this.activityGoodsCategories = activityGoodsCategories;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public Integer getOpenGroupLimit() {
        return openGroupLimit;
    }

    public void setOpenGroupLimit(Integer openGroupLimit) {
        this.openGroupLimit = openGroupLimit;
    }

    public Integer getJoinGroupLimit() {
        return joinGroupLimit;
    }

    public void setJoinGroupLimit(Integer joinGroupLimit) {
        this.joinGroupLimit = joinGroupLimit;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("goodsCode", goodsCode)
                .append("type", type)
                .append("name", name)
                .append("picUrl", picUrl)
                .append("pics", pics)
                .append("currentPrice", currentPrice)
                .append("commodityNo", commodityNo)
                .append("subsidyType", subsidyType)
                .append("subsidyPrice", subsidyPrice)
                .append("joinStartAt", joinStartAt)
                .append("identityName", identityName)
                .append("joinEndAt", joinEndAt)
                .append("status", status)
                .append("identity", identity)
                .append("identityId", identityId)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .append("version", version)
                .append("applyStatus", applyStatus)
                .append("activityGoodsSpecs", activityGoodsSpecs)
                .append("activityGoodsCategories", activityGoodsCategories)
                .append("goodShowStyleInRYArrayList", goodShowStyleInRYArrayList)
                .append("enrollSource", enrollSource)
                .append("activityGoodsRule", activityGoodsRule)
                .append("rejectReason", rejectReason)
                .append("desc", desc)
                .append("groupNum", groupNum)
                .append("joinGroupLimit", joinGroupLimit)
                .append("openGroupLimit", openGroupLimit)
                .append("sortNum", sortNum)
                .append("remainStock", remainStock)
                .append("activityPrice", activityPrice)
                .append("groupRandomNum", groupRandomNum)
                .append("enrollSource", enrollSource)
                .append("stockCount", stockCount)
                .toString();
    }
}