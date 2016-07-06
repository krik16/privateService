package com.rongyi.easy.code;

import com.rongyi.easy.coupon.entity.CouponChannel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description: 邀请推广码模板类
 * Author: 袁波
 * DATE: 2016/6/27 14:44
 * Package:com.rongyi.code.entity
 * Project:easy-market
 */
public class Hannels implements Serializable{
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 有效期开始时间
     */
    private Date validStartAt;

    /**
     * 有效期结束时间
     */
    private Date validEndAt;

    /**
     * 码的数量
     */
    private Integer count;

    /**
     * 每个用户使用限制
     */
    private Integer useLimit;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 0:待审核；1：通过；2：未通过；3：作废
     */
    private Byte status;

    /**
     * 0:渠道邀请码；1:渠道推广码
     */
    private Byte type;

    private List<HannelsCheckLog> hannelsCheckLogList;
    /**
     * 渠道id
     */
    private Integer channelId;
    /**
     * 渠道邀请码
     */
    private String channelCode;

    private List<HannelsCoupon> coupons;

    private CouponChannel couponChannel;

    public CouponChannel getCouponChannel() {
        return couponChannel;
    }

    public void setCouponChannel(CouponChannel couponChannel) {
        this.couponChannel = couponChannel;
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

    public Date getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Date validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Date getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Date validEndAt) {
        this.validEndAt = validEndAt;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(Integer useLimit) {
        this.useLimit = useLimit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public List<HannelsCheckLog> getHannelsCheckLogList() {
        return hannelsCheckLogList;
    }

    public void setHannelsCheckLogList(List<HannelsCheckLog> hannelsCheckLogList) {
        this.hannelsCheckLogList = hannelsCheckLogList;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public List<HannelsCoupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<HannelsCoupon> coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hannels{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", validStartAt=").append(validStartAt);
        sb.append(", validEndAt=").append(validEndAt);
        sb.append(", count=").append(count);
        sb.append(", useLimit=").append(useLimit);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", createBy='").append(createBy).append('\'');
        sb.append(", updateAt=").append(updateAt);
        sb.append(", updateBy='").append(updateBy).append('\'');
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", hannelsCheckLogList=").append(hannelsCheckLogList);
        sb.append(", channelId=").append(channelId);
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", coupons=").append(coupons);
        sb.append('}');
        return sb.toString();
    }
}
