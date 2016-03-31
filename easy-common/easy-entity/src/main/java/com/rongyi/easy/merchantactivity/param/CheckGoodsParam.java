package com.rongyi.easy.merchantactivity.param;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activitymanage.param.PagingParam;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/20
 * TIME : 19:53
 * ideaworkspace.
 */
public class CheckGoodsParam extends PagingParam {

    private static final String ORDER_BY_CLAUSE = "create_at DESC,identity DESC";
    private static final String ORDER_BY_CLAUSE_LABEL = "update_at DESC";
    private static final String ORDER_BY_CLAUSE_LABEL_JOIN = "join_start_at";

    private Integer activityId;
    /**
     * 1代表所有活动
     2申请撤销
     3代表待审核
     4代表已通过

     */
    private Integer label;


    /**1 代表 标题
     2代表 报名人
     3 代表 卡券编码
     4代表 商品编码
     */
    private Integer type;


    private String typeName;

    /**活动时间 1参与时间*/
    private Integer dataType;
    /**开始时间*/
    private Date startAt;
    /**结束时间*/
    private Date endAt;




    /**活动名称*/
    private String name;


    /**当前页码*/
    private Integer offset;

    /**
     * 排序字段
     */
    private String orderByClause = ORDER_BY_CLAUSE;

    public Integer getOffset() {
        offset = (super.getCurrentPage() -1) * super.getPageSize();
        return offset;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getOrderByClause() {
        if (label == 1) {
            return ORDER_BY_CLAUSE;
        }
        if (label == 2) {
            return ORDER_BY_CLAUSE_LABEL;
        }
        if (label == 3) {
            return ORDER_BY_CLAUSE;
        }
        if (label == 4) {
            return ORDER_BY_CLAUSE_LABEL_JOIN;
        }
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("label", label)
                .append("type", type)
                .append("typeName", typeName)
                .append("dataType", dataType)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("name", name)
                .append("offset", offset)
                .append("orderByClause", orderByClause)
                .toString();
    }
}
