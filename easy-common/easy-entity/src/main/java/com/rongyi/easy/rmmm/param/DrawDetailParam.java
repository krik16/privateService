package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
* @ClassName: DrawDetailParam
* @Description: TODO(提现记录参数类)
* @author lqy
* @date 2015年5月28日 下午1:50:53
*
*/
public class DrawDetailParam implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * @Fields currentPage : TODO(当前页，从1开始)
	 */
	private String currentPage;

	/**
	 * @Fields pageSize : TODO(每页的大小)
	 */
	private String pageSize;

	/**
	 * @Fields date : TODO(时间:所有时间[0], 当天[1], 当周[2], 当月[3])
	 */
	private String date;

	/**
	 * @Fields status : TODO(状态：全部 [0], 已发放[1], 处理中[2], 失败[3])
	 */
	private String status;

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DrawDetailParam [currentPage=" + currentPage + ", pageSize=" + pageSize + ", date=" + date + ", status=" + status
				+ "]";
	}

}
