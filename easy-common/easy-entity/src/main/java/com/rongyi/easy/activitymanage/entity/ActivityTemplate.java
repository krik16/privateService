package com.rongyi.easy.activitymanage.entity;

import com.rongyi.core.constant.Const;
import com.rongyi.easy.coupon.consts.CouponConstants;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动模版
 * @author lijing 2015 11 17 15:12
 */
public class ActivityTemplate implements Serializable{
    /**活动模版的id*/
    private Integer id;
   /**活动规则的id*/
    private Integer activityRuleId;
    /**活动规则的名字*/
    private String activityRuleName;
  /**模版类型 1代表标准模版  2代表特殊模版*/
    private Byte templateType;
    /**活动名称*/
    private String name;
   /**活动发布时间*/
    private Date startAt;
   /**活动结束时间*/
    private Date endAt;
    /**
     * 发布渠道  0 大运营 1 商家
     */
    private Integer publishChannel;
    /**
     * 商家id
     */
    private String publishChannelId;

    /***
     * 活动最后生成的URl
     */
    private String activityUrl;
    /**活动类型 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖*/
    private Integer activityType;
   /**模版类型 模版的选择：0.签到送积分-移动端 1.签到送积分-互动屏 2.抽奖类活动(翻牌购)-移动端 3.抽奖类活动(翻牌购)-互动屏 4.商品/卡券限时活动-移动端 5.商品/卡券限时活动-互动屏 6.商品/卡券通用活动-移动端 7.商品/卡券通用活动-互动端 8.闪购-移动端 9.特卖-移动端*/
    private Integer moduleType;
   /**适用终端 0移动端，1互动屏，2，ipad*/
    private Byte publishTerminal;
    /**默认是false可以正常使用 true表示强制关闭*/
    private Boolean status;
   /**创建人 */
    private String createUser;
   /**创建时间*/
    private Date createAt;
  /**修改时间*/
    private String updateUser;
  /**修改时间*/
    private Date updateAt;
   /**版本*/
    private Integer version;
   /**是否删除 false 没有删除 true 删除*/
    private Boolean isDeleted;
    /**这个是卡券商品模版信息*/
    private TemplateCouponGood templateCouponGood;
   /**这个是翻牌购模版信息*/
    private TemplateFlop templateFlop;
   /**这个模版标签关联商品卡券关联*/
    private List<TemplateLabel> templateLabel;

   /**特卖模版信息表*/
    private TemplateSale templateSale;
    /**店铺商场关联*/
    private List<TemplateSaleShopMall>  templateSaleShopMalls;
   /**签到送积分信息*/
    private TemplateSigned templateSigned;

    /**特卖的置顶商品*/
    private List<SaleCommodityTop> saleCommodityTops;

    private int isOuter;//是否外投

    public int getIsOuter() {
        return isOuter;
    }

    public void setIsOuter(int isOuter) {
        this.isOuter = isOuter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
    }

    public String getActivityRuleName() {
        return activityRuleName;
    }

    public void setActivityRuleName(String activityRuleName) {
        this.activityRuleName = activityRuleName;
    }

    public Byte getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Byte templateType) {
        this.templateType = templateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Byte getPublishTerminal() {
        return publishTerminal;
    }

    public void setPublishTerminal(Byte publishTerminal) {
        this.publishTerminal = publishTerminal;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public TemplateCouponGood getTemplateCouponGood() {
        return templateCouponGood;
    }
    public void setTemplateCouponGood(TemplateCouponGood templateCouponGood) {
        this.templateCouponGood = templateCouponGood;
    }

    public TemplateFlop getTemplateFlop() {
        return templateFlop;
    }

    public void setTemplateFlop(TemplateFlop templateFlop) {
        this.templateFlop = templateFlop;
    }

    public List<TemplateLabel> getTemplateLabel() {
        return templateLabel;
    }

    public void setTemplateLabel(List<TemplateLabel> templateLabel) {
        this.templateLabel = templateLabel;
    }



    public TemplateSale getTemplateSale() {
        return templateSale;
    }

    public void setTemplateSale(TemplateSale templateSale) {
        this.templateSale = templateSale;
    }

    public List<TemplateSaleShopMall> getTemplateSaleShopMalls() {
        return templateSaleShopMalls;
    }

    public void setTemplateSaleShopMalls(List<TemplateSaleShopMall> templateSaleShopMalls) {
        this.templateSaleShopMalls = templateSaleShopMalls;
    }

    public TemplateSigned getTemplateSigned() {
        return templateSigned;
    }

    public void setTemplateSigned(TemplateSigned templateSigned) {
        this.templateSigned = templateSigned;
    }

    public List<SaleCommodityTop> getSaleCommodityTops() {
        return saleCommodityTops;
    }

    public void setSaleCommodityTops(List<SaleCommodityTop> saleCommodityTops) {
        this.saleCommodityTops = saleCommodityTops;
    }

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public String getPublishChannelId() {
        return publishChannelId;
    }

    public void setPublishChannelId(String publishChannelId) {
        this.publishChannelId = publishChannelId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityRuleId", activityRuleId)
                .append("activityRuleName", activityRuleName)
                .append("templateType", templateType)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("publishChannel", publishChannel)
                .append("publishChannelId", publishChannelId)
                .append("activityUrl", activityUrl)
                .append("activityType", activityType)
                .append("moduleType", moduleType)
                .append("publishTerminal", publishTerminal)
                .append("status", status)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("isDeleted", isDeleted)
                .append("templateCouponGood", templateCouponGood)
                .append("templateFlop", templateFlop)
                .append("templateLabel", templateLabel)
                .append("templateSale", templateSale)
                .append("templateSaleShopMalls", templateSaleShopMalls)
                .append("templateSigned", templateSigned)
                .append("saleCommodityTops", saleCommodityTops)
                .append("isOuter", isOuter)
                .toString();
    }
}