package com.rongyi.easy.roa.param;

import java.io.Serializable;

/**
 * 分公司查询参数
 * @author kenny
 *
 */
public class FilialeParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;
	/**
	 * id
	 */
	private String id;
	/**
	 * 关联品牌id
	 */
	private String brandMid;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 负责人
	 */
	private String manager;
	/**
	 * 联系电话
	 */
	private String telephone;
	/**
	 * 省id
	 */
	private String proId;
	/**
	 * 市id
	 */
	private String cityId;
	/**
	 * 区域id
	 */
	private String areaId;
	/**
	 * 详细地址
	 */
	private String address;
	/**
	 * 关联店铺ids
	 */
	private String shopIds;
	/**
	 * 当前页
	 */
	private Integer currentPage;
	/**
	 * 每页个数
	 */
	private Integer pageSize;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the brandMid
	 */
	public String getBrandMid() {
		return brandMid;
	}
	/**
	 * @param brandMid the brandMid to set
	 */
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the proId
	 */
	public String getProId() {
		return proId;
	}
	/**
	 * @param proId the proId to set
	 */
	public void setProId(String proId) {
		this.proId = proId;
	}
	/**
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * @return the areaId
	 */
	public String getAreaId() {
		return areaId;
	}
	/**
	 * @param areaId the areaId to set
	 */
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the shopIds
	 */
	public String getShopIds() {
		return shopIds;
	}
	/**
	 * @param shopIds the shopIds to set
	 */
	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}
	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
