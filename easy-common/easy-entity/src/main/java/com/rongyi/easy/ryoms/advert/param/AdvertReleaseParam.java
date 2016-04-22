package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

public class AdvertReleaseParam implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 6469102833024790937L;
	private String sync_name;//同步人姓名
	// 当前页码
	private int currentPage = 0;
	// 页数
	private int pageSize = 10;
	// 开始序号数
	private int startIndex = 0;
	private String sync_by;//同步人id
	/**
	 * @return the sync_name
	 */
	public String getSync_name() {
		return sync_name;
	}
	/**
	 * @param sync_name the sync_name to set
	 */
	public void setSync_name(String sync_name) {
		this.sync_name = sync_name;
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
	 * @return the startIndex
	 */
	public int getStartIndex() {
		return startIndex;
	}
	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	/**
	 * @return the sync_by
	 */
	public String getSync_by() {
		return sync_by;
	}
	/**
	 * @param sync_by the sync_by to set
	 */
	public void setSync_by(String sync_by) {
		this.sync_by = sync_by;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年4月6日 下午3:16:27
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdvertReleaseParam [sync_name=" + sync_name + ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ ", startIndex=" + startIndex + ", sync_by=" + sync_by + "]";
	}
}
