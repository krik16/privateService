package com.rongyi.easy.smms.vo;

import java.io.Serializable;

public class CategoryVO implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 4389787820338036311L;

    /**  */
    private Long   id;

    /** 商超分类名称 */
    private String name;

    /** 级别 1 一级 2 二级 */
    private Byte   level;

    /** 父级id -1没有父级 */
    private Long   parentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

}
