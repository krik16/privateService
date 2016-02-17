package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;

public class UserOrderReportVo implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -4113837520237262313L;
	private String orderDate;//工单时间
	private int orderAddCount;//新增工单数量
	private int orderDoneCount;//解决工单数量
	private int year;//年
	private int month;//月
	private int day;//日
	private int week;//星期
	private String userName;//客服姓名
	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the orderAddCount
	 */
	public int getOrderAddCount() {
		return orderAddCount;
	}
	/**
	 * @param orderAddCount the orderAddCount to set
	 */
	public void setOrderAddCount(int orderAddCount) {
		this.orderAddCount = orderAddCount;
	}
	/**
	 * @return the orderDoneCount
	 */
	public int getOrderDoneCount() {
		return orderDoneCount;
	}
	/**
	 * @param orderDoneCount the orderDoneCount to set
	 */
	public void setOrderDoneCount(int orderDoneCount) {
		this.orderDoneCount = orderDoneCount;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the week
	 */
	public int getWeek() {
		return week;
	}
	/**
	 * @param week the week to set
	 */
	public void setWeek(int week) {
		this.week = week;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年1月14日 下午5:52:11
	* @throws 
	*/
	@Override
	public String toString() {
		return "UserOrderReportVo [orderDate=" + orderDate + ", orderAddCount=" + orderAddCount + ", orderDoneCount="
				+ orderDoneCount + ", year=" + year + ", month=" + month + ", day=" + day + ", week=" + week
				+ ", userName=" + userName + "]";
	}
}
