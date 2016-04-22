package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.TemplateSale;
import com.rongyi.easy.activitymanage.entity.TemplateSaleShopMall;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by lijing on 2015/11/23 18:17
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class TemplateListVO implements Serializable {
    /**活动模版的id*/
    private Integer id;

    /**活动名称*/
    private String name;
    /**活动发布时间*/
    private Date startAt;
    /**活动结束时间*/
    private Date endAt;
    /***
     * 活动最后生成的URl
     */
    private String activityUrl;
    /**0关联商场 1关联店铺*/
    private Byte isMallShop;
    /**店铺商场关联*/
    private TemplateSaleShopMall templateSaleShopMall;

    private TemplateSale templateSale;

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

    public Byte getIsMallShop() {
        return isMallShop;
    }

    public void setIsMallShop(Byte isMallShop) {
        this.isMallShop = isMallShop;
    }

    public TemplateSaleShopMall getTemplateSaleShopMals() {
        return templateSaleShopMall;
    }

    public void setTemplateSaleShopMalls(TemplateSaleShopMall templateSaleShopMall) {
        this.templateSaleShopMall = templateSaleShopMall;
    }

    public TemplateSaleShopMall getTemplateSaleShopMall() {
        return templateSaleShopMall;
    }

    public void setTemplateSaleShopMall(TemplateSaleShopMall templateSaleShopMall) {
        this.templateSaleShopMall = templateSaleShopMall;
    }

    public TemplateSale getTemplateSale() {
        return templateSale;
    }

    public void setTemplateSale(TemplateSale templateSale) {
        this.templateSale = templateSale;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("activityUrl", activityUrl)
                .append("isMallShop", isMallShop)
                .append("templateSaleShopMall", templateSaleShopMall)
                .append("templateSale", templateSale)
                .toString();
    }
}
