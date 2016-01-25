package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 *  活动模版地址
 *  @author  lijing 2015-11-17 15:03
 */
public class ActivityModuleUrl implements Serializable{
    /**id*/
    private Integer id;
    /**模版类型 0.签到送积分-移动端 1.签到送积分-互动屏 2.抽奖类活动(翻牌购)-移动端 3.抽奖类活动(翻牌购)-互动屏 4.商品/卡券限时活动-移动端 5.商品/卡券限时活动-互动屏 6.商品/卡券通用活动-移动端 7.商品/卡券通用活动-互动端 8.闪购-移动端 9.特卖-移动端*/
    private Integer moduleType;
   /**url地址*/
    private String url;
   /**创建时间*/
    private Date createAt;
    /**修改时间*/
    private Date updateAt;
  /**是否删除 true删除 false 不删除*/
    private Boolean isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("moduleType", moduleType)
                .append("url", url)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .toString();
    }
}