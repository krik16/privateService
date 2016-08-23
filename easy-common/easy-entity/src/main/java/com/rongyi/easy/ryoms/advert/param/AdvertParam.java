package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;
import java.util.List;

public class AdvertParam implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -8496462108476346037L;
	private String id;//广告id 新增不需要，修改需要
	private String groupId;//广告组id
	private int currentPage = 0;//当前页
	private int pageSize =0;//总页数
	private int startIndex = 0;
	private String position;//广告位置 1全屏 2banner
	private String adTime;//播放时长
	private String module_type;//11 全屏模板-A 12 全屏模板-B 浮窗 13 全屏模板-c 浮窗2 21首页Banner模板-A 31 内页广告模板
	private String content;//内容url
	private String publish_start;//发布开始时间
	private String publish_end;//发布结束时间
	private String mallIds;//商场id 多个商场用逗号分割
	private String agree;//审核通过1 不通过2
	private String reason;//审核不通过原因
	private List<AdMaterialParam> adMaterialList;
	private String relation_id;//广告关联配置id
	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the adTime
	 */
	public String getAdTime() {
		return adTime;
	}
	/**
	 * @param adTime the adTime to set
	 */
	public void setAdTime(String adTime) {
		this.adTime = adTime;
	}
	/**
	 * @return the module_type
	 */
	public String getModule_type() {
		return module_type;
	}
	/**
	 * @param module_type the module_type to set
	 */
	public void setModule_type(String module_type) {
		this.module_type = module_type;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the publish_start
	 */
	public String getPublish_start() {
		return publish_start;
	}
	/**
	 * @param publish_start the publish_start to set
	 */
	public void setPublish_start(String publish_start) {
		this.publish_start = publish_start;
	}
	/**
	 * @return the publish_end
	 */
	public String getPublish_end() {
		return publish_end;
	}
	/**
	 * @param publish_end the publish_end to set
	 */
	public void setPublish_end(String publish_end) {
		this.publish_end = publish_end;
	}
	/**
	 * @return the mallIds
	 */
	public String getMallIds() {
		return mallIds;
	}
	/**
	 * @param mallIds the mallIds to set
	 */
	public void setMallIds(String mallIds) {
		this.mallIds = mallIds;
	}
	/**
	 * @return the agree
	 */
	public String getAgree() {
		return agree;
	}
	/**
	 * @param agree the agree to set
	 */
	public void setAgree(String agree) {
		this.agree = agree;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
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

	public List<AdMaterialParam> getAdMaterialList() {
		return adMaterialList;
	}

	public void setAdMaterialList(List<AdMaterialParam> adMaterialList) {
		this.adMaterialList = adMaterialList;
	}

	@Override
	public String toString() {
		return "AdvertParam{" +
				"id='" + id + '\'' +
				", groupId='" + groupId + '\'' +
				", currentPage=" + currentPage +
				", pageSize=" + pageSize +
				", startIndex=" + startIndex +
				", position='" + position + '\'' +
				", adTime='" + adTime + '\'' +
				", module_type='" + module_type + '\'' +
				", content='" + content + '\'' +
				", publish_start='" + publish_start + '\'' +
				", publish_end='" + publish_end + '\'' +
				", mallIds='" + mallIds + '\'' +
				", agree='" + agree + '\'' +
				", reason='" + reason + '\'' +
				", adMaterialList=" + adMaterialList +
				", relation_id='" + relation_id + '\'' +
				'}';
	}
}
