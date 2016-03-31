package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class MyOrderDetailVO implements Serializable{
	
	private String itemName;
	private String thumbnail;
	private Double orderPrice;
	private Integer orderNum;
	private Integer outDateFlag;
	private Integer orderDetailId;
	private List<MyOrderActivityVO> myActivityList;

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Integer getOutDateFlag() {
		return outDateFlag;
	}
	public void setOutDateFlag(Integer outDateFlag) {
		this.outDateFlag = outDateFlag;
	}
	public List<MyOrderActivityVO> getMyActivityList() {
		return myActivityList;
	}
	public void setMyActivityList(List<MyOrderActivityVO> myActivityList) {
		this.myActivityList = myActivityList;
	}
	public Integer getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

}
