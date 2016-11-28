package com.rongyi.easy.rmmm.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
import net.sf.json.JSONObject;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

public class SubmitOrderParam extends MalllifeBaseParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ParentOrderParam> parentOrderList;
	private List<String> commodityCartIds;
	private String devId;// 设备号
	private String devType;// 设备类型（0 ios/1 android/2 wap）
	private String source;//订单来源 0为微商城,微信，1为APP，2为终端机，3其他
	private String platformRebateCode;//购物车抵扣券码
	private JSONObject discountInfo;// {“score”:”使用积分”} 购物车使用积分
	private Boolean ifCart = true;//是否购物车订单
	private String weixinAppId;//微信标准版支付appid
	private String orderChannel;//下单渠道
	private String openId;//微信openId
	private String phone;//用户手机号
	private String memberId;//微信电子会员id
	private String receiverProvinceName;//收货省市
	private String receiverCityName;//收货城市
	private String receiverDistrictName;//收货区县
	private String receiverAddress;//收货地址
	private String receiverPhone;//收货人手机
	private String receiverName;//收货人姓名
	private String provinceId;//收货省市id
	private String cityId;//收货城市id
	private String districtId;//收货区县id
	private Integer business;//订单类型（0普通、1积分商城）
	//=======start= add by wangjh7 at 2016-11-23
	private Integer commodityType; //商品类型，0：普通商品 1：商品类礼品券 2：卡券类礼品券 3：停车券
	private Integer userType; // 用户类型（0：容易逛 1：电子会员）
	private Integer exchangeType; // 兑换类型（1：兑换 2：换购）
	private Integer deliveryType; // 快递方式 1：自提 2：快递"
	private Integer totalCredit; // 总积分
	private String mallMid; // 商场ID
	private String shopMid; // 店铺ID
	// =======end=

	public List<ParentOrderParam> getParentOrderList() {
		return parentOrderList;
	}

	public void setParentOrderList(List<ParentOrderParam> parentOrderList) {
		this.parentOrderList = parentOrderList;
	}

	public List<String> getCommodityCartIds() {
		return commodityCartIds;
	}

	public void setCommodityCartIds(List<String> commodityCartIds) {
		this.commodityCartIds = commodityCartIds;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPlatformRebateCode() {
		return platformRebateCode;
	}

	public void setPlatformRebateCode(String platformRebateCode) {
		this.platformRebateCode = platformRebateCode;
	}

	public JSONObject getDiscountInfo() {
		return discountInfo;
	}

	public void setDiscountInfo(JSONObject discountInfo) {
		this.discountInfo = discountInfo;
	}

	public Boolean getIfCart() {
		return ifCart;
	}

	public void setIfCart(Boolean ifCart) {
		this.ifCart = ifCart;
	}

	public String getWeixinAppId() {
		return weixinAppId;
	}

	public void setWeixinAppId(String weixinAppId) {
		this.weixinAppId = weixinAppId;
	}

	public String getOrderChannel() {
		return orderChannel;
	}

	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getReceiverProvinceName()
	{
		return receiverProvinceName;
	}

	public void setReceiverProvinceName(String receiverProvinceName)
	{
		this.receiverProvinceName = receiverProvinceName;
	}

	public String getReceiverCityName()
	{
		return receiverCityName;
	}

	public void setReceiverCityName(String receiverCityName)
	{
		this.receiverCityName = receiverCityName;
	}

	public String getReceiverDistrictName()
	{
		return receiverDistrictName;
	}

	public void setReceiverDistrictName(String receiverDistrictName)
	{
		this.receiverDistrictName = receiverDistrictName;
	}

	public String getReceiverAddress()
	{
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress)
	{
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverPhone()
	{
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone)
	{
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverName()
	{
		return receiverName;
	}

	public void setReceiverName(String receiverName)
	{
		this.receiverName = receiverName;
	}

	public String getProvinceId()
	{
		return provinceId;
	}

	public void setProvinceId(String provinceId)
	{
		this.provinceId = provinceId;
	}

	public String getCityId()
	{
		return cityId;
	}

	public void setCityId(String cityId)
	{
		this.cityId = cityId;
	}

	public String getDistrictId()
	{
		return districtId;
	}

	public void setDistrictId(String districtId)
	{
		this.districtId = districtId;
	}

	public Integer getBusiness() {
		return business;
	}

	public void setBusiness(Integer business) {
		this.business = business;
	}

	public Integer getCommodityType() {
		return commodityType;
	}

	public void setCommodityType(Integer commodityType) {
		this.commodityType = commodityType;
	}

	public Integer getExchangeType() {
		return exchangeType;
	}

	public void setExchangeType(Integer exchangeType) {
		this.exchangeType = exchangeType;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Integer getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
	
}
