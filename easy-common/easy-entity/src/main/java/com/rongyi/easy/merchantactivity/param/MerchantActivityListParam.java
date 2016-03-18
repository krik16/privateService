package com.rongyi.easy.merchantactivity.param;

import com.rongyi.easy.activitymanage.param.PagingParam;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/18
 * TIME : 11:51
 * ideaworkspace.
 */
public class MerchantActivityListParam extends PagingParam {

    private static final String ORDER_BY_CLAUSE = "start_at DESC,create_at DESC";
    private static final String ORDER_BY_CLAUSE_LABEL = "create_at DESC";
    /**描述:
     * 0.待审核
     * 1.不通过
     2.未开始
     3.进行中
     4.已结束
     5.强下线
     */
    private Integer status;

    /**活动类型 3代表及商品类活动*/
    private Integer type;

    /**推广渠道查询条件     匹配字符*/
    private String synTarget;

    /**活动时间 0代表开始时间   1代表活动结束时间*/
    private Integer activityTimeType;
    /**开始时间*/
    private Date startAt;
    /**结束时间*/
    private Date endAt;

    /**
     * 1 代表name 是活动主题  2代表name是活动发起人
     */
    private Integer nameType;


    /**活动名称*/
    private String name;
    /**发布渠道: 大运营[0] 商家[1]'*/
    private Integer publishChannel;

    /**当前页码*/
    private Integer offset;
    /**0代表所有活动  1代表进行中活动
     2代表参加的活动*/
    private Integer label;
    /**
     * 排序字段
     */
    private String orderByClause = ORDER_BY_CLAUSE;

    /**
     * 商场id
     */
   private String mallId;
    public Integer getOffset() {
        offset = (super.getCurrentPage() -1) * super.getPageSize();
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Integer getActivityTimeType() {
        return activityTimeType;
    }

    public void setActivityTimeType(Integer activityTimeType) {
        this.activityTimeType = activityTimeType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public String getOrderByClause() {
        if (label == 0) {
            return ORDER_BY_CLAUSE_LABEL;
        }
        return ORDER_BY_CLAUSE;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getNameType() {
        return nameType;
    }

    public void setNameType(Integer nameType) {
        this.nameType = nameType;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("status", status)
                .append("type", type)
                .append("synTarget", synTarget)
                .append("activityTimeType", activityTimeType)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("nameType", nameType)
                .append("name", name)
                .append("publishChannel", publishChannel)
                .append("offset", offset)
                .append("label", label)
                .append("orderByClause", orderByClause)
                .append("mallId", mallId)
                .toString();
    }
}
