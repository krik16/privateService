/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年3月3日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年3月3日               1.0              创建文件
 */
public class NodeVO implements Serializable{
	
	private String date;//节点时间
	private String node;//节点
	private boolean flag;//是否点亮
	private String nodeMessage;//
	private String nodeStatus;//节点状态  （不同详情页，状态不同，请看接口文档）
	public NodeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NodeVO(String node, boolean flag) {
		super();
		this.node = node;
		this.flag = flag;
	}
	public NodeVO(String date, String node, boolean flag, String nodeMessage, String nodeStatus) {
		super();
		this.date = date;
		this.node = node;
		this.flag = flag;
		this.nodeMessage = nodeMessage;
		this.nodeStatus = nodeStatus;
	}
	public String getNodeStatus() {
		return nodeStatus;
	}
	public void setNodeStatus(String nodeStatus) {
		this.nodeStatus = nodeStatus;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getNodeMessage() {
		return nodeMessage;
	}
	public void setNodeMessage(String nodeMessage) {
		this.nodeMessage = nodeMessage;
	}
	@Override
	public String toString() {
		return "NodeVO [date=" + date + ", node=" + node + ", flag=" + flag + ", nodeMessage=" + nodeMessage + ", nodeStatus="
				+ nodeStatus + "]";
	}

}
