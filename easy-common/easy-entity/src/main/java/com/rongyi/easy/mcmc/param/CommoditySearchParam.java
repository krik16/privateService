package com.rongyi.easy.mcmc.param;

import java.util.Date;

import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;





public class CommoditySearchParam {
	private String categoryId;//3级分类id
	private String category;//4级分类id
	private int type;//type 0表示不考虑时间1:添加时间2上架时间 3下架时间
	@JsonDeserialize(using=DateJsonDeserializer.class)
	private Date startTime;//时间段开始
	@JsonDeserialize(using=DateJsonDeserializer.class)
	private Date endTime;//时间段结束
	private String name;//编号\商品名\商品编码
	private int status;//状态 0下架 1上架 2是删除3待上架4待处理 -1表示所有
	private int currpage;//当页数1表示第一页
	private int pageSize;//每页大小


	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCurrpage() {
		return currpage;
	}
	public void setCurrpage(int currpage) {
		this.currpage = currpage;
	}

	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
