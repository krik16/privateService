package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AppOrderInfo implements Serializable{
    private Integer id;

    private String orderId;

    private String buyerId; //买家id

    private String buyerName; // 买家昵称
 
    private String buyerMobile;

    private Integer tradeStatus; //交易状态,0:待付款 ,1:已付款,2:已取消,3:已删除, 4:全部, 5:退款(包括已退款和未退款)

    private Date orderTime; //下单时间

    private Date payTime; //支付时间
    
    private String zhifubaoSign; //支付宝订单签名
    
    private String app_signature; // 微信支付所需app_signature
    
    private String prepayid; // 微信支付所需prepayid
    
    private String activityids;// 团购ID 以#分隔
    
    private String app_signature2; // 安卓使用支付宝订单签名
    
    private String noncestr; // 随机数
    
    private String timestamp; // 微信支付需使用的时间戳
    
    private List<AppOrderDetail> orderDetailList;
    
    private Integer tradeWay; //支付方式  0:未支付; 1:支付宝支付; 2:微信支付
    
    private String buyerEmail; // (买家支付宝账号) 现在改为微信交易号，28 位长的数值，其中前 10 位为商户号，之后 8 位为订单产生的日期，如20090415，最后10 位是流水号

    private String buyerPayId; // (原本是买家支付宝用户id,)现在改为 该交易在支付宝系统中的交易 流水号。 最短16位，最长64位

    private Integer alarmFlag; //当值为0时，代表为最后警戒团购数量下所下的单，再去支付时，则不再扣库存
    //当库存量低于警戒数量时，对所下订单进行标记，防止支付时二次减库存
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile == null ? null : buyerMobile.trim();
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

	public List<AppOrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<AppOrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public String getZhifubaoSign() {
		return zhifubaoSign;
	}

	public void setZhifubaoSign(String zhifubaoSign) {
		this.zhifubaoSign = zhifubaoSign;
	}

	public String getApp_signature() {
		return app_signature;
	}

	public String getPrepayid() {
		return prepayid;
	}

	public void setApp_signature(String app_signature) {
		this.app_signature = app_signature;
	}

	public void setPrepayid(String prepayid) {
		this.prepayid = prepayid;
	}

	public String getActivityids() {
		return activityids;
	}

	public void setActivityids(String activityids) {
		this.activityids = activityids;
	}

	public String getApp_signature2() {
		return app_signature2;
	}

	public void setApp_signature2(String app_signature2) {
		this.app_signature2 = app_signature2;
	}

	public String getNoncestr() {
		return noncestr;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setNoncestr(String noncestr) {
		this.noncestr = noncestr;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getTradeWay() {
		return tradeWay;
	}

	public void setTradeWay(Integer tradeWay) {
		this.tradeWay = tradeWay;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public String getBuyerPayId() {
		return buyerPayId;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public void setBuyerPayId(String buyerPayId) {
		this.buyerPayId = buyerPayId;
	}

	public Integer getAlarmFlag() {
		return alarmFlag;
	}

	public void setAlarmFlag(Integer alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}