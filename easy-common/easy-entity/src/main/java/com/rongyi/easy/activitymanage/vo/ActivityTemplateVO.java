package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 查询列表返回的
 * Created by lijing on 2015/11/19.
 */
public class ActivityTemplateVO implements Serializable{
    /**活动模版的id*/
    private Integer id;
    /**活动规则的id*/
    private Integer activityRuleId;
    /**活动规则的名字*/
    private String activityRuleName;
    /**模版类型 1代表标准模版  2代表特殊模版*/
    private Byte templateType;
    /**活动名称*/
    private String name;
    /**活动发布时间*/
    private Date startAt;
    /**活动结束时间*/
    private Date endAt;

    /**活动状态 1 未开始，2进行中 3已结束 4 已下线*/
    private Integer activityStatus;
    /***
     * 活动最后生成的URl
     */
    private String activityUrl;
    /**活动类型 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖*/
    private Integer activityType;
    /**模版类型 模版的选择：0.签到送积分-移动端 1.签到送积分-互动屏 2.抽奖类活动(翻牌购)-移动端 3.抽奖类活动(翻牌购)-互动屏 4.商品/卡券限时活动-移动端 5.商品/卡券限时活动-互动屏 6.商品/卡券通用活动-移动端 7.商品/卡券通用活动-互动端 8.闪购-移动端 9.特卖-移动端*/
    private Integer moduleType;
    /**适用终端 0移动端，1互动屏，2，ipad*/
    private Byte publishTerminal;
    /**默认是false可以正常使用 true表示强制关闭*/
    private Boolean status;
    /**创建人 */
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改时间*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
    }

    public String getActivityRuleName() {
        return activityRuleName;
    }

    public void setActivityRuleName(String activityRuleName) {
        this.activityRuleName = activityRuleName;
    }

    public Byte getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Byte templateType) {
        this.templateType = templateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStartAt() {
        if (startAt == null){
            return -62170185600000L;
        }
        return startAt.getTime();
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Long getEndAt() {
        if (endAt == null){
            return -62170185600000L;
        }
        return endAt.getTime();
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Byte getPublishTerminal() {
        return publishTerminal;
    }

    public void setPublishTerminal(Byte publishTerminal) {
        this.publishTerminal = publishTerminal;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Long getCreateAt() {
        return createAt.getTime();
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Long getUpdateAt() {
        return updateAt.getTime();
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityRuleId", activityRuleId)
                .append("activityRuleName", activityRuleName)
                .append("templateType", templateType)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("activityStatus", activityStatus)
                .append("activityUrl", activityUrl)
                .append("activityType", activityType)
                .append("moduleType", moduleType)
                .append("publishTerminal", publishTerminal)
                .append("status", status)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .toString();
    }
}
