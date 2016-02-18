package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * Created by Leon on 2016/1/27.
 */
public class ActivityGoodsImportParam extends PagingParam {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 版本号
     */
    private String version;

    /**
     * 类型：商品[0] 卡券[1]
     */
    private Integer goodsType;

    /**
     * 商品审核状态：待审核[0] 未通过[1] 已通过[2]
     */
    private Integer status;

    /**
     * id集合
     */
    private List<Integer> ids;

    /**
     * 创建人
     */
    private String createUser;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("version", version)
                .append("goodsType", goodsType)
                .append("status", status)
                .append("ids", ids)
                .append("createUser", createUser)
                .toString();
    }
}
