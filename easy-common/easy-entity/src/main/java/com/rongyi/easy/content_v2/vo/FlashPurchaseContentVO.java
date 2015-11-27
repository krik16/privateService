package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.core.common.util.DateTool;
/**
 * 
* @ClassName: FlashPurchaseContentVO 
* @Description: 闪购推荐返回vo
* @author shaozhou 
* @date 2015年11月18日 下午8:31:50 
*
 */
public class FlashPurchaseContentVO  implements Serializable{
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5671906000929060540L;
	/**
	 * 闪购id
	 */
	private Integer id;
	/**
	 * 闪购封面图
	 */
	private String bannerPic;
	/**
	 * 详情url
	 */
	private String activityUrl;
	private String name;
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
	 * @return the bannerPic
	 */
	public String getBannerPic() {
		return bannerPic;
	}
	/**
	 * @param bannerPic the bannerPic to set
	 */
	public void setBannerPic(String bannerPic) {
		this.bannerPic = bannerPic;
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
	/**(非 Javadoc)
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou 
	* @date 2015年11月27日 下午4:21:12
	* @throws 
	*/
	@Override
	public String toString() {
		return "FlashPurchaseContentVO [id=" + id + ", bannerPic=" + bannerPic + ", activityUrl=" + activityUrl
				+ ", name=" + name + "]";
	}
}
