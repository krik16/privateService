package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class FilialeInfoEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String filialeMid;

    private String name;

    private Integer brandId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilialeMid() {
        return filialeMid;
    }

    public void setFilialeMid(String filialeMid) {
        this.filialeMid = filialeMid == null ? null : filialeMid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}