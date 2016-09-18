package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动模版参数
 * Created by lijing on 2015/11/19.
 */
public class ActivityTemplateParam implements Serializable {
    private static final Integer CURRENTPAGE = 1;
    private static final Integer PAGESIZE = 10;
    private static final String ORDER_BY_CLAUSE = "create_at desc";
   /**活动模版id*/
    private Integer id;
    /**活动模版名称*/
    private String name;
    /**
     * 活动id
     */
    private Integer activityRuleId;
    /** 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖*/
    private Integer activityType;
    /**活动状态 1 未开始，2进行中 3已结束  全部不传*/
    private Integer activityStatus;
    /**适用终端 0移动端，1互动屏，2，ipad*/
    private Integer publishTerminal;
    /**发布时间的选择 1活动开始时间  2活动结束时间*/
    private int timeType;
    /**开始时间*/
    private Date timeAt;
    /**结束时间*/
    private Date timeEnd;
    /**模版类型 1代表标准模版  2代表特殊模版*/
    private Integer  templateType;
    /**当前页*/
    private Integer currentPage = CURRENTPAGE;
    /**每页显示的数量*/
    private Integer pageSize = PAGESIZE;

    private Integer offset;
    //0全部 1特卖 2专场
    private Integer moduleType;

    private String shopId;//店铺id


    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    /**排序的字段*/
    private String orderByString= ORDER_BY_CLAUSE;

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
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

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Integer getPublishTerminal() {
        return publishTerminal;
    }

    public void setPublishTerminal(Integer publishTerminal) {
        this.publishTerminal = publishTerminal;
    }

    public int getTimeType() {
        return timeType;
    }

    public void setTimeType(int timeType) {
        this.timeType = timeType;
    }

    public Date getTimeAt() {
        return timeAt;
    }

    public void setTimeAt(Long timeAt) {
        this.timeAt = new Date(timeAt);
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Long timeEnd) {
        this.timeEnd = new Date(timeEnd);
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByString() {
        return orderByString;
    }

    public void setOrderByString(String orderByString) {
        this.orderByString = orderByString;
    }

    public Integer getOffset() {
        offset = (this.currentPage -1) * this.pageSize;
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("activityRuleId", activityRuleId)
                .append("activityType", activityType)
                .append("activityStatus", activityStatus)
                .append("publishTerminal", publishTerminal)
                .append("timeType", timeType)
                .append("timeAt", timeAt)
                .append("timeEnd", timeEnd)
                .append("templateType", templateType)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("offset", offset)
                .append("orderByString", orderByString)
                .append("moduleType", moduleType)
                .append("shopId", shopId)
                .toString();
    }
}
