package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * 礼品标签参数
 *
 * @author yaoyiwei
 * @date 2016-11-22
 * @version 1.0
 *
 */
public class GiftTagParam implements Serializable {

    private String id;
    private String name;
    private String mappingId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    @Override
    public String toString() {
        return "GiftTagParam{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mappingId='" + mappingId + '\'' +
                '}';
    }
}
