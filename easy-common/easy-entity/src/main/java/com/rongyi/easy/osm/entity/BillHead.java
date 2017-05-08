package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by yangyang on 2017/3/10.
 */
@XmlType(propOrder = { "billNo", "orgCode" ,"place","pfcustCode","custName","custPhone","custAddr","depCode","date","time","staffCode","remark"})
@XmlAccessorType(XmlAccessType.FIELD)
public class BillHead implements Serializable {

    @XmlElement(name = "BILLNO")
    private String billNo;
    @XmlElement(name = "ORGCODE")
    private String orgCode;
    @XmlElement(name = "PLACE")
    private String place;
    @XmlElement(name = "PFCUSTCODE")
    private String pfcustCode;
    @XmlElement(name = "CUSTNAME")
    private String custName;
    @XmlElement(name = "CUSTPHONE")
    private String custPhone;
    @XmlElement(name = "CUSTADDR")
    private String custAddr;
    @XmlElement(name = "DEPCODE")
    private String depCode;
    @XmlElement(name = "DATE")
    private String date;
    @XmlElement(name = "TIME")
    private String time;
    @XmlElement(name = "STAFFCODE")
    private String staffCode;
    @XmlElement(name = "REMARK")
    private String remark;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPfcustCode() {
        return pfcustCode;
    }

    public void setPfcustCode(String pfcustCode) {
        this.pfcustCode = pfcustCode;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
