package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class MRefundCategoryEntity implements Serializable {
    /**  */
    private Integer id;

    /** 退款原因 */
    private String name;

    /** 是否删除 0：未删除 1：删除 */
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 退款原因
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 退款原因
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 是否删除 0：未删除 1：删除
     * @return isDeleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除 0：未删除 1：删除
     * @param isDeleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}