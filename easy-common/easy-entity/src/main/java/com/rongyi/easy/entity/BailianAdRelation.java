package com.rongyi.easy.entity;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 百联广告接口映射表
 * @author user 2015年1月7日 下午3:51:05
 */
@Entity("bailian_ad_relation")
public class BailianAdRelation {

    @Id
    private ObjectId id;
    
    /** 设备id */
    @Property("equipment_id")
    private String equipmentId;
    
    @Property("terminal_id")
    private ObjectId terminalId;
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    public String getEquipmentId() {
        return equipmentId;
    }
    
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }
    
    public ObjectId getTerminalId() {
        return terminalId;
    }
    
    public void setTerminalId(ObjectId terminalId) {
        this.terminalId = terminalId;
    }
    
}
