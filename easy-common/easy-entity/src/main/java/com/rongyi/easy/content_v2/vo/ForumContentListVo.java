package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 这个是页面上的列表的数据
 * @author lijing
 * @time 2015-09-07
 *
 */
public class ForumContentListVo implements Serializable{
	/**内容id*/
	private Integer id;
	
	/**位置id*/
	private Integer positionId;
	/**省份名称*/
	private String provName;
	/**城市名称*/
	private String cityName;
	/**图片*/
	private String picUrls;
	/**图片*/
	private String picUrlsTwo;
	/**
	 * 选中的图片
	 * @author wangjh7
	 * @date 2016-04-11
	 */
	private String selectedPicUrls;
	/**标题  或则活动主题*/
	private String title;
	/**发布开始时间*/
	private Date publishBeginAt;
	/**发布结束时间*/
	private Date publishEndAt;
	/**创建人*/
	private String createUser;
	/**创建时间*/
	private Date createAt;
	/**状态0待发布、1已发布、2已关闭*/
	private Integer status;
	/**
	 * 买手直播
	 */
	private String buyerLive;
	/**
	 *iosVersion版本
	 */
	private String iosVersion;
	/**
	 * 安卓版本号
	 */
	private String androidVersion;

	/**
	 * 快捷入口的类型   方式为 12，13，10，10
	 */
	private String quickType;
	/**
	 * 快捷入口的类型值    方式为 , , ,www.baidu.com
	 */
	private String quickTypeVal;
	/**
	 * 是否置顶
	 */
	private int stick;
	/**
	 * 类型
	 */
	private int type;
	/**
	 * 类型值
	 */
	private String typeVal;

	/**
	 * 类型名:如品牌名称
	 */
	private String typeName;

	private String shareTitle;

	private String appTitle;

	private String shareContent;

	private String sharePic;

	private String updateUser;

	private String quickRemarks;

	private Integer quickCount;

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}


	public String getQuickRemarks() {
		return quickRemarks;
	}

	public void setQuickRemarks(String quickRemarks) {
		this.quickRemarks = quickRemarks;
	}

	public Integer getQuickCount() {
		return quickCount;
	}

	public void setQuickCount(Integer quickCount) {
		this.quickCount = quickCount;
	}

	public String getSharePic() {
		return sharePic;
	}

	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getAppTitle() {
		return appTitle;
	}

	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

	public String getPicUrlsTwo() {
		return picUrlsTwo;
	}

	public void setPicUrlsTwo(String picUrlsTwo) {
		this.picUrlsTwo = picUrlsTwo;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getProvName() {
		return provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPicUrls() {
		return picUrls;
	}

	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBuyerLive() {
		return buyerLive;
	}

	public void setBuyerLive(String buyerLive) {
		this.buyerLive = buyerLive;
	}

	public String getIosVersion() {
		return iosVersion;
	}

	public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getQuickType() {
		return quickType;
	}

	public void setQuickType(String quickType) {
		this.quickType = quickType;
	}

	public String getQuickTypeVal() {
		return quickTypeVal;
	}

	public void setQuickTypeVal(String quickTypeVal) {
		this.quickTypeVal = quickTypeVal;
	}
	/**
	 * @return the stick
	 */
	public int getStick() {
		return stick;
	}

	/**
	 * @param stick the stick to set
	 */
	public void setStick(int stick) {
		this.stick = stick;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the typeVal
	 */
	public String getTypeVal() {
		return typeVal;
	}

	/**
	 * @param typeVal the typeVal to set
	 */
	public void setTypeVal(String typeVal) {
		this.typeVal = typeVal;
	}


	public String getSelectedPicUrls() {
		return selectedPicUrls;
	}

	public void setSelectedPicUrls(String selectedPicUrls) {
		this.selectedPicUrls = selectedPicUrls;
	}

	/**
	 * (非 Javadoc)
	 *
	 * @param @return 设定文件
	 * @throws
	 * @Title: toString
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author shaozhou
	 * @date 2015年11月24日 下午4:20:02
	 */
	@Override
	public String toString() {
		return "ForumContentListVo{" +
				"id=" + id +
				", positionId=" + positionId +
				", provName='" + provName + '\'' +
				", cityName='" + cityName + '\'' +
				", picUrls='" + picUrls + '\'' +
				", selectedPicUrls='" + selectedPicUrls + '\'' +
				", title='" + title + '\'' +
				", publishBeginAt=" + publishBeginAt +
				", publishEndAt=" + publishEndAt +
				", createUser='" + createUser + '\'' +
				", createAt=" + createAt +
				", status=" + status +
				", buyerLive='" + buyerLive + '\'' +
				", iosVersion='" + iosVersion + '\'' +
				", androidVersion='" + androidVersion + '\'' +
				", quickType='" + quickType + '\'' +
				", quickTypeVal='" + quickTypeVal + '\'' +
				", stick=" + stick +
				", type=" + type +
				", typeVal='" + typeVal + '\'' +
				", typeName='" + typeName + '\'' +
				", picUrlsTwo='" + picUrlsTwo + '\'' +
				", shareContent='" + shareContent + '\'' +
				", shareTitle='" + shareTitle + '\'' +
				", appTitle='" + appTitle + '\'' +
				", sharePic='" + sharePic + '\'' +
				", updateUser='" + updateUser + '\'' +
				", quickCount='" + quickCount + '\'' +
				", quickRemarks='" + quickRemarks + '\'' +
				'}';
	}
}
