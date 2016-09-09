package com.rongyi.easy.rmmm.param.task;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 * 任务列表参数
 * @author user
 *
 */
public class TaskListParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer type;// 1进行中   2已结束
	private Integer currentPage;//当前页  从1开始
	private Integer pageSize;//每页显示的数据 
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
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
	
}
