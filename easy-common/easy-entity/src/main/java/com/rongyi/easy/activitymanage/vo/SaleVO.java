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

    private Long createAt;
    private Long updateAt;
    private String bannerPic;
    private Integer isMallShop;
    private List<MallVO> mall;
    private List<ShopVO> shops;

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
                                shopVOs.add(tempShop);
                            }
                        }
                       if(activityTemplate.getTemplateSaleShopMalls().size()>1) {
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("shops", shops)
                .append("mall", mall)
                .append("isMallShop", isMallShop)
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
