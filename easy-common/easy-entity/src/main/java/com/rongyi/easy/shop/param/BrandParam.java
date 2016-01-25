package com.rongyi.easy.shop.param;

import java.io.Serializable;

/**
 * 商家后台店铺管理实体类
 * @author wzh
 *
 */
public class BrandParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;
	
	private String currpage;// （要请求页） 1表示第一页
	
	private String pageSize;// 每页数据显示数量
	
	private String name;//品牌名模糊

	public String getCurrpage() {
		return currpage;
	}

	public void setCurrpage(String currpage) {
		this.currpage = currpage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
