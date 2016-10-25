package com.rongyi.easy.solr.result;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SearchMeta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3337560364556240592L;
	
	private int hitCount;
	private int status;
	private String msg;
	/** 总页数  */
	private int totalPage;	
	/** 总命中纪录 */
	private int totalRecord;
	
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/**
	 * @return the totalRecord
	 */
	public int getTotalRecord() {
		return totalRecord;
	}
	/**
	 * @param totalRecord the totalRecord to set
	 */
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	@Override
	public String toString() {
		return "SearchMeta{" +
				"hitCount=" + hitCount +
				", status=" + status +
				", msg='" + msg + '\'' +
				", totalPage=" + totalPage +
				", totalRecord=" + totalRecord +
				'}';
	}

	public SearchMeta() {
	}

	/**
	 * 构造结果
	 *
	 * @param status
	 * @param hitCount
	 * @param totalRecord
	 * @param pageSize
	 */
	public SearchMeta(int status, int hitCount, int totalRecord, int pageSize) {
		this.status = status;
		if (0 == status) {
			this.msg = "success";
		} else {
			this.msg = "fail";
		}
		this.hitCount = hitCount;
		this.totalRecord = totalRecord;
		this.totalPage = (int) Math.ceil(totalRecord / (double) pageSize);
	}
}
