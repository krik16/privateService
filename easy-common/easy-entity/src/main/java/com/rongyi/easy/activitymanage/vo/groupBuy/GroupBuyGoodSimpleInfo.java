package com.rongyi.easy.activitymanage.vo.groupBuy;

import com.rongyi.easy.util.NumberUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/***
 * 拼团活动  H5页面商品简要信息
 * @author caohongjiang
 *
 */
public class GroupBuyGoodSimpleInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2067826230803082081L;

	/***
	 * 活动id
	 */
	private int activityId;

	/***
	 * 商品id
	 * 
	 */
	private String goodId;
	
	/***
	 * 商品desc   开团说明
	 * 
	 */
	private String desc;
	
	
	/***
	 * 商品名
	 */
	private String goodName;
	
	/***
	 * 成团人数  :3人团   5 人团
	 */
	private int  groupPeopleLimit;
	/**
	 * 最大成团人数
	 */
	private Integer groupPeopleMaxLimit;

	/***
	 * 排序
	 */
	private int  level;
	
	
	
	/***
	 * 开团限制次数
	 */
	private int  openGroupLimit;
	
	
	/***
	 * 参团限制次数
	 */
	private int  joinGroupLimit;
	
	
	
	/***
	 * 商品规格列表
	 */
	private List<GoodSpecInfo> specs;
	
	
	/***
	 * 商品已参团次数,已有多少人参团，起始数字为50-200之间随机生成，活动发布成功后显示，之后按PV数累计
	 */
	private int groupedCount;

	/**
	 * 商品审核状态：待审核[0] 未通过[1] 已通过[2]
	 */
	private Integer status;
	
	private Integer groupStatus;//团状态  团状态:0等待发起人支付,1开团失败,2进行中,3成功,4人数不够自动失败,5活动下线,团失败  

	private Long goodsStartAt;//商品开始时间
	private Long goodsEndAt;//商品结束时间
	private Long groupStartAt;//团开始时间
	private Long groupEndAt;//团结束时间
	private String expectTotalAmount;//众筹价
	private boolean supModPrice;//true是，false否
	private int joinGroupNum;//参团人数
	
	
	public int getJoinGroupNum() {
		return joinGroupNum;
	}

	public void setJoinGroupNum(int joinGroupNum) {
		this.joinGroupNum = joinGroupNum;
	}

	public Long getGoodsStartAt() {
		return goodsStartAt;
	}

	public void setGoodsStartAt(Long goodsStartAt) {
		this.goodsStartAt = goodsStartAt;
	}

	public Long getGoodsEndAt() {
		return goodsEndAt;
	}

	public void setGoodsEndAt(Long goodsEndAt) {
		this.goodsEndAt = goodsEndAt;
	}

	public boolean isSupModPrice() {
		return supModPrice;
	}

	public void setSupModPrice(boolean supModPrice) {
		this.supModPrice = supModPrice;
	}

	public String getExpectTotalAmount() {
		return expectTotalAmount;
	}

	public void setExpectTotalAmount(String expectTotalAmount) {
		this.expectTotalAmount = expectTotalAmount;
	}

	public Integer getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(Integer groupStatus) {
		this.groupStatus = groupStatus;
	}

	public Long getGroupStartAt() {
		return groupStartAt;
	}

	public void setGroupStartAt(Long groupStartAt) {
		this.groupStartAt = groupStartAt;
	}

	public Long getGroupEndAt() {
		return groupEndAt;
	}

	public void setGroupEndAt(Long groupEndAt) {
		this.groupEndAt = groupEndAt;
	}

	public double getMinActivityPrice(List<GoodSpecInfo> specs) {
		Assert.notNull(specs);
		double min = specs.get(0).getGoodGroupPrice();

		for(GoodSpecInfo spec : specs) {
			min = NumberUtils.getMinData(min, spec.getGoodGroupPrice());
		}
		return min;
	}

	public int getRemainStock(List<GoodSpecInfo> specs) {
		int remainStock = 0;
		for(GoodSpecInfo spec : specs) {
			remainStock += spec.getRemainCount();
		}
		return remainStock;
	}

	public Integer getGroupPeopleMaxLimit() {
		return groupPeopleMaxLimit;
	}

	public void setGroupPeopleMaxLimit(Integer groupPeopleMaxLimit) {
		this.groupPeopleMaxLimit = groupPeopleMaxLimit;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getGroupedCount() {
		return groupedCount;
	}


	public void setGroupedCount(int groupedCount) {
		this.groupedCount = groupedCount;
	}


	public List<GoodSpecInfo> getSpecs() {
		return specs;
	}


	public void setSpecs(List<GoodSpecInfo> specs) {
		this.specs = specs;
	}


	public int getActivityId() {
		return activityId;
	}


	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}


	public String getGoodId() {
		return goodId;
	}


	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}


	public String getGoodName() {
		return goodName;
	}


	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}





	public int getGroupPeopleLimit() {
		return groupPeopleLimit;
	}


	public void setGroupPeopleLimit(int groupPeopleLimit) {
		this.groupPeopleLimit = groupPeopleLimit;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getOpenGroupLimit() {
		return openGroupLimit;
	}


	public void setOpenGroupLimit(int openGroupLimit) {
		this.openGroupLimit = openGroupLimit;
	}


	public int getJoinGroupLimit() {
		return joinGroupLimit;
	}


	public void setJoinGroupLimit(int joinGroupLimit) {
		this.joinGroupLimit = joinGroupLimit;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

}
