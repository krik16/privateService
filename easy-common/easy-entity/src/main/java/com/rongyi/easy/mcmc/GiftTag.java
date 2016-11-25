package com.rongyi.easy.mcmc;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * 礼品标签类
 *
 * @author yaoyiwei
 * @date 2016-11-23
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
    // 更新时间
    private Date updateAt;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "GiftTag{" +
                "id=" + id +
                ", mappingId=" + mappingId +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", mysqlId=" + mysqlId +
                '}';
    }
}
