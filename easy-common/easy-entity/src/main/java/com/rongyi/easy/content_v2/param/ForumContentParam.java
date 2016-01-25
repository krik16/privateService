package com.rongyi.easy.content_v2.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * 用于进行内容管理详情内容查询的参数
 * @author lijing
 * @time 2015-08-31
 */
@SuppressWarnings("serial")
public class ForumContentParam implements Serializable{
	private static final Integer CURRENTPAGE = 1;
	private static final Integer PAGESIZE = 10;
	private static final String ORDER_BY_CLAUSE = "create_at";
	
	/**省id  0代表全国*/
	private String provId;
	/**城市id 0代表全国*/
	private String cityId;
	/**标题名称*/
	private String title;
	/**发布开始时间*/
	private Date publishBeginAt;
	/**发布结束时间 */
	private Date publishEndAt;
	/**状态   0待发布、1已发布、2已关闭*/
	private Integer status;
	
	private Integer currentPage = CURRENTPAGE;

	private Integer pageSize = PAGESIZE;
	
	private Integer offset;
	
	/**排序的字段*/
	private String orderByString=ORDER_BY_CLAUSE;
	
	/**0 为升序  1为降序  */
	private Integer orderByDesc;
	/**位置id*/
	private Integer positionId;
	
	private List<Integer> positionIds;
	
	public ForumContentParam(){
		
	}
	
	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getProvId() {
		return provId;
	}

	public void setProvId(String provId) {
		this.provId = provId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = StringUtils.isNotBlank(title)?title.trim():null;
	}

	public Date getPublishBeginAt() {
		return publishBeginAt;
	}

	public void setPublishBeginAt(Date publishBeginAt) {
		this.publishBeginAt = publishBeginAt;
	}

	public Date getPublishEndAt() {
		return publishEndAt;
	}

	public void setPublishEndAt(Date publishEndAt) {
		this.publishEndAt = publishEndAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public Integer getOffset() {
		offset = (this.currentPage -1) * this.pageSize;
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public String getOrderByString() {
		return orderByString;
	}

	public void setOrderByString(String orderByString) {
		this.orderByString = orderByString;
	}

	public Integer getOrderByDesc() {
		return orderByDesc;
	}

	public void setOrderByDesc(Integer orderByDesc) {
		this.orderByDesc = orderByDesc;
	}
	/**
	 * @return the positionIds
	 */
	public List<Integer> getPositionIds() {
		return positionIds;
	}

	/**
	 * @param positionIds the positionIds to set
	 */
	public void setPositionIds(List<Integer> positionIds) {
		this.positionIds = positionIds;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("ForumContent {").append("provId:").append(this.provId).append(" cityId:").append(this.cityId).append(" title:").append(this.title)
		.append(" publishBeginAt:").append(this.publishBeginAt).append(" publishEndAt:").append(this.publishEndAt).append(" status:").append(this.status).append(" currentPage:").append(this.currentPage).append(" pageSize:").append(this.pageSize).append(" orderByString:").append(this.orderByString).append(" orderByDesc:").append(this.orderByDesc).append(" positionId:").append(this.positionId);
		return sb.toString();
		
	}
	
}
