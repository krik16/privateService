package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class BrandInfoEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 品牌名称 */
    private String brandName;

    /** 品牌 mongo ID */
    private String brandMid;

    /** 状态：0删除，1正常 */
    private Integer brandStatus;

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
     * 品牌名称
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 品牌名称
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 品牌 mongo ID
     * @return brandMid
     */
    public String getBrandMid() {
        return brandMid;
    }

    /**
     * 品牌 mongo ID
     * @param brandMid
     */
    public void setBrandMid(String brandMid) {
        this.brandMid = brandMid;
    }

    /**
     * 状态：0删除，1正常
     * @return brandStatus
     */
    public Integer getBrandStatus() {
        return brandStatus;
    }

    /**
     * 状态：0删除，1正常
     * @param brandStatus
     */
    public void setBrandStatus(Integer brandStatus) {
        this.brandStatus = brandStatus;
    }
}