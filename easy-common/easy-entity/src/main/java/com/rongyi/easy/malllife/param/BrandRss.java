package com.rongyi.easy.malllife.param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.rmmm.base.BaseParam;

 
public class BrandRss extends BaseParam implements Serializable{

	private int currentPage;
	private int pageSize;
	private int type;
	private String key;
	private String brandName;
	private String brandLogo;
	private List<Map> brandIds;
	public List<Map> getBrandIds() {
		return brandIds;
	}
	public void setBrandIds(List<Map> brandIds) {
		this.brandIds = brandIds;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandLogo() {
		return brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "BrandRss [currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", type=" + type + ", key=" + key + ", brandName="
				+ brandName + ", brandLogo=" + brandLogo + ", brandIds="
				+ brandIds + "]";
	}
 
	
 

}
