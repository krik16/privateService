package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/6/29.
 * 促销推广码返回vo
 */
public class HannelsVO implements Serializable {
    private int id;//推广码id
    private String name;//推广码名称
    private int type;//推广码类型(0:渠道邀请码；1:渠道推广码)
    private String channerId;//关联渠道id
    private String channerName;//关联渠道名称
    private int status;//1 待审核 2 未开始 3 进行中 4 已结束 5未通过 6 已作废
    private Long validStartAt;//有效开始时间
    private Long validEndAt;//有效结束时间
    private List<HannelsCheckLog> hannelCheckLogs;//审核，作废日志列表
    private List<HannelsCoupon> hannelsCoupons;
    private List<HannelsUser> hannelsUsers;
    private Integer isAllUser;
    private Integer allotType;
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
    private Long createAt;
    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Long updateAt;

    /**
     * 更新人
     */
    private String updateBy;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getChannerId() {
        return channerId;
    }

    public void setChannerId(String channerId) {
        this.channerId = channerId;
    }

    public String getChannerName() {
        return channerName;
    }

    public void setChannerName(String channerName) {
        this.channerName = channerName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Long validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Long getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Long validEndAt) {
        this.validEndAt = validEndAt;
    }

    public List<HannelsCheckLog> getHannelCheckLogs() {
        return hannelCheckLogs;
    }

    public void setHannelCheckLogs(List<HannelsCheckLog> hannelCheckLogs) {
        this.hannelCheckLogs = hannelCheckLogs;
    }

    public List<HannelsCoupon> getHannelsCoupons() {
        return hannelsCoupons;
    }

    public void setHannelsCoupons(List<HannelsCoupon> hannelsCoupons) {
        this.hannelsCoupons = hannelsCoupons;
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

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public List<HannelsUser> getHannelsUsers() {
        return hannelsUsers;
    }

    public void setHannelsUsers(List<HannelsUser> hannelsUsers) {
        this.hannelsUsers = hannelsUsers;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HannelsVO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", type=").append(type);
        sb.append(", channerId='").append(channerId).append('\'');
        sb.append(", channerName='").append(channerName).append('\'');
        sb.append(", status=").append(status);
        sb.append(", validStartAt=").append(validStartAt);
        sb.append(", validEndAt=").append(validEndAt);
        sb.append(", hannelCheckLogs=").append(hannelCheckLogs);
        sb.append(", hannelsCoupons=").append(hannelsCoupons);
        sb.append(", hannelsUsers=").append(hannelsUsers);
        sb.append(", isAllUser=").append(isAllUser);
        sb.append(", allotType=").append(allotType);
        sb.append(", count=").append(count);
        sb.append(", useLimit=").append(useLimit);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", createBy='").append(createBy).append('\'');
        sb.append(", updateAt=").append(updateAt);
        sb.append(", updateBy='").append(updateBy).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
