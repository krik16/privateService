package com.rongyi.easy.mcmc.vo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyiwei on 2016/11/10.
 */
@Entity(value="mcmc_gift_payment",noClassnameStored=true)
public class GiftPayment implements Serializable, Cloneable {
    @Id
    private ObjectId id;
    // 礼品id
    private ObjectId commodityId;
    // 支付方式（1.兑换 2.换购）
    private Integer payType;
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







}
