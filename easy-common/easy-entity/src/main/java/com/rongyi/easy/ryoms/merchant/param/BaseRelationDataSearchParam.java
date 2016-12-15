package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;

public class BaseRelationDataSearchParam implements Serializable {
	
	private static final long serialVersionUID = 6456986268364671739L;
	
	private String type;//group集团  mall商场 shop店铺
	private String name;
	private String mid;//id
	private int currentPage = 0;//当前页
	private int pageSize =0;//总页数
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
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
	@Override
	public String toString() {
		return "BaseRelationDataSearchParam [type=" + type + ", name=" + name + ", mid=" + mid + ", currentPage="
				+ currentPage + ", pageSize=" + pageSize + "]";
	}
	
}
