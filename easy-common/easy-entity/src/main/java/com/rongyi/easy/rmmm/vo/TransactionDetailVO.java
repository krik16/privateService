package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class TransactionDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String consignee;// 收货人姓名

	private String phone;// 手机号

	private String address;// 邮寄地址

	private String provinceName;// 省名称

	private String cityName;// 市名称

	private String districtName;// 区名称

	private String commitOrderTime;// 下单时间

	private String payTime;// 付款时间

	private List<String> orderNums;// 大订单号集合

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

	public String getCommitOrderTime() {
		return commitOrderTime;
	}

	public void setCommitOrderTime(String commitOrderTime) {
		this.commitOrderTime = commitOrderTime;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public List<String> getOrderNums() {
		return orderNums;
	}

	public void setOrderNums(List<String> orderNums) {
		this.orderNums = orderNums;
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

}
