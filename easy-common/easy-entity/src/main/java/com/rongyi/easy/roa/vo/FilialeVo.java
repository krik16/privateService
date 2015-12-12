package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.rongyi.easy.shop.vo.ShopVO;

public class FilialeVo implements Serializable{
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 3867267911089519944L;

	private String id;     
	
	private String name;     //分公司名称
	
	private String manager;  //管理者
	
	private String brandId;   //关联品牌ID
	
	private Date createAt;
	
	private Date updateAt;
	
	private String brandName; //关联品牌名称
	
	private String proId;//省id
	private String proName;//省名称
	private String cityId;//市id
	private String cityName;//市名称
	private String areaId;//区域id
	private String areaName;//区域名称
	private int valid;//0运营中  1已停运
	private String address; //详细地址 
	private List<ShopVO> shopList;


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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	 * @return the proName
	 */
	public String getProName() {
		return proName;
	}

	/**
	 * @param proName the proName to set
	 */
	public void setProName(String proName) {
		this.proName = proName;
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
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @return the valid
	 */
	public int getValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(int valid) {
		this.valid = valid;
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
	 * @return the shopList
	 */
	public List<ShopVO> getShopList() {
		return shopList;
	}
	/**
	 * @param shopList the shopList to set
	 */
	public void setShopList(List<ShopVO> shopList) {
		this.shopList = shopList;
	}
}
