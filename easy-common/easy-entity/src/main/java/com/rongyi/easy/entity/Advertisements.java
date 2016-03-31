package com.rongyi.easy.entity;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 类AdvertisementsPojo.java的实现描述：TODO 类实现描述
 * 
 * @author jiejie 2014年4月10日 下午3:01:03
 */
@Entity(value = "advertisements", noClassnameStored = true)
public class Advertisements implements Serializable {

    private static final long serialVersionUID = -3897664351284960639L;

    @Id
    private ObjectId          id;

    /** 新增字段 2015-01-04 */

    /** 发布id */
    @Property("deploy_id")
    private String            deployId;

    /** 操作类型 1 发布 2撤销发布 */
    @Property("action_type")
    private String            actionType;

    /** 优先级 */
    @Property("priority")
    private String            priority;

    /** 跳转类型，0为不跳转，1为跳转到商户/专柜首页 */
    @Property("jump_type")
    private String            jumpType;

    /** 跳转码 */
    @Property("jump_code")
    private String            jumpCode;

    /** 是否适用广告位所有设备，1为是，0为否，为1时，equipmentList字段不提供 */
    @Property("is_for_all")
    private String            isForAll;

    /** 设备id集合 */
    @Property("equipment_id")
    private List<String>      equipmentId;

    /** 终端机id集合 */
    @Property("terminal_list")
    private List<ObjectId>    terminalList;

    /** 描述 */
    @Property("desc")
    private String            desc;

    /** 展示时间，单位秒 */
    @Property("display_seconds")
    private String            displaySeconds;

    /** 广告素材id */
    @Property("adMaterial_id")
    private ObjectId          adMaterialId;

    /** 最新更新时间 */
    @Property("updated_at")
    private String            updatedAt;

    /** 资源id，区分商场 */
    @Property("resource_id")
    private String            resourceId;
    
    /** 开始时间 */
    private String start_time;
    
    /** 结束时间 */
    private String end_time;

    public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public String getDisplaySeconds() {
        return displaySeconds;
    }

    public void setDisplaySeconds(String displaySeconds) {
        this.displaySeconds = displaySeconds;
    }

    public ObjectId getAdMaterialId() {
        return adMaterialId;
    }

    public void setAdMaterialId(ObjectId adMaterialId) {
        this.adMaterialId = adMaterialId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<String> getEquipmentId() {
        return equipmentId;
    }
    
    public void setEquipmentId(List<String> equipmentId) {
        this.equipmentId = equipmentId;
    }

    public List<ObjectId> getTerminalList() {
        return terminalList;
    }

    public void setTerminalList(List<ObjectId> terminalList) {
        this.terminalList = terminalList;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getResourceId() {
        return resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}


}
