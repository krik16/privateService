package com.rongyi.easy.shop.entity;

import com.rongyi.easy.shop.mvc.DateJson.JsonObjectIdSerializer;
import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2017/5/15.
 */
@SuppressWarnings("serial")
@Entity(value="shopRelation",noClassnameStored=true)
public class ShopRelation implements Serializable {

    @JsonSerialize(using=JsonObjectIdSerializer.class)
    @Id
    private ObjectId id;

    private String shopMid;
    private String importUrl;

    public ShopRelation() {}

    public ShopRelation(String shopMid, String importUrl) {
        this.shopMid = shopMid;
        this.importUrl = importUrl;
    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getImportUrl() {
        return importUrl;
    }

    public void setImportUrl(String importUrl) {
        this.importUrl = importUrl;
    }
}
