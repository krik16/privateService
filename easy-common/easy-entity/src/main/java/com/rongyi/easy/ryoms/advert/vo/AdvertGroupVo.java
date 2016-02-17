package com.rongyi.easy.ryoms.advert.vo;

import java.util.List;

public class AdvertGroupVo {
	private Long id;
	private String name;
	private String contract;
	private String owner;
	private Long create_by;
	private Long create_at;
	private Long update_by;
	private Long update_at;
	private Integer waitCheckCount;//待审核数量
	private Integer disAgreeCount;//未通过数量
	private Integer waitPublishCount;//待发布数量
	private Integer processingCount;//进行中数量
	private Integer endCount;//已结束数量
	private Integer offlineCount;//已下线数量
	private Integer deleteCount;//已删除数量
	private List<AdvertVo> advertVos;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the create_at
	 */
	public Long getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_at
	 */
	public Long getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
	}
	/**
	 * @return the waitCheckCount
	 */
	public Integer getWaitCheckCount() {
		return waitCheckCount;
	}
	/**
	 * @param waitCheckCount the waitCheckCount to set
	 */
	public void setWaitCheckCount(Integer waitCheckCount) {
		this.waitCheckCount = waitCheckCount;
	}
	/**
	 * @return the disAgreeCount
	 */
	public Integer getDisAgreeCount() {
		return disAgreeCount;
	}
	/**
	 * @param disAgreeCount the disAgreeCount to set
	 */
	public void setDisAgreeCount(Integer disAgreeCount) {
		this.disAgreeCount = disAgreeCount;
	}
	/**
	 * @return the waitPublishCount
	 */
	public Integer getWaitPublishCount() {
		return waitPublishCount;
	}
	/**
	 * @param waitPublishCount the waitPublishCount to set
	 */
	public void setWaitPublishCount(Integer waitPublishCount) {
		this.waitPublishCount = waitPublishCount;
	}
	/**
	 * @return the processingCount
	 */
	public Integer getProcessingCount() {
		return processingCount;
	}
	/**
	 * @param processingCount the processingCount to set
	 */
	public void setProcessingCount(Integer processingCount) {
		this.processingCount = processingCount;
	}
	/**
	 * @return the endCount
	 */
	public Integer getEndCount() {
		return endCount;
	}
	/**
	 * @param endCount the endCount to set
	 */
	public void setEndCount(Integer endCount) {
		this.endCount = endCount;
	}
	/**
	 * @return the offlineCount
	 */
	public Integer getOfflineCount() {
		return offlineCount;
	}
	/**
	 * @param offlineCount the offlineCount to set
	 */
	public void setOfflineCount(Integer offlineCount) {
		this.offlineCount = offlineCount;
	}
	/**
	 * @return the deleteCount
	 */
	public Integer getDeleteCount() {
		return deleteCount;
	}
	/**
	 * @param deleteCount the deleteCount to set
	 */
	public void setDeleteCount(Integer deleteCount) {
		this.deleteCount = deleteCount;
	}
	/**
	 * @return the advertVos
	 */
	public List<AdvertVo> getAdvertVos() {
		return advertVos;
	}
	/**
	 * @param advertVos the advertVos to set
	 */
	public void setAdvertVos(List<AdvertVo> advertVos) {
		this.advertVos = advertVos;
	}
	/**
	 * @return the create_by
	 */
	public Long getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(Long create_by) {
		this.create_by = create_by;
	}
	/**
	 * @return the update_by
	 */
	public Long getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(Long update_by) {
		this.update_by = update_by;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年2月17日 上午11:37:43
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdvertGroupVo [id=" + id + ", name=" + name + ", contract=" + contract + ", owner=" + owner
				+ ", create_by=" + create_by + ", create_at=" + create_at + ", update_by=" + update_by + ", update_at="
				+ update_at + ", waitCheckCount=" + waitCheckCount + ", disAgreeCount=" + disAgreeCount
				+ ", waitPublishCount=" + waitPublishCount + ", processingCount=" + processingCount + ", endCount="
				+ endCount + ", offlineCount=" + offlineCount + ", deleteCount=" + deleteCount + ", advertVos="
				+ advertVos + "]";
	}
}
