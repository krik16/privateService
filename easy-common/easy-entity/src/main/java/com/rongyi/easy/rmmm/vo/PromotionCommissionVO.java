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
 * time ：2016年3月8日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年3月8日               1.0              创建文件
 */
public class PromotionCommissionVO implements Serializable{
	
	private String label;//容易逛、摩店、首单”
	private String appName;//注册app名称：容易逛、摩店
	private String userAccount;//注册账号
	private String title;//邀请用户XXX注册成功
	private String date;//时间
	private String status;// 状态 1已发放 2处理中 3失败
	private String amount;//佣金金额
	private Integer promotionId;//”推广佣金记录id
	private List<NodeVO> nodeList;// 节点数据
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public List<NodeVO> getNodeList() {
		return nodeList;
	}
	public void setNodeList(List<NodeVO> nodeList) {
		this.nodeList = nodeList;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Integer getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(Integer promotionId) {
		this.promotionId = promotionId;
	}
	@Override
	public String toString() {
		return "PromotionCommissionVO [label=" + label + ", appName=" + appName + ", userAccount=" + userAccount + ", title="
				+ title + ", date=" + date + ", status=" + status + ", amount=" + amount + ", promotionId=" + promotionId
				+ ", nodeList=" + nodeList + "]";
	}

}
