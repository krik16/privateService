package com.rongyi.easy.malllife.param;

import java.io.Serializable;

public class PaySuccessVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orderId;//订单id
	private String sonOrderId;//子订单id
	private String unitPrice;//单价
	private String num;//下单数量
	private String commodityName;//商品名称
	private String commodityId;//商品id
	private String totalPrice;//总价
	private String shopName;// 店铺名称
	private String consignee;// 收件人姓名
	private String phone;// 收件人电话
	private String address;// 邮寄地址
	private String orderNum;// 订单编号
	private String expressBillId;// 物流单号ID
	private String payTime;// 付款时间
	private String commitOrderTime;// 提交订单时间
	private String integral;//交易完成后获得的积分
	private String provinceName;// 省名称
	private String cityName;// 市名称
	private String districtName;// 区名称
	private Integer activityId;// 拼团活动id
	private Integer activityType;// 0不参与，3秒杀，4拼团,
	private Long activityRoundId;// 团编号
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public Integer getActivityType() {
		return activityType;
	}
	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}
	public Long getActivityRoundId() {
		return activityRoundId;
	}
	public void setActivityRoundId(Long activityRoundId) {
		this.activityRoundId = activityRoundId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSonOrderId() {
		return sonOrderId;
	}
	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getExpressBillId() {
		return expressBillId;
	}
	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
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
	public String getIntegral() {
		return integral;
	}
	public void setIntegral(String integral) {
		this.integral = integral;
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
	@Override
	public String toString() {
		return "PaySuccessVO [orderId=" + orderId + ", sonOrderId="
				+ sonOrderId + ", unitPrice=" + unitPrice + ", num=" + num
				+ ", commodityName=" + commodityName + ", commodityId="
				+ commodityId + ", totalPrice=" + totalPrice + ", shopName="
				+ shopName + ", consignee=" + consignee + ", phone=" + phone
				+ ", address=" + address + ", orderNum=" + orderNum
				+ ", expressBillId=" + expressBillId + ", payTime=" + payTime
				+ ", commitOrderTime=" + commitOrderTime + ", integral="
				+ integral + ", provinceName=" + provinceName + ", cityName="
				+ cityName + ", districtName=" + districtName 
				+ ", activityId=" + activityId 
				+ ", activityRoundId=" + activityRoundId 
				+ ", activityType=" + activityType 
				+ "]";
	}
	
}
