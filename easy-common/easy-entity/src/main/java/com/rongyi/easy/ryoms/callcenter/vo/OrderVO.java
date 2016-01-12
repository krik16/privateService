package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.ryoms.callcenter.entity.OrderDetailEntity;

/**
 * 客服工单实体（返回参数）
 * 
 * @author wangjianhua
 *
 */
public class OrderVO implements Serializable {

	@Override
	public String toString() {
		return "OrderVO [id=" + id + ", customerCode=" + customerCode + ", customerTel=" + customerTel + ", orderSrc="
				+ orderSrc + ", orderSrcString=" + orderSrcString + ", orderType=" + orderType + ", orderTypeString="
				+ orderTypeString + ", orderStatus=" + orderStatus + ", orderStatusString=" + orderStatusString
				+ ", orderLevel=" + orderLevel + ", orderLevelString=" + orderLevelString + ", title=" + title
				+ ", moduleId=" + moduleId + ", moduleString=" + moduleString + ", createBy=" + createBy + ", createAt="
				+ createAt + ", updateBy=" + updateBy + ", updateAt=" + updateAt + ", replyCnt=" + replyCnt
				+ ", replyList=" + replyList + "]";
	}

	public String getCreateBy() {
		return createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1514982413532586884L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerTel() {
		return customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public int getOrderSrc() {
		return orderSrc;
	}

	public void setOrderSrc(int orderSrc) {
		this.orderSrc = orderSrc;
	}

	public String getOrderSrcString() {
		return orderSrcString;
	}

	public void setOrderSrcString(String orderSrcString) {
		this.orderSrcString = orderSrcString;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public String getOrderTypeString() {
		return orderTypeString;
	}

	public void setOrderTypeString(String orderTypeString) {
		this.orderTypeString = orderTypeString;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderStatusString() {
		return orderStatusString;
	}

	public void setOrderStatusString(int orderStatusString) {
		this.orderStatusString = orderStatusString;
	}

	public int getOrderLevel() {
		return orderLevel;
	}

	public void setOrderLevel(int orderLevel) {
		this.orderLevel = orderLevel;
	}

	public String getOrderLevelString() {
		return orderLevelString;
	}

	public void setOrderLevelString(String orderLevelString) {
		this.orderLevelString = orderLevelString;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleString() {
		return moduleString;
	}

	public void setModuleString(String moduleString) {
		this.moduleString = moduleString;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	public List<OrderDetailEntity> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<OrderDetailEntity> replyList) {
		this.replyList = replyList;
	}

	// 编号
	private int id = 0;
	// 客户账户
	private String customerCode = "";
	// 客户电话
	private String customerTel = "";

	// 工单来源
	private int orderSrc = 0;
	// 工单来源字符串
	private String orderSrcString = "";

	// 工单类型
	private int orderType = 0;
	// 工单类型字符串
	private String orderTypeString = "";

	// 工单状态
	private int orderStatus = 0;
	// 工单状态字符串
	private int orderStatusString = 0;

	// 工单等级
	private int orderLevel = 0;
	// 工单等级字符串
	private String orderLevelString = "";
	// 标题
	private String title = "";
	// 板块
	private int moduleId = 0;
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

	// 回复数
	private int replyCnt = 0;

	// 回复列表
	private List<OrderDetailEntity> replyList = null;

}
