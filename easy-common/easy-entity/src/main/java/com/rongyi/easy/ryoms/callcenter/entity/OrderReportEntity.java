package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: CallCenterOrderReportEntity 
* @Description: 工单报表实体
* @author shaozhou 
* @date 2016年1月11日 上午10:42:33
 */
public class OrderReportEntity implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -2854490842451042382L;
	private int id;//id
	private int year;//年
	private int month;//月
	private int day;//日
	private int user_id;//客服账号
	private int order_add_cnt;//新增工单数
	private int order_done_cnt;//解决工单数
	private Date create_at;//创建时间
	private Date update_at;//修改时间
	private String remark;//备注
	private int user_count;//客服数量
	private int week;//周
	private int dayTime;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the order_add_cnt
	 */
	public int getOrder_add_cnt() {
		return order_add_cnt;
	}
	/**
	 * @param order_add_cnt the order_add_cnt to set
	 */
	public void setOrder_add_cnt(int order_add_cnt) {
		this.order_add_cnt = order_add_cnt;
	}
	/**
	 * @return the order_done_cnt
	 */
	public int getOrder_done_cnt() {
		return order_done_cnt;
	}
	/**
	 * @param order_done_cnt the order_done_cnt to set
	 */
	public void setOrder_done_cnt(int order_done_cnt) {
		this.order_done_cnt = order_done_cnt;
	}
	/**
	 * @return the create_at
	 */
	public Date getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_at
	 */
	public Date getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the user_count
	 */
	public int getUser_count() {
		return user_count;
	}
	/**
	 * @param user_count the user_count to set
	 */
	public void setUser_count(int user_count) {
		this.user_count = user_count;
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
	 * @return the dayTime
	 */
	public int getDayTime() {
		return dayTime;
	}
	/**
	 * @param dayTime the dayTime to set
	 */
	public void setDayTime(int dayTime) {
		this.dayTime = dayTime;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年1月18日 上午11:15:37
	* @throws 
	*/
	@Override
	public String toString() {
		return "OrderReportEntity [id=" + id + ", year=" + year + ", month=" + month + ", day=" + day + ", user_id="
				+ user_id + ", order_add_cnt=" + order_add_cnt + ", order_done_cnt=" + order_done_cnt + ", create_at="
				+ create_at + ", update_at=" + update_at + ", remark=" + remark + ", user_count=" + user_count
				+ ", week=" + week + ", dayTime=" + dayTime + "]";
	}
}
