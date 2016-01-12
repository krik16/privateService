package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;

/**
 * 客服工单详情实体
 * 
 * @author wangjianhua
 *
 */
public class OrderDetailEntity implements Serializable {

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "OrderDetailEntity [id=" + id + ", orderId=" + orderId + ", orderStatus=" + orderStatus
				+ ", orderStatusString=" + orderStatusString + ", content=" + content + ", createBy=" + createBy
				+ ", userId=" + userId + ", createAt=" + createAt + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4942188133837627327L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusString() {
		return orderStatusString;
	}

	public void setOrderStatusString(String orderStatusString) {
		this.orderStatusString = orderStatusString;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	// 编号
	private int id = 0;
	// 客户账户
	private int orderId = 0;

	// 工单状态
	private int orderStatus = 0;
	// 工单状态字符串
	private String orderStatusString = "";

	// 工单等级字符串
	private String content = "";

	// 创建人
	private String createBy = "";
	// 创建时间
	private String createAt = "";

	// 当前用户Id
	private int userId = 0;

}
