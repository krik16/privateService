package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

public class SubmitOrderParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ParentOrderParam> parentOrderList;

	private List<String> commodityCartIds;

	private String devId;// 设备号

	private String devType;// 设备类型（0 ios/1 android/2 wap）

	private String source;//订单来源 0为容易逛，1为微网站，2为终端机，3其他

	public List<ParentOrderParam> getParentOrderList() {
		return parentOrderList;
	}

	public void setParentOrderList(List<ParentOrderParam> parentOrderList) {
		this.parentOrderList = parentOrderList;
	}

	public List<String> getCommodityCartIds() {
		return commodityCartIds;
	}

	public void setCommodityCartIds(List<String> commodityCartIds) {
		this.commodityCartIds = commodityCartIds;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "SubmitOrderParam{" +
				"parentOrderList=" + parentOrderList +
				", commodityCartIds=" + commodityCartIds +
				", devId='" + devId + '\'' +
				", devType='" + devType + '\'' +
				", source='" + source + '\'' +
				'}';
	}
}
