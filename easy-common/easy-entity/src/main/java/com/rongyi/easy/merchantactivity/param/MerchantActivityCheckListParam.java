package com.rongyi.easy.merchantactivity.param;

import com.rongyi.easy.activitymanage.param.PagingParam;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/20
 * TIME : 0:53
 * ideaworkspace.
 */
public class MerchantActivityCheckListParam extends PagingParam {

    private static final String ORDER_BY_CLAUSE = "create_at DESC,start_at DESC";
    private static final String ORDER_BY_CLAUSE_LABEL = "update_at DESC";
    private static final String ORDER_BY_CLAUSE_LABEL_START = "start_at DESC";



    /**1	代表活动开始时间
     2	代表活动结束时间
     3	代表活动报名开始时间
     4	代表活动报名结束时间*/
    private Integer activityTimeType;
    /**开始时间*/
    private Date startAt;
    /**结束时间*/
    private Date endAt;

    /**
     * 代表活动id
     2代表活动主题
     3代表发起人
     */
    private Integer nameType;


    /**活动名称*/
    private String name;
    /**发布渠道: 大运营[0] 商家[1]'*/
    private Integer publishChannel;

    /**当前页码*/
    private Integer offset;
    /**0代表所有活动  1待审核活动 2 已通过 3撤销申请  4已下线*/
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
        if(label != null) {
            if (label == 0) {
                return ORDER_BY_CLAUSE;
            }
            if(label == 1){
                return ORDER_BY_CLAUSE;
            }
            if(label == 2){
                return ORDER_BY_CLAUSE_LABEL;
            }
            if(label == 3){
                return ORDER_BY_CLAUSE_LABEL_START;
            }
            if(label == 4){
                return ORDER_BY_CLAUSE_LABEL;
            }
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
