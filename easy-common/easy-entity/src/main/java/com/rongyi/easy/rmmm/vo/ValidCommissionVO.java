/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年3月7日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年3月7日               1.0              创建文件
 */
public class ValidCommissionVO implements Serializable{
	
	private BigDecimal amount;//佣金
	private String code;//券码
	private String orderNum;//订单号
	private String status;//状态  1已发放 2处理中 3失败
	private List<NodeVO> nodeList;// 节点数据
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<NodeVO> getNodeList() {
		return nodeList;
	}
	public void setNodeList(List<NodeVO> nodeList) {
		this.nodeList = nodeList;
	}
	@Override
	public String toString() {
		return "ValidCommissionVO [amount=" + amount + ", code=" + code + ", orderNum=" + orderNum + ", status=" + status
				+ ", nodeList=" + nodeList + "]";
	}

}
