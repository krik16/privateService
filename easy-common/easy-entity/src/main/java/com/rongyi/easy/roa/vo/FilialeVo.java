package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.shop.vo.AreaVO;
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

	//private String proId;//省id
	/*private String proName;//省名称
	private String cityId;//市id
	private String cityName;//市名称
	private String areaId;//区域id
	private String areaName;//区域名称
*/
	private List<AreaVO> areaVo;
	private int valid;//0运营中  1已停运
	private String address; //详细地址
	private List<ShopVO> shopList;
	private String telephone;//电话
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
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
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
	public List<AreaVO> getAreaVo() {
		return areaVo;
	}
	public void setAreaVo(List<AreaVO> areaVo) {
		this.areaVo = areaVo;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int valid) {
		this.valid = valid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<ShopVO> getShopList() {
		return shopList;
	}
	public void setShopList(List<ShopVO> shopList) {
		this.shopList = shopList;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "FilialeVo [id=" + id + ", name=" + name + ", manager=" + manager + ", brandId=" + brandId
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + ", brandName=" + brandName + ", areaVo="
				+ areaVo + ", valid=" + valid + ", address=" + address + ", shopList=" + shopList + ", telephone="
				+ telephone + "]";
	}
}
