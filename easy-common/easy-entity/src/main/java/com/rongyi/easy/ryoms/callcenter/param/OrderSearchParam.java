package com.rongyi.easy.ryoms.callcenter.param;

import java.io.Serializable;

import com.rongyi.easy.ryoms.callcenter.entity.OrderEntity;

/**
 * 客服工单查询参数
 * 
 * @author wangjianhua
 *
 */
public class OrderSearchParam extends OrderEntity implements Serializable {

	@Override
	public String toString() {
		return "OrderSearchParam [userName=" + userName + ", userTag=" + userTag + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", pageSize=" + pageSize + ", currentPage=" + currentPage + ", toString()="
				+ super.toString() + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserTag() {
		return userTag;
	}

	public void setUserTag(int userTag) {
		this.userTag = userTag;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartIndex() {
		if (0 < currentPage) {
			return (currentPage - 1) * pageSize;
		}
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6317758135338708592L;

	// 用户名
	private String userName = "";

	// 用户类型（标签，创建人/更新人）
	private int userTag = 0;

	// 开始日期
	private String startDate = "";

	// 结束日期
	private String endDate = "";

	// 每页数
	private int pageSize = 0;

	// 页数
	private int currentPage = 0;

	// 开始数
	private int startIndex = 0;
}
