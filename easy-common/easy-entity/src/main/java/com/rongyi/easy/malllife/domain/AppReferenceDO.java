package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiejie 2014年6月20日 下午1:23:54
 */
public class AppReferenceDO implements Serializable{

    private Integer id;
    private Date    createDate;
    private Date    updateDate;
    /**
     * city,mall,brand,shop
     */
    private String  type;            // city,mall,brand,shop
    /**
	 * '当type=city时，field1是省或直辖市，field2是省下辖的市。当type为shop或mall时，field1是mall或shop id',
	 */
    private String  referenceField1; //当type=city时，field1是省或直辖市，field2是省下辖的市。当type为shop或mall时，field1是mall或shop id
    private String  referenceField2;
    private String  referenceAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReferenceField1() {
        return referenceField1;
    }

    public void setReferenceField1(String referenceField1) {
        this.referenceField1 = referenceField1;
    }

    public String getReferenceField2() {
        return referenceField2;
    }

    public void setReferenceField2(String referenceField2) {
        this.referenceField2 = referenceField2;
    }

    public String getReferenceAddress() {
        return referenceAddress;
    }

    public void setReferenceAddress(String referenceAddress) {
        this.referenceAddress = referenceAddress;
    }

}
