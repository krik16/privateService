package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: CallCenterOrderEntity 
* @Description:工单实体
* @author shaozhou 
* @date 2016年1月11日 上午10:36:05
 */
public class CallCenterOrderEntity implements Serializable{
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -7576964220951626875L;
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 客户账户
	 */
	private String customer_code;
	/**
	 * 客户电话
	 */
	private String customer_tel;
	/**
	 * 工单来源
	 */
	private int order_src;
	/**
	 * 工单类型
	 */
	private int order_type;
	/**
	 * 工单状态
	 */
	private int order_status;
	/**
	 * 工单优先级
	 */
	private int order_level;
	/**
	 * 问题标题
	 */
	private String title;
	/**
	 * 发生板块
	 */
	private int category_id;
	/**
	 * 创建人账号
	 */
	private String create_by;
	/**
	 * 创建时间
	 */
	private Date create_at;
	/**
	 * 更新人账号
	 */
	private String update_by;
	/**
	 * 更新时间
	 */
	private Date update_at;
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
	 * @return the customer_code
	 */
	public String getCustomer_code() {
		return customer_code;
	}
	/**
	 * @param customer_code the customer_code to set
	 */
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	/**
	 * @return the customer_tel
	 */
	public String getCustomer_tel() {
		return customer_tel;
	}
	/**
	 * @param customer_tel the customer_tel to set
	 */
	public void setCustomer_tel(String customer_tel) {
		this.customer_tel = customer_tel;
	}
	/**
	 * @return the order_src
	 */
	public int getOrder_src() {
		return order_src;
	}
	/**
	 * @param order_src the order_src to set
	 */
	public void setOrder_src(int order_src) {
		this.order_src = order_src;
	}
	/**
	 * @return the order_type
	 */
	public int getOrder_type() {
		return order_type;
	}
	/**
	 * @param order_type the order_type to set
	 */
	public void setOrder_type(int order_type) {
		this.order_type = order_type;
	}
	/**
	 * @return the order_status
	 */
	public int getOrder_status() {
		return order_status;
	}
	/**
	 * @param order_status the order_status to set
	 */
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	/**
	 * @return the order_level
	 */
	public int getOrder_level() {
		return order_level;
	}
	/**
	 * @param order_level the order_level to set
	 */
	public void setOrder_level(int order_level) {
		this.order_level = order_level;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	/**
	 * @return the create_by
	 */
	public String getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
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
	 * @return the update_by
	 */
	public String getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
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
	/* (非 Javadoc) 
	* <p>Title: toString</p> 
	* <p>Description: </p> 
	* @return 
	* @see java.lang.Object#toString() 
	*/
	@Override
	public String toString() {
		return "CallCenterOrderEntity [id=" + id + ", customer_code=" + customer_code + ", customer_tel=" + customer_tel
				+ ", order_src=" + order_src + ", order_type=" + order_type + ", order_status=" + order_status
				+ ", order_level=" + order_level + ", title=" + title + ", category_id=" + category_id + ", create_by="
				+ create_by + ", create_at=" + create_at + ", update_by=" + update_by + ", update_at=" + update_at
				+ "]";
	}
}
