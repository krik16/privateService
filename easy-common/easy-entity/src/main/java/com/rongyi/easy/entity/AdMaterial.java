package com.rongyi.easy.entity;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 广告素材
 * @author baodk
 */
@Entity(value = "ad_material", noClassnameStored = true)
public class AdMaterial {

    @Id
    private ObjectId id;
    
    /** 商场id */
    @Property("mall_id")
    private ObjectId mallId;

    /** 素材名称 */
    private String name;
    
    /** 素材类型 :1 文档 2 图片 3 音乐 4 视频  5 超文本*/
    private String type;
    
    /** 素材url */
    private String url;
    
    public ObjectId getId() {
        return id;
    }
    
    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getMallId() {
        return mallId;
    }

    public void setMallId(ObjectId mallId) {
        this.mallId = mallId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
