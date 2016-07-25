package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class HappyLifeParam   extends MalllifeBaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer currentPage; //当前页数
	
    private Integer pageSize;//每页显示数
	
	private String cityId;//城市id
	
	private Integer type;//0全部，1附近，2吃喝，3玩乐
	
	private String mallId;//商场id
	
	private String shopId;//店铺id

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "HappyLifeParam [currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", cityId=" + cityId + ", type=" + type
				+ ", mallId=" + mallId + ", shopId=" + shopId + "]";
	}
	
}
