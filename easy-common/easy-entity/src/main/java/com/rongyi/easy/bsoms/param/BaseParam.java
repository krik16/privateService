package com.rongyi.easy.bsoms.param;


import java.io.Serializable;

public class BaseParam implements Serializable {

	private static final long serialVersionUID = 6482067627833704241L;
	private Integer pageSize;
	
	private Integer currentPage;

	private Integer startRecordIndex;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getStartRecordIndex() {
		if(pageSize!=null&&pageSize!=0&&currentPage!=null&&currentPage>0)
			startRecordIndex = (currentPage-1)*pageSize;
		return startRecordIndex;
	}

	public void setStartRecordIndex(Integer startRecordIndex) {
		this.startRecordIndex = startRecordIndex;
	}

}
