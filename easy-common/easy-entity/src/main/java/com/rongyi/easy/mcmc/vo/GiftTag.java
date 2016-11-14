package com.rongyi.easy.mcmc.vo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 礼品标签类
 *
 * @author yaoyiwei
 * @date 2016-11-10
 * @version 1.0
 *
 */
@Entity(value="mcmc_gift_tag", noClassnameStored=true)
public class GiftTag implements Serializable, Cloneable {
    @Id
    private ObjectId id;
    // 所属id
    private String mappingId;
    // 名称
    private String name;
    // 创建时间
    private Date createAt;
    // mysql id
    private String mysqlId;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getMysqlId() {
        return mysqlId;
    }

    public void setMysqlId(String mysqlId) {
        this.mysqlId = mysqlId;
    }

    @Override
    public String toString() {
        return "GiftTag{" +
                "id=" + id +
                ", mappingId=" + mappingId +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", mysqlId=" + mysqlId +
                '}';
    }
}
