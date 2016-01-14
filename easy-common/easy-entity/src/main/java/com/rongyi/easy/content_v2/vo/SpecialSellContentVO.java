package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.core.common.util.DateTool;
/**
 * 
* @ClassName: SpecialSellContentVO 
* @Description: 特卖返回vo
* @author shaozhou 
* @date 2015年11月18日 下午4:35:37 
*
 */
public class SpecialSellContentVO  implements Serializable{
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5671906000929060540L;
	/**
	 * 内容id
	 */
	private Integer id;
	/**
	 * 卖场封面图
	 */
	private String picUrls;
	/**
	 * 详情url
	 */
	private String activityUrl;
	/**
	 * "商圈名称"
	 */
	private String businessDistrictName;
	/**
	 * "商圈id
	 */
	private String businessDistrictId;
	/**
	 * name
	 */
	private String name;
	/**
	 * 
	 */
	private Integer contentId;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the picUrls
	 */
	public String getPicUrls() {
		return picUrls;
	}
	/**
	 * @param picUrls the picUrls to set
	 */
	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}
	/**
	 * @return the activityUrl
	 */
	public String getActivityUrl() {
		return activityUrl;
	}
	/**
	 * @param activityUrl the activityUrl to set
	 */
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}
	/**
	 * @return the businessDistrictName
	 */
	public String getBusinessDistrictName() {
		return businessDistrictName;
	}
	/**
	 * @param businessDistrictName the businessDistrictName to set
	 */
	public void setBusinessDistrictName(String businessDistrictName) {
		this.businessDistrictName = businessDistrictName;
	}
	/**
	 * @return the businessDistrictId
	 */
	public String getBusinessDistrictId() {
		return businessDistrictId;
	}
	/**
	 * @param businessDistrictId the businessDistrictId to set
	 */
	public void setBusinessDistrictId(String businessDistrictId) {
		this.businessDistrictId = businessDistrictId;
	}
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
	 * @return the contentId
	 */
	public Integer getContentId() {
		return contentId;
	}
	/**
	 * @param contentId the contentId to set
	 */
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	/**(非 Javadoc)
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou 
	* @date 2015年12月1日 下午5:20:25
	* @throws 
	*/
	@Override
	public String toString() {
		return "SpecialSellContentVO [id=" + id + ", picUrls=" + picUrls + ", activityUrl=" + activityUrl
				+ ", businessDistrictName=" + businessDistrictName + ", businessDistrictId=" + businessDistrictId
				+ ", name=" + name + ", contentId=" + contentId + "]";
	}
}
