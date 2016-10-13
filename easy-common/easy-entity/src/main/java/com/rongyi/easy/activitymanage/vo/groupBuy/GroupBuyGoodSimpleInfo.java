package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
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
	 * 商品desc
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
	





	
	
	
	
}
