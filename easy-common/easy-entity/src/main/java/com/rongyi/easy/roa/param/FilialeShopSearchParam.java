package com.rongyi.easy.roa.param;

import java.io.Serializable;

/**
 * 
* @ClassName: FilialeShopSearchParam 
* @Description: 分公司查询店铺参数
* @author shaozhou 
* @date 2015年12月14日 下午2:57:08
 */
public class FilialeShopSearchParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;
	/**
	 * id
	 */
	private String id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 区域id
	 */
	private String zoneId;
	/**
	 * 当前页
	 */
	private Integer currentPage;
	/**
	 * 每页个数
	 */
	private Integer pageSize;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
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
}
