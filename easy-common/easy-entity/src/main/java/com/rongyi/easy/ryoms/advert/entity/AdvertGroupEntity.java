package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AdvertGroupEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -3667769233560188201L;
	
	private Integer id;
	private String name;
	private String contract;//合同号
	private String owner;//广告主
	private Integer create_by;
	private Date create_at;
	private Integer update_by;
	private Date update_at;
	private List<AdvertEntity> advertList;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the contract
	 */
	public String getContract() {
		return contract;
	}
	/**
	 * @param contract the contract to set
	 */
	public void setContract(String contract) {
		this.contract = contract;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the create_by
	 */
	public Integer getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}
	/**
	 * @return the create_at
	 */
	public Date getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_by
	 */
	public Integer getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(Integer update_by) {
		this.update_by = update_by;
	}
	/**
	 * @return the update_at
	 */
	public Date getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	/**
	 * @return the advertList
	 */
	public List<AdvertEntity> getAdvertList() {
		return advertList;
	}
	/**
	 * @param advertList the advertList to set
	 */
	public void setAdvertList(List<AdvertEntity> advertList) {
		this.advertList = advertList;
	}
}
