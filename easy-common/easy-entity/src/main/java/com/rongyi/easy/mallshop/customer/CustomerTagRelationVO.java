package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerTagRelationVO implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 标签名
     */
    private String name;

    /**
     * 标签类型  1为常用标签  2为用户自定义标签
     */
    private Integer tagType;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 顾客ID
     */
    private Integer customerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTagType() {
        return tagType;
    }

    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
