package com.rongyi.easy.activity.entity;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

public class ReturnActivityGoods {
	private String activityId;// 活动id
	private String goodsId;// 卡券或商品id
	private int type;// 卡券或商品类型
	private String name;// 卡券或商品名称
	private int currCount;// 现有库存
	private int stockCount;// 活动库存
	private int currPrice;// 现价
	private int activityPrice;// 活动价
	private String picUrl;// 图片
	private Date joinStartAt;// 参与开始时间
	private Date joinEndAt;// 参与结束时间
	private List<ObjectId> specList;// 商品规格列表
	public Date getJoinStartAt() {
		return joinStartAt;
	}

	public void setJoinStartAt(Date joinStartAt) {
		this.joinStartAt = joinStartAt;
	}

	public Date getJoinEndAt() {
		return joinEndAt;
	}

	public void setJoinEndAt(Date joinEndAt) {
		this.joinEndAt = joinEndAt;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<ObjectId> getSpecList() {
		return specList;
	}

	public void setSpecList(List<ObjectId> specList) {
		this.specList = specList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrCount() {
		return currCount;
	}

	public void setCurrCount(int currCount) {
		this.currCount = currCount;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public int getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(int currPrice) {
		this.currPrice = currPrice;
	}

	public int getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(int activityPrice) {
		this.activityPrice = activityPrice;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
}
