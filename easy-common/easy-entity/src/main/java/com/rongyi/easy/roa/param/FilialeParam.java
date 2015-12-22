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
	//省id
	private String proId;
	private String cityId;
	private String areaId;
	//查询用区域id
	private String zoneId;
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
	 * 状态
	 */
	private Integer valid;
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
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShopIds() {
		return shopIds;
	}
	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
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
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "FilialeParam [id=" + id + ", brandMid=" + brandMid + ", name=" + name + ", manager=" + manager
				+ ", telephone=" + telephone + ", proId=" + proId + ", cityId=" + cityId + ", areaId=" + areaId
				+ ", zoneId=" + zoneId + ", address=" + address + ", shopIds=" + shopIds + ", currentPage="
				+ currentPage + ", pageSize=" + pageSize + ", valid=" + valid + "]";
	}
}
