package com.rongyi.easy.merchantactivity.param;

import com.rongyi.easy.activitymanage.param.PagingParam;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 23:14
 * ideaworkspace.
 */
public class MerchantActivityGoodsParam extends PagingParam {

    private static final String ORDER_BY_CLAUSE = "create_at DESC";
    private static final String ORDER_BY_CLAUSE_LABEL = "update_at DESC";
    private static final String ORDER_BY_CLAUSE_LABEL_JOIN = "join_start_at";
    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 标签类型 1代表所有活动
     2代表退回带处理
     3代表待审核
     4代表已通过
     5代表第三放报名

     */
    private Integer label;

    /**当前页码*/
    private Integer offset;

    /**
     * 排序字段
     */
    private String orderByClause = ORDER_BY_CLAUSE;


    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getOffset() {
        offset = (super.getCurrentPage() -1) * super.getPageSize();
        return offset;
    }

    public String getOrderByClause() {
        if (label == 1) {
            return ORDER_BY_CLAUSE;
        }
        if(label ==  2){
            return ORDER_BY_CLAUSE_LABEL;
        }
        if(label == 3){
            return ORDER_BY_CLAUSE;
        }
        if(label == 4){
            return ORDER_BY_CLAUSE_LABEL_JOIN;
        }
        return ORDER_BY_CLAUSE;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("label", label)
                .append("offset", offset)
                .append("orderByClause", orderByClause)
                .toString();
    }
}
