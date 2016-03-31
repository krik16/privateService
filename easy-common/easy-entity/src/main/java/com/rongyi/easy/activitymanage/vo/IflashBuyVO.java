package com.rongyi.easy.activitymanage.vo;


import com.rongyi.easy.activitymanage.entity.ActivityTemplate;
import com.rongyi.easy.activitymanage.entity.TemplateRelevantGoodsCoupon;
import com.rongyi.easy.coupon.param.RebateAndRedenvelopParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijing on 2015/11/22 22:34
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class IflashBuyVO implements Serializable {
    private Integer id;
    private String name;
    private Long startAt;
    private Long endAt;
    private String activityUrl;
    private Integer activityType;
    private Integer moduleType;
    private Integer publishTerminal;
    private String createUser;
    private String updateUser;

    private Long createAt;
    private Long updateAt;
    private String bannerPic;
    private String subTitle;

    private List<CommodityVO> commodityVOs;

    public IflashBuyVO(){

    }

    public IflashBuyVO(ActivityTemplate activityTemplate){
        if(activityTemplate != null){
            this.id=activityTemplate.getId();
            this.name=activityTemplate.getName();
            this.startAt=activityTemplate.getStartAt().getTime();
            this.endAt=activityTemplate.getEndAt().getTime();
            this.activityUrl=activityTemplate.getActivityUrl();
            this.activityType=activityTemplate.getActivityType();
            this.moduleType=activityTemplate.getModuleType();
            this.publishTerminal=(int)activityTemplate.getPublishTerminal();
            this.createAt=activityTemplate.getCreateAt().getTime();
            this.updateAt=activityTemplate.getUpdateAt().getTime();
            this.createUser=activityTemplate.getCreateUser();
            this.updateUser=activityTemplate.getUpdateUser();
            if(activityTemplate.getTemplateCouponGood() != null){
                this.bannerPic=activityTemplate.getTemplateCouponGood().getBannerPic();
                this.subTitle=activityTemplate.getTemplateCouponGood().getSubtitle();
            }
            List<CommodityVO> commodityVOsT=new ArrayList<CommodityVO>();
            if(activityTemplate.getTemplateLabel() != null){
                if(!CollectionUtils.isEmpty(activityTemplate.getTemplateLabel().get(0).getTemplateRelevantGoodsCouponList())){
                    for(TemplateRelevantGoodsCoupon templateRelevantGoodsCoupon:activityTemplate.getTemplateLabel().get(0).getTemplateRelevantGoodsCouponList()){
                        CommodityVO commodityVO=new CommodityVO();
                        commodityVO.setCommodityId(templateRelevantGoodsCoupon.getCommodityId());
                        commodityVO.setActivityPrice(templateRelevantGoodsCoupon.getActivityPrice());
                        commodityVO.setTitle(templateRelevantGoodsCoupon.getTitle());
                        commodityVO.setPic(templateRelevantGoodsCoupon.getPic());
                        commodityVO.setCurrentTitle(templateRelevantGoodsCoupon.getCurrentTitle());
                        commodityVO.setStockCount(templateRelevantGoodsCoupon.getStockCount());
                        commodityVO.setRySubsidy(templateRelevantGoodsCoupon.getRySubsidy());
                        commodityVO.setOrderPosition(templateRelevantGoodsCoupon.getOrderPosition());
                        commodityVOsT.add(commodityVO);
                    }
                    this.commodityVOs=commodityVOsT;
                }
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
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

    public Integer getPublishTerminal() {
        return publishTerminal;
    }

    public void setPublishTerminal(Integer publishTerminal) {
        this.publishTerminal = publishTerminal;
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

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public List<CommodityVO> getCommodityVOs() {
        return commodityVOs;
    }

    public void setCommodityVOs(List<CommodityVO> commodityVOs) {
        this.commodityVOs = commodityVOs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("commodityVOs", commodityVOs)
                .append("subTitle", subTitle)
                .append("bannerPic", bannerPic)
                .append("updateAt", updateAt)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("createUser", createUser)
                .append("publishTerminal", publishTerminal)
                .append("moduleType", moduleType)
                .append("activityType", activityType)
                .append("activityUrl", activityUrl)
                .append("endAt", endAt)
                .append("startAt", startAt)
                .append("name", name)
                .append("id", id)
                .toString();
    }
}
