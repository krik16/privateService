package com.rongyi.easy.activitymanage.param;

import com.google.inject.internal.Lists;
import com.rongyi.easy.activitymanage.param.GoodsSku;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yangyang on 2016/10/13.
 */
public class ActivityGoodsDetail implements Serializable {
    private Integer id;
    private Integer activityId;

    private String commodityPic;
    private String desc;
    private String goodsId;
    private Integer groupNum;
    private Integer groupMaxNum;//最大成团人数
    private String subTitle;//副标题
    private Integer supModPrice;//是否支持按成团人数调价
    private String expectTotalAmount;//期望的金额
    private Date joinStartAt;
    private Date joinEndAt;
    private Integer joinGroupLimit;
    private String name;
    private Integer openGroupLimit;
    private Integer sortNum;
    private String createUser;
    private String updateUser;
    private String remainStock;//剩余库存
    private String activityPrice;//活动价，是个范围
    private Integer status;//2已编辑8未编辑
    private List<GoodsSku> goodsSkuList = Lists.newArrayList();

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("desc", desc)
                .append("goodsId", goodsId)
                .append("groupNum", groupNum)
                .append("joinGroupLimit", joinGroupLimit)
                .append("name", name)
                .append("id", id)
                .append("openGroupLimit", openGroupLimit)
                .append("sortNum", sortNum)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("remainStock", remainStock)
                .append("activityPrice", activityPrice)
                .append("status", status)
                .append("commodityPic", commodityPic)
                .append("groupMaxNum", groupMaxNum)
                .append("subTitle", subTitle)
                .append("supModPrice", supModPrice)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("expectTotalAmount", expectTotalAmount)
                .toString();
    }

    public String getExpectTotalAmount() {
        return expectTotalAmount;
    }

    public void setExpectTotalAmount(String expectTotalAmount) {
        this.expectTotalAmount = expectTotalAmount;
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

    public String getCommodityPic() {
        return commodityPic;
    }

    public void setCommodityPic(String commodityPic) {
        this.commodityPic = commodityPic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<GoodsSku> getGoodsSkuList() {
        return goodsSkuList;
    }

    public void setGoodsSkuList(List<GoodsSku> goodsSkuList) {
        this.goodsSkuList = goodsSkuList;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }



    public Integer getJoinGroupLimit() {
        return joinGroupLimit;
    }

    public void setJoinGroupLimit(Integer joinGroupLimit) {
        this.joinGroupLimit = joinGroupLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOpenGroupLimit() {
        return openGroupLimit;
    }

    public void setOpenGroupLimit(Integer openGroupLimit) {
        this.openGroupLimit = openGroupLimit;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
