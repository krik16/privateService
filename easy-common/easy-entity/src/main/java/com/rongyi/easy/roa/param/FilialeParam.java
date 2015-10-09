package com.rongyi.easy.roa.param;

import java.io.Serializable;

/**
 * 分公司查询参数
 * @author kenny
 *
 */
public class FilialeParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;

	private String id;
	private String brandMid;
	private String name;
	private Integer currentPage;
	private Integer pageSize;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrandMid() {
		return brandMid;
	}
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
