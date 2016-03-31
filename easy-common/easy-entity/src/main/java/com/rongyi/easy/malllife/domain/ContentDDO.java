package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章，同城 ，活动  包装
 * @author user
 *
 */
public class ContentDDO implements Serializable{
	private Integer id;
    private String  title;
    private String  contentType;    // 文章类型：活动，文章
    private String  category;
    private Integer contentStatus;  // 状态
    private Integer creator;        // 创建者
    private Date    createDate;     // 创建时间
    private Date    updateDate;     // 更新时间
    private String  mark;           // 标签
    private String  picture;        // 缩略图
    private String  content;        // 正文
    private Date    actionStartDate; // 活动开始时间
    private Date    actionEndDate;  // 结束时间
    private String  actionCost;     // 活动费用
    private String  actionPicture;  // 活动轮播图
    private String  recommentView;  // 推荐
    private Integer referenceId;    // 外键id
    private Integer markCount;      // 收藏总数
    private String  indexDisplay;   // 是否推荐 true false
    private String  mapPicture;     // 地图图片
    private String  description;    //分享描述
    
    private String  referenceField1; //关联shop，mall，city id
    
    private String actionPictureName;//顶部四张图
    private Integer position;//'置顶顺序',
    private Date gatheringTime;//'集合时间',
    private Date sameCityEndTime;//'同城结束时间',
    private String mettersAttentions;//'注意事项',
    private Date signupStartTime;// '报名开始时间',
    private Date signupEndTime;//'报名结束时间',
    private Integer participantsNumber;//'已报名人数',
    private Integer participationNumber;//'参与名额',
    private String celectionAddress;//'集合地点',
    
    private Integer visitedNum; // 文章或活动访问数量
    private Integer shareNum;   // 分享数量
    
    private Integer ballot; //是否投票 0是投票，1是不投
    private String  ballot_title; // 投票名称
    
    private String sharedTitle;
    
    private Integer activity_recommend;
    private Integer userLimit;
    
    private Date publishTime;
    private Date publishEnd;
    
    private String grouponId; // 团购券ID

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getContentStatus() {
		return contentStatus;
	}

	public void setContentStatus(Integer contentStatus) {
		this.contentStatus = contentStatus;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getActionStartDate() {
		return actionStartDate;
	}

	public void setActionStartDate(Date actionStartDate) {
		this.actionStartDate = actionStartDate;
	}

	public Date getActionEndDate() {
		return actionEndDate;
	}

	public void setActionEndDate(Date actionEndDate) {
		this.actionEndDate = actionEndDate;
	}

	public String getActionCost() {
		return actionCost;
	}

	public void setActionCost(String actionCost) {
		this.actionCost = actionCost;
	}

	public String getActionPicture() {
		return actionPicture;
	}

	public void setActionPicture(String actionPicture) {
		this.actionPicture = actionPicture;
	}

	public String getRecommentView() {
		return recommentView;
	}

	public void setRecommentView(String recommentView) {
		this.recommentView = recommentView;
	}

	public Integer getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}

	public Integer getMarkCount() {
		return markCount;
	}

	public void setMarkCount(Integer markCount) {
		this.markCount = markCount;
	}

	public String getIndexDisplay() {
		return indexDisplay;
	}

	public void setIndexDisplay(String indexDisplay) {
		this.indexDisplay = indexDisplay;
	}

	public String getMapPicture() {
		return mapPicture;
	}

	public void setMapPicture(String mapPicture) {
		this.mapPicture = mapPicture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReferenceField1() {
		return referenceField1;
	}

	public void setReferenceField1(String referenceField1) {
		this.referenceField1 = referenceField1;
	}

	public String getActionPictureName() {
		return actionPictureName;
	}

	public void setActionPictureName(String actionPictureName) {
		this.actionPictureName = actionPictureName;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Date getGatheringTime() {
		return gatheringTime;
	}

	public void setGatheringTime(Date gatheringTime) {
		this.gatheringTime = gatheringTime;
	}

	public Date getSameCityEndTime() {
		return sameCityEndTime;
	}

	public void setSameCityEndTime(Date sameCityEndTime) {
		this.sameCityEndTime = sameCityEndTime;
	}

	public String getMettersAttentions() {
		return mettersAttentions;
	}

	public void setMettersAttentions(String mettersAttentions) {
		this.mettersAttentions = mettersAttentions;
	}

	public Date getSignupStartTime() {
		return signupStartTime;
	}

	public void setSignupStartTime(Date signupStartTime) {
		this.signupStartTime = signupStartTime;
	}

	public Date getSignupEndTime() {
		return signupEndTime;
	}

	public void setSignupEndTime(Date signupEndTime) {
		this.signupEndTime = signupEndTime;
	}

	public Integer getParticipantsNumber() {
		return participantsNumber;
	}

	public void setParticipantsNumber(Integer participantsNumber) {
		this.participantsNumber = participantsNumber;
	}

	public Integer getParticipationNumber() {
		return participationNumber;
	}

	public void setParticipationNumber(Integer participationNumber) {
		this.participationNumber = participationNumber;
	}

	public String getCelectionAddress() {
		return celectionAddress;
	}

	public void setCelectionAddress(String celectionAddress) {
		this.celectionAddress = celectionAddress;
	}

	public Integer getVisitedNum() {
		return visitedNum;
	}

	public void setVisitedNum(Integer visitedNum) {
		this.visitedNum = visitedNum;
	}

	public Integer getShareNum() {
		return shareNum;
	}

	public void setShareNum(Integer shareNum) {
		this.shareNum = shareNum;
	}

	public Integer getBallot() {
		return ballot;
	}

	public void setBallot(Integer ballot) {
		this.ballot = ballot;
	}

	public String getBallot_title() {
		return ballot_title;
	}

	public void setBallot_title(String ballot_title) {
		this.ballot_title = ballot_title;
	}

	public String getSharedTitle() {
		return sharedTitle;
	}

	public void setSharedTitle(String sharedTitle) {
		this.sharedTitle = sharedTitle;
	}

	public Integer getActivity_recommend() {
		return activity_recommend;
	}

	public void setActivity_recommend(Integer activity_recommend) {
		this.activity_recommend = activity_recommend;
	}

	public Integer getUserLimit() {
		return userLimit;
	}

	public void setUserLimit(Integer userLimit) {
		this.userLimit = userLimit;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getPublishEnd() {
		return publishEnd;
	}

	public void setPublishEnd(Date publishEnd) {
		this.publishEnd = publishEnd;
	}

	public String getGrouponId() {
		return grouponId;
	}

	public void setGrouponId(String grouponId) {
		this.grouponId = grouponId;
	}
    
    
}
