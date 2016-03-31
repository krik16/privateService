package com.rongyi.easy.entity;

import java.util.Date;

public class RoaConfig {
    /**  */
    private Long id;

    /**  */
    private String name;

    /**  */
    private Long valueBigint;

    /**  */
    private String valueVarchar;

    /**  */
    private String memo;

    /**  */
    private Date insDt;

    /**  */
    private Date updDt;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return valueBigint
     */
    public Long getValueBigint() {
        return valueBigint;
    }

    /**
     * 
     * @param valueBigint
     */
    public void setValueBigint(Long valueBigint) {
        this.valueBigint = valueBigint;
    }

    /**
     * 
     * @return valueVarchar
     */
    public String getValueVarchar() {
        return valueVarchar;
    }

    /**
     * 
     * @param valueVarchar
     */
    public void setValueVarchar(String valueVarchar) {
        this.valueVarchar = valueVarchar;
    }

    /**
     * 
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 
     * @return insDt
     */
    public Date getInsDt() {
        return insDt;
    }

    /**
     * 
     * @param insDt
     */
    public void setInsDt(Date insDt) {
        this.insDt = insDt;
    }

    /**
     * 
     * @return updDt
     */
    public Date getUpdDt() {
        return updDt;
    }

    /**
     * 
     * @param updDt
     */
    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }
}