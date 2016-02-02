package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;

public class OrderReportVo implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -4113837520237262313L;
	private String orderTime;//工单时间
	private int userCount;//客服数量
	private int orderAddCount;//新增工单数量
	private int orderDoneCount;//解决工单数量
	private String averageCount;//平均解决工单数量
	private int year;
	private int month;
	private int day;
	private int week;
	/**
	 * @return the orderTime
	 */
	public String getOrderTime() {
		return orderTime;
	}
	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	/**
	 * @return the userCount
	 */
	public int getUserCount() {
		return userCount;
	}
	/**
	 * @param userCount the userCount to set
	 */
	public void setUserCount(int userCount) {
		this.userCount = userCount;
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
	 * @return the averageCount
	 */
	public String getAverageCount() {
		return averageCount;
	}
	/**
	 * @param averageCount the averageCount to set
	 */
	public void setAverageCount(String averageCount) {
		this.averageCount = averageCount;
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
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年1月14日 下午5:51:31
	* @throws 
	*/
	@Override
	public String toString() {
		return "OrderReportVo [orderTime=" + orderTime + ", userCount=" + userCount + ", orderAddCount=" + orderAddCount
				+ ", orderDoneCount=" + orderDoneCount + ", averageCount=" + averageCount + ", year=" + year
				+ ", month=" + month + ", day=" + day + ", week=" + week + "]";
	}
}
