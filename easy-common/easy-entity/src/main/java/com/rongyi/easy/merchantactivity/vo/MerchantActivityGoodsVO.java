package com.rongyi.easy.merchantactivity.vo;

import com.rongyi.easy.activitymanage.entity.ActivityGoodsSpec;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 22:25
 * ideaworkspace.
 */
public class MerchantActivityGoodsVO implements Serializable {
    /**
     * PK
     */
    private Integer id;



    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 类型 4代表活动券
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
     * 参与开始时间
     */
    private Date joinStartAt;

    /**
     * 参与结束时间
     */
    private Date joinEndAt;

    /**
     * 商品审核状态：待审核[0] 已退回[1] 已通过[2],3已下线 4 申请撤销中),
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

    /**
     * 创建人
     */
    private String shopName;

    private String shopId;


    private MerchantGoodsCheckVO record;

    private Integer isAuto;



    /**
     * 商品规格
     */
    private List<ActivityGoodsSpec> activityGoodsSpecsVos = new ArrayList<ActivityGoodsSpec>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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



    public MerchantGoodsCheckVO getRecord() {
        return record;
    }

    public void setRecord(MerchantGoodsCheckVO record) {
        this.record = record;
    }

    public Integer getIsAuto() {
        if(identity != null){
            if(identity == 2){
                return 1;
            }else{
                return 0;
            }
        }
        return isAuto;
    }

    public void setIsAuto(Integer isAuto) {
        this.isAuto = isAuto;
    }

    public List<ActivityGoodsSpec> getActivityGoodsSpecsVos() {
        return activityGoodsSpecsVos;
    }

    public void setActivityGoodsSpecsVos(List<ActivityGoodsSpec> activityGoodsSpecsVos) {
        this.activityGoodsSpecsVos = activityGoodsSpecsVos;
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("goodsId", goodsId)
                .append("type", type)
                .append("name", name)
                .append("picUrl", picUrl)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("status", status)
                .append("identity", identity)
                .append("identityId", identityId)
                .append("shopName", shopName)
                .append("shopId", shopId)
                .append("record", record)
                .append("isAuto", isAuto)
                .append("activityGoodsSpecsVos", activityGoodsSpecsVos)
                .toString();
    }
}
