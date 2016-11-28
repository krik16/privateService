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
public class OsmOrderForUserCenterEntity implements Serializable {

    // mallId
    private String mallId;
    // 订单编号
    private String tradeNo;
    // 用户ID
    private String userId;
    // 用户手机
    private String userPhone;
    // 用户留言
    private String userMessage;
    // 商品类型
    private int commodityType;
    // 订单创建时间
    private Date createAt;
    // 总积分
    private int totalCredit;
    // 总金额
    private int totalAmount;
    // 订单状态
    private int status;
    // 快递方式 1：自提 2：快递
    private int deliveryType;
    // 收货人手机
    private String receiverPhone;
    // 收货人地址（包含省市区）
    private String receiverAddress;
    // 收货人姓名
    private  String  receiverName;
    // 对应事件
    private List<OrderEventEntity> eventList;
}
