package com.rongyi.easy.activity.entity;

import java.util.Date;
import java.util.List;

import com.rongyi.easy.activitymanage.entity.ActivityGoods;
import com.rongyi.easy.activitymanage.entity.ActivityGoodsSpec;

@SuppressWarnings("serial")
public class QueryActivityGoods {
	private String activityId;// 活动id
	private String goodsId;// 卡券/商品编码
	private int type;// 卡券/商品对应类型(0:商品,1:卡券)
	private Date joinStartAt;//参与开始时间
	private Date joinEndAt;//参与结束时间
	private String name;//名称
	private int status;//状态
	private List<String> pageRespGoodsIdList;//记入页面传来的goodsid
	private List<ActivityGoods> submitActivityGoods;//提交时列表集合
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<String> getPageRespGoodsIdList() {
		return pageRespGoodsIdList;
	}

	public void setPageRespGoodsIdList(List<String> pageRespGoodsIdList) {
		this.pageRespGoodsIdList = pageRespGoodsIdList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
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

	

	public List<ActivityGoods> getSubmitActivityGoods() {
		return submitActivityGoods;
	}

	public void setSubmitActivityGoods(
			List<ActivityGoods> submitActivityGoods) {
		this.submitActivityGoods = submitActivityGoods;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "QueryActivityGoods [activityId=" + activityId + ", goodsId="
				+ goodsId + ", type=" + type + ", joinStartAt=" + joinStartAt
				+ ", joinEndAt=" + joinEndAt + ", name=" + name
				+ ", submitActivityGoods=" + submitActivityGoods + "]";
	}


}