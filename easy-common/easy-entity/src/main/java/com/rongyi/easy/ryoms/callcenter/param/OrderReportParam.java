package com.rongyi.easy.ryoms.callcenter.param;

import java.io.Serializable;

public class OrderReportParam implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 9020669381941530831L;
	private int userId;//用户名
	private String beginTime;//开始时间
	private String endTime;//结束时间
	private int type;//类别 1 日报表 2 周报表 3 月报表
	private int currentPage;//当前页
	private int pageSize;//总页数
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the beginTime
	 */
	public String getBeginTime() {
		return beginTime;
	}
	/**
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
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
	* @date 2016年1月14日 下午5:49:16
	* @throws 
	*/
	@Override
	public String toString() {
		return "OrderReportParam [userId=" + userId + ", beginTime=" + beginTime + ", endTime=" + endTime + ", type="
				+ type + ", currentPage=" + currentPage + ", pageSize=" + pageSize + "]";
	}
}
