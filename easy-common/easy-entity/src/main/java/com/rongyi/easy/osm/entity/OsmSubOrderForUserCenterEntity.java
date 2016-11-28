package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单实体（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-25
 */
public class OsmSubOrderForUserCenterEntity implements Serializable {
    // 订单编号
    private String tradeNo;
    // 用户ID
    private String tradeSubNo;
    // 用户留言
    private String userMessage;
    // 兑换类型
    private int exchageType;
    // 购买数
    private int quantity;
    // 商品Id
    private String commodityId;
    // 商品名称
    private String commodityName;
    // 商品缩微图
    private String commodityLogoUrl;
    // 商品类目
    private List<String> commoditySpecName;



}
