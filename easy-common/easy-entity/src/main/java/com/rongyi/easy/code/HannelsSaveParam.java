package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/6/29
 * 促销码保存实体.
 */
public class HannelsSaveParam implements Serializable {
    private String id;//主键
    private String type;//推广码类型 0 邀请码 1 渠道推广码
    private String name;//推广码名称
    private List<HannelsCoupon> hannelsCouponList;//关联促销券ids(多个用逗号隔开)
    private String validStartAt;//有效开始时间
    private String validEndAt;//有效结束时间
    private String channelId;//渠道id
    private String count;//推广码个数
    private String useLimit;//每个用户使用个数
    private String remark;//备注
    private List<HannelsUser> hannelsUserList;//关联的导购,买手数据
    private Integer userType;
    private Integer isAllUser;//0:不是；1：全部用户
    private Integer allotType;//分配类型。0：店员；1：店长；2：商场；3：第三方渠道

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(String validStartAt) {
        this.validStartAt = validStartAt;
    }

    public String getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(String validEndAt) {
        this.validEndAt = validEndAt;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(String useLimit) {
        this.useLimit = useLimit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<HannelsCoupon> getHannelsCouponList() {
        return hannelsCouponList;
    }

    public void setHannelsCouponList(List<HannelsCoupon> hannelsCouponList) {
        this.hannelsCouponList = hannelsCouponList;
    }

    public List<HannelsUser> getHannelsUserList() {
        return hannelsUserList;
    }

    public void setHannelsUserList(List<HannelsUser> hannelsUserList) {
        this.hannelsUserList = hannelsUserList;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getIsAllUser() {
        return isAllUser;
    }

    public void setIsAllUser(Integer isAllUser) {
        this.isAllUser = isAllUser;
    }

    public Integer getAllotType() {
        return allotType;
    }

    public void setAllotType(Integer allotType) {
        this.allotType = allotType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HannelsSaveParam{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", hannelsCouponList=").append(hannelsCouponList);
        sb.append(", validStartAt='").append(validStartAt).append('\'');
        sb.append(", validEndAt='").append(validEndAt).append('\'');
        sb.append(", channelId='").append(channelId).append('\'');
        sb.append(", count='").append(count).append('\'');
        sb.append(", useLimit='").append(useLimit).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", hannelsUserList=").append(hannelsUserList);
        sb.append(", userType=").append(userType);
        sb.append(", isAllUser=").append(isAllUser);
        sb.append(", allotType=").append(allotType);
        sb.append('}');
        return sb.toString();
    }
}
