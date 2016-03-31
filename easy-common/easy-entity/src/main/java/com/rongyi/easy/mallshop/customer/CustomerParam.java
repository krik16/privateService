package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerParam implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 备注名
     */
    private String memoName;

    /**
     * 性别 M为男性  F为女性
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 家庭情况  1为学生  2为未婚  3为已婚  4为有子
     */
    private Integer familyType;

    /**
     * 备注
     */
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemoName() {
        return memoName;
    }

    public void setMemoName(String memoName) {
        this.memoName = memoName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getFamilyType() {
        return familyType;
    }

    public void setFamilyType(Integer familyType) {
        this.familyType = familyType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Customer toCustomer() {
        Customer customer = new Customer();
        customer.setId(this.id);
        customer.setMemoName(this.memoName);
        customer.setMemo(this.memo);
        customer.setGender(this.gender);
        customer.setFamilyType(this.familyType);
        customer.setBirthday(this.birthday);
        return customer;
    }

}
