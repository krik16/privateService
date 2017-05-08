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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "billNo","serialNo","pluCode","pluName","pfCount","pfpRice","barCode"})
public class PluData implements Serializable {

    @XmlElement(name = "BILLNO")
    private String billNo;
    @XmlElement(name = "SERIALNO")
    private String serialNo;
    @XmlElement(name = "PLUCODE")
    private String pluCode;
    @XmlElement(name = "PLUNAME")
    private String pluName;
    @XmlElement(name = "PFCOUNT")
    private String pfCount;
    @XmlElement(name = "PFPRICE")
    private String pfpRice;
    @XmlElement(name = "BARCODE")
    private String barCode;

    public String getBillNo() {
        return billNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getPluCode() {
        return pluCode;
    }

    public void setPluCode(String pluCode) {
        this.pluCode = pluCode;
    }

    public String getPluName() {
        return pluName;
    }

    public void setPluName(String pluName) {
        this.pluName = pluName;
    }

    public String getPfCount() {
        return pfCount;
    }

    public void setPfCount(String pfCount) {
        this.pfCount = pfCount;
    }

    public String getPfpRice() {
        return pfpRice;
    }

    public void setPfpRice(String pfpRice) {
        this.pfpRice = pfpRice;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
