package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;

/**
 * 客服工单实体(DB返回的实体，增加预定义类型的转换及关联表的解析)
 * 
 * @author wangjianhua
 *
 */
public class OrderResultEntity extends OrderEntity implements Serializable {

	@Override
	public String toString() {
		return "OrderResultEntity [orderSrcString=" + orderSrcString + ", orderTypeString=" + orderTypeString
				+ ", orderStatusString=" + orderStatusString + ", orderLevelString=" + orderLevelString
				+ ", moduleString=" + moduleString + ", createBy=" + createBy + ", createAt=" + createAt + ", updateBy="
				+ updateBy + ", updateAt=" + updateAt + ", toString()=" + super.toString() + "]";
	}

	public String getOrderSrcString() {
		return orderSrcString;
	}

	public void setOrderSrcString(String orderSrcString) {
		this.orderSrcString = orderSrcString;
	}

	public String getOrderTypeString() {
		return orderTypeString;
	}

	public void setOrderTypeString(String orderTypeString) {
		this.orderTypeString = orderTypeString;
	}

	public String getOrderStatusString() {
		return orderStatusString;
	}

	public void setOrderStatusString(String orderStatusString) {
		this.orderStatusString = orderStatusString;
	}

	public String getOrderLevelString() {
		return orderLevelString;
	}

	public void setOrderLevelString(String orderLevelString) {
		this.orderLevelString = orderLevelString;
	}

	public String getModuleString() {
		return moduleString;
	}

	public void setModuleString(String moduleString) {
		this.moduleString = moduleString;
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

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -9179378565276902906L;

	// 工单来源字符串
	private String orderSrcString = "";

	// 工单类型字符串
	private String orderTypeString = "";

	// 工单状态字符串
	private String orderStatusString = "";

	// 工单等级字符串
	private String orderLevelString = "";

	// 板块 字符串
	private String moduleString = "";

	// 创建人
	private String createBy = "";
	// 创建时间
	private String createAt = "";
	// 更新人
	private String updateBy = "";
	// 更新时间
	private String updateAt = "";
}
