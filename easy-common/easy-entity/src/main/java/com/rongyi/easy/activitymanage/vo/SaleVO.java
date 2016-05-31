package com.rongyi.easy.activitymanage.vo;


import com.rongyi.easy.activitymanage.entity.ActivityTemplate;
import com.rongyi.easy.activitymanage.entity.TemplateSaleShopMall;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lijing on 2015/11/2013:51
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class SaleVO implements Serializable {
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
    private String shareTitle;
    private String shareDesc;
    private String sharePic;
    private String replacePic;
    private String subTitle;
    private Long createAt;
    private Long updateAt;
    private String bannerPic;
    private Integer isMallShop;
    private List<MallVO> mall;
    private List<ShopVO> shops;
    private List<SaleCommodityTopVO> commodities;

    private List<SaleFlashCommodityVO> commodityList;
    public SaleVO(){}

    public SaleVO(ActivityTemplate activityTemplate){
        if(activityTemplate!=null){
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
            if(activityTemplate.getTemplateSale() != null){
                this.bannerPic= activityTemplate.getTemplateSale().getBannerPic();
                this.subTitle = activityTemplate.getTemplateSale().getSubTitle();
                this.shareTitle = activityTemplate.getTemplateSale().getShareTitle();
                this.shareDesc = activityTemplate.getTemplateSale().getShareDesc();
                this.sharePic = activityTemplate.getTemplateSale().getSharePic();
                this.replacePic = activityTemplate.getTemplateSale().getReplacePic();
                this.isMallShop=(int)activityTemplate.getTemplateSale().getIsMallShop();

            if(!CollectionUtils.isEmpty(activityTemplate.getTemplateSaleShopMalls())){
                List<MallVO>  mallVOs=new ArrayList<MallVO>();
                List<ShopVO> shopVOs=new ArrayList<ShopVO>();
                    if(this.isMallShop == 0){
                        if (activityTemplate.getTemplateSaleShopMalls().size() >=1){
                            MallVO tempMall = new MallVO();
                            tempMall.setMallId(activityTemplate.getTemplateSaleShopMalls().get(0).getMallMid());
                            tempMall.setMallName(activityTemplate.getTemplateSaleShopMalls().get(0).getMallName());
                            mallVOs.add(tempMall);
                        }
                    }else {
                        for (TemplateSaleShopMall templateSaleShopMall : activityTemplate.getTemplateSaleShopMalls()) {
                            if (StringUtils.isNotBlank(templateSaleShopMall.getShopMid())) {
                                ShopVO tempShop = new ShopVO();
                                tempShop.setShopId(templateSaleShopMall.getShopMid());
                                tempShop.setShopName(templateSaleShopMall.getShopName());
                                tempShop.setMallId(templateSaleShopMall.getMallMid());
                                tempShop.setMallName(templateSaleShopMall.getMallName());
                                shopVOs.add(tempShop);
                            }
                        }
                       if(activityTemplate.getTemplateSaleShopMalls().size()>0) {
                           MallVO tempMall = new MallVO();
                           tempMall.setMallId(activityTemplate.getTemplateSaleShopMalls().get(0).getMallMid());
                           tempMall.setMallName(activityTemplate.getTemplateSaleShopMalls().get(0).getMallName());
                           mallVOs.add(tempMall);
                       }
                    }
                    this.mall=mallVOs;
                    this.shops=shopVOs;
                }
            }
        }
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getReplacePic() {
        return replacePic;
    }

    public void setReplacePic(String replacePic) {
        this.replacePic = replacePic;
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

    public Integer getIsMallShop() {
        return isMallShop;
    }

    public void setIsMallShop(Integer isMallShop) {
        this.isMallShop = isMallShop;
    }

    public List<MallVO> getMall() {
        return mall;
    }

    public void setMall(List<MallVO> mall) {
        this.mall = mall;
    }

    public List<ShopVO> getShops() {
        return shops;
    }

    public void setShops(List<ShopVO> shops) {
        this.shops = shops;
    }

    public List<SaleCommodityTopVO> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<SaleCommodityTopVO> commodities) {
        this.commodities = commodities;
    }

    public List<SaleFlashCommodityVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<SaleFlashCommodityVO> commodityList) {
        this.commodityList = commodityList;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("activityUrl", activityUrl)
                .append("activityType", activityType)
                .append("moduleType", moduleType)
                .append("publishTerminal", publishTerminal)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("shareTitle", shareTitle)
                .append("shareDesc", shareDesc)
                .append("sharePic", sharePic)
                .append("replacePic", replacePic)
                .append("subTitle", subTitle)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("bannerPic", bannerPic)
                .append("isMallShop", isMallShop)
                .append("mall", mall)
                .append("shops", shops)
                .append("commodities", commodities)
                .append("commodityList", commodityList)
                .toString();
    }
}
