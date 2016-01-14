package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianMemberCouponBaseVo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 接口返回结果编码，00100000表示成功，其他编码表示失败
	 */
	// public final static String RESPONSE_CODE = "00100000";
	private Integer count;
	private Integer currentPage;
	private Integer pageSize;
	private Integer pages;
	private Integer end;
	private Integer start;
	private List<BailianMemberCouponVo> list;

	public BailianMemberCouponBaseVo() {
		super();
	}

	public BailianMemberCouponBaseVo(Integer count, Integer currentPage, Integer pageSize, Integer pages, Integer end, List<BailianMemberCouponVo> list) {
		super();
		this.count = count;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.pages = pages;
		this.end = end;
		this.list = list;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public List<BailianMemberCouponVo> getList() {
		return list;
	}

	public void setList(List<BailianMemberCouponVo> list) {
		this.list = list;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

}
