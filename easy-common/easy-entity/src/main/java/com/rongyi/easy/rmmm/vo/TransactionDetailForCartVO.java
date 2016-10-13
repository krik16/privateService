/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年1月6日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年1月6日               1.0              创建文件
 */
public class TransactionDetailForCartVO implements Serializable{
	
	private List<TransactionDetailVO> transactionDetail;
	
	private String consignee;// 收货人姓名

	private String phone;// 手机号

	private String address;// 邮寄地址

	private String provinceName;// 省名称

	private String cityName;// 市名称

	private String districtName;// 区名称

	private String commitOrderTime;// 下单时间

	private String payTime;// 付款时间
	
	private String integral;//积分
	
	private String easyMoney;//容颜币

	private List<String> orderNums;// 大订单号集合
	
	/** 返回的信息 */
	private String msg;
	/** 错误编码 0成功 1失败 */
	private Integer errno;
	/** 翻牌购拼接的url */
	private String url;

	public String getEasyMoney() {
		return easyMoney;
	}

	public void setEasyMoney(String easyMoney) {
		this.easyMoney = easyMoney;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getErrno() {
		return errno;
	}

	public void setErrno(Integer errno) {
		this.errno = errno;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<TransactionDetailVO> getTransactionDetail() {
		return transactionDetail;
	}

	public void setTransactionDetail(List<TransactionDetailVO> transactionDetail) {
		this.transactionDetail = transactionDetail;
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

	@Override
	public String toString() {
		return "TransactionDetailForCartVO [transactionDetail=" + transactionDetail + ", consignee=" + consignee + ", phone="
				+ phone + ", address=" + address + ", provinceName=" + provinceName + ", cityName=" + cityName
				+ ", districtName=" + districtName + ", commitOrderTime=" + commitOrderTime + ", payTime=" + payTime
				+ ", integral=" + integral + ", easyMoney=" + easyMoney +", orderNums=" + orderNums + ", msg=" + msg + ", errno=" + errno + 
				", url=" + url + "]";
	}

}
