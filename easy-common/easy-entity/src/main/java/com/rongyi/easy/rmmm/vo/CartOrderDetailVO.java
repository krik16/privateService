package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CartOrderDetailVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ParentOrderVO> orderList;//中订单详情列表

	private BigDecimal rebateDiscount = BigDecimal.valueOf(0.0);// 抵扣券金额

	private String rebateName;// 抵扣券名称

	private BigDecimal scoreDiscount = BigDecimal.valueOf(0.0);// 积分抵扣金额

	private Integer score = 0;// 使用积分

	private BigDecimal realAmount  = BigDecimal.valueOf(0.0);// 总价

	private BigDecimal payAmount = BigDecimal.valueOf(0.0);// 应付价
	
	
	private String orderNum;// 订单编号
	private String consignee;// 收件人姓名
	private String phone;// 收件人电话
	private String address;// 邮寄地址
	private String provinceName;// 省名称
	private String cityName;// 市名称
	private String districtName;// 区名称
	private BigDecimal commodityTotalPostage  = BigDecimal.valueOf(0.0);// 合计运费
	private String receiveTime;// 确认收货时间
	private String cancelTime;// 卖家取消订单时间
	private String closeTime;// 订单关闭时间
	private String payTime;// 付款时间
	private String commitOrderTime;// 提交订单时间
	private String deliverTime;// 发货时间
	private String nextStatusTime;// 预计进入下一状态的时间
	private String expressBillId;// 物流单号ID
	private String expressName;// 物流名称
	private String orderStatus;// 购物车订单状态  1未支付 2已支付 3超时关闭 4买家关闭 5失效
	private String isComment = "-1";// 是否评价  -1:表示不可以评价 0：表示未评价 1：表示已评价	
	private boolean ifDeleteOrder = false;//true表示可以删除订单 false
	private BigDecimal totalHongBaoAmount  = BigDecimal.valueOf(0.0);//红包合计抵现
    private Integer changePriceFlag = 0;//0没有再次改价1表示有商家再次修改价格 2改价影响了抵扣券
	private String message;
	private String parentOrderStatus;// 父订单状态 1未付款 2待发货 3已发货 4确认收货 5已关闭
	private Integer totalCommodityNum = 0;//订单sku数量
	private String orderId;// 订单id
	private String receiveType = "1";// 收货方式 0快递 1无需快递
	private String commentTime;// 评价时间
	private String expressOrderInfoId;// 物流信息主键id
	private boolean ifSupportByKuaidi100;// true快递100支持 false不支持
	private String newContextByKuaidi100;// 当前最新推送的一条物流信息
	private String newTimeByKuaidi100;// 当前最新推送的一条物流信息的时间

	public String getExpressOrderInfoId() {
		return expressOrderInfoId;
	}

	public void setExpressOrderInfoId(String expressOrderInfoId) {
		this.expressOrderInfoId = expressOrderInfoId;
	}

	public boolean isIfSupportByKuaidi100() {
		return ifSupportByKuaidi100;
	}

	public void setIfSupportByKuaidi100(boolean ifSupportByKuaidi100) {
		this.ifSupportByKuaidi100 = ifSupportByKuaidi100;
	}

	public String getNewContextByKuaidi100() {
		return newContextByKuaidi100;
	}

	public void setNewContextByKuaidi100(String newContextByKuaidi100) {
		this.newContextByKuaidi100 = newContextByKuaidi100;
	}

	public String getNewTimeByKuaidi100() {
		return newTimeByKuaidi100;
	}

	public void setNewTimeByKuaidi100(String newTimeByKuaidi100) {
		this.newTimeByKuaidi100 = newTimeByKuaidi100;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	public String getReceiveType() {
		return receiveType;
	}

	public void setReceiveType(String receiveType) {
		this.receiveType = receiveType;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getTotalCommodityNum() {
		return totalCommodityNum;
	}

	public void setTotalCommodityNum(Integer totalCommodityNum) {
		this.totalCommodityNum = totalCommodityNum;
	}

	public String getParentOrderStatus() {
		return parentOrderStatus;
	}

	public void setParentOrderStatus(String parentOrderStatus) {
		this.parentOrderStatus = parentOrderStatus;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public BigDecimal getCommodityTotalPostage() {
		return commodityTotalPostage;
	}

	public void setCommodityTotalPostage(BigDecimal commodityTotalPostage) {
		this.commodityTotalPostage = commodityTotalPostage;
	}

	public String getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getCommitOrderTime() {
		return commitOrderTime;
	}

	public void setCommitOrderTime(String commitOrderTime) {
		this.commitOrderTime = commitOrderTime;
	}

	public String getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	public String getNextStatusTime() {
		return nextStatusTime;
	}

	public void setNextStatusTime(String nextStatusTime) {
		this.nextStatusTime = nextStatusTime;
	}

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getIsComment() {
		return isComment;
	}

	public void setIsComment(String isComment) {
		this.isComment = isComment;
	}

	public boolean isIfDeleteOrder() {
		return ifDeleteOrder;
	}

	public void setIfDeleteOrder(boolean ifDeleteOrder) {
		this.ifDeleteOrder = ifDeleteOrder;
	}

	public BigDecimal getTotalHongBaoAmount() {
		return totalHongBaoAmount;
	}

	public void setTotalHongBaoAmount(BigDecimal totalHongBaoAmount) {
		this.totalHongBaoAmount = totalHongBaoAmount;
	}

	public Integer getChangePriceFlag() {
		return changePriceFlag;
	}

	public void setChangePriceFlag(Integer changePriceFlag) {
		this.changePriceFlag = changePriceFlag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ParentOrderVO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<ParentOrderVO> orderList) {
		this.orderList = orderList;
	}

	public BigDecimal getRebateDiscount() {
		return rebateDiscount;
	}

	public void setRebateDiscount(BigDecimal rebateDiscount) {
		this.rebateDiscount = rebateDiscount;
	}

	public String getRebateName() {
		return rebateName;
	}

	public void setRebateName(String rebateName) {
		this.rebateName = rebateName;
	}

	public BigDecimal getScoreDiscount() {
		return scoreDiscount;
	}

	public void setScoreDiscount(BigDecimal scoreDiscount) {
		this.scoreDiscount = scoreDiscount;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public BigDecimal getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	@Override
	public String toString() {
		return "CartOrderDetailVO{" +
				"parentOrderList=" + orderList +
				", rebateDiscount='" + rebateDiscount + '\'' +
				", rebateName='" + rebateName + '\'' +
				", scoreDiscount='" + scoreDiscount + '\'' +
				", score='" + score + '\'' +
				", realAmount='" + realAmount + '\'' +
				", payAmount='" + payAmount + '\'' +
				'}';
	}
}
