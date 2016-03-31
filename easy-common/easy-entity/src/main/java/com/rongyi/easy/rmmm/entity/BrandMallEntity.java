package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class BrandMallEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** mall中品牌ID */
    private Integer brandId;

    /** mall ID */
    private Integer mallId;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * mall中品牌ID
     * @return brandId
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * mall中品牌ID
     * @param brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * mall ID
     * @return mallId
     */
    public Integer getMallId() {
        return mallId;
    }

    /**
     * mall ID
     * @param mallId
     */
    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }
}