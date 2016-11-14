package com.rongyi.easy.mcmc.vo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * 礼品支付规则类
 *
 * @author yaoyiwei
 * @date 2016-11-11
 * @version 1.0
 *
 */
@Entity(value="mcmc_gift_payment",noClassnameStored=true)
public class GiftPayment implements Serializable, Cloneable {
    @Id
    private ObjectId id;
    // 礼品id
    private String commodityId;
    // 支付方式（1.兑换 2.换购）
    private Integer type;
    // 用户等级
    private String level;
    // 所需积分
    private Integer point;
    // 所需金额
    private Double money;
    // 是否生效（1.是 2.否）
    private Integer isEffective;
    // 创建时间
    private Date createAt;
    // mysql id
    private String mysqlId;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getMysqlId() {
        return mysqlId;
    }

    public void setMysqlId(String mysqlId) {
        this.mysqlId = mysqlId;
    }

    @Override
    public String toString() {
        return "GiftPayment{" +
                "id=" + id +
                ", commodityId='" + commodityId + '\'' +
                ", type=" + type +
                ", level='" + level + '\'' +
                ", point=" + point +
                ", money=" + money +
                ", isEffective=" + isEffective +
                ", createAt=" + createAt +
                ", mysqlId='" + mysqlId + '\'' +
                '}';
    }
}
