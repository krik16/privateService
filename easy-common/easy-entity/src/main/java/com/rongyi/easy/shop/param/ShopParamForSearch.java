package com.rongyi.easy.shop.param;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;


/**
 * 商家后台店铺列表查询参数类
 * 
 * @author wzh
 *
 */
public class ShopParamForSearch {

	private Integer shopType;// 店铺类型 0普通店 1免税店 2专柜 3折扣店 4旗舰店-1表示所有
	
	private Integer shopNature;// 店铺性质 0商场店铺 1商场专柜 2街边店-1表示所有
	
	private Integer status;//0正常营业 1即将营业 2暂停营业3待处理-1表示所有    运营平台 0正常  1系统下架-1表示所有
	
	@JsonDeserialize(using=DateJsonDeserializer.class)
	private Date updateTime;//最后修改时间
	
	private String name;//编号或者店铺名称
	
	private String zoneId;//地区id
	
	private Integer currpage;//当前页1表示第一页
	
	private Integer pageSize;//每页大小
	
	public Integer getShopType() {
		return shopType;
	}

	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}

	public Integer getShopNature() {
		return shopNature;
	}

	public void setShopNature(Integer shopNature) {
		this.shopNature = shopNature;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCurrpage() {
		return currpage;
	}

	public void setCurrpage(Integer currpage) {
		this.currpage = currpage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	
	
}
