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
public class CallCenterOrderReportEntity implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -2854490842451042382L;
	private int id;//id
	private int year;//年
	private int month;//月
	private int day;//日
	private String account;//客服账号
	private int order_add_cnt;//新增工单数
	private int order_done_cnt;//解决工单数
	private Date create_at;//创建时间
	private Date update_at;//修改时间
	private String remark;//备注
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
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
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
	/* (非 Javadoc) 
	* <p>Title: toString</p> 
	* <p>Description: </p> 
	* @return 
	* @see java.lang.Object#toString() 
	*/
	@Override
	public String toString() {
		return "CallCenterOrderReportEntity [id=" + id + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", account=" + account + ", order_add_cnt=" + order_add_cnt + ", order_done_cnt=" + order_done_cnt
				+ ", create_at=" + create_at + ", update_at=" + update_at + ", remark=" + remark + "]";
	}
}
