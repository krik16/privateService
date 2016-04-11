package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

public class AdMallSearchParam implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -4496398950481100758L;
	
	private String name;
	private String zoneId;
	private String mallId;
	private int currentPage;
	private int pageSize;
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
	 * @return the zoneId
	 */
	public String getZoneId() {
		return zoneId;
	}
	/**
	 * @param zoneId the zoneId to set
	 */
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	/**
	 * @return the mallId
	 */
	public String getMallId() {
		return mallId;
	}
	/**
	 * @param mallId the mallId to set
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年2月25日 上午10:13:48
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdMallSearchParam [name=" + name + ", zoneId=" + zoneId + ", mallId=" + mallId + ", currentPage="
				+ currentPage + ", pageSize=" + pageSize + "]";
	}
}
