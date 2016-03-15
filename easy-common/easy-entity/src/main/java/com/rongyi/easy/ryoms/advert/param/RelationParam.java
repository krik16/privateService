package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

public class RelationParam implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -3053597022756637202L;
	private String relation_id;
	private String name;
	private String code;
	private String status;
	private String content_type;
	private String content_url;
	private Integer currentPage = 0;//当前页
	private Integer pageSize =0;//总页数
	private Integer startIndex = 0;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the startIndex
	 */
	public Integer getStartIndex() {
		return startIndex;
	}
	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	/**
	 * @return the relation_id
	 */
	public String getRelation_id() {
		return relation_id;
	}
	/**
	 * @param relation_id the relation_id to set
	 */
	public void setRelation_id(String relation_id) {
		this.relation_id = relation_id;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the content_type
	 */
	public String getContent_type() {
		return content_type;
	}
	/**
	 * @param content_type the content_type to set
	 */
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	/**
	 * @return the content_url
	 */
	public String getContent_url() {
		return content_url;
	}
	/**
	 * @param content_url the content_url to set
	 */
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月15日 下午2:35:10
	* @throws 
	*/
	@Override
	public String toString() {
		return "RelationParam [relation_id=" + relation_id + ", name=" + name + ", code=" + code + ", status=" + status
				+ ", content_type=" + content_type + ", content_url=" + content_url + ", currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", startIndex=" + startIndex + "]";
	}
}
