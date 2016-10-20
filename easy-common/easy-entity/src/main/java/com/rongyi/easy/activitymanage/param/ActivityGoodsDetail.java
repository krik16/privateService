package com.rongyi.easy.activitymanage.param;

import com.google.inject.internal.Lists;
import com.rongyi.easy.activitymanage.param.GoodsSku;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/10/13.
 */
public class ActivityGoodsDetail implements Serializable {
    private Integer id;
    private Integer activityId;

    private String desc;
    private String goodsId;
    private Integer groupNum;
    private Integer joinGroupLimit;
    private String name;
    private Integer openGroupLimit;
    private Integer sortNum;
    private String createUser;
    private String updateUser;
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
                .toString();
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
