package com.rongyi.easy.redi.param;

import java.util.List;

public class AdvertiseParam {

    /** 发布id */
    private String deployId;
    
    /** 操作类型 1 发布 2撤销发布 */
    private String actionType;
    
    /** 发布名称 */
    private String deployeName;

    /** 优先级 */
    private String priority;
    
    /** 根据后缀判断内容内容类型，需要下载传送至到门店服务器上 */
    private String contentUrl;
    
    /** 跳转类型，0为不跳转，1为跳转到商户/专柜首页 */
    private String jumpType;
    
    /** 跳转码 */
    private String jumpCode;
    
    /** 是否适用广告位所有设备，1为是，0为否，为1时，equipmentList字段不提供 */
    private String isForAll;
    
    /** 设备id集合 */
    private List<String> equipmentId;
    
    /** 描述 */
    private String desc;
    
    /** 开始时间 */
    private String startTime;
    
    /** 结束时间 */
    private String endTime;
    
    /** 展示时间，单位秒 */
    private String displaySeconds;
    
    /** 素材类型：1 文档 2 图片 3 音乐 4 视频  5 超文本（速赢可以只含2与4） */
    private String contentType;

    public String getDeployId() {
        return deployId;
    }

    public void setDeployId(String deployId) {
        this.deployId = deployId;
    }

    public String getActionType() {
        return actionType;
    }
    
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    
    public String getDeployeName() {
        return deployeName;
    }

    public void setDeployeName(String deployeName) {
        this.deployeName = deployeName;
    }

    public String getPriority() {
        return priority;
    }
    
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }
    
    public String getJumpType() {
        return jumpType;
    }

    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }
    
    public String getJumpCode() {
        return jumpCode;
    }

    public void setJumpCode(String jumpCode) {
        this.jumpCode = jumpCode;
    }
    
    public String getIsForAll() {
        return isForAll;
    }

    public void setIsForAll(String isForAll) {
        this.isForAll = isForAll;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStartTime() {
        return startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    public String getDisplaySeconds() {
        return displaySeconds;
    }
    
    public void setDisplaySeconds(String displaySeconds) {
        this.displaySeconds = displaySeconds;
    }
    
    public List<String> getEquipmentId() {
        return equipmentId;
    }
    
    public void setEquipmentId(List<String> equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getContentType() {
        return contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

	@Override
	public String toString() {
		return "AdvertiseParam [deployId=" + deployId + ", actionType="
				+ actionType + ", deployeName=" + deployeName + ", priority="
				+ priority + ", contentUrl=" + contentUrl + ", jumpType="
				+ jumpType + ", jumpCode=" + jumpCode + ", isForAll="
				+ isForAll + ", equipmentId=" + equipmentId + ", desc=" + desc
				+ ", startTime=" + startTime + ", endTime=" + endTime
				+ ", displaySeconds=" + displaySeconds + ", contentType="
				+ contentType + "]";
	}
    
}
