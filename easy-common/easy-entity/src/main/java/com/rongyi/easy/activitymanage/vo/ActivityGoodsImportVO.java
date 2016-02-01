package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 导入商品返回结果VO
 * Created by Leon on 2016/1/27.
 */
public class ActivityGoodsImportVO implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     *  活动id
     */
    private Integer activityId;

    /**
     * 商品|卡券id
     */
    private String goodsId;

    /**
     * 商品|卡券名称
     */
    private String goodsName;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 版本号
     */
    private String version;

    /**
     * 成功的数量
     */
    private Integer successCount;

    /**
     * 失败的数量
     */
    private Integer failureCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("goodsName", goodsName)
                .append("goodsType", goodsType)
                .append("version", version)
                .append("successCount", successCount)
                .append("failureCount", failureCount)
                .toString();
    }
}
